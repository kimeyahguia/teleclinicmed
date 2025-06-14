
package mainInterfaces;

import com.mysql.cj.jdbc.CallableStatement;
import db_clinicproj.db_Teleclinicmed;
import java.awt.Color;
import java.awt.Font;
import java.security.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import subInterfaces.AppointmentAdmin;
import subInterfaces.manageDocsADMIN;
import subInterfaces.manageInventoryBillsADMIN;
import subInterfaces.managePatientADMIN;
import java.sql.ResultSet;
import java.util.Vector;
import javax.lang.model.util.Types;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartPanel;
import subInterfaces.AUDIT_SECURITYS;


//graph 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;

public class adminDashboard extends javax.swing.JFrame {

  
    private static int loggedInAccountID; 

    public adminDashboard(int accountId) {
        loggedInAccountID = accountId;
        initComponents();
        
        //small reports 
        LoadtotalUser(totalUser);
        getTopUserActivity(TopUserofTelemed);
        loadRecentUserLogs(RecentLogs);
        
        //tables
        upcomingAppointments();
        
        
        //functions
        loadRevenueChart();
        updateConsultationRevenueLabel();
        updateMedicineRevenueLabel();
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        inventoryBtn = new javax.swing.JButton();
        billsandpayBtn = new javax.swing.JButton();
        addNotifiactions = new javax.swing.JButton();
        patientBtn = new javax.swing.JButton();
        doctorBtn = new javax.swing.JButton();
        MENUBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        totalUser = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TopUserofTelemed = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UpcomingAppointment = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        revenueMEds = new javax.swing.JLabel();
        revenueCOnsult1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        revenuechart = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        RecentLogs = new javax.swing.JTextArea();
        bookAppointment1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 120, 1510, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 736));

        inventoryBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        inventoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        inventoryBtn.setText("Inventory");
        inventoryBtn.setBorderPainted(false);
        inventoryBtn.setContentAreaFilled(false);
        inventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryBtnActionPerformed(evt);
            }
        });
        getContentPane().add(inventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 300, 60));

        billsandpayBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        billsandpayBtn.setForeground(new java.awt.Color(255, 255, 255));
        billsandpayBtn.setText("Billing and Payments");
        billsandpayBtn.setBorderPainted(false);
        billsandpayBtn.setContentAreaFilled(false);
        billsandpayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsandpayBtnActionPerformed(evt);
            }
        });
        getContentPane().add(billsandpayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 300, 60));

        addNotifiactions.setBackground(new java.awt.Color(255, 255, 255));
        addNotifiactions.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addNotifiactions.setForeground(new java.awt.Color(0, 51, 102));
        addNotifiactions.setText("Post Announcements");
        addNotifiactions.setBorder(null);
        addNotifiactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNotifiactionsActionPerformed(evt);
            }
        });
        getContentPane().add(addNotifiactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 240, 40));

        patientBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        patientBtn.setForeground(new java.awt.Color(255, 255, 255));
        patientBtn.setText("Patients");
        patientBtn.setBorderPainted(false);
        patientBtn.setContentAreaFilled(false);
        patientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBtnActionPerformed(evt);
            }
        });
        getContentPane().add(patientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 300, 60));

        doctorBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        doctorBtn.setForeground(new java.awt.Color(255, 255, 255));
        doctorBtn.setText("Doctors");
        doctorBtn.setBorderPainted(false);
        doctorBtn.setContentAreaFilled(false);
        doctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorBtnActionPerformed(evt);
            }
        });
        getContentPane().add(doctorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 300, 60));

        MENUBTN.setContentAreaFilled(false);
        MENUBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUBTNActionPerformed(evt);
            }
        });
        getContentPane().add(MENUBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 20, 90, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        totalUser.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        totalUser.setText("TOTAL USER: ");

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel7.setText("TOP USER: ");

        TopUserofTelemed.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        TopUserofTelemed.setText("TOP USER: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalUser)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TopUserofTelemed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TopUserofTelemed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel4.setText("UPCOMING SCHEDULED APPOINTMENTS: ");

        UpcomingAppointment.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        UpcomingAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "Patient", "Doctor", "Reason", "Date", "Time"
            }
        ));
        jScrollPane2.setViewportView(UpcomingAppointment);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        revenueMEds.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        revenueMEds.setText("REVENUE OVERALL");
        jPanel8.add(revenueMEds, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 380, -1));

        revenueCOnsult1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        revenueCOnsult1.setText("REVENUE OVERALL");
        jPanel8.add(revenueCOnsult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 390, -1));

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, 70));

        revenuechart.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout revenuechartLayout = new javax.swing.GroupLayout(revenuechart);
        revenuechart.setLayout(revenuechartLayout);
        revenuechartLayout.setHorizontalGroup(
            revenuechartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        revenuechartLayout.setVerticalGroup(
            revenuechartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel8.add(revenuechart, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 550, 200));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel5.setText("RECENT ACTIVITY LOGS: ");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        RecentLogs.setColumns(20);
        RecentLogs.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        RecentLogs.setRows(5);
        jScrollPane3.setViewportView(RecentLogs);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 320, 120));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 1000, 550));

        bookAppointment1.setBackground(new java.awt.Color(255, 255, 255));
        bookAppointment1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bookAppointment1.setForeground(new java.awt.Color(0, 51, 102));
        bookAppointment1.setText("Book An Appointment");
        bookAppointment1.setBorder(null);
        bookAppointment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointment1ActionPerformed(evt);
            }
        });
        getContentPane().add(bookAppointment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 240, 40));

        jPanel9.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 500, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kimberly urge\\Downloads\\PROJ PICS\\admin 1.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    
    
    
    
    
    
    
    
    
    
    public static void loadRecentUserLogs(JTextArea RecentLogs) {
    String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    String user = "root";
    String password = "";
    String query = "SELECT * FROM view_recent_user_logs WHERE activity_when >= CURDATE() - INTERVAL 3 DAY";
    StringBuilder logs = new StringBuilder();

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        boolean hasResults = false;

        while (rs.next()) {
            hasResults = true;
            int logId = rs.getInt("log_id");
            String fullName = rs.getString("full_name");
            String role = rs.getString("Role");
            String activity = rs.getString("activity");
            java.sql.Timestamp activityWhen = rs.getTimestamp("activity_when");

            logs.append("[").append(activityWhen).append("] ")
                .append(role).append(" - ").append(fullName).append(" - ").append(activity)
                .append("\n");
        }

        if (hasResults) {
            RecentLogs.setText(logs.toString());
        } else {
            RecentLogs.setText("📭 No user logs in the last 3 days.");
        }

    } catch (SQLException e) {
        RecentLogs.setText("❌ Error loading recent logs:\n" + e.getMessage());
        e.printStackTrace();
    }
}




       public static void getTopUserActivity(JLabel TopUser) {
        String result = "No data found.";
        String query = "SELECT * FROM view_top_user_activity";

        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String dbUser = "root";
        String dbPassword = "";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, dbUser, dbPassword); // connection opened
            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();

            if (rs.next()) {
                String role = rs.getString("Role");
                String fullName = rs.getString("full_name");
                int count = rs.getInt("total_activity");

                result = role + " | Name: " + fullName + " | Act Count: " + count;
                TopUser.setText(result);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Failed to retrieve top user activity:\n" + e.getMessage(),
                                          "Query Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try { if (rs != null) rs.close(); } catch (SQLException ignored) {}
            try { if (stmt != null) stmt.close(); } catch (SQLException ignored) {}
            // Connection not closed here
        }
    }
    
        public void LoadtotalUser(JLabel totalUser) { 
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String dbUser = "root";
        String dbPassword = "";

        try (Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);
             PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) AS total_users FROM accounts");
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                int totalUsers = rs.getInt("total_users");
                totalUser.setText("Total Users: " + totalUsers); // Set the label text with "Total Users: " before the count
            }

        } catch (SQLException e) {
            totalUser.setText("Error");
            e.printStackTrace();
        }
        }   
    
        private void upcomingAppointments() {
      String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
      String dbUser = "root", dbPassword = "";

      // Call the procedure to fetch upcoming appointments
      String query = "{CALL GetUpcomingAppointment()}"; // Make sure procedure name matches

      try (Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);
           CallableStatement stmt = (CallableStatement) conn.prepareCall(query);
           ResultSet rs = stmt.executeQuery()) {

          DefaultTableModel model = (DefaultTableModel) UpcomingAppointment.getModel();
          model.setRowCount(0); // Clear existing table data

          // Add rows to the table from the result set
          while (rs.next()) {
              model.addRow(new Object[]{
                  rs.getInt("AppointmentID"), 
                  rs.getString("Patient"),          // Patient name
                  rs.getString("Doctor"),           // Doctor name
                  rs.getString("Reason"),           // Reason for the appointment
                  rs.getString("AppointmentDate"),  // Appointment Date
                  rs.getString("AppointmentTime")   // Appointment Time
              });
          }

      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
      }
  }


      
    private void inventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryBtnActionPerformed
      new manageInventoryBillsADMIN().setVisible(true);
      dispose();
    }//GEN-LAST:event_inventoryBtnActionPerformed

    private void patientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBtnActionPerformed
         managePatientADMIN next = new managePatientADMIN(loggedInAccountID);
         next.setVisible(true);
         dispose();
    }//GEN-LAST:event_patientBtnActionPerformed

    private void billsandpayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsandpayBtnActionPerformed
     new manageInventoryBillsADMIN().setVisible(true);
      dispose();
    }//GEN-LAST:event_billsandpayBtnActionPerformed

    private void doctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorBtnActionPerformed
         manageDocsADMIN next = new manageDocsADMIN();
         next.setVisible(true);
         dispose(); 
    }//GEN-LAST:event_doctorBtnActionPerformed

    private void MENUBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUBTNActionPerformed
    
    UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
    UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 12));

    
    String[] options = {"About Teleclinic", "Logout", "Cancel"};

    // Show option dialog
    int choice = JOptionPane.showOptionDialog(
        this,
        "Welcome to Teleclinic!\n\nChoose an option below:",
        "Teleclinic Menu",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.PLAIN_MESSAGE,
        null,
        options,
        options[0]
    );

    // Perform actions based on user choice
    switch (choice) {
        case 0: // About Teleclinic
            JOptionPane.showMessageDialog(
                this,
                "🩺 Teleclinic: A modern online medical consultation platform.\n"
                + "Providing accessible healthcare solutions anytime, anywhere.\n\n"
                + "Stay healthy, stay connected!",
                "About Teleclinic",
                JOptionPane.INFORMATION_MESSAGE
            );
            break;

        case 1: // Logout
            int confirm = JOptionPane.showConfirmDialog(
                this, 
                "⚠ Are you sure you want to logout?\nYour session will be ended.", 
                "Logout Confirmation", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.WARNING_MESSAGE
            );
             if (confirm == JOptionPane.YES_OPTION) {

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
                 PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO useractivity_logs (AccountID, activity, activity_when) VALUES (?, ?, ?)")) {

                String activity = "Logged out";
                String timestamp = java.time.LocalDateTime.now().format(
                        java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                stmt.setInt(1, loggedInAccountID); // make sure this variable is accessible
                stmt.setString(2, activity);
                stmt.setString(3, timestamp);
                stmt.executeUpdate();

                System.out.println("✅ Logout activity logged for AccountID: " + loggedInAccountID);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "❌ Failed to log logout activity.\n" + e.getMessage());
                e.printStackTrace();
            }

            new loginORsignup().setVisible(true); // Open the login/signup page
            this.dispose(); // Close current window
        }
             break;

        case 2:
        default:
            break;
    
    }
    }//GEN-LAST:event_MENUBTNActionPerformed

    private void addNotifiactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNotifiactionsActionPerformed

            JTextArea textArea = new JTextArea(5, 20); 
            textArea.setWrapStyleWord(true); 
            textArea.setLineWrap(true);  
            JScrollPane scrollPane = new JScrollPane(textArea); 

            int option = JOptionPane.showConfirmDialog(null, scrollPane, "Enter Announcement Message", JOptionPane.OK_CANCEL_OPTION);

            if (option != JOptionPane.OK_OPTION || textArea.getText().trim().isEmpty()) {
                return;  // If canceled or no message, exit
            }

            String notification = textArea.getText().trim();  // Get the multi-line notification message

            // Choices for "who this is for"
            String[] choices = {"Everyone", "Patients", "Doctors"};
            String notificationFor = (String) JOptionPane.showInputDialog(
                null, 
                "Select who this announcement is for:", 
                "Select Recipient", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                choices, 
                choices[0]  // Default choice
            );

            if (notificationFor == null || notificationFor.trim().isEmpty()) {
                return;  // If canceled or no choice made, exit
            }

            // Get the current timestamp to show the user before posting
            String timestamp = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            // Show timestamp preview to the admin
            int confirm = JOptionPane.showConfirmDialog(null, 
                "Timestamp: " + timestamp + "\n\n" +
                "Message Preview: \n" + notification + "\n\n" +
                "Are you sure you want to post this announcement?", 
                "Confirm Announcement", JOptionPane.YES_NO_OPTION);

            if (confirm != JOptionPane.YES_OPTION) {
                return;  // If they cancel, exit
            }

            // Hardcoded postedBy as "Admin" (can be dynamic based on your app's login system)
            String postedBy = "Admin";  

            try {
                // Connect to DB
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
                CallableStatement cs = (CallableStatement) con.prepareCall("{CALL AddNotification(?, ?, ?)}");

                cs.setString(1, notification);
                cs.setString(2, postedBy);
                cs.setString(3, notificationFor);

                cs.execute();

                JOptionPane.showMessageDialog(null, "📢 Announcement posted successfully!");

                cs.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "❌ Failed to post announcement: " + e.getMessage());
            }
    }//GEN-LAST:event_addNotifiactionsActionPerformed

    private void bookAppointment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointment1ActionPerformed
        new AppointmentAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_bookAppointment1ActionPerformed

    // Database URL, username, and password
    private static final String DB_URL = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Update the Consultation Revenue Label
    public void updateConsultationRevenueLabel() {
        Connection conn = null;
        try {
            // Establish the connection to the database using the URL, username, and password
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // Call the GetConsultationRevenue procedure
            java.sql.CallableStatement stmtConsultation = conn.prepareCall("{CALL GetConsultationRevenue(?)}");
            stmtConsultation.registerOutParameter(1, java.sql.Types.DOUBLE);  // Fully qualified name
            stmtConsultation.execute();
            double consultationRevenue = stmtConsultation.getDouble(1);

            // Check if revenue is zero, then update label accordingly
            if (consultationRevenue == 0) {
                revenueCOnsult1.setText("No consultation revenue");
            } else {
                revenueCOnsult1.setText("Consultation Revenue: " + consultationRevenue);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connection if it's open
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Update the Medicine Revenue Label
    public void updateMedicineRevenueLabel() {
        Connection conn = null;
        try {
            // Establish the connection to the database using the URL, username, and password
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

            // Call the GetMedicineRevenue procedure
            java.sql.CallableStatement stmtMedicine = conn.prepareCall("{CALL GetMedicineRevenue(?)}");
             stmtMedicine.registerOutParameter(1, java.sql.Types.DOUBLE); 
            stmtMedicine.execute();
            double medicineRevenue = stmtMedicine.getDouble(1);

            // Check if revenue is zero, then update label accordingly
            if (medicineRevenue == 0) {
                revenueMEds.setText("No medicine revenue");
            } else {
                revenueMEds.setText("Medicine Revenue: " + medicineRevenue);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connection if it's open
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    
    
        private void loadRevenueChart() {
        ChartPanel chartPanel = adminDashboard.generateRevenueChart();
        revenuechart.setLayout(new java.awt.BorderLayout());  // Important para di mag-siksikan
        revenuechart.add(chartPanel);
        revenuechart.revalidate();
    }
            
    
       public static ChartPanel generateRevenueChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Database Connection
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        // Queries
        String consultationQuery = """
            SELECT DATE(payed_when) AS revenue_date, SUM(total_amount) AS consultation_revenue
            FROM payments
            WHERE status = 'Paid'
            GROUP BY DATE(payed_when)
            ORDER BY revenue_date ASC
        """;

        String medicineQuery = """
            SELECT DATE(buyed_when) AS revenue_date, SUM(total_payed) AS medicine_revenue
            FROM buyedmeds
            WHERE payment_status = 'Paid'
            GROUP BY DATE(buyed_when)
            ORDER BY revenue_date ASC
        """;

        Map<String, Double> consultationRevenue = new HashMap<>();
        Map<String, Double> medicineRevenue = new HashMap<>();

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            // Load consultation revenues
            try (PreparedStatement stmt = conn.prepareStatement(consultationQuery);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    String date = rs.getString("revenue_date");
                    double amount = rs.getDouble("consultation_revenue");
                    consultationRevenue.put(date, amount);
                }
            }

            // Load medicine revenues
            try (PreparedStatement stmt = conn.prepareStatement(medicineQuery);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    String date = rs.getString("revenue_date");
                    double amount = rs.getDouble("medicine_revenue");
                    medicineRevenue.put(date, amount);
                }
            }

            // Merge dates
            Set<String> allDates = new TreeSet<>();
            allDates.addAll(consultationRevenue.keySet());
            allDates.addAll(medicineRevenue.keySet());

            for (String date : allDates) {
                double consultation = consultationRevenue.getOrDefault(date, 0.0);
                double medicine = medicineRevenue.getOrDefault(date, 0.0);

                dataset.addValue(consultation, "Consultation", date);
                dataset.addValue(medicine, "Medicine", date);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create the line chart
        JFreeChart chart = ChartFactory.createLineChart(
                "TCM Daily Clinic Revenue",    // Title
                "Date",                    // X-axis
                "Revenue (PHP)",            // Y-axis
                dataset
        );

        // Set cleaner title
        chart.setTitle(new TextTitle("TCM Daily Clinic Revenue", new Font("Arial", Font.PLAIN, 12)));

        // Customize plot
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setDomainGridlinePaint(Color.lightGray);
        plot.setRangeGridlinePaint(Color.lightGray);

        // Customize line colors
        LineAndShapeRenderer renderer = new LineAndShapeRenderer();
        renderer.setSeriesPaint(0, new Color(66, 135, 245)); // Consultation - Blue
        renderer.setSeriesPaint(1, new Color(100, 221, 23)); // Medicine - Green

        // Make lines smooth
        renderer.setDefaultShapesVisible(true);
        renderer.setDefaultShapesFilled(true);

        // Tooltips
        renderer.setDefaultToolTipGenerator(new StandardCategoryToolTipGenerator());

        plot.setRenderer(renderer);

        // Return Chart Panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setDomainZoomable(false);
        chartPanel.setRangeZoomable(false);
        return chartPanel;
    }


    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard(loggedInAccountID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MENUBTN;
    private javax.swing.JTextArea RecentLogs;
    private javax.swing.JLabel TopUserofTelemed;
    private javax.swing.JTable UpcomingAppointment;
    private javax.swing.JButton addNotifiactions;
    private javax.swing.JButton billsandpayBtn;
    private javax.swing.JButton bookAppointment1;
    private javax.swing.JButton doctorBtn;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton patientBtn;
    private javax.swing.JLabel revenueCOnsult1;
    private javax.swing.JLabel revenueMEds;
    private javax.swing.JPanel revenuechart;
    private javax.swing.JLabel totalUser;
    // End of variables declaration//GEN-END:variables
}
