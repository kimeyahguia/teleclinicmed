
package subInterfaces;
import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import mainInterfaces.patientDashboard;
import mainInterfaces.sessionManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultCellEditor;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableCellRenderer;

public class MedicinetoBuy extends javax.swing.JFrame {

    int accountId = sessionManager.getAccountId();


    public MedicinetoBuy() {
        initComponents();
        loadMedicineCategoriesIntoComboBox(medicineType);
        
        
        String[] columnNames = {"Select", "Medicine Name", "Price", "Stock", "Quantity"};
        medicineTable.setModel(new MedicineTableModel(columnNames, 0));
        
        
        
        
        
        
        medicineType.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedCategory = (String) medicineType.getSelectedItem();  // Get selected category

            // Ensure "Select Category" is not selected
            if (!"Select Category".equals(selectedCategory)) {
                loadMedicinesByCategory(selectedCategory, medicineTable);  
            }
        }
    });
        
        
         //System.out.println("Logged-in Account ID: " + accountId); // Console log
         //JOptionPane.showMessageDialog(this, "Logged-in Account ID: " + accountId); // Popup message
    }

    //functions fro loading 
    
        private void processSelectedMedicines(JTable medicineTable) {
        DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();

        for (int row = 0; row < model.getRowCount(); row++) {
            boolean selected = (boolean) model.getValueAt(row, 0);  // Get the checkbox value
            if (selected) {
                String medicineName = (String) model.getValueAt(row, 1);
                int quantity = (int) model.getValueAt(row, 4);  // Get the entered quantity
                // Process the selected medicine with its quantity
                System.out.println("Selected Medicine: " + medicineName + ", Quantity: " + quantity);
            }
        }
    }
    
    
    
    
    public class MedicineTableModel extends DefaultTableModel {

     public MedicineTableModel(Object[] columnNames, int rowCount) {
         super(columnNames, rowCount);
     }

     @Override
     public Class<?> getColumnClass(int columnIndex) {
         switch (columnIndex) {
             case 0:
                 return Boolean.class; // Checkbox column
             case 9:
                 return Integer.class; // Quantity column
             default:
                 return super.getColumnClass(columnIndex);
         }
     }

     @Override
     public boolean isCellEditable(int row, int column) {
         return column == 0 || column == 9; // Allow editing checkbox and quantity columns
     }
 }
    
        
        private void loadMedicinesByCategory(String category, JTable medicineTable) {
      String query = "SELECT name, brand, form, strength, price, stock, expiration_date, medicineImage " +
                     "FROM medicine_basis WHERE category = ? ORDER BY category ASC";

      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
           PreparedStatement stmt = conn.prepareStatement(query)) {

          stmt.setString(1, category);
          ResultSet rs = stmt.executeQuery();

          // Clear the previous table data
          DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();
          model.setRowCount(0);

          // Define column names
          String[] columnNames = {
              "Select", "Medicine Name", "Brand", "Form", "Strength", "Price", "Stock", 
              "Expiration Date", "Medicine Image", "Quantity"
          };
          model.setColumnIdentifiers(columnNames);

          // Add new data to the table
          while (rs.next()) {
              String name = rs.getString("name");
              String brand = rs.getString("brand");
              String form = rs.getString("form");
              String strength = rs.getString("strength");
              double price = rs.getDouble("price");
              int stock = rs.getInt("stock");
              Date expirationDate = rs.getDate("expiration_date");

              byte[] medicineImage = rs.getBytes("medicineImage");
              ImageIcon icon = new ImageIcon(medicineImage);
              Image scaledImage = icon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
              icon = new ImageIcon(scaledImage);

              Object[] rowData = {
                  false,
                  name,
                  brand,
                  form,
                  strength,
                  price,
                  stock,
                  expirationDate,
                  icon,  // ✅ ImageIcon for medicine
                  1
              };

              model.addRow(rowData);
          }

          // Set row height para kasya image
          medicineTable.setRowHeight(60);

          // Set custom renderer for image column
          medicineTable.getColumnModel().getColumn(8).setCellRenderer(new DefaultTableCellRenderer() {
              @Override
              public Component getTableCellRendererComponent(JTable table, Object value,
                                                             boolean isSelected, boolean hasFocus, int row, int column) {
                  if (value instanceof ImageIcon) {
                      JLabel label = new JLabel();
                      label.setIcon((ImageIcon) value);
                      label.setHorizontalAlignment(JLabel.CENTER);
                      return label;
                  }
                  return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
              }
          });

      } catch (SQLException ex) {
          ex.printStackTrace();
          JOptionPane.showMessageDialog(null, "Error loading medicines by category.", "Error", JOptionPane.ERROR_MESSAGE);
      }
  }


       private void scanSelectedMedicinesAndDisplay(JTable medicineTable, JTextArea txtSummaryArea, JLabel lblSelectedCount, JLabel lblTotalQuantity) {
        DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();
        int rowCount = model.getRowCount();

        StringBuilder summary = new StringBuilder();
        int totalQuantity = 0;
        int selectedCount = 0;
        double totalPrice = 0;

        for (int i = 0; i < rowCount; i++) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0); // checkbox column

            if (Boolean.TRUE.equals(isSelected)) {
                selectedCount++;

                String medicineName = model.getValueAt(i, 1).toString(); // name column
                double price = Double.parseDouble(model.getValueAt(i, 5).toString()); // price column
                Object quantityValue = model.getValueAt(i, 9); // quantity column

                int quantity = 1;
                try {
                    if (quantityValue instanceof Integer) {
                        quantity = (Integer) quantityValue;
                    } else if (quantityValue instanceof String && !((String) quantityValue).isEmpty()) {
                        quantity = Integer.parseInt((String) quantityValue);
                    }
                } catch (NumberFormatException e) {
                    quantity = 1;
                }

                totalQuantity += quantity;
                totalPrice += price * quantity;

                summary.append("• ").append(medicineName)
                       .append(" — Qty: ").append(quantity)
                       .append(" @ ₱").append(String.format("%.2f", price))
                       .append("\n");
            }
        }

        if (selectedCount == 0) {
            JOptionPane.showMessageDialog(null, "Please select at least one medicine before proceeding.");
            return;
        }

       
        summary.append("\n──────────────\n");
        summary.append("Total Items: ").append(selectedCount).append("\n");
        summary.append("Total Quantity: ").append(totalQuantity).append("\n");
        summary.append("Total Price: ₱").append(String.format("%.2f", totalPrice));

        // Set outputs
        summaryngMEds.setText(summary.toString());
        lblSelectedCount.setText("Selected Items: " + selectedCount);
        lblTotalQuantity.setText("Total Quantity: " + totalQuantity);
}
       
       
       
    
        public void loadMedicineCategoriesIntoComboBox(JComboBox<String> categoryComboBox) {
        categoryComboBox.removeAllItems(); // Clear existing items

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");

            String sql = "SELECT DISTINCT category FROM medicine_basis ORDER BY category ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String category = rs.getString("category");
                categoryComboBox.addItem(category);
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error loading categories: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        medicineType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        summaryngMEds = new javax.swing.JTextArea();
        GeneraterecieptPAyment = new javax.swing.JButton();
        seeSummarybtn = new javax.swing.JButton();
        checkoutMeds = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(medicineType, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 230, 40));

        medicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(medicineTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 1030, 290));

        summaryngMEds.setColumns(20);
        summaryngMEds.setRows(5);
        jScrollPane2.setViewportView(summaryngMEds);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 800, 150));

        GeneraterecieptPAyment.setBackground(new java.awt.Color(255, 255, 255));
        GeneraterecieptPAyment.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        GeneraterecieptPAyment.setForeground(new java.awt.Color(0, 51, 153));
        GeneraterecieptPAyment.setText("Cancel");
        GeneraterecieptPAyment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneraterecieptPAymentActionPerformed(evt);
            }
        });
        jPanel1.add(GeneraterecieptPAyment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 670, 220, 40));

        seeSummarybtn.setBackground(new java.awt.Color(255, 255, 255));
        seeSummarybtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        seeSummarybtn.setForeground(new java.awt.Color(0, 51, 153));
        seeSummarybtn.setText("See Summary");
        seeSummarybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeSummarybtnActionPerformed(evt);
            }
        });
        jPanel1.add(seeSummarybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 570, 220, 40));

        checkoutMeds.setBackground(new java.awt.Color(255, 255, 255));
        checkoutMeds.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        checkoutMeds.setForeground(new java.awt.Color(0, 51, 153));
        checkoutMeds.setText("Checkout Medicines");
        checkoutMeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutMedsActionPerformed(evt);
            }
        });
        jPanel1.add(checkoutMeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 620, 220, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/subInterfaces/medsUi_meds.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, 1507, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeneraterecieptPAymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneraterecieptPAymentActionPerformed
        new patientDashboard(accountId).setVisible(rootPaneCheckingEnabled);
        dispose();
    }//GEN-LAST:event_GeneraterecieptPAymentActionPerformed

    private void seeSummarybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeSummarybtnActionPerformed
        scanSelectedMedicinesAndDisplay(medicineTable, summaryngMEds, jLabel1, jLabel1);
    }//GEN-LAST:event_seeSummarybtnActionPerformed

    private void checkoutMedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutMedsActionPerformed
    
    DefaultTableModel model = (DefaultTableModel) medicineTable.getModel();
    int rowCount = model.getRowCount();

    List<Object[]> selectedMedicines = new ArrayList<>();
    double totalCost = 0;

    for (int i = 0; i < rowCount; i++) {
        Boolean isSelected = (Boolean) model.getValueAt(i, 0);
        if (Boolean.TRUE.equals(isSelected)) {
            String medicineName = model.getValueAt(i, 1).toString();
            double price = 0;
            int quantity = 0;

            try {
                Object priceObj = model.getValueAt(i, 5);
                Object quantityObj = model.getValueAt(i, 9);

                if (priceObj == null || quantityObj == null) continue;

                price = Double.parseDouble(priceObj.toString());
                quantity = Integer.parseInt(quantityObj.toString());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "❌ Invalid number format in row " + (i + 1));
                continue;
            }

            double subTotal = price * quantity;
            totalCost += subTotal;

            selectedMedicines.add(new Object[]{medicineName, price, quantity, subTotal});
        }
    }

    if (selectedMedicines.isEmpty()) {
        JOptionPane.showMessageDialog(null, "⚠️ Please select medicines to checkout.");
        return;
    }

    String[] paymentOptions = {"Pay Now", "Mark as Pending"};
    int paymentChoice = JOptionPane.showOptionDialog(null,
            "Do you want to pay now or mark as pending?",
            "Payment Option",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            paymentOptions,
            paymentOptions[0]);

    if (paymentChoice == JOptionPane.CLOSED_OPTION) return;

    boolean isPending = (paymentChoice == 1);
    double amountPaid = 0;
    double change = 0;
    String method = null;
    String type = null;
    String paymentDetails = null;
    String paymentStatus = isPending ? "Pending" : "Paid";

    if (!isPending) {
        // Pay Now flow
        while (true) {
            String amountStr = JOptionPane.showInputDialog(null, "Enter Payment Amount (₱):");
            if (amountStr == null) return;
            try {
                amountPaid = Double.parseDouble(amountStr);
                if (amountPaid < totalCost) {
                    JOptionPane.showMessageDialog(null, "❌ Payment is less than the total cost.");
                } else break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "❌ Invalid payment amount.");
            }
        }

        change = amountPaid - totalCost;

        String[] paymentMethods = {"Cash", "GCash", "Bank Transfer"};
        method = (String) JOptionPane.showInputDialog(null, "Select Payment Method:", "Payment Method",
                JOptionPane.QUESTION_MESSAGE, null, paymentMethods, paymentMethods[0]);

        if (method == null) return;
        type = method.equals("Cash") ? "Over-the-Counter" : "Online";

        switch (method) {
            case "Cash":
                paymentDetails = "Paid in Cash";
                break;
            case "GCash":
                paymentDetails = JOptionPane.showInputDialog(null, "Enter GCash number:");
                break;
            case "Bank Transfer":
                paymentDetails = JOptionPane.showInputDialog(null, "Enter bank name and reference:");
                break;
        }

        if (paymentDetails == null || paymentDetails.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "⚠️ Payment details are required.");
            return;
        }

        String finalSummary =
                "🛒 Final Payment Summary 🛒\n\n" +
                "Total Cost: ₱" + String.format("%.2f", totalCost) + "\n" +
                "Amount Paid: ₱" + String.format("%.2f", amountPaid) + "\n" +
                "Change: ₱" + String.format("%.2f", change) + "\n" +
                "Payment Method: " + method + "\n" +
                "Payment Details: " + paymentDetails + "\n\n" +
                "Confirm to finalize purchase?";

        int finalConfirm = JOptionPane.showConfirmDialog(null, finalSummary, "Finalize Payment", JOptionPane.YES_NO_OPTION);
        if (finalConfirm != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "❌ Transaction cancelled.");
            return;
        }
    }

    // Save to database
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "")) {
        String insertSQL = "INSERT INTO buyedmeds (account_id, medicine_name, price, quantity, total, total_payed, med_change, payment_method, payment_type, payment_details, payment_status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(insertSQL);

        for (Object[] item : selectedMedicines) {
            ps.setInt(1, accountId);
            ps.setString(2, item[0].toString());
            ps.setDouble(3, (double) item[1]);
            ps.setInt(4, (int) item[2]);
            ps.setDouble(5, (double) item[3]);
            ps.setDouble(6, amountPaid);
            ps.setDouble(7, change);
            ps.setString(8, method);
            ps.setString(9, type);
            ps.setString(10, paymentDetails);
            ps.setString(11, paymentStatus);
            ps.addBatch();
        }
        ps.executeBatch();

        // Update stock
        String updateSQL = "UPDATE medicine_basis SET stock = stock - ? WHERE name = ?";
        PreparedStatement psStock = conn.prepareStatement(updateSQL);

        for (Object[] item : selectedMedicines) {
            psStock.setInt(1, (int) item[2]);
            psStock.setString(2, item[0].toString());
            psStock.addBatch();
        }
        psStock.executeBatch();

        JOptionPane.showMessageDialog(null, isPending ? "🕐 Purchase marked as pending." : "✅ Purchase successful!");

        int buyMore = JOptionPane.showConfirmDialog(null, "Do you want to buy more medicines?", "Continue Shopping?", JOptionPane.YES_NO_OPTION);
        if (buyMore == JOptionPane.YES_OPTION) {
            for (int i = 0; i < rowCount; i++) {
                model.setValueAt(false, i, 0);
                model.setValueAt("", i, 9);
            }
        } else {
            new patientDashboard(accountId).setVisible(true);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "❌ SQL Error: " + e.getMessage());
        e.printStackTrace();
    }


    }//GEN-LAST:event_checkoutMedsActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MedicinetoBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicinetoBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicinetoBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicinetoBuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicinetoBuy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GeneraterecieptPAyment;
    private javax.swing.JButton checkoutMeds;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable medicineTable;
    private javax.swing.JComboBox<String> medicineType;
    private javax.swing.JButton seeSummarybtn;
    private javax.swing.JTextArea summaryngMEds;
    // End of variables declaration//GEN-END:variables
}
