
package subInterfaces;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.xdevapi.Statement;
import javax.swing.JTabbedPane;
import javax.swing.JOptionPane;
import mainInterfaces.loginORsignup; 
import javax.swing.*;
import java.awt.*;
import mainInterfaces.adminDashboard;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.security.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import mainInterfaces.SignUpform;
import mainInterfaces.SignUpformPatient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartPanel;


import org.jfree.chart.*;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.category.*;
import org.jfree.data.category.*;

public class managePatientADMIN extends javax.swing.JFrame {
    
    private static int loggedInAccountID; 
    Connection conn = null;
    
    public managePatientADMIN(int accountId) {
        initComponents();
        loggedInAccountID = accountId;
        displayAllAppointmentsForAdmin();
        updatePatientWithMostAppointments(mostPatient);
        updateTotalAppointments(totalApp);
        updateTotalPatients(totalPatien1);
        
        
        loadPatientAppChart();
        loadPatientData(tablePatients);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MENUBTN = new javax.swing.JButton();
        tabbPatients = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePatients = new javax.swing.JTable();
        viewInvent3 = new javax.swing.JButton();
        viewInvent4 = new javax.swing.JButton();
        viewInvent5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        appointmentAdmin = new javax.swing.JTable();
        reschedApp = new javax.swing.JButton();
        cancelAPP = new javax.swing.JButton();
        noshowApp = new javax.swing.JButton();
        showAppsummary = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        addPatient = new javax.swing.JButton();
        exportData = new javax.swing.JButton();
        mostPatient = new javax.swing.JLabel();
        totalApp = new javax.swing.JLabel();
        patientsApp = new javax.swing.JPanel();
        totalPatien1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MENUBTN.setContentAreaFilled(false);
        MENUBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUBTNActionPerformed(evt);
            }
        });
        getContentPane().add(MENUBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 30, 100, 70));

        tablePatients.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablePatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "AccountID", "PatientID", "Name", "Email Address", "Contact Num", "Address", "Med Histo", "BloodType"
            }
        ));
        jScrollPane1.setViewportView(tablePatients);

        viewInvent3.setBackground(new java.awt.Color(0, 153, 255));
        viewInvent3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        viewInvent3.setForeground(new java.awt.Color(255, 255, 255));
        viewInvent3.setText("ADD PATIENT");
        viewInvent3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvent3ActionPerformed(evt);
            }
        });

        viewInvent4.setBackground(new java.awt.Color(0, 153, 255));
        viewInvent4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        viewInvent4.setForeground(new java.awt.Color(255, 255, 255));
        viewInvent4.setText("UPDATE PATIENT");
        viewInvent4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvent4ActionPerformed(evt);
            }
        });

        viewInvent5.setBackground(new java.awt.Color(0, 153, 255));
        viewInvent5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        viewInvent5.setForeground(new java.awt.Color(255, 255, 255));
        viewInvent5.setText("DELETE PATIENT ");
        viewInvent5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvent5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(viewInvent3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewInvent4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewInvent5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewInvent3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewInvent4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewInvent5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tabbPatients.addTab("", jPanel3);

        appointmentAdmin.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        appointmentAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "PatientID", "Patient Name", "Doctor Name ", "Date", "Time", "Reason", "Status", "Total Fee"
            }
        ));
        jScrollPane5.setViewportView(appointmentAdmin);

        reschedApp.setBackground(new java.awt.Color(0, 153, 255));
        reschedApp.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        reschedApp.setForeground(new java.awt.Color(255, 255, 255));
        reschedApp.setText("RESCHEDULE");
        reschedApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reschedAppActionPerformed(evt);
            }
        });

        cancelAPP.setBackground(new java.awt.Color(0, 153, 255));
        cancelAPP.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cancelAPP.setForeground(new java.awt.Color(255, 255, 255));
        cancelAPP.setText("CANCEL ");
        cancelAPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAPPActionPerformed(evt);
            }
        });

        noshowApp.setBackground(new java.awt.Color(0, 153, 255));
        noshowApp.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        noshowApp.setForeground(new java.awt.Color(255, 255, 255));
        noshowApp.setText("MARK AS NO SHOW");
        noshowApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noshowAppActionPerformed(evt);
            }
        });

        showAppsummary.setBackground(new java.awt.Color(0, 153, 255));
        showAppsummary.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        showAppsummary.setForeground(new java.awt.Color(255, 255, 255));
        showAppsummary.setText("SHOW SUMMARY");
        showAppsummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAppsummaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(reschedApp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelAPP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noshowApp, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showAppsummary, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reschedApp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelAPP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noshowApp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showAppsummary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        tabbPatients.addTab("", jPanel4);

        getContentPane().add(tabbPatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 980, 520));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View Patients ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        addPatient.setBackground(new java.awt.Color(0, 153, 255));
        addPatient.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        addPatient.setForeground(new java.awt.Color(255, 255, 255));
        addPatient.setText("View Appointments");
        addPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientActionPerformed(evt);
            }
        });

        exportData.setBackground(new java.awt.Color(0, 153, 255));
        exportData.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        exportData.setForeground(new java.awt.Color(255, 255, 255));
        exportData.setText("Export Data");
        exportData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 576, Short.MAX_VALUE)
                .addComponent(exportData)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(exportData)))
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 980, 80));

        mostPatient.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        mostPatient.setForeground(new java.awt.Color(0, 0, 51));
        mostPatient.setText("MOST PATIENT");
        getContentPane().add(mostPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        totalApp.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        totalApp.setForeground(new java.awt.Color(0, 0, 51));
        totalApp.setText("TOTAL PATIENTS");
        getContentPane().add(totalApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        patientsApp.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout patientsAppLayout = new javax.swing.GroupLayout(patientsApp);
        patientsApp.setLayout(patientsAppLayout);
        patientsAppLayout.setHorizontalGroup(
            patientsAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        patientsAppLayout.setVerticalGroup(
            patientsAppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(patientsApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 310, 360));

        totalPatien1.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        totalPatien1.setForeground(new java.awt.Color(0, 0, 51));
        totalPatien1.setText("TOTAL PATIENTS");
        getContentPane().add(totalPatien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 610, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/subInterfaces/patients 2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1490, 800));

        jPanel7.setBackground(new java.awt.Color(0, 0, 51));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DOCTOR MANAGEMENT");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 560, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENUBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUBTNActionPerformed
        
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 12));

        // Menu options
        String[] options = {"About Teleclinic", "Back to Menu", "Cancel"};

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
            case 0: 
            JOptionPane.showMessageDialog(
                this,
                "🩺 Teleclinic: A modern online medical consultation platform.\n"
                + "Providing accessible healthcare solutions anytime, anywhere.\n\n"
                + "Stay healthy, stay connected!",
                "About Teleclinic",
                JOptionPane.INFORMATION_MESSAGE
            );
            break;

            case 1: // Back to Menu (Do nothing, just return to the main screen)
            JOptionPane.showMessageDialog(this, "Returning to main dashboard...");
            new adminDashboard(loggedInAccountID).setVisible(true); // Open the login/signup page
            this.dispose();
            break;

            case 2:
            default:
            break;

        }
    }//GEN-LAST:event_MENUBTNActionPerformed

        // table for patients 
        private void Loadpatients(){
        
        
        }
    
        private void displayAllAppointmentsForAdmin() {
    DefaultTableModel model = (DefaultTableModel) appointmentAdmin.getModel();
    model.setRowCount(0); // Clear table

    // Query with subqueries for patient and doctor information
    String query = """
        SELECT 
            a.appointment_id, 
            (SELECT patientID FROM patient pt WHERE pt.AccountID = a.AccountID) AS patient_id, 
            (SELECT CONCAT(firstName, ' ', middleName, ' ', lastName) FROM accounts p WHERE p.AccountID = a.AccountID) AS patient_name,
            (SELECT CONCAT(firstName, ' ', middleName, ' ', lastName) FROM accounts d WHERE d.AccountID = a.doctor_id) AS doctor_name,
            a.appointment_date, 
            a.appointment_time, 
            cr.reason_description, 
            a.status, 
            a.fee
        FROM appointment a
        JOIN appointment_reason cr ON a.consultation_reason_id = cr.consultation_reason_id
        ORDER BY a.appointment_date, a.appointment_time
    """;

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            int appointmentId = rs.getInt("appointment_id");
            int patientId = rs.getInt("patient_id"); // Retrieve patientID from subquery
            String patient = rs.getString("patient_name");
            String doctor = rs.getString("doctor_name");
            String date = rs.getString("appointment_date");
            String time = rs.getString("appointment_time");
            String reason = rs.getString("reason_description");
            String status = rs.getString("status");
            double fee = rs.getDouble("fee");

            model.addRow(new Object[]{appointmentId, patientId, patient, doctor, date, time, reason, status, fee});
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Failed to load appointments: " + e.getMessage());
        e.printStackTrace();
    }
}
        
    public void showAddPatientPopup() {
        JDialog addPatientDialog = new JDialog();
        addPatientDialog.setTitle("➕ Add New Patient");
        addPatientDialog.setSize(400, 600);
        addPatientDialog.setLocationRelativeTo(null);
        addPatientDialog.setModal(true);
        addPatientDialog.setLayout(new GridLayout(0, 2, 10, 10));

        // Create fields
        JTextField firstNameField = new JTextField();
        JTextField middleNameField = new JTextField();
        JTextField lastNameField = new JTextField();
        JTextField suffixField = new JTextField();
        JTextField birthDateField = new JTextField("yyyy-mm-dd");
        JComboBox<String> sexBox = new JComboBox<>(new String[]{"Male", "Female"});
        JTextField emailField = new JTextField();
        JTextField contactField = new JTextField();
        JTextField usernameField = new JTextField();
        JTextField passwordField = new JTextField();

        JTextField addCityField = new JTextField();
        JTextField addBrgyField = new JTextField();
        JTextField addStreetField = new JTextField();
        JTextField medHistoryField = new JTextField();
        JComboBox<String> bloodTypeBox = new JComboBox<>(new String[]{"A-","A+","B+","AB+","O+", "B-", "AB-", "O-"});

        JButton submitButton = new JButton("Save Patient");

        // Add components to dialog
        addPatientDialog.add(new JLabel("First Name:"));
        addPatientDialog.add(firstNameField);
        addPatientDialog.add(new JLabel("Middle Name:"));
        addPatientDialog.add(middleNameField);
        addPatientDialog.add(new JLabel("Last Name:"));
        addPatientDialog.add(lastNameField);
        addPatientDialog.add(new JLabel("Suffix:"));
        addPatientDialog.add(suffixField);
        addPatientDialog.add(new JLabel("Birth Date:"));
        addPatientDialog.add(birthDateField);
        addPatientDialog.add(new JLabel("Sex:"));
        addPatientDialog.add(sexBox);
        addPatientDialog.add(new JLabel("Email Address:"));
        addPatientDialog.add(emailField);
        addPatientDialog.add(new JLabel("Contact Number:"));
        addPatientDialog.add(contactField);
        addPatientDialog.add(new JLabel("Username:"));
        addPatientDialog.add(usernameField);
        addPatientDialog.add(new JLabel("Password:"));
        addPatientDialog.add(passwordField);
        addPatientDialog.add(new JLabel("City:"));
        addPatientDialog.add(addCityField);
        addPatientDialog.add(new JLabel("Barangay:"));
        addPatientDialog.add(addBrgyField);
        addPatientDialog.add(new JLabel("Street:"));
        addPatientDialog.add(addStreetField);
        addPatientDialog.add(new JLabel("Medical History:"));
        addPatientDialog.add(medHistoryField);
        addPatientDialog.add(new JLabel("Blood Type:"));
        addPatientDialog.add(bloodTypeBox);
        addPatientDialog.add(new JLabel());
        addPatientDialog.add(submitButton);

        // Button Action
        submitButton.addActionListener(e -> {
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "")) {

                // Insert into accounts
                String sql = "INSERT INTO accounts (Role, firstName, middleName, lastName, birthDate, Sex, emailAdd, contactNum, username, password, createdAt) " +
                             "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    String role = "Patient";

                    // Merge last name + suffix
                    String lastName = lastNameField.getText();
                    if (!suffixField.getText().isEmpty()) {
                        lastName += " " + suffixField.getText();
                    }

                    pstmt.setString(1, role);
                    pstmt.setString(2, firstNameField.getText());
                    pstmt.setString(3, middleNameField.getText());
                    pstmt.setString(4, lastName);
                    pstmt.setString(5, birthDateField.getText());
                    pstmt.setString(6, sexBox.getSelectedItem().toString());
                    pstmt.setString(7, emailField.getText());
                    pstmt.setString(8, contactField.getText());
                    pstmt.setString(9, usernameField.getText());
                    pstmt.setString(10, passwordField.getText());

                    // Execute the insert query
                    int rowsInserted = pstmt.executeUpdate();

                    if (rowsInserted > 0) {
                        // Select the AccountID based on the details just inserted
                        String selectSql = "SELECT AccountID FROM accounts WHERE firstName = ? AND middleName = ? AND lastName = ? " +
                                           "AND birthDate = ? AND Sex = ? AND emailAdd = ? AND contactNum = ? AND username = ?";
                        try (PreparedStatement selectStmt = conn.prepareStatement(selectSql)) {
                            selectStmt.setString(1, firstNameField.getText());
                            selectStmt.setString(2, middleNameField.getText());
                            selectStmt.setString(3, lastName);
                            selectStmt.setString(4, birthDateField.getText());
                            selectStmt.setString(5, sexBox.getSelectedItem().toString());
                            selectStmt.setString(6, emailField.getText());
                            selectStmt.setString(7, contactField.getText());
                            selectStmt.setString(8, usernameField.getText());

                            ResultSet rs = selectStmt.executeQuery();

                            if (rs.next()) {
                                int accountId = rs.getInt("AccountID");

                                // Insert into patient table using the AccountID
                                String patientSql = "INSERT INTO patient (AccountID, AddCity, AddBrgy, AddStreet, medicalHistory, bloodType) VALUES (?, ?, ?, ?, ?, ?)";
                                try (PreparedStatement patientStmt = conn.prepareStatement(patientSql)) {
                                    patientStmt.setInt(1, accountId);
                                    patientStmt.setString(2, addCityField.getText());
                                    patientStmt.setString(3, addBrgyField.getText());
                                    patientStmt.setString(4, addStreetField.getText());
                                    patientStmt.setString(5, medHistoryField.getText());
                                    patientStmt.setString(6, bloodTypeBox.getSelectedItem().toString());

                                    patientStmt.executeUpdate();
                                }

                                JOptionPane.showMessageDialog(addPatientDialog, "✅ Patient added successfully!");
                                addPatientDialog.dispose();
                            } else {
                                JOptionPane.showMessageDialog(addPatientDialog, "❌ Failed to retrieve AccountID.");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(addPatientDialog, "❌ Failed to add patient to accounts.");
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(addPatientDialog, "❌ Error: " + ex.getMessage());
                ex.printStackTrace();
            }
        });

        addPatientDialog.setVisible(true);
    }

       private void loadPatientData(JTable table) {
    // Database connection details
    String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    String user = "root";
    String password = "";

    // SQL query to retrieve patient details from the database
    String sql = "SELECT a.AccountID, p.PatientID, a.firstName, a.middleName, a.lastName,  a.emailAdd, a.contactNum, " +
                 "p.AddCity, p.AddBrgy, p.AddStreet, p.medicalHistory, p.bloodType " +
                 "FROM accounts a " +
                 "JOIN patient p ON a.AccountID = p.AccountID";

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        // Create a DefaultTableModel for the JTable
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Account ID");
        model.addColumn("Patient ID");
        model.addColumn("Full Name");
        model.addColumn("Email Address");
        model.addColumn("Contact Number");
        model.addColumn("Full Address");
        model.addColumn("Medical History");
        model.addColumn("Blood Type");

        // Populate the table with data
        while (rs.next()) {
            Vector<String> row = new Vector<>();
            
            // Account ID
            row.add(rs.getString("AccountID"));

            // Patient ID
            row.add(rs.getString("PatientID"));
            
            // Concatenate full name
            String fullName = rs.getString("firstName") + " " + 
                              rs.getString("middleName") + " " + 
                              rs.getString("lastName");
            row.add(fullName.trim());  // Ensure no extra spaces if suffix is empty

            row.add(rs.getString("emailAdd"));
            row.add(rs.getString("contactNum"));

            // Concatenate full address
            String fullAddress = rs.getString("AddCity") + ", " + 
                                 rs.getString("AddBrgy") + ", " + 
                                 rs.getString("AddStreet");
            row.add(fullAddress.trim());  // Ensure no extra commas if any part is empty

            row.add(rs.getString("medicalHistory"));
            row.add(rs.getString("bloodType"));

            model.addRow(row);
        }

        // Set the model to the JTable
        table.setModel(model);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading patient data: " + e.getMessage());
        e.printStackTrace();
    }
}

    private void updatePatientDetails() {
     int selectedRow = tablePatients.getSelectedRow(); // Assume this is your JTable
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "❗ Please select a patient to update.");
        return;
    }

    int accountId = Integer.parseInt(tablePatients.getValueAt(selectedRow, 0).toString());


    String query = "SELECT a.firstName, a.middleName, a.lastName, a.emailAdd, a.contactNum, " +
                   "p.AddCity, p.AddBrgy, p.AddStreet, p.medicalHistory, p.bloodType " +
                   "FROM accounts a " +
                   "LEFT JOIN patient p ON a.AccountID = p.AccountID " +
                   "WHERE a.AccountID = ?";

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setInt(1, accountId);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                String info = String.format("""
                    📄 Current Info:
                    First Name: %s
                    Middle Name: %s
                    Last Name: %s
                    Email: %s
                    Contact #: %s
                    City: %s
                    Barangay: %s
                    Street: %s
                    Medical History: %s
                    Blood Type: %s
                    """,
                    rs.getString("firstName"),
                    rs.getString("middleName"),
                    rs.getString("lastName"),
                    rs.getString("emailAdd"),
                    rs.getString("contactNum"),
                    rs.getString("AddCity"),
                    rs.getString("AddBrgy"),
                    rs.getString("AddStreet"),
                    rs.getString("medicalHistory"),
                    rs.getString("bloodType")
                );

                JOptionPane.showMessageDialog(null, info);

                String[] choices = {
                    "Email", "Contact Number", "City", "Barangay", "Street", "Medical History", "Blood Type"
                };
                String choice = (String) JOptionPane.showInputDialog(
                        null, "🛠 Choose what to update:", "Update Profile",
                        JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);

                if (choice == null) return;

                String newVal = JOptionPane.showInputDialog("New " + choice + ":");
                if (newVal == null || newVal.trim().isEmpty()) return;

                String sql = "";
                switch (choice) {
                    case "Email" -> sql = "UPDATE accounts SET emailAdd=? WHERE AccountID=?";
                    case "Contact Number" -> sql = "UPDATE accounts SET contactNum=? WHERE AccountID=?";
                    case "City" -> sql = "UPDATE patient SET AddCity=? WHERE AccountID=?";
                    case "Barangay" -> sql = "UPDATE patient SET AddBrgy=? WHERE AccountID=?";
                    case "Street" -> sql = "UPDATE patient SET AddStreet=? WHERE AccountID=?";
                    case "Medical History" -> sql = "UPDATE patient SET medicalHistory=? WHERE AccountID=?";
                    case "Blood Type" -> sql = "UPDATE patient SET bloodType=? WHERE AccountID=?";
                }

                try (PreparedStatement updateStmt = conn.prepareStatement(sql)) {
                    updateStmt.setString(1, newVal);
                    updateStmt.setInt(2, accountId);

                    int affected = updateStmt.executeUpdate();
                    if (affected > 0) {
                        JOptionPane.showMessageDialog(null, "✅ " + choice + " updated successfully!");
                        // Optionally refresh the table here
                    } else {
                        JOptionPane.showMessageDialog(null, "❌ Update failed.");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "❌ Error during update.\n" + e.getMessage());
                    e.printStackTrace();
                }

            } else {
                JOptionPane.showMessageDialog(null, "❌ Patient not found.");
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "❌ Error fetching data.\n" + e.getMessage());
        e.printStackTrace();
    }
}


    private void deletePatient() {
            
              int selectedRow = tablePatients.getSelectedRow(); // patientTable is your JTable name
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "❗ Please select a patient to delete.");
        return;
    }

    // Get the AccountID from the selected row (assuming column 0 is AccountID)
    int accountId = Integer.parseInt(tablePatients.getValueAt(selectedRow, 0).toString());

            
            
      String query = "SELECT a.firstName, a.middleName, a.lastName, a.emailAdd, a.contactNum, " +
                   "p.AddCity, p.AddBrgy, p.AddStreet, p.medicalHistory, p.bloodType " +
                   "FROM accounts a " +
                   "LEFT JOIN patient p ON a.AccountID = p.AccountID " +
                   "WHERE a.AccountID = ?";

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setInt(1, accountId);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                String info = String.format("""
                    📄 Current Info:
                    First Name: %s
                    Middle Name: %s
                    Last Name: %s
                    Email: %s
                    Contact #: %s
                    City: %s
                    Barangay: %s
                    Street: %s
                    Medical History: %s
                    Blood Type: %s
                    """,
                    rs.getString("firstName"),
                    rs.getString("middleName"),
                    rs.getString("lastName"),
                    rs.getString("emailAdd"),
                    rs.getString("contactNum"),
                    rs.getString("AddCity"),
                    rs.getString("AddBrgy"),
                    rs.getString("AddStreet"),
                    rs.getString("medicalHistory"),
                    rs.getString("bloodType")
                );

                // Confirm Deletion
                int confirm = JOptionPane.showConfirmDialog(null, info + "\nAre you sure you want to delete this patient?",
                                                            "Confirm Deletion", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    // Delete from patient table
                    String deletePatientQuery = "DELETE FROM patient WHERE AccountID = ?";
                    try (PreparedStatement deletePatientStmt = conn.prepareStatement(deletePatientQuery)) {
                        deletePatientStmt.setInt(1, accountId);
                        deletePatientStmt.executeUpdate();
                    }

                    // Delete from accounts table
                    String deleteAccountQuery = "DELETE FROM accounts WHERE AccountID = ?";
                    try (PreparedStatement deleteAccountStmt = conn.prepareStatement(deleteAccountQuery)) {
                        deleteAccountStmt.setInt(1, accountId);
                        int affectedRows = deleteAccountStmt.executeUpdate();

                        if (affectedRows > 0) {
                            JOptionPane.showMessageDialog(null, "✅ Patient deleted successfully!");

                            // Optionally refresh table here (e.g., reloadTableData())
                        } else {
                            JOptionPane.showMessageDialog(null, "❌ Deletion failed.");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "❌ Patient not found.");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "❌ Error during deletion.\n" + e.getMessage());
        e.printStackTrace();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        ////////reports part 
        
         private void loadPatientAppChart() {
        ChartPanel chartPanel = managePatientADMIN.generatePatientAppointmentChart();
        patientsApp.setLayout(new java.awt.BorderLayout());  // Important para di mag-siksikan
        patientsApp.add(chartPanel);
        patientsApp.revalidate();
    }
         
        public static ChartPanel generatePatientAppointmentChart() {
        // Create dataset for appointments and patients
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Database Connection
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        // Queries to get number of appointments and patients per day
        String appointmentsQuery = """
            SELECT DATE(appointment_date) AS appointment_date, COUNT(appointment_id) AS total_appointments
            FROM appointment
            GROUP BY DATE(appointment_date)
            ORDER BY appointment_date ASC
        """;

        String patientsQuery = """
            SELECT DATE(appointment_date) AS appointment_date, COUNT(DISTINCT patient_id) AS total_patients
            FROM appointment
            GROUP BY DATE(appointment_date)
            ORDER BY appointment_date ASC
        """;

        Map<String, Integer> totalAppointments = new HashMap<>();
        Map<String, Integer> totalPatients = new HashMap<>();

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Load total appointments
            try (PreparedStatement stmt = conn.prepareStatement(appointmentsQuery);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    String date = rs.getString("appointment_date");
                    int count = rs.getInt("total_appointments");
                    totalAppointments.put(date, count);
                }
            }

            // Load total patients
            try (PreparedStatement stmt = conn.prepareStatement(patientsQuery);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    String date = rs.getString("appointment_date");
                    int count = rs.getInt("total_patients");
                    totalPatients.put(date, count);
                }
            }

            // Merge all dates
            Set<String> allDates = new TreeSet<>();
            allDates.addAll(totalAppointments.keySet());
            allDates.addAll(totalPatients.keySet());

            // Populate dataset (bar chart)
            for (String date : allDates) {
                int appointments = totalAppointments.getOrDefault(date, 0);
                int patients = totalPatients.getOrDefault(date, 0);
                dataset.addValue(appointments, "Appointments", date);
                dataset.addValue(patients, "Patients", date);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Create the bar chart
        JFreeChart chart = ChartFactory.createBarChart(
                "TCM Daily Patients & Appointments",    // Title
                "Date",                             // X-axis
                "Count",                            // Y-axis
                dataset,                            // Dataset
                PlotOrientation.VERTICAL,           // Vertical orientation
                true,                               // Include legend
                true,                               // Tooltips enabled
                false                               // No URLs
        );

        // Customize chart appearance
        chart.setBackgroundPaint(Color.white);
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setDomainGridlinePaint(Color.blue);
        plot.setRangeGridlinePaint(Color.white);

        // Customize bar colors
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, new Color(66, 135, 245)); // Appointments - Blue
        renderer.setSeriesPaint(1, new Color(100, 221, 23)); // Patients - Green
        
         // Ensure the labels are visible and properly spaced
    plot.getDomainAxis().setCategoryLabelPositions(CategoryLabelPositions.UP_45); // Rotate labels at 45 degrees
    plot.getDomainAxis().setCategoryLabelPositionOffset(20);  // Add space between labels
        // Return the chart panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 500));
        chartPanel.setMouseWheelEnabled(true);
        return chartPanel;
    }
        
        
        
        public void updateTotalPatients(JLabel lblTotalPatients) {
        String query = "{CALL GetTotalPatients()}"; // Stored procedure name
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                int totalPatients = rs.getInt("totalPatients");
                lblTotalPatients.setText("Total Patients: " + totalPatients);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            lblTotalPatients.setText("Error fetching data");
        }
    }

    public void updatePatientWithMostAppointments(JLabel lblPatientWithMostAppointments) {
    String query = "{CALL GetPatientWithMostAppointments()}"; // Stored procedure name
    String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    String user = "root";
    String password = "";

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        if (rs.next()) {
            int patientId = rs.getInt("patientID");
            int accountId = rs.getInt("AccountID");
            String patientName = rs.getString("patientName");
            int totalAppointments = rs.getInt("totalAppointments");

            // Using HTML to display text on two lines
            String displayText = "<html>Patient ID: " + patientId + " - " + patientName + "<br>Total Appointments: " + totalAppointments + "</html>";
            lblPatientWithMostAppointments.setText(displayText);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        lblPatientWithMostAppointments.setText("Error fetching data");
    }
}

         public void updateTotalAppointments(JLabel lblTotalAppointments) {
        String query = "{CALL GetTotalAppointments()}"; // Stored procedure name
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                int totalAppointments = rs.getInt("totalAppointments");
                lblTotalAppointments.setText("Total Appointments: " + totalAppointments);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            lblTotalAppointments.setText("Error fetching data");
        }
    }

         
         
         
         
     ///////////////////////////////////appointments
         
    private void adminReschedAppointmentActionPerformed(java.awt.event.ActionEvent evt) {                                                      
    int selectedRow = appointmentAdmin.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select an appointment to reschedule.");
        return;
    }

    int appointmentId = (Integer) appointmentAdmin.getValueAt(selectedRow, 0);
    String originalDate = (String) appointmentAdmin.getValueAt(selectedRow, 4);
    String originalTime = (String) appointmentAdmin.getValueAt(selectedRow, 5);
    int patientId = (Integer) appointmentAdmin.getValueAt(selectedRow, 1); // Assuming patient ID is in the 5th column

    String newDate = JOptionPane.showInputDialog(null, "Enter new date (e.g. 2025-04-21):");
    String newTime = JOptionPane.showInputDialog(null, "Enter new time (e.g. 11:00:00 - 12:00:00):");
    String reason = JOptionPane.showInputDialog(null, "Enter reason for rescheduling:");

    if (newDate == null || newTime == null || reason == null ||
        newDate.trim().isEmpty() || newTime.trim().isEmpty() || reason.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required.");
        return;
    }

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "")) {
        
        // Update appointment status and date for the admin
        String newStatus = "Rescheduled";
        String updateQuery = "UPDATE appointment SET appointment_date = ?, appointment_time = ?, status = ? WHERE appointment_id = ?";

        try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
            updateStmt.setString(1, newDate);
            updateStmt.setString(2, newTime);
            updateStmt.setString(3, newStatus);
            updateStmt.setInt(4, appointmentId);
            updateStmt.executeUpdate();
        }

        // Log the rescheduling into appointment_reschedules table for tracking
        String logQuery = "INSERT INTO appointment_reschedules (appointment_id, rescheduled_by, original_date, original_time, new_date, new_time, reason, rescheduled_at) " +
                          "VALUES (?, ?, ?, ?, ?, ?, ?, NOW())";
        try (PreparedStatement logStmt = conn.prepareStatement(logQuery)) {
            logStmt.setInt(1, appointmentId);
            logStmt.setInt(2, loggedInAccountID); // loggedInAccountID for the admin who is rescheduling
            logStmt.setString(3, originalDate);
            logStmt.setString(4, originalTime);
            logStmt.setString(5, newDate);
            logStmt.setString(6, newTime);
            logStmt.setString(7, reason);
            logStmt.executeUpdate();
        }

        // Notify admin and patient (via email or notification - placeholder)
        // Send email or notifications about the reschedule if needed.
        
        JOptionPane.showMessageDialog(null, "Appointment successfully rescheduled.");
        displayAllAppointmentsForAdmin();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        e.printStackTrace();
    }
}
    
    
    private void cancelAppointmentAsAdmin() {
    int selectedRow = appointmentAdmin.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "⚠️ Please select an appointment to cancel.");
        return;
    }

    int appointmentId = (int) appointmentAdmin.getValueAt(selectedRow, 0); // Assuming column 0 is appointment_id

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement updateStmt = conn.prepareStatement("UPDATE appointment SET status = 'Cancelled' WHERE appointment_id = ?");
         PreparedStatement cancelLogStmt = conn.prepareStatement("INSERT INTO appointment_cancellations (appointment_id, cancelled_by, cancelled_at) VALUES (?, ?, NOW())")) {

        updateStmt.setInt(1, appointmentId);
        updateStmt.executeUpdate();

        cancelLogStmt.setInt(1, appointmentId);
        cancelLogStmt.setInt(2, loggedInAccountID); // admin ID
        cancelLogStmt.executeUpdate();

        JOptionPane.showMessageDialog(null, "✅ Appointment cancelled successfully!");
        displayAllAppointmentsForAdmin();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "❌ Error cancelling appointment:\n" + e.getMessage());
        e.printStackTrace();
    }
}

    private void markNoShowAsAdmin() {
    int selectedRow = appointmentAdmin.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "⚠️ Please select an appointment to mark as No Show.");
        return;
    }

    int appointmentId = (int) appointmentAdmin.getValueAt(selectedRow, 0); // Assuming column 0 is appointment_id

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement updateStmt = conn.prepareStatement("UPDATE appointment SET status = 'No Show' WHERE appointment_id = ?");
         PreparedStatement noShowLogStmt = conn.prepareStatement("INSERT INTO appointment_no_shows (appointment_id, marked_by, marked_at) VALUES (?, ?, NOW())")) {

        updateStmt.setInt(1, appointmentId);
        updateStmt.executeUpdate();

        noShowLogStmt.setInt(1, appointmentId);
        noShowLogStmt.setInt(2, loggedInAccountID); // admin ID
        noShowLogStmt.executeUpdate();

        JOptionPane.showMessageDialog(null, "✅ Appointment marked as No Show!");
        displayAllAppointmentsForAdmin();
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "❌ Error marking No Show:\n" + e.getMessage());
        e.printStackTrace();
    }
}
    
    
        private void showAppointmentSummary() {
            int completed = 0;
            int cancelled = 0;
            int noShow = 0;
            int rescheduled = 0;
            double totalFee = 0.0;

            DefaultTableModel model = (DefaultTableModel) appointmentAdmin.getModel();
            int rowCount = model.getRowCount();

            for (int i = 0; i < rowCount; i++) {
                String status = model.getValueAt(i, 7).toString(); // status column
                double fee = Double.parseDouble(model.getValueAt(i, 8).toString()); // fee column

                // Increment the respective status counters
                switch (status) {
                    case "Completed" -> completed++;
                    case "Cancelled" -> cancelled++;
                    case "No Show" -> noShow++;
                    case "Rescheduled" -> rescheduled++;
                }

                totalFee += fee;
            }

            // Update the summary without "Pending"
            String summary = String.format("""
                📋 Appointment Summary:

                Total Appointments: %d
                ✅ Completed: %d
                ❌ Cancelled: %d
                🚫 No Show: %d
                🔄 Rescheduled: %d

                💵 Total Fees: ₱%.2f
                """,
                rowCount, completed, cancelled, noShow, rescheduled, totalFee
            );

            JOptionPane.showMessageDialog(null, summary, "Appointment Summary", JOptionPane.INFORMATION_MESSAGE);
        }


// Add this MouseListener once sa appointmentAdmin table para sa Full Details ng selected row
    private void enableAppointmentFullDetailsPopup() {
        appointmentAdmin.addMouseListener(new MouseAdapter() {
            @Override
        public void mouseClicked(MouseEvent e) {
            int selectedRow = appointmentAdmin.getSelectedRow();
            if (selectedRow != -1) {
                DefaultTableModel model = (DefaultTableModel) appointmentAdmin.getModel();

                int appointmentId = (int) model.getValueAt(selectedRow, 0);
                int patientId = (int) model.getValueAt(selectedRow, 1);
                String patientName = model.getValueAt(selectedRow, 2).toString();
                String doctorName = model.getValueAt(selectedRow, 3).toString();
                String appointmentDate = model.getValueAt(selectedRow, 4).toString();
                String appointmentTime = model.getValueAt(selectedRow, 5).toString();
                String reason = model.getValueAt(selectedRow, 6).toString();
                String status = model.getValueAt(selectedRow, 7).toString();
                double fee = Double.parseDouble(model.getValueAt(selectedRow, 8).toString());

                String fullDetails = String.format("""
                    📄 Appointment Details:
                    
                    Appointment ID: %d
                    Patient ID: %d
                    Patient Name: %s
                    Doctor Name: %s
                    Date: %s
                    Time: %s
                    Reason: %s
                    Status: %s
                    Fee: ₱%.2f
                    """,
                    appointmentId, patientId, patientName, doctorName,
                    appointmentDate, appointmentTime, reason, status, fee
                );

                JOptionPane.showMessageDialog(null, fullDetails, "Appointment Details", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    });
}



    
    //// EXPORT TABLE 
   public static void exportTableToPDF(JTable table1, JTable table2) {
      // Show dialog to choose export option
    String[] options = {"Patient Table", "Appointment Table", "Export Both Tables"};
    int choice = JOptionPane.showOptionDialog(null, 
            "Choose which table(s) to export:", "Export Tables", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
            null, options, options[0]);

    if (choice == JOptionPane.CLOSED_OPTION) {
        return;  // If the user closes the dialog, cancel the export
    }

    // File chooser to save the PDF
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save PDF");
    fileChooser.setSelectedFile(new java.io.File("exported_table.pdf"));
    int result = fileChooser.showSaveDialog(null);

    if (result == JFileChooser.APPROVE_OPTION) {
        String filePath = fileChooser.getSelectedFile().getAbsolutePath();
        Document document = new Document();

        try {
            // Start the document and prepare to write to PDF
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Default font with reduced size
            com.itextpdf.text.Font font = FontFactory.getFont(FontFactory.HELVETICA, 10);

            // Export selected table(s) based on user's choice
            if (choice == 0 || choice == 2) {
                document.add(new Paragraph("Table 1:", font));
                PdfPTable pdfTable1 = new PdfPTable(table1.getColumnCount());

                // Add table 1 header
                for (int i = 0; i < table1.getColumnCount(); i++) {
                    PdfPCell cell = new PdfPCell(new Phrase(table1.getColumnName(i), font));
                    pdfTable1.addCell(cell);
                }

                // Add table 1 rows
                for (int row = 0; row < table1.getRowCount(); row++) {
                    for (int col = 0; col < table1.getColumnCount(); col++) {
                        Object value = table1.getValueAt(row, col);
                        PdfPCell cell = new PdfPCell(new Phrase(value == null ? "" : value.toString(), font));
                        pdfTable1.addCell(cell);
                    }
                }
                document.add(pdfTable1);
                document.newPage();  // To separate each table
            }

            if (choice == 1 || choice == 2) {
                document.add(new Paragraph("Table 2:", font));
                PdfPTable pdfTable2 = new PdfPTable(table2.getColumnCount());

                // Add table 2 header
                for (int i = 0; i < table2.getColumnCount(); i++) {
                    PdfPCell cell = new PdfPCell(new Phrase(table2.getColumnName(i), font));
                    pdfTable2.addCell(cell);
                }

                // Add table 2 rows
                for (int row = 0; row < table2.getRowCount(); row++) {
                    for (int col = 0; col < table2.getColumnCount(); col++) {
                        Object value = table2.getValueAt(row, col);
                        PdfPCell cell = new PdfPCell(new Phrase(value == null ? "" : value.toString(), font));
                        pdfTable2.addCell(cell);
                    }
                }
                document.add(pdfTable2);
                document.newPage();  // To separate each table
            }

            // Close the document after adding selected table(s)
            document.close();

            JOptionPane.showMessageDialog(null, "✅ PDF Exported Successfully to: " + filePath);
        } catch (FileNotFoundException | DocumentException e) {
            JOptionPane.showMessageDialog(null, "❌ Failed to export PDF:\n" + e.getMessage());
            e.printStackTrace();
        }
    }
}



 
    
    private void addPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientActionPerformed
      tabbPatients.setSelectedIndex(1);
    }//GEN-LAST:event_addPatientActionPerformed

    private void exportDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportDataActionPerformed
       // Assuming you have appointmentAdmin and anotherTable as JTable objects
        exportTableToPDF(tablePatients, appointmentAdmin);

    }//GEN-LAST:event_exportDataActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         tabbPatients.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void reschedAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reschedAppActionPerformed
        adminReschedAppointmentActionPerformed(evt);
    }//GEN-LAST:event_reschedAppActionPerformed

    private void cancelAPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAPPActionPerformed
       cancelAppointmentAsAdmin();
    }//GEN-LAST:event_cancelAPPActionPerformed

    private void noshowAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noshowAppActionPerformed
         markNoShowAsAdmin();
    }//GEN-LAST:event_noshowAppActionPerformed

    private void viewInvent3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvent3ActionPerformed
        showAddPatientPopup();
    }//GEN-LAST:event_viewInvent3ActionPerformed

    private void viewInvent4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvent4ActionPerformed
        updatePatientDetails();
    }//GEN-LAST:event_viewInvent4ActionPerformed

    private void viewInvent5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvent5ActionPerformed
        deletePatient();
    }//GEN-LAST:event_viewInvent5ActionPerformed

    private void showAppsummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAppsummaryActionPerformed
         showAppointmentSummary();
         enableAppointmentFullDetailsPopup(); 
    }//GEN-LAST:event_showAppsummaryActionPerformed

    //logs 
    private void logPatientTransaction(int accountId, int patientId, String actionType, String actionDetails, String performedBy) {
    String sql = "INSERT INTO patient_transactions (AccountID, PatientID, ActionType, ActionDetails, PerformedBy) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setInt(1, accountId);
        pstmt.setInt(2, patientId);
        pstmt.setString(3, actionType);
        pstmt.setString(4, actionDetails);
        pstmt.setString(5, performedBy);

        pstmt.executeUpdate();
        System.out.println("Patient transaction logged successfully.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error logging transaction: " + e.getMessage());
        e.printStackTrace();
    }
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
            java.util.logging.Logger.getLogger(managePatientADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managePatientADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managePatientADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managePatientADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managePatientADMIN(loggedInAccountID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MENUBTN;
    private javax.swing.JButton addPatient;
    private javax.swing.JTable appointmentAdmin;
    private javax.swing.JButton cancelAPP;
    private javax.swing.JButton exportData;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel mostPatient;
    private javax.swing.JButton noshowApp;
    private javax.swing.JPanel patientsApp;
    private javax.swing.JButton reschedApp;
    private javax.swing.JButton showAppsummary;
    private javax.swing.JTabbedPane tabbPatients;
    private javax.swing.JTable tablePatients;
    private javax.swing.JLabel totalApp;
    private javax.swing.JLabel totalPatien1;
    private javax.swing.JButton viewInvent3;
    private javax.swing.JButton viewInvent4;
    private javax.swing.JButton viewInvent5;
    // End of variables declaration//GEN-END:variables
}
