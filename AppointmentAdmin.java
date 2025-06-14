
package subInterfaces;
import javax.swing.JTabbedPane;
import javax.swing.JOptionPane;
import mainInterfaces.loginORsignup; 
import javax.swing.*;
import java.awt.*;
import mainInterfaces.adminDashboard;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import mainInterfaces.loginORsignup;
import mainInterfaces.patientDashboard;
import static mainInterfaces.patientDashboard.setLoggedInAccountID;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;


public class AppointmentAdmin extends javax.swing.JFrame {
        
        private int accountId;
        public AppointmentAdmin() {
        initComponents();
        setupPatientSelector();
        LoadadminDoctors();  // Load doctors into the combo box

       
        ChooseDoc.addActionListener(e -> {
        AdminLoadDocRate();

            // Fetch the selected doctor ID and update availability
            String selectedDoctor = (String) ChooseDoc.getSelectedItem();
            if (selectedDoctor != null) {
                int doctorId = getDoctorIdFromName(selectedDoctor);  
                updateDoctorAvailability(doctorId);  // Update availability combo box based on the selected doctor
            }
        });
        
        typeOfappointment.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            TypeofConsultationActionPerformed(evt);  // Call the method when a selection is made
        }
        });
        loadConsultationTypes();
        
        //calculate ng total
        reasonOfappointment.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            calculateTotalFee(); // Call your method here
        }
        });
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MENUBTN = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        MENUBTN1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        PATIENTID = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Pfullname = new javax.swing.JLabel();
        fullAddress = new javax.swing.JLabel();
        patientContact = new javax.swing.JLabel();
        pSex = new javax.swing.JLabel();
        patBithdate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicalHistory = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        ChooseDoc = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        specialityDOc = new javax.swing.JLabel();
        feeDoc = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        docTImeavailable = new javax.swing.JComboBox<>();
        dateApp = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        docFee = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        consultFee = new javax.swing.JLabel();
        totalFee = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        typeOfappointment = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        reasonOfappointment = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        confirmAppointment = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        MENUBTN.setContentAreaFilled(false);
        MENUBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 938, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MENUBTN1.setBackground(new java.awt.Color(255, 255, 255));
        MENUBTN1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        MENUBTN1.setText("MENU");
        MENUBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUBTN1ActionPerformed(evt);
            }
        });
        jPanel2.add(MENUBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 120, 40));

        jPanel6.setBackground(new java.awt.Color(0, 51, 153));

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));

        PATIENTID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        PATIENTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PATIENTIDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("✅ PATIENT INFORMATION: ");

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jLabel6.setText("SELECT PATIENT: ");

        Pfullname.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        Pfullname.setForeground(new java.awt.Color(0, 0, 102));
        Pfullname.setText("Name here");

        fullAddress.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        fullAddress.setForeground(new java.awt.Color(0, 0, 102));
        fullAddress.setText("Address");

        patientContact.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        patientContact.setForeground(new java.awt.Color(0, 0, 102));
        patientContact.setText("Contact Num");

        pSex.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        pSex.setForeground(new java.awt.Color(0, 0, 102));
        pSex.setText("Sex");

        patBithdate.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        patBithdate.setForeground(new java.awt.Color(0, 0, 102));
        patBithdate.setText("Birthday");

        medicalHistory.setColumns(20);
        medicalHistory.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        medicalHistory.setRows(5);
        jScrollPane1.setViewportView(medicalHistory);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(PATIENTID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(pSex, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(patBithdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientContact, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PATIENTID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pfullname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patientContact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pSex, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patBithdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(153, 204, 255));

        ChooseDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ChooseDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("DOCTOR INFORMATION");

        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jLabel12.setText("SELECT DOCTOR: ");

        specialityDOc.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        specialityDOc.setForeground(new java.awt.Color(0, 0, 102));
        specialityDOc.setText("Speciality");

        feeDoc.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        feeDoc.setForeground(new java.awt.Color(0, 0, 102));
        feeDoc.setText("Fee");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChooseDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(specialityDOc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feeDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChooseDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specialityDOc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feeDoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(153, 204, 255));

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel13.setText("DATE: ");

        jLabel14.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));

        jLabel15.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel15.setText("TIME: ");

        docTImeavailable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 51));
        jLabel18.setText("APPOINTMENT SCHEDULING: ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dateApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(docTImeavailable, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(docTImeavailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(153, 204, 255));

        jLabel16.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setText("APPOINTMENT SUMMARY: ");

        jLabel21.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel21.setText("DOCTOR'S FEE: ");

        docFee.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        docFee.setForeground(new java.awt.Color(0, 0, 102));
        docFee.setText("DOCTOR'S FEE: ");

        jLabel23.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel23.setText("CONSULT FEE: ");

        consultFee.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        consultFee.setForeground(new java.awt.Color(0, 0, 102));
        consultFee.setText("CONSULT FEE");

        totalFee.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        totalFee.setForeground(new java.awt.Color(0, 0, 102));
        totalFee.setText("TOTAL ");

        jLabel26.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel26.setText("TOTAL AMOUNT TO PAY: ");

        jLabel27.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel27.setText("SMART CARE, ANYTIME!");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(20, 20, 20))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docFee, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultFee, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalFee, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(docFee)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultFee)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalFee)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(153, 204, 255));

        typeOfappointment.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        typeOfappointment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 51));
        jLabel19.setText("REASON OF APPOINTMENT: ");

        jLabel20.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jLabel20.setText("SELECT TYPE: ");

        reasonOfappointment.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        reasonOfappointment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jLabel17.setText("SELECT REASON: ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeOfappointment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reasonOfappointment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeOfappointment, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reasonOfappointment, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        confirmAppointment.setBackground(new java.awt.Color(255, 255, 255));
        confirmAppointment.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        confirmAppointment.setText("CONFIRM APPOINTMENT");
        confirmAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAppointmentActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton2.setText("CANCEL ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(confirmAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 949, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Call this method in your constructor or form initialization
   public void setupPatientSelector() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String pass = "";

        Connection conn = DriverManager.getConnection(url, user, pass);

        // Load patient ID + name into combo box
        String queryIDs = "SELECT p.patientID, a.AccountID, a.firstName, a.middleName, a.lastName " +
                          "FROM patient p JOIN accounts a ON p.AccountID = a.AccountID";
        try (PreparedStatement ps = conn.prepareStatement(queryIDs);
             ResultSet rs = ps.executeQuery()) {

            PATIENTID.removeAllItems();
            while (rs.next()) {
                String patientID = rs.getString("patientID");
                String accountID = rs.getString("AccountID");
                String name = rs.getString("firstName") + " " +
                              rs.getString("middleName") + " " +
                              rs.getString("lastName");

                // Add both patientID and accountID together for display purposes
                PATIENTID.addItem(patientID + " - " + name);
                // Optionally, store the accountID in a map for easy lookup later
                patientAccountMap.put(patientID, accountID);
            }
        }

        // Action listener for patient selection
        PATIENTID.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) PATIENTID.getSelectedItem();
                
                // Check if the selected patient contains " - "
                if (selected != null && selected.contains(" - ")) {
                    // Extract patientID from the selected item
                    String[] parts = selected.split(" - ");
                    String patientID = parts[0];  // patientID (e.g., "123")
                    
                    // Use the patientID to fetch the associated AccountID from the map
                    String accountID = patientAccountMap.get(patientID); 
                    
                    // Convert the patientID to an integer
                    int patientIDInt = Integer.parseInt(patientID);

                    // Output the patient ID and account ID for debugging purposes
                    System.out.println("Selected Patient ID: " + patientIDInt);
                    System.out.println("Associated Account ID: " + accountID);
                    
                    // Now use the patientID to fetch details from the database
                    String queryDetails = "SELECT a.firstName, a.middleName, a.lastName, a.birthDate, a.Sex, a.contactNum, " +
                                          "p.AddStreet, p.AddBrgy, p.AddCity, p.medicalHistory " +
                                          "FROM patient p JOIN accounts a ON p.AccountID = a.AccountID " +
                                          "WHERE p.patientID = ?";
                    try (PreparedStatement ps = conn.prepareStatement(queryDetails)) {
                        ps.setInt(1, patientIDInt);  // Use the selected patientID to fetch details
                        ResultSet rs = ps.executeQuery();

                        if (rs.next()) {
                            // Populate the UI with patient details
                            String fullName = rs.getString("firstName") + " " +
                                              rs.getString("middleName") + " " +
                                              rs.getString("lastName");
                            String fullAdd = rs.getString("AddStreet") + ", " +
                                             rs.getString("AddBrgy") + ", " +
                                             rs.getString("AddCity");
                            String birthDate = rs.getString("birthDate");
                            String sex = rs.getString("Sex");
                            String contact = rs.getString("contactNum");
                            String medHistory = rs.getString("medicalHistory");

                            Pfullname.setText(fullName);
                            fullAddress.setText(fullAdd);
                            pSex.setText(sex);
                            patientContact.setText(contact);
                            medicalHistory.setText(medHistory);
                            patBithdate.setText(birthDate);
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database connection failed.");
    }
}

// Define a map to store patientID and corresponding AccountID
private Map<String, String> patientAccountMap = new HashMap<>();



    
             private int getDoctorIdFromName(String doctorName) {
       String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
       String user = "root";  // Database username
       String password = "";  // Database password
       int doctorId = -1;  // Default value if doctor is not found

       try (Connection conn = DriverManager.getConnection(url, user, password)) {
           // Query to get the doctor_id based on the doctorName
           String query = "SELECT d.doctor_id FROM accounts a " +
                          "JOIN telemed_doctors d ON a.AccountID = d.AccountID " +
                          "WHERE CONCAT('Dr. ', a.firstName, ' ', a.lastName) = ?";

           PreparedStatement pst = conn.prepareStatement(query);
           pst.setString(1, doctorName);  // Set the doctor name parameter
           ResultSet rs = pst.executeQuery();

           // If the doctor is found, get the doctor_id
           if (rs.next()) {
               doctorId = rs.getInt("doctor_id");
           }

           rs.close();
           pst.close();
       } catch (SQLException e) {
           System.err.println("SQL Exception: " + e.getMessage());
           JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
       }

       return doctorId;
   }
    
     private void LoadadminDoctors() {
    String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";

    try (Connection conn = DriverManager.getConnection(url, "root", "");
         // Prepare the query to fetch doctor names with the role of 'doctor' from the 'account' table
         PreparedStatement pst = conn.prepareStatement(
                                        "SELECT CONCAT('Dr. ', a.firstName, ' ', a.lastName) AS DoctorName, d.doctor_id " +
                                        "FROM accounts a " +
                                        "LEFT JOIN telemed_doctors d ON a.AccountID = d.AccountID " +
                                        "WHERE a.role = 'Doctor'"
                                    )){

        try (ResultSet rs = pst.executeQuery()) {
            ChooseDoc.removeAllItems();  // Clear the combo box before populating

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No available doctors found.");
                return;
            }

            // Populate the combo box with the doctor names
            while (rs.next()) {
                String doctorName = rs.getString("DoctorName");  // Retrieve the full doctor name with 'Dr.' prefix
                System.out.println("Retrieved Doctor: " + doctorName);  // Debugging

                ChooseDoc.addItem(doctorName);  // Add the doctor name to the combo box
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
    }
}

            private void AdminLoadDocRate() {
       String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
       String selectedDoctor = (String) ChooseDoc.getSelectedItem();

       if (selectedDoctor == null) {
           JOptionPane.showMessageDialog(null, "Please select a doctor first.");
           return;
       }

       // Debugging: Print the selected doctor's name before processing
       System.out.println("Selected Doctor: " + selectedDoctor);

       // Remove "Dr." if it exists at the beginning of the doctor's name after selection
       String doctorName = selectedDoctor;
       if (doctorName.startsWith("Dr. ")) {
           doctorName = doctorName.substring(4);  // Remove "Dr." part
       }

       // Debugging: Print the doctor name after removing "Dr."
       System.out.println("Doctor Name for Query (No 'Dr.' prefix): " + doctorName);

       // Query to fetch consultation fee and specialty based on the doctor name
       String docRateandSpeciality = "SELECT d.doctors_fee, d.specialty " +
                      "FROM telemed_doctors d " +
                      "JOIN accounts a ON d.AccountID = a.AccountID " +
                      "WHERE LOWER(CONCAT(a.firstName, ' ', a.lastName)) = LOWER(?)";

       try (Connection conn = DriverManager.getConnection(url, "root", "");
            // Prepare the query using PreparedStatement
            PreparedStatement pst = conn.prepareStatement(docRateandSpeciality)) {

           // Set the doctor name in the query (with "Dr." removed if present)
           pst.setString(1, doctorName);

           try (ResultSet rs = pst.executeQuery()) {
               if (rs.next()) {
                   // Retrieve the consultation fee and specialty
                   double consultationFee = rs.getDouble("doctors_fee");
                   String specialty = rs.getString("specialty");

                   // Debugging: Print the consultation fee and specialty
                   System.out.println("Consultation Fee: ₱" + consultationFee);
                   System.out.println("Specialty: " + specialty);

                   // Display the consultation fee and specialty on labels
                   feeDoc.setText( String.format("%.2f", consultationFee) + " Pesos " );
                   specialityDOc.setText( specialty);
               } else {
                   // Display message if rate or specialty is not found
                   JOptionPane.showMessageDialog(null, "Consultation fee and specialty not found for " + selectedDoctor);
               }
           }

       } catch (SQLException e) {
           // Print the error message for debugging
           System.err.println("SQL Exception: " + e.getMessage());
           JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
       }
   }

     private void updateDoctorAvailability(int doctorId) {
     String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
     String user = "root";  // Database username
     String password = "";  // Database password

     try (Connection conn = DriverManager.getConnection(url, user, password)) {  // Initialize conn within the method
         // Prepare the SQL query to get the doctor's availability
         String timeAvailability = "SELECT CONCAT(available_from, ' - ', available_to) AS availability " +
                                    "FROM doctors_availability " +
                                    "WHERE doctor_id = ? AND status = 'Available'";

         PreparedStatement pst = conn.prepareStatement(timeAvailability);
         pst.setInt(1, doctorId);  // Set the doctor_id parameter
         ResultSet rs = pst.executeQuery();

         // Clear the previous availability data from the combo box
         docTImeavailable.removeAllItems();

         // Populate the doctorAvailability combo box with the fetched availability
         while (rs.next()) {
             String availability = rs.getString("availability");
             docTImeavailable.addItem(availability);
         }

         rs.close();
         pst.close();
     } catch (SQLException e) {
         System.err.println("SQL Exception: " + e.getMessage());
         JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
     }
 }
               
        private void docTIme(int doctorId) {
     String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
     String user = "root";  // Database username
     String password = "";  // Database password

     try (Connection conn = DriverManager.getConnection(url, user, password)) {  // Initialize conn within the method
         // Prepare the SQL query to get the doctor's availability
         String timeAvailability = "SELECT CONCAT(available_from, ' - ', available_to) AS availability " +
                                    "FROM doctors_availability " +
                                    "WHERE doctor_id = ? AND status = 'Available'";

         PreparedStatement pst = conn.prepareStatement(timeAvailability);
         pst.setInt(1, doctorId);  // Set the doctor_id parameter
         ResultSet rs = pst.executeQuery();

         // Clear the previous availability data from the combo box
         docTImeavailable.removeAllItems();

         // Populate the doctorAvailability combo box with the fetched availability
         while (rs.next()) {
             String availability = rs.getString("availability");
             docTImeavailable.addItem(availability);
         }

         rs.close();
         pst.close();
     } catch (SQLException e) {
         System.err.println("SQL Exception: " + e.getMessage());
         JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
     }
 }
            
        
        private void loadConsultationTypes() {
    String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    String user = "root";  // Database username
    String password = "";  // Database password

    try (Connection conn = DriverManager.getConnection(url, user, password)) {
        // Query to fetch all consultation types (categories)
        String query = "SELECT DISTINCT reason_type FROM appointment_reason";  // Assuming a 'consultation_types' table exists

        PreparedStatement pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        // Clear previous items
        typeOfappointment.removeAllItems();

        // Add the fetched consultation types to the combo box
        while (rs.next()) {
            String category = rs.getString("reason_type");
            typeOfappointment.addItem(category);  // Add category to the combo box
        }

        rs.close();
        pst.close();
    } catch (SQLException e) {
        System.err.println("SQL Exception: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
    }
    }
    
    private void TypeofConsultationActionPerformed(java.awt.event.ActionEvent evt) {
   
    String selectedConsultationType = (String) typeOfappointment.getSelectedItem();
    loadReasonsForConsultation(selectedConsultationType);
    }
    
    
    private void loadReasonsForConsultation(String consultationType) {
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";  // Database username
        String password = "";  // Database password

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Query to fetch reasons for the selected consultation type
            String query = "SELECT reason_description FROM appointment_reason " +
                           "WHERE reason_type = ?";  // Assuming 'consultation_reasons' table has category and reason_description

            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, consultationType);  // Set the selected consultation type as parameter
            ResultSet rs = pst.executeQuery();

            // Clear previous reasons from the combo box
            reasonOfappointment.removeAllItems();

            // Add the fetched reasons to the combo box
            while (rs.next()) {
                String reason = rs.getString("reason_description");
                reasonOfappointment.addItem(reason);  // Add reason to the combo box
            }

            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
        }
    }
    
        private int getConsultationReasonId(String selectedReason) {
        int reasonId = -1;  // Default value if reason not found
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        
        String query = "SELECT consultation_reason_id FROM appointment_reason WHERE reason_description = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = conn.prepareStatement(query)) {

            // Set the selected reason as the parameter
            pst.setString(1, selectedReason);

            ResultSet rs = pst.executeQuery();

            // If a result is found, retrieve the reason ID
            if (rs.next()) {
                reasonId = rs.getInt("consultation_reason_id");
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
        }

        return reasonId;
    }
        
            private double calculateTotalFee() {
            String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
            String user = "root";
            String password = "";

            String selectedDoctor = (String) ChooseDoc.getSelectedItem();
            String selectedReason = (String) reasonOfappointment.getSelectedItem();

            double doctorFee = 0.0;
            double consultationFee = 0.0;

            try (Connection conn = DriverManager.getConnection(url, user, password)) {

                // Get doctor fee
                String doctorQuery = "SELECT d.doctor_id, d.doctors_fee FROM telemed_doctors d " +
                                     "JOIN accounts a ON d.AccountID = a.AccountID " +
                                     "WHERE CONCAT('Dr. ', a.firstName, ' ', a.lastName) = ?";
                PreparedStatement pstDoctor = conn.prepareStatement(doctorQuery);
                pstDoctor.setString(1, selectedDoctor);
                ResultSet rsDoctor = pstDoctor.executeQuery();

                if (rsDoctor.next()) {
                    doctorFee = rsDoctor.getDouble("doctors_fee");
                }

                rsDoctor.close();
                pstDoctor.close();

                // Get consultation reason fee
                String reasonQuery = "SELECT consultFee FROM appointment_reason WHERE reason_description = ?";
                PreparedStatement pstReason = conn.prepareStatement(reasonQuery);
                pstReason.setString(1, selectedReason);
                ResultSet rsReason = pstReason.executeQuery();

                if (rsReason.next()) {
                    consultationFee = rsReason.getDouble("consultFee");
                }

                rsReason.close();
                pstReason.close();

            } catch (SQLException e) {
                System.err.println("SQL Exception: " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
            }

            // Calculate total
            double total = doctorFee + consultationFee;

            // Update UI Labels
            docFee.setText("₱" + String.format("%.2f", doctorFee));
            consultFee.setText("₱" + String.format("%.2f", consultationFee));
            totalFee.setText("₱" + String.format("%.2f", total));

            return total; // <-- return this!
        }

        
            public int getPatientIdFromAccount(int accountId) {
        int patientId = -1;
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        String sql = "SELECT patientID FROM patient WHERE AccountID = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, accountId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                patientId = rs.getInt("patientID");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return patientId;
    }
        
        
        
        
            
    
    private void MENUBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUBTNActionPerformed
        // Set UI style for JOptionPane
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 12));

        // Menu options
        String[] options = {"About Teleclinic", "Logout", "Back to Menu", "Cancel"};

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

            // 👉 Log the logout activity
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
                 PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO useractivity_logs (AccountID, activity, activity_when) VALUES (?, ?, ?)")) {

                String activity = "Logged out";
                String timestamp = java.time.LocalDateTime.now().format(
                        java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                stmt.setInt(1, accountId); // make sure this variable is accessible
                stmt.setString(2, activity);
                stmt.setString(3, timestamp);
                stmt.executeUpdate();

                System.out.println("✅ Logout activity logged for AccountID: " + accountId);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "❌ Failed to log logout activity.\n" + e.getMessage());
                e.printStackTrace();
            }

            new loginORsignup().setVisible(true); // Open the login/signup page
            this.dispose(); // Close current window
        }
             break;

            case 2: // Back to Menu (Do nothing, just return to the main screen)
            JOptionPane.showMessageDialog(this, "Returning to main dashboard...");
            new adminDashboard(accountId).setVisible(true); // Open the login/signup page
            this.dispose();
            break;

            case 3:
            default:
            break;

        }
    }//GEN-LAST:event_MENUBTNActionPerformed

    private int getAccountIdFromPatient(int patientId) {
      String query = "SELECT AccountID FROM patient WHERE patientID = ?";
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement pst = conn.prepareStatement(query)) {
        pst.setInt(1, patientId);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            return rs.getInt("AccountID");  // Retrieve AccountID
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return -1;  // Return -1 if not found
}

    
    private void confirmAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAppointmentActionPerformed
        String selectedPatient = (String) PATIENTID.getSelectedItem();
        if (selectedPatient == null || !selectedPatient.contains(" - ")) {
            JOptionPane.showMessageDialog(null, "Please select a patient.");
            return;
        }

        // Extract patientID from selected string (e.g., "3 - Juan D Cruz")
        int patientId = Integer.parseInt(selectedPatient.split(" - ")[0]);

        // ✅ Now fetch AccountID from patientId
        int accountId = getAccountIdFromPatient(patientId);
        if (accountId == -1) {
            JOptionPane.showMessageDialog(null, "Account not found for the selected patient.");
            return;
        }

        // Get data from other form fields
        String selectedDoctor = (String) ChooseDoc.getSelectedItem();
        String selectedReason = (String) reasonOfappointment.getSelectedItem();
        Date selectedDateRaw = dateApp.getDate();  // Use Date object from JDateChooser
        String selectedTime = (String) docTImeavailable.getSelectedItem();

        // Validate all required fields
        if (selectedDoctor == null || selectedReason == null || selectedDateRaw == null || selectedTime == null || selectedTime.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        // 🛑 Check if selected date is in the past
        Date currentDate = new Date(); // now
        if (selectedDateRaw.before(currentDate)) {
            JOptionPane.showMessageDialog(null, "Appointment date cannot be in the past.");
            return;
        }

        // Format the date to "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String selectedDate = dateFormat.format(selectedDateRaw);

        // Fetch doctor ID and consultation reason ID
        int doctorId = getDoctorIdFromName(selectedDoctor);
        int consultationReasonId = getConsultationReasonId(selectedReason);

        // Default values
        String status = "Scheduled";
        double totalFee = calculateTotalFee();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "")) {

            // 🛑 Check for overlapping unavailable slots
            String overlapCheckQuery = "SELECT * FROM doctors_availability " +
            "WHERE doctor_id = ? AND status = 'unavailable' AND " +
            "((available_from <= ? AND available_to > ?) OR " +
            "(available_from < ? AND available_to >= ?) OR " +
            "(available_from >= ? AND available_to <= ?) OR " +
            "(available_from <= ? AND available_to >= ?))";

            PreparedStatement overlapCheckStmt = conn.prepareStatement(overlapCheckQuery);

            String[] timeParts = selectedTime.split(" - ");
            if (timeParts.length != 2) {
                JOptionPane.showMessageDialog(null, "Invalid time format. Please select a valid time.");
                return;
            }

            java.sql.Time appointmentStart = java.sql.Time.valueOf(timeParts[0].trim());
            java.sql.Time appointmentEnd = java.sql.Time.valueOf(timeParts[1].trim());

            overlapCheckStmt.setInt(1, doctorId);
            overlapCheckStmt.setTime(2, appointmentStart);
            overlapCheckStmt.setTime(3, appointmentStart);
            overlapCheckStmt.setTime(4, appointmentEnd);
            overlapCheckStmt.setTime(5, appointmentEnd);
            overlapCheckStmt.setTime(6, appointmentStart);
            overlapCheckStmt.setTime(7, appointmentEnd);
            overlapCheckStmt.setTime(8, appointmentStart);
            overlapCheckStmt.setTime(9, appointmentEnd);

            ResultSet rs = overlapCheckStmt.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "This time slot is already unavailable. Please choose another time.");
                return;
            }

            // ✅ No overlap → Proceed to insert appointment
            String insertQuery = "INSERT INTO appointment (AccountID, patient_id, doctor_id, appointment_date, " +
            "appointment_time, consultation_reason_id, status, fee) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);

            pst.setInt(1, accountId);
            pst.setInt(2, patientId);
            pst.setInt(3, doctorId);
            pst.setString(4, selectedDate);
            pst.setString(5, selectedTime);
            pst.setInt(6, consultationReasonId);
            pst.setString(7, status);
            pst.setDouble(8, totalFee);

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                ResultSet generatedKeys = pst.getGeneratedKeys();
                int appointmentId = -1;
                if (generatedKeys.next()) {
                    appointmentId = generatedKeys.getInt(1);
                }

                if (appointmentId != -1) {
                    // ✅ Insert into payment table
                    String paymentInsert = "INSERT INTO payments (account_id, appointment_id, totalAmout_tobepaid, status) " +
                    "VALUES (?, ?, ?, ?)";

                    PreparedStatement payStmt = conn.prepareStatement(paymentInsert);
                    payStmt.setInt(1, accountId);
                    payStmt.setInt(2, appointmentId);
                    payStmt.setDouble(3, totalFee);
                    payStmt.setString(4, "Pending");

                    int paymentRows = payStmt.executeUpdate();
                    if (paymentRows > 0) {
                        // ✅ Mark availability as unavailable
                        String updateAvailability = "UPDATE doctors_availability SET status = 'unavailable' " +
                        "WHERE doctor_id = ? AND available_from = ? AND available_to = ?";
                        PreparedStatement updateStmt = conn.prepareStatement(updateAvailability);
                        updateStmt.setInt(1, doctorId);
                        updateStmt.setTime(2, appointmentStart);
                        updateStmt.setTime(3, appointmentEnd);
                        updateStmt.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Appointment and payment record created!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Appointment created, but failed to create payment record.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Appointment created but failed to retrieve appointment ID.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Failed to create appointment.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error while processing: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_confirmAppointmentActionPerformed

    private void PATIENTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PATIENTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PATIENTIDActionPerformed

    private void MENUBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUBTN1ActionPerformed
        // Set UI style for JOptionPane
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 14));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 12));

        // Menu options
        String[] options = {"About Teleclinic", "Logout", "Back to Menu", "Cancel"};

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
                new loginORsignup().setVisible(true); // Open the login/signup page
                this.dispose(); // Close current window
            }
            break;

            case 2: // Back to Menu (Do nothing, just return to the main screen)
            JOptionPane.showMessageDialog(this, "Returning to main dashboard...");
            new adminDashboard(accountId).setVisible(true); // Open the login/signup page
            this.dispose();
            break;

            case 3:
            default:
            break;

        }
    }//GEN-LAST:event_MENUBTN1ActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChooseDoc;
    private javax.swing.JButton MENUBTN;
    private javax.swing.JButton MENUBTN1;
    private javax.swing.JComboBox<String> PATIENTID;
    private javax.swing.JLabel Pfullname;
    private javax.swing.JButton confirmAppointment;
    private javax.swing.JLabel consultFee;
    private com.toedter.calendar.JDateChooser dateApp;
    private javax.swing.JLabel docFee;
    private javax.swing.JComboBox<String> docTImeavailable;
    private javax.swing.JLabel feeDoc;
    private javax.swing.JLabel fullAddress;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea medicalHistory;
    private javax.swing.JLabel pSex;
    private javax.swing.JLabel patBithdate;
    private javax.swing.JLabel patientContact;
    private javax.swing.JComboBox<String> reasonOfappointment;
    private javax.swing.JLabel specialityDOc;
    private javax.swing.JLabel totalFee;
    private javax.swing.JComboBox<String> typeOfappointment;
    // End of variables declaration//GEN-END:variables
}
