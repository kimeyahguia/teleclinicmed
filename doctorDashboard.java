
package mainInterfaces;
import com.mysql.cj.jdbc.Blob;
import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.xdevapi.Statement;
import db_clinicproj.db_Teleclinicmed;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import subInterfaces.bookaAppointment;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;


public class doctorDashboard extends javax.swing.JFrame {
    
    private JTextField txtName = new JTextField(20);
    private static int loggedInAccountID; // Store AccountID
    public doctorDashboard(int AccountID) {
        initComponents();
        
        loggedInAccountID = AccountID; 
        loadDoctorDetails(AccountID);  
        docAnnouncements();
        loadDoctorPatientsTable(AccountID);
        displayAppointments(AccountID);
        displayUpcomingAppointments(loggedInAccountID);
        displayPrescriptionTable();
        displayProfile(AccountID, picniDoc);
        
        
        //prescriptions
        comboPatientDoc.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (comboPatientDoc.getSelectedItem() != null) {
                String selected = comboPatientDoc.getSelectedItem().toString();
                int patientID = Integer.parseInt(selected.split(" - ")[0]);
                loadAppointmentsForPatient(loggedInAccountID, patientID, comboAppDoc,ReasonforAppointment);
                
                
                loadMedicines();
                loadEnumValues();
            }
        }
    });

    loadPatientsForDoctor(loggedInAccountID, comboAppDoc);
    
        Typemedicine.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String selectedType = (String) Typemedicine.getSelectedItem();
        if (selectedType != null) {
            loadMedicineNamesByType(selectedType);
        }
    }
    });
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        picniDoc = new javax.swing.JLabel();
        docName = new javax.swing.JLabel();
        docSpecial = new javax.swing.JLabel();
        docContact = new javax.swing.JLabel();
        docLicense = new javax.swing.JLabel();
        updateProfileniDOc = new javax.swing.JButton();
        viewAppbyDoc = new javax.swing.JButton();
        postOverallAnnouncement = new javax.swing.JButton();
        docEmail = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        announcementsDoc = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        AvailabilityDocs = new javax.swing.JButton();
        profilephotoBydoc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MENUBTN = new javax.swing.JButton();
        tabbdocsDashboard = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        addPrescription = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientDoctor = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        prescriptionsDoctor = new javax.swing.JTable();
        updatePrescriptionbyDoc = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        announcePerpatient = new javax.swing.JButton();
        viewfullDetailsbyDoc = new javax.swing.JButton();
        fulldeetsPrescription = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        upcomingappniDoc = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabbDocapp = new javax.swing.JTable();
        ManageStatusbyDoc = new javax.swing.JButton();
        backtomain = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        backtoMain = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        comboPatientDoc = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        comboAppDoc = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        diagnosisNiDoc = new javax.swing.JTextArea();
        Typemedicine = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        nameMEdicine = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        quantityMEd = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        frequencyMEd = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        routeMed = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        NoteDocPrescription = new javax.swing.JTextArea();
        durationMEd = new javax.swing.JComboBox<>();
        confirmPrescription = new javax.swing.JToggleButton();
        jLabel24 = new javax.swing.JLabel();
        ReasonforAppointment = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1599, 895, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel7.setText("DOCTOR'S PROFILE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, 20));

        jPanel7.setBackground(new java.awt.Color(0, 0, 51));

        picniDoc.setText("jLabel3");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picniDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picniDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 160, 150));

        docName.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        docName.setText("NAME ");
        jPanel2.add(docName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, 20));

        docSpecial.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        docSpecial.setText("Specialization");
        jPanel2.add(docSpecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, 20));

        docContact.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        docContact.setText("Contact Num: ");
        jPanel2.add(docContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, 20));

        docLicense.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        docLicense.setText("Liscence num");
        jPanel2.add(docLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, 20));

        updateProfileniDOc.setBackground(new java.awt.Color(255, 255, 255));
        updateProfileniDOc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        updateProfileniDOc.setForeground(new java.awt.Color(0, 51, 153));
        updateProfileniDOc.setText("Update Profile");
        updateProfileniDOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfileniDOcActionPerformed(evt);
            }
        });
        jPanel2.add(updateProfileniDOc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 120, 30));

        viewAppbyDoc.setBackground(new java.awt.Color(255, 255, 255));
        viewAppbyDoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        viewAppbyDoc.setForeground(new java.awt.Color(0, 51, 153));
        viewAppbyDoc.setText("View Appointments");
        viewAppbyDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAppbyDocActionPerformed(evt);
            }
        });
        jPanel2.add(viewAppbyDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 180, 40));

        postOverallAnnouncement.setBackground(new java.awt.Color(255, 255, 255));
        postOverallAnnouncement.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        postOverallAnnouncement.setForeground(new java.awt.Color(0, 51, 153));
        postOverallAnnouncement.setText("Post An Announcement");
        postOverallAnnouncement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postOverallAnnouncementActionPerformed(evt);
            }
        });
        jPanel2.add(postOverallAnnouncement, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 180, 40));

        docEmail.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        docEmail.setText("Email ");
        jPanel2.add(docEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, 20));

        announcementsDoc.setColumns(20);
        announcementsDoc.setRows(5);
        jScrollPane8.setViewportView(announcementsDoc);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 360, 100));

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("TCM Announcements! ");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 30));

        AvailabilityDocs.setBackground(new java.awt.Color(255, 255, 255));
        AvailabilityDocs.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        AvailabilityDocs.setForeground(new java.awt.Color(0, 51, 204));
        AvailabilityDocs.setText("Update Availability");
        AvailabilityDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailabilityDocsActionPerformed(evt);
            }
        });
        jPanel2.add(AvailabilityDocs, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 160, 40));

        profilephotoBydoc.setBackground(new java.awt.Color(255, 255, 255));
        profilephotoBydoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        profilephotoBydoc.setForeground(new java.awt.Color(0, 51, 204));
        profilephotoBydoc.setText("Profile Photo");
        profilephotoBydoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilephotoBydocActionPerformed(evt);
            }
        });
        jPanel2.add(profilephotoBydoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 160, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainInterfaces/doctor prof 2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 520));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 470, 530));

        MENUBTN.setContentAreaFilled(false);
        MENUBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUBTNActionPerformed(evt);
            }
        });
        jPanel1.add(MENUBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 680, 100, 60));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        addPrescription.setBackground(new java.awt.Color(255, 255, 255));
        addPrescription.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        addPrescription.setForeground(new java.awt.Color(0, 102, 204));
        addPrescription.setText("Add Prescription");
        addPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPrescriptionActionPerformed(evt);
            }
        });

        patientDoctor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        patientDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact", "Email", "BloodType", "Address"
            }
        ));
        jScrollPane1.setViewportView(patientDoctor);

        prescriptionsDoctor.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        prescriptionsDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient ID", "Name", "Date", "Status", "Medicine", "Quantity", "Frequency", "Duration", "Route"
            }
        ));
        jScrollPane7.setViewportView(prescriptionsDoctor);

        updatePrescriptionbyDoc.setBackground(new java.awt.Color(255, 255, 255));
        updatePrescriptionbyDoc.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        updatePrescriptionbyDoc.setForeground(new java.awt.Color(0, 102, 204));
        updatePrescriptionbyDoc.setText("Update Prescription");
        updatePrescriptionbyDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePrescriptionbyDocActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRESCRIPTIONS : ");

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PATIENTS:  ");

        announcePerpatient.setBackground(new java.awt.Color(255, 255, 255));
        announcePerpatient.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        announcePerpatient.setForeground(new java.awt.Color(0, 102, 204));
        announcePerpatient.setText("Annouce Notice");
        announcePerpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                announcePerpatientActionPerformed(evt);
            }
        });

        viewfullDetailsbyDoc.setBackground(new java.awt.Color(255, 255, 255));
        viewfullDetailsbyDoc.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        viewfullDetailsbyDoc.setForeground(new java.awt.Color(0, 102, 204));
        viewfullDetailsbyDoc.setText("View Full Details ");
        viewfullDetailsbyDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewfullDetailsbyDocActionPerformed(evt);
            }
        });

        fulldeetsPrescription.setBackground(new java.awt.Color(255, 255, 255));
        fulldeetsPrescription.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        fulldeetsPrescription.setForeground(new java.awt.Color(0, 102, 204));
        fulldeetsPrescription.setText("View Full Details");
        fulldeetsPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fulldeetsPrescriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(updatePrescriptionbyDoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(addPrescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fulldeetsPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(announcePerpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewfullDetailsbyDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(announcePerpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewfullDetailsbyDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatePrescriptionbyDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fulldeetsPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        tabbdocsDashboard.addTab("", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));

        jLabel14.setFont(new java.awt.Font("Century Schoolbook", 1, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TODAY'S APPOINTMENTS: ");

        upcomingappniDoc.setColumns(20);
        upcomingappniDoc.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        upcomingappniDoc.setRows(5);
        jScrollPane3.setViewportView(upcomingappniDoc);

        tabbDocapp.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tabbDocapp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Patient ID", "Name", "Date", "Time", "Reason", "Status"
            }
        ));
        tabbDocapp.setToolTipText("");
        jScrollPane4.setViewportView(tabbDocapp);

        ManageStatusbyDoc.setBackground(new java.awt.Color(255, 255, 255));
        ManageStatusbyDoc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ManageStatusbyDoc.setForeground(new java.awt.Color(0, 51, 204));
        ManageStatusbyDoc.setText("MANAGE STATUS");
        ManageStatusbyDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageStatusbyDocActionPerformed(evt);
            }
        });

        backtomain.setBackground(new java.awt.Color(255, 255, 255));
        backtomain.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        backtomain.setForeground(new java.awt.Color(0, 51, 204));
        backtomain.setText("Back");
        backtomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtomainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ManageStatusbyDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(backtomain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel14)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ManageStatusbyDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backtomain, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        tabbdocsDashboard.addTab("", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 51, 102));

        jLabel15.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" WRITE PRESCRIPTION");

        backtoMain.setBackground(new java.awt.Color(255, 255, 255));
        backtoMain.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        backtoMain.setForeground(new java.awt.Color(0, 51, 204));
        backtoMain.setText("Back");
        backtoMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoMainActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 51));
        jLabel22.setText("SELECT PATIENT: ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("WRITE DIAGNOSIS :");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 51));
        jLabel25.setText("MEDICINES: ");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 51));
        jLabel19.setText("NOTE: ");

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 51));
        jLabel27.setText("Type: ");

        comboPatientDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPatientDocActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 51));
        jLabel23.setText("SELECT APPOINTMENT: ");

        diagnosisNiDoc.setColumns(20);
        diagnosisNiDoc.setRows(5);
        jScrollPane5.setViewportView(diagnosisNiDoc);

        Typemedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypemedicineActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 51));
        jLabel28.setText("Name: ");

        nameMEdicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameMEdicineActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 51));
        jLabel29.setText("Qty: ");

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 51));
        jLabel30.setText("Frequency: ");

        frequencyMEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyMEdActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 51));
        jLabel31.setText("Duration: ");

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 51));
        jLabel32.setText("Route: ");

        routeMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeMedActionPerformed(evt);
            }
        });

        NoteDocPrescription.setColumns(20);
        NoteDocPrescription.setRows(5);
        jScrollPane6.setViewportView(NoteDocPrescription);

        durationMEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationMEdActionPerformed(evt);
            }
        });

        confirmPrescription.setBackground(new java.awt.Color(255, 255, 255));
        confirmPrescription.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        confirmPrescription.setForeground(new java.awt.Color(0, 51, 204));
        confirmPrescription.setText("CONFIRM");
        confirmPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPrescriptionActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 51));
        jLabel24.setText("REASON OF APP: ");

        ReasonforAppointment.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ReasonforAppointment.setForeground(new java.awt.Color(0, 0, 51));
        ReasonforAppointment.setText("rEAON NG APP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Typemedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel28)
                                        .addGap(28, 28, 28)
                                        .addComponent(nameMEdicine, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(frequencyMEd, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(durationMEd, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel29))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantityMEd)
                                    .addComponent(routeMed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboPatientDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(comboAppDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ReasonforAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboPatientDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboAppDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(ReasonforAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(quantityMEd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(Typemedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(nameMEdicine, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(frequencyMEd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(durationMEd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(routeMed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backtoMain))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backtoMain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tabbdocsDashboard.addTab("", jPanel6);

        jPanel1.add(tabbdocsDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 960, 530));

        jPanel8.setBackground(new java.awt.Color(128, 156, 249));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 680, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainInterfaces/doc ui na 2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 1520, 780));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public static void setLoggedInAccountID(int AccountID) {
        loggedInAccountID = AccountID; // Store globally
    }
    
        private void loadDoctorDetails(int loggedInAccountID) {
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        // 🔹 Complete query: Get all needed data from both tables (doctor + account)
        String query = "SELECT a.firstName, a.middleName, a.lastName, a.contactNum, a.emailAdd, " +
                       "d.specialty, d.licenseNum " +
                       "FROM telemed_doctors d " +
                       "JOIN accounts a ON d.AccountID = a.AccountID " +
                       "WHERE a.AccountID = ?";

        System.out.println("🔍 Checking AccountID: " + loggedInAccountID); // Debugging ID

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, loggedInAccountID); // Use the logged-in Account ID
            ResultSet rs = pstmt.executeQuery();

            // 🔹 Clear UI before setting new data
            docName.setText("Loading...");
            docSpecial.setText("Loading...");
            docContact.setText("Loading...");
            docEmail.setText("Loading...");
            docLicense.setText("Loading...");

            if (rs.next()) {
                System.out.println("✅ Data Found!");

                // 🔹 Fetch Data from ResultSet
                String fullName = rs.getString("firstName") + " " + rs.getString("middleName") + " " + rs.getString("lastName");
                String contactNumber = rs.getString("contactNum");
                String email = rs.getString("emailAdd");
                String specialty = rs.getString("specialty");
                String license = rs.getString("licenseNum");

                // 🔹 Set values to UI components
                docName.setText(fullName);
                docSpecial.setText(specialty);
                docContact.setText(contactNumber);
                docEmail.setText(email);
                docLicense.setText(license);

                // 🔹 Debugging: Print values to console
                System.out.println("📌 Name: " + fullName);
                System.out.println("📌 Contact: " + contactNumber);
                System.out.println("📌 Email: " + email);
                System.out.println("📌 Specialty: " + specialty);
                System.out.println("📌 License Number: " + license);

            } else {
                System.out.println("⚠ No data found for AccountID: " + loggedInAccountID);
                JOptionPane.showMessageDialog(null, "No data found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        }
    }

    private void docAnnouncements() {
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        String query = "CALL GetNotificationsForGroups('Doctors', 'Everyone')";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             java.sql.CallableStatement cstmt = conn.prepareCall(query);
             ResultSet rs = cstmt.executeQuery()) {

            StringBuilder notificationsText = new StringBuilder();
            boolean hasData = false;

            while (rs.next()) {
                hasData = true;

                String notification = rs.getString("notification");
                String postedBy = rs.getString("postedBy");

                java.sql.Timestamp postedAtTs = rs.getTimestamp("postedAt");
                String postedAt = (postedAtTs != null)
                        ? new SimpleDateFormat("MMM dd, yyyy HH:mm").format(postedAtTs)
                        : "Unknown date";

                if (notification == null) notification = "(No message)";
                if (postedBy == null) postedBy = "Unknown";

                notificationsText.append("📢 ").append(notification).append("\n")
                                 .append("🧑‍💼 Posted by: ").append(postedBy).append("\n")
                                 .append("🕒 Posted on: ").append(postedAt).append("\n\n");

                // Console debug
                System.out.println("Notification: " + notification +
                                   " | By: " + postedBy +
                                   " | Date: " + postedAt);
            }

            if (!hasData) {
                System.out.println("No notifications found in the database.");
                notificationsText.append("No new notifications.");
            }

            
            SwingUtilities.invokeLater(() -> {
                announcementsDoc.setText(notificationsText.toString());
            });

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading notifications: " + e.getMessage());
        
    }
}
    
        private void loadDoctorPatientsTable(int loggedInAccountID) {
                String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
            String user = "root";
            String password = "";

            String checkDoctorQuery = "SELECT AccountID FROM telemed_doctors WHERE AccountID = ?";

            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement checkDoctorStmt = conn.prepareStatement(checkDoctorQuery)) {

                checkDoctorStmt.setInt(1, loggedInAccountID);
                ResultSet rs = checkDoctorStmt.executeQuery();

                if (rs.next()) {
                    // Use DISTINCT to avoid duplicates (if a patient booked multiple appointments)
                    String query = "SELECT DISTINCT p.patientID, a.firstName, a.middleName, a.lastName, " +
                                   "a.contactNum, a.emailAdd, p.bloodType, " +
                                   "p.AddStreet, p.AddBrgy, p.AddCity " +
                                   "FROM appointment appt " +
                                   "JOIN patient p ON appt.patient_id = p.patientID " +
                                   "JOIN accounts a ON p.AccountID = a.AccountID " +
                                   "WHERE appt.doctor_id = ? " +
                                   "ORDER BY a.lastName ASC";

                    try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                        pstmt.setInt(1, loggedInAccountID);
                        ResultSet patientRs = pstmt.executeQuery();

                        String[] columnNames = {"Patient ID", "Name", "Contact", "Email", "Blood Type", "Address"};
                        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

                        while (patientRs.next()) {
                            int patientID = patientRs.getInt("patientID");
                            String fullName = patientRs.getString("firstName") + " " +
                                              patientRs.getString("middleName") + " " +
                                              patientRs.getString("lastName");
                            String contact = patientRs.getString("contactNum");
                            String email = patientRs.getString("emailAdd");
                            String bloodType = patientRs.getString("bloodType");

                            String address = patientRs.getString("AddStreet") + ", " +
                                             patientRs.getString("AddBrgy") + ", " +
                                             patientRs.getString("AddCity");

                            Object[] row = { patientID, fullName, contact, email, bloodType, address };
                            model.addRow(row);
                        }

                        patientDoctor.setModel(model);

                        // Hide patient ID column if needed
                        patientDoctor.getColumnModel().getColumn(0).setMinWidth(0);
                        patientDoctor.getColumnModel().getColumn(0).setMaxWidth(0);
                        patientDoctor.getColumnModel().getColumn(0).setWidth(0);

                    } catch (SQLException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "You are not authorized to view this patient's data.");
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
            }
    }


    
    
    
    private void updateProfileniDOcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfileniDOcActionPerformed
            // Assume loggedInAccountID is the AccountID of the currently logged-in user
    int accountId = loggedInAccountID;

    String query = "SELECT a.AccountID, a.firstName, a.middleName, a.lastName, a.emailAdd, a.contactNum, " +
                   "d.licenseNum, d.specialty, d.doctors_fee " +
                   "FROM accounts a " +
                   "LEFT JOIN telemed_doctors d ON a.AccountID = d.AccountID " +
                   "WHERE a.AccountID = ?";

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setInt(1, accountId);  // Using the logged-in AccountID

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                // Prepare the string with the current doctor's details
                String info = String.format("""
                    📄 Current Info:
                    First Name: %s
                    Middle Name: %s
                    Last Name: %s
                    Email: %s
                    Contact #: %s
                    License #: %s
                    Specialty: %s
                    Consultation Fee: %s
                    """,
                    rs.getString("firstName"),
                    rs.getString("middleName"),
                    rs.getString("lastName"),
                    rs.getString("emailAdd"),
                    rs.getString("contactNum"),
                    rs.getString("licenseNum"),
                    rs.getString("specialty"),
                    rs.getString("doctors_fee")
                );

                // Show the current doctor details in a popup
                JOptionPane.showMessageDialog(null, info);
            } else {
                JOptionPane.showMessageDialog(null, "❌ No doctor found with this AccountID.");
                System.out.println("Debug: No records found.");
            }
        }
    } catch (SQLException e) {
        System.out.println("SQL Error: " + e.getMessage());
        e.printStackTrace();
    }

    // Prompt to choose which field to update
    String[] choices = {
        "Email", "Contact Number", "License Number", "Specialty", "Consultation Fee"
    };
    String choice = (String) JOptionPane.showInputDialog(
            null, "🛠 Choose what to update:", "Update Profile",
            JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);

    if (choice == null) return;  // If user cancels

    String newVal = JOptionPane.showInputDialog("New " + choice + ":");
    if (newVal == null || newVal.trim().isEmpty()) return;  // If input is empty

    String sql = "";
    switch (choice) {
        case "Email" -> sql = "UPDATE accounts SET emailAdd=? WHERE AccountID=?";
        case "Contact Number" -> sql = "UPDATE accounts SET contactNum=? WHERE AccountID=?";
        case "License Number" -> sql = "UPDATE telemed_doctors SET licenseNum=? WHERE AccountID=?";
        case "Specialty" -> sql = "UPDATE telemed_doctors SET specialty=? WHERE AccountID=?";
        case "Consultation Fee" -> sql = "UPDATE telemed_doctors SET doctors_fee=? WHERE AccountID=?";
    }

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        if (choice.equals("Consultation Fee")) {
            stmt.setBigDecimal(1, new java.math.BigDecimal(newVal));  // Handle BigDecimal for fee
        } else {
            stmt.setString(1, newVal);  // Set the new value for the selected field
        }

        stmt.setInt(2, accountId);  // Using the logged-in AccountID

        int affected = stmt.executeUpdate();
        if (affected > 0) {
            JOptionPane.showMessageDialog(null, "✅ " + choice + " updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "❌ Update failed.");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "❌ Error during update.\n" + e.getMessage());
        e.printStackTrace();
    }

    }//GEN-LAST:event_updateProfileniDOcActionPerformed

    private void viewAppbyDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAppbyDocActionPerformed
        tabbdocsDashboard.setSelectedIndex(1);
    }//GEN-LAST:event_viewAppbyDocActionPerformed

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

            // 👉 Log the logout activity
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

    private void postOverallAnnouncementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postOverallAnnouncementActionPerformed
                // Get announcement message from doctor
       JTextArea textArea = new JTextArea(5, 20);
       textArea.setWrapStyleWord(true);
       textArea.setLineWrap(true);
       JScrollPane scrollPane = new JScrollPane(textArea);

       int option = JOptionPane.showConfirmDialog(null, scrollPane, "📢 Enter Announcement Message", JOptionPane.OK_CANCEL_OPTION);

       if (option != JOptionPane.OK_OPTION || textArea.getText().trim().isEmpty()) {
           return;
       }

       String announcementMessage = textArea.getText().trim();

       // Timestamp
       String timestamp = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

       String postedBy = "";
       int doctorId = -1;

       try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "")) {

           String doctorAbbre = "Dr";
           PreparedStatement nameStmt = conn.prepareStatement(
               "SELECT CONCAT(firstName, ' ', lastName) AS fullName FROM accounts WHERE AccountID = ?");
           nameStmt.setInt(1, loggedInAccountID);
           ResultSet nameRs = nameStmt.executeQuery();
           if (nameRs.next()) {
               String fullName = nameRs.getString("fullName");
               postedBy = doctorAbbre + " " + fullName;
           } else {
               JOptionPane.showMessageDialog(null, "❌ Unable to find doctor name.");
               return;
           }

           // Get doctor_id from doctors table using AccountID
           PreparedStatement doctorStmt = conn.prepareStatement(
               "SELECT doctor_id FROM telemed_doctors WHERE accountID = ?");
           doctorStmt.setInt(1, loggedInAccountID);
           ResultSet doctorRs = doctorStmt.executeQuery();
           if (doctorRs.next()) {
               doctorId = doctorRs.getInt("doctor_id");
           } else {
               JOptionPane.showMessageDialog(null, "❌ Doctor not found in doctors table.");
               return;
           }

           // Confirm before posting
           int confirm = JOptionPane.showConfirmDialog(null,
                   "Doctor: " + postedBy + "\n" +
                   "Timestamp: " + timestamp + "\n\n" +
                   "Message Preview:\n" + announcementMessage + "\n\n" +
                   "Post this announcement to all your patients?",
                   "Confirm Announcement", JOptionPane.YES_NO_OPTION);

           if (confirm != JOptionPane.YES_OPTION) return;

                    // Get all unique patient IDs this doctor has appointments with
            PreparedStatement getPatientsStmt = conn.prepareStatement(
                    "SELECT DISTINCT patient_id FROM appointment WHERE doctor_id = ?");
            getPatientsStmt.setInt(1, doctorId);
            ResultSet rs = getPatientsStmt.executeQuery();

            // Insert the announcement (no actual use of patient_id in insert)
            PreparedStatement insertNotifStmt = conn.prepareStatement(
                    "INSERT INTO notifications (notification, notificationFor, postedBy, postedAt) VALUES (?, ?, ?, ?)");

            String notifFor = "Patients";
            int count = 0;

            while (rs.next()) {
                insertNotifStmt.setString(1, announcementMessage); // notification
                insertNotifStmt.setString(2, notifFor);            // notificationFor
                insertNotifStmt.setString(3, postedBy);            // posted_by
                insertNotifStmt.setString(4, timestamp);           // timestamp

                insertNotifStmt.executeUpdate();
                count++;
            }

            if (count > 0) {
                JOptionPane.showMessageDialog(null, "📢 Announcement sent to " + count + " patients.");
            } else {
                JOptionPane.showMessageDialog(null, "⚠️ No patients found to receive the announcement.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Database error.\n" + e.getMessage());
            e.printStackTrace();
       }

    }//GEN-LAST:event_postOverallAnnouncementActionPerformed
    
    /////////////////////////////doctor prescriptins////////////////////////////////////////////
    
                    private void loadPatientsForDoctor(int loggedInDoctorID, JComboBox<String> patientComboBox) {
                    String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
                    String user = "root";  // Database username
                    String password = "";  // Database password

                    try (Connection conn = DriverManager.getConnection(url, user, password)) {
                        // Query to fetch patients who have an appointment with the logged-in doctor
                         String query = "SELECT DISTINCT p.patientID, CONCAT(a.firstName, ' ', a.middleName, ' ', a.lastName) AS fullname " +
                        "FROM appointment ap " +
                        "JOIN accounts a ON ap.AccountID = a.AccountID " +
                        "JOIN patient p ON a.AccountID = p.AccountID " +
                        "WHERE ap.doctor_id = ?";

                        PreparedStatement pst = conn.prepareStatement(query);
                        pst.setInt(1, loggedInDoctorID);  // Set the logged-in doctor's ID as parameter
                        ResultSet rs = pst.executeQuery();

                        // Clear previous patients from the combo box
                        patientComboBox.removeAllItems();

                        // Add the fetched patients to the combo box
                        while (rs.next()) {
                            String patientDisplay = rs.getInt("patientID") + " - " + rs.getString("fullname");
                            comboPatientDoc.addItem(patientDisplay);  // Add patient to the combo box
                        }

                        rs.close();
                        pst.close();
                    } catch (SQLException e) {
                        System.err.println("SQL Exception: " + e.getMessage());
                        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
                    }
                }
                    
                     private void loadAppointmentsForPatient(int loggedInDoctorID, int patientID, JComboBox<String> appointmentComboBox, JLabel Reason) {
                     String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
                     String user = "root";
                     String password = "";

                     try (Connection conn = DriverManager.getConnection(url, user, password)) {
                         // Query to fetch appointments with their consultation reasons
                         String query = "SELECT a.appointment_id, a.appointment_date, a.appointment_time, r.reason_description " +
                                        "FROM appointment a " +
                                        "JOIN appointment_reason r ON a.consultation_reason_id = r.consultation_reason_id " +
                                        "WHERE a.doctor_id = ? AND a.patient_id = ?";

                         PreparedStatement pst = conn.prepareStatement(query);
                         pst.setInt(1, loggedInDoctorID);
                         pst.setInt(2, patientID);
                         ResultSet rs = pst.executeQuery();

                         // Clear previous items
                         appointmentComboBox.removeAllItems();

                         // Store the first reason to show in the label later
                         String firstReason = "";

                         while (rs.next()) {
                             String apptDisplay = rs.getInt("appointment_id") + " - " +
                                                  rs.getDate("appointment_date") + " " +
                                                  rs.getString("appointment_time");
                             appointmentComboBox.addItem(apptDisplay);

                             if (firstReason.isEmpty()) {
                                 firstReason = rs.getString("reason_description");
                             }
                         }

                         // Set the label to the first appointment's reason (or clear if none)
                         if (!firstReason.isEmpty()) {
                             ReasonforAppointment.setText( firstReason);
                         } else {
                             ReasonforAppointment.setText("No appointments found.");
                         }

                         rs.close();
                         pst.close();
                     } catch (SQLException e) {
                         System.err.println("SQL Exception: " + e.getMessage());
                         JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
                     }
                 }

                    
                    
                                 private void loadMedicines() {
                                 String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
                                 String user = "root";
                                 String password = "";

                                 try (Connection conn = DriverManager.getConnection(url, user, password)) {
                                     String query = "SELECT DISTINCT category FROM medicine_basis";

                                     PreparedStatement pst = conn.prepareStatement(query);
                                     ResultSet rs = pst.executeQuery();

                                     Typemedicine.removeAllItems();
                                     while (rs.next()) {
                                         Typemedicine.addItem(rs.getString("category"));
                                     }

                                     rs.close();
                                     pst.close();
                                 } catch (SQLException e) {
                                     System.err.println("SQL Exception: " + e.getMessage());
                                     JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
                                 }
                             }
                                 
                                 private void loadMedicineNamesByType(String selectedType) {
                                String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
                                String user = "root";
                                String password = "";

                                try (Connection conn = DriverManager.getConnection(url, user, password)) {
                                    String query = "SELECT name FROM medicine_basis WHERE category = ?";

                                    PreparedStatement pst = conn.prepareStatement(query);
                                    pst.setString(1, selectedType);
                                    ResultSet rs = pst.executeQuery();

                                    nameMEdicine.removeAllItems(); // clear previous names

                                    while (rs.next()) {
                                        nameMEdicine.addItem(rs.getString("name"));
                                    }

                                    rs.close();
                                    pst.close();
                                } catch (SQLException e) {
                                    System.err.println("SQL Exception: " + e.getMessage());
                                    JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
                                }
                            }



                    
                            private void loadEnumValues() {
                             String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
                             String user = "root";
                             String password = "";

                             try (Connection conn = DriverManager.getConnection(url, user, password)) {
                                 // Frequency
                                 frequencyMEd.removeAllItems();
                                 try (PreparedStatement pst = conn.prepareStatement("SELECT frequency FROM frequency_options")) {
                                     ResultSet rs = pst.executeQuery();
                                     while (rs.next()) {
                                         frequencyMEd.addItem(rs.getString("frequency"));
                                     }
                                     rs.close();
                                 }

                                 // Duration
                                 durationMEd.removeAllItems();
                                 try (PreparedStatement pst = conn.prepareStatement("SELECT duration FROM duration_options")) {
                                     ResultSet rs = pst.executeQuery();
                                     while (rs.next()) {
                                         durationMEd.addItem(rs.getString("duration"));
                                     }
                                     rs.close();
                                 }

                                 // Route
                                 routeMed.removeAllItems();
                                 try (PreparedStatement pst = conn.prepareStatement("SELECT route FROM route_options")) {
                                     ResultSet rs = pst.executeQuery();
                                     while (rs.next()) {
                                         routeMed.addItem(rs.getString("route"));
                                     }
                                     rs.close();
                                 }

                             } catch (SQLException e) {
                                 System.err.println("SQL Exception: " + e.getMessage());
                                 JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
                             }
                         }


    
    private void TypemedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypemedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypemedicineActionPerformed

    private void nameMEdicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameMEdicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameMEdicineActionPerformed

    private void frequencyMEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyMEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequencyMEdActionPerformed

    private void routeMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeMedActionPerformed

    private void comboPatientDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPatientDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPatientDocActionPerformed

    private void durationMEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationMEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationMEdActionPerformed

    private void announcePerpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_announcePerpatientActionPerformed
                int selectedRow = patientDoctor.getSelectedRow();
      if (selectedRow == -1) {
          JOptionPane.showMessageDialog(null, "⚠️ Please select a patient from the table first.");
          return;
      }

      // Assuming column 0 is patient ID and column 1 is full name
      int selectedPatientId = (int) patientDoctor.getValueAt(selectedRow, 0);
      String selectedPatientName = (String) patientDoctor.getValueAt(selectedRow, 1);

      // Show announcement input
      JTextArea textArea = new JTextArea(5, 20);
      textArea.setWrapStyleWord(true);
      textArea.setLineWrap(true);
      JScrollPane messageScroll = new JScrollPane(textArea);

      int option = JOptionPane.showConfirmDialog(null, messageScroll, "📢 Enter Announcement for " + selectedPatientName, JOptionPane.OK_CANCEL_OPTION);
      if (option != JOptionPane.OK_OPTION || textArea.getText().trim().isEmpty()) {
          return;
      }

      String announcementMessage = textArea.getText().trim();
      String timestamp = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
      String postedBy = "";

      try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "")) {

          // Get doctor's name
          PreparedStatement nameStmt = conn.prepareStatement("SELECT CONCAT(firstName, ' ', lastName) AS fullName FROM accounts WHERE AccountID = ?");
          nameStmt.setInt(1, loggedInAccountID);
          ResultSet nameRs = nameStmt.executeQuery();
          if (nameRs.next()) {
              postedBy = "Dr " + nameRs.getString("fullName");
          } else {
              JOptionPane.showMessageDialog(null, "❌ Unable to find doctor name.");
              return;
          }

          int confirm = JOptionPane.showConfirmDialog(null,
                  "Doctor: " + postedBy + "\n" +
                  "Patient: " + selectedPatientName + "\n" +
                  "Timestamp: " + timestamp + "\n\n" +
                  "Message Preview:\n" + announcementMessage + "\n\n" +
                  "Send this announcement?",
                  "Confirm Announcement", JOptionPane.YES_NO_OPTION);

          if (confirm != JOptionPane.YES_OPTION) return;

          // Insert notification
          PreparedStatement insertStmt = conn.prepareStatement(
              "INSERT INTO notifications (notification, notificationFor, postedBy, postedAt) VALUES (?, ?, ?, ?)");

          insertStmt.setString(1, announcementMessage);
          insertStmt.setString(2, "Patients");
          insertStmt.setString(3, postedBy);
          insertStmt.setString(4, timestamp);

          insertStmt.executeUpdate();

          JOptionPane.showMessageDialog(null, "✅ Announcement sent to " + selectedPatientName + ".");

      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "❌ Database error.\n" + e.getMessage());
          e.printStackTrace();
      }

    }//GEN-LAST:event_announcePerpatientActionPerformed

    private void confirmPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPrescriptionActionPerformed
         String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    String user = "root";
    String password = "";

    try (Connection conn = DriverManager.getConnection(url, user, password)) {
        conn.setAutoCommit(false); // Start transaction

        String selectedPatient = comboPatientDoc.getSelectedItem().toString();
        int patientID = Integer.parseInt(selectedPatient.split(" - ")[0]);
        int doctorID = loggedInAccountID;

        // Get diagnosis and notes from text areas
        String diagnosis = diagnosisNiDoc.getText().trim();
        String notes = NoteDocPrescription.getText().trim();

        // 1. Insert into prescriptions
        String insertPrescription = "INSERT INTO prescriptions (patientID, doctor_id, prescription_date, status) VALUES (?, ?, CURRENT_DATE, 'Active')";
        try (PreparedStatement pstPresc = conn.prepareStatement(insertPrescription)) {
            pstPresc.setInt(1, patientID);
            pstPresc.setInt(2, doctorID);
            pstPresc.executeUpdate();

            // 2. Get last inserted prescription_id
            String selectLastID = "SELECT MAX(prescription_id) AS prescription_id FROM prescriptions";
            try (java.sql.Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(selectLastID)) {

                if (rs.next()) {
                    int prescriptionID = rs.getInt("prescription_id");

                    // 3. Get medicine_id from medicine_basis
                    String category = Typemedicine.getSelectedItem().toString();
                    String medicineName = nameMEdicine.getSelectedItem().toString();

                    PreparedStatement medPst = conn.prepareStatement("SELECT medicine_id FROM medicine_basis WHERE category = ? AND name = ?");
                    medPst.setString(1, category);
                    medPst.setString(2, medicineName);
                    ResultSet medRs = medPst.executeQuery();

                    if (medRs.next()) {
                        int medID = medRs.getInt("medicine_id");

                        // Get other prescription details
                        int quantity;
                        try {
                            quantity = Integer.parseInt(quantityMEd.getText().trim());
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a valid number.");
                            return;
                        }

                        String frequency = frequencyMEd.getSelectedItem().toString();
                        String duration = durationMEd.getSelectedItem().toString();
                        String route = routeMed.getSelectedItem().toString();

                        // 4. Insert into prescription_details with diagnosis & notes
                        String insertDetails = "INSERT INTO prescription_details (prescription_id, medicine_id, diagnosis, quantity, frequency, duration, route, notesDoc) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                        try (PreparedStatement pstDetail = conn.prepareStatement(insertDetails)) {
                            pstDetail.setInt(1, prescriptionID);
                            pstDetail.setInt(2, medID);
                            pstDetail.setString(3, diagnosis);
                            pstDetail.setInt(4, quantity);
                            pstDetail.setString(5, frequency);
                            pstDetail.setString(6, duration);
                            pstDetail.setString(7, route);
                            pstDetail.setString(8, notes);
                            pstDetail.executeUpdate();
                        }

                        JOptionPane.showMessageDialog(null, "Prescription saved successfully!");
                        resetPrescriptionForm(); // optional: reset form after success
                        
                        displayPrescriptionTable();
                    } else {
                        conn.rollback();
                        JOptionPane.showMessageDialog(null, "Medicine not found.");
                    }
                } else {
                    conn.rollback();
                    throw new SQLException("Failed to retrieve the last inserted prescription ID.");
                }
            }
        }

        conn.commit(); // Commit transaction
    } catch (SQLException e) {
        System.err.println("SQL Exception: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
    }
    }//GEN-LAST:event_confirmPrescriptionActionPerformed
    
            private void resetPrescriptionForm() {
                // Reset the combo boxes
                comboPatientDoc.setSelectedIndex(-1);  // Clear the selected patient
                Typemedicine.setSelectedIndex(-1);  // Clear the selected medicine category
                nameMEdicine.setSelectedIndex(-1);  // Clear the selected medicine name
                diagnosisNiDoc.setText("");
                quantityMEd.setText("");  // Clear the quantity text field
                frequencyMEd.setSelectedIndex(-1);  // Clear the frequency combo box
                durationMEd.setSelectedIndex(-1);  // Clear the duration combo box
                routeMed.setSelectedIndex(-1);  
                NoteDocPrescription.setText("");// Clear the route combo box
            }
    
    
    private void addPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPrescriptionActionPerformed
        tabbdocsDashboard.setSelectedIndex(2);
    }//GEN-LAST:event_addPrescriptionActionPerformed
    
    
    
        public void showPatientDetails(int patientID) {
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        String query = "SELECT a.AccountID, a.firstName, a.middleName, a.lastName, a.birthDate, a.Sex, " +
                       "a.emailAdd, a.contactNum, p.AddStreet, p.AddBrgy, p.AddCity, " +
                       "p.medicalHistory, p.bloodType " +
                       "FROM patient p " +
                       "JOIN accounts a ON p.AccountID = a.AccountID " +
                       "WHERE p.patientID = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, patientID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String fullName = rs.getString("firstName") + " " +
                                  rs.getString("middleName") + " " +
                                  rs.getString("lastName");

                String address = rs.getString("AddStreet") + ", " +
                                 rs.getString("AddBrgy") + ", " +
                                 rs.getString("AddCity");

                StringBuilder info = new StringBuilder();
                info.append("👤 Name: ").append(fullName).append("\n");
                info.append("🆔 Account ID: ").append(rs.getInt("AccountID")).append("\n");
                info.append("🎂 Birthdate: ").append(rs.getString("birthDate")).append("\n");
                info.append("🚻 Sex: ").append(rs.getString("Sex")).append("\n");
                info.append("📧 Email: ").append(rs.getString("emailAdd")).append("\n");
                info.append("📱 Contact: ").append(rs.getString("contactNum")).append("\n");
                info.append("🩸 Blood Type: ").append(rs.getString("bloodType")).append("\n");
                info.append("🏠 Address: ").append(address).append("\n");
                info.append("📋 Medical History:\n").append(rs.getString("medicalHistory"));

                JTextArea textArea = new JTextArea(info.toString());
                textArea.setEditable(false);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 300));

                JOptionPane.showMessageDialog(null, scrollPane, "📄 Patient Full Details", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "❌ Patient record not found.");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        }
    }

    private void viewfullDetailsbyDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewfullDetailsbyDocActionPerformed
          int selectedRow = patientDoctor.getSelectedRow();
            if (selectedRow != -1) {
                int patientID = (int) patientDoctor.getValueAt(selectedRow, 0); // column 0 = patientID
                showPatientDetails(patientID);
            } else {
                JOptionPane.showMessageDialog(null, "⚠️ Please select a patient from the table first.");
            }

    }//GEN-LAST:event_viewfullDetailsbyDocActionPerformed

    private void updatePrescriptionbyDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePrescriptionbyDocActionPerformed
       // Assuming loggedInAccountID is the AccountID of the currently logged-in user
        int accountId = loggedInAccountID;

        // Query to get the current prescription and details for the logged-in doctor
        String prescriptionQuery = "SELECT p.prescription_id, p.patientID, p.doctor_id, p.prescription_date, p.status, " +
                                   "pd.detail_id, pd.medicine_id, pd.quantity, pd.frequency, pd.duration, pd.route " +
                                   "FROM prescriptions p " +
                                   "JOIN prescription_details pd ON p.prescription_id = pd.prescription_id " +
                                   "WHERE p.doctor_id = ?";  // Using logged-in doctor's AccountID (doctor_id)

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
             PreparedStatement stmt = conn.prepareStatement(prescriptionQuery)) {

            stmt.setInt(1, accountId);  // Using the logged-in AccountID

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Prepare the string with current prescription and details
                    StringBuilder info = new StringBuilder("📄 Current Prescription Info:\n");
                    do {
                        info.append(String.format("""
                                Prescription ID: %d
                                Patient ID: %d
                                Prescription Date: %s
                                Status: %s
                                Medicine ID: %d
                                Quantity: %d
                                Frequency: %s
                                Duration: %s
                                Route: %s
                                """,
                                rs.getInt("prescription_id"),
                                rs.getInt("patientID"),
                                rs.getString("prescription_date"),
                                rs.getString("status"),
                                rs.getInt("medicine_id"),
                                rs.getInt("quantity"),
                                rs.getString("frequency"),
                                rs.getString("duration"),
                                rs.getString("route")
                        ));
                    } while (rs.next());

                    // Show the current prescription details in a popup
                    JOptionPane.showMessageDialog(null, info.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "❌ No prescriptions found for this doctor.");
                    System.out.println("Debug: No records found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        }

        // Prompt to choose which prescription field to update
        String[] choices = {
            "Prescription Status", "Medicine Quantity", "Medicine Frequency", "Medicine Duration", "Medicine Route"
        };
        String choice = (String) JOptionPane.showInputDialog(
                null, "🛠 Choose what to update:", "Update Prescription",
                JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);

        if (choice == null) return;  // If user cancels

        String newVal = JOptionPane.showInputDialog("New " + choice + ":");
        if (newVal == null || newVal.trim().isEmpty()) return;  // If input is empty

        String sql = "";
        int selectedRow = prescriptionsDoctor.getSelectedRow();
         if (selectedRow == -1) {
             JOptionPane.showMessageDialog(null, "⚠️ Please select a prescription from the table.");
             return;
         }

         int prescriptionId = (int) prescriptionsDoctor.getValueAt(selectedRow, 0); // Assuming column 0 is prescription_id
         int detailId = (int) prescriptionsDoctor.getValueAt(selectedRow, 1);  

        // Get old values for auditing
        String oldValue = "";
        String sqlOldValue = "";

        switch (choice) {
            case "Prescription Status" -> {
                sql = "UPDATE prescriptions SET status=? WHERE prescription_id=?";
                sqlOldValue = "SELECT status FROM prescriptions WHERE prescription_id=?";
            }
            case "Medicine Quantity" -> {
                sql = "UPDATE prescription_details SET quantity=? WHERE detail_id=?";
                sqlOldValue = "SELECT quantity FROM prescription_details WHERE detail_id=?";
            }
            case "Medicine Frequency" -> {
                sql = "UPDATE prescription_details SET frequency=? WHERE detail_id=?";
                sqlOldValue = "SELECT frequency FROM prescription_details WHERE detail_id=?";
            }
            case "Medicine Duration" -> {
                sql = "UPDATE prescription_details SET duration=? WHERE detail_id=?";
                sqlOldValue = "SELECT duration FROM prescription_details WHERE detail_id=?";
            }
            case "Medicine Route" -> {
                sql = "UPDATE prescription_details SET route=? WHERE detail_id=?";
                sqlOldValue = "SELECT route FROM prescription_details WHERE detail_id=?";
            }
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
             PreparedStatement oldStmt = conn.prepareStatement(sqlOldValue)) {

            // Get the old value before updating
            if (choice.equals("Prescription Status")) {
                oldStmt.setInt(1, prescriptionId);
            } else {
                oldStmt.setInt(1, detailId);
            }

            try (ResultSet rsOld = oldStmt.executeQuery()) {
                if (rsOld.next()) {
                    oldValue = rsOld.getString(1);  // Get the old value
                }
            }

            try (PreparedStatement updateStmt = conn.prepareStatement(sql)) {
                if (choice.equals("Prescription Status")) {
                    updateStmt.setString(1, newVal);  // Set new status value
                    updateStmt.setInt(2, prescriptionId);
                } else {
                    updateStmt.setString(1, newVal);  // Set new value for other fields
                    updateStmt.setInt(2, detailId);
                }

                // Execute the update query
                int affected = updateStmt.executeUpdate();
                if (affected > 0) {
                    JOptionPane.showMessageDialog(null, "✅ " + choice + " updated successfully!");

                    // Insert audit log
                    String auditSql = "INSERT INTO prescription_audit (prescription_id, detail_id, changed_by, field_changed, old_value, new_value) " +
                                      "VALUES (?, ?, ?, ?, ?, ?)";

                    try (PreparedStatement auditStmt = conn.prepareStatement(auditSql)) {
                        auditStmt.setInt(1, prescriptionId);
                        auditStmt.setInt(2, detailId);
                        auditStmt.setInt(3, accountId);  // Who made the change
                        auditStmt.setString(4, choice);  // Field changed
                        auditStmt.setString(5, oldValue); // Old value before the change
                        auditStmt.setString(6, newVal);  // New value after the change

                        // Execute audit log insert
                        auditStmt.executeUpdate();
                        System.out.println("Audit log entry added.");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "❌ Update failed.");
                }

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error during update.\n" + e.getMessage());
            e.printStackTrace();
        }

        
        
        
    }//GEN-LAST:event_updatePrescriptionbyDocActionPerformed

    private void ManageStatusbyDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageStatusbyDocActionPerformed
          int selectedRow = tabbDocapp.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "⚠️ Please select an appointment from the table.");
        return;
    }

    int appointmentId = (int) tabbDocapp.getValueAt(selectedRow, 0); // assuming appointment_id is column 0
    int loggedInId = loggedInAccountID; // Currently logged-in user's AccountID

    String currentStatus = "";
    String appointmentDate = "";
    String appointmentTime = "";

    String getStatusQuery = "SELECT status, appointment_date, appointment_time FROM appointment WHERE appointment_id = ?";

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement getStmt = conn.prepareStatement(getStatusQuery)) {

        getStmt.setInt(1, appointmentId);
        ResultSet rs = getStmt.executeQuery();
        if (rs.next()) {
            currentStatus = rs.getString("status");
            appointmentDate = rs.getString("appointment_date");
            appointmentTime = rs.getString("appointment_time");
        } else {
            JOptionPane.showMessageDialog(null, "❌ Appointment not found.");
            return;
        }

        if ("Completed".equals(currentStatus)) {
            JOptionPane.showMessageDialog(null, "⚠️ This appointment is already marked as Completed.");
            return;
        }

        String[] choices = {"Completed", "No Show", "Cancelled"};
        String newStatus = (String) JOptionPane.showInputDialog(
                null, "🛠 Select new status:", "Update Appointment Status",
                JOptionPane.PLAIN_MESSAGE, null, choices, currentStatus
        );

        if (newStatus == null || newStatus.equals(currentStatus)) {
            JOptionPane.showMessageDialog(null, "⚠️ No changes made.");
            return;
        }

        // Update appointment status
        String updateQuery = "UPDATE appointment SET status = ? WHERE appointment_id = ?";
        try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
            updateStmt.setString(1, newStatus);
            updateStmt.setInt(2, appointmentId);
            int updated = updateStmt.executeUpdate();

            if (updated > 0) {
                // Insert audit log
                String auditQuery = "INSERT INTO appointment_update_audit (appointment_id, updated_by, old_status, new_status) VALUES (?, ?, ?, ?)";
                try (PreparedStatement auditStmt = conn.prepareStatement(auditQuery)) {
                    auditStmt.setInt(1, appointmentId);
                    auditStmt.setInt(2, loggedInId);
                    auditStmt.setString(3, currentStatus);
                    auditStmt.setString(4, newStatus);
                    auditStmt.executeUpdate();
                }

                if ("Completed".equals(newStatus)) {
                    // Split appointment_time (e.g., "11:00:00 - 12:00:00")
                    String[] timeParts = appointmentTime.split(" - ");
                    if (timeParts.length != 2) {
                        JOptionPane.showMessageDialog(null, "❌ Invalid appointment time format.");
                        return;
                    }
                    String startTime = timeParts[0].trim();
                    String endTime = timeParts[1].trim();

                    // Mark time slot as available again
                    String updateAvailabilityQuery = "UPDATE doctors_availability SET status = 'Available' WHERE doctor_id = ? AND available_from = ? AND available_to = ?";
                    try (PreparedStatement availabilityStmt = conn.prepareStatement(updateAvailabilityQuery)) {
                        availabilityStmt.setInt(1, loggedInId); // << loggedInAccountID
                        availabilityStmt.setString(2, startTime);
                        availabilityStmt.setString(3, endTime);
                        availabilityStmt.executeUpdate();
                    }

                    // Insert into appointment_completions
                    String completedQuery = "INSERT INTO appointment_completions (appointment_id, completed_by, completed_at) VALUES (?, ?, NOW())";
                    try (PreparedStatement completeStmt = conn.prepareStatement(completedQuery)) {
                        completeStmt.setInt(1, appointmentId);
                        completeStmt.setInt(2, loggedInId);
                        completeStmt.executeUpdate();
                    }

                    JOptionPane.showMessageDialog(null, "✅ Appointment marked as Completed. Time slot is now Available.");
                    displayAppointments(loggedInAccountID);

                } else if ("No Show".equals(newStatus)) {
                    // Insert into appointment_no_shows
                    String noShowQuery = "INSERT INTO appointment_no_shows (appointment_id, marked_by, marked_at) VALUES (?, ?, NOW())";
                    try (PreparedStatement noShowStmt = conn.prepareStatement(noShowQuery)) {
                        noShowStmt.setInt(1, appointmentId);
                        noShowStmt.setInt(2, loggedInId);
                        noShowStmt.executeUpdate();
                    }

                    JOptionPane.showMessageDialog(null, "✅ Appointment marked as No Show.");
                    displayAppointments(loggedInAccountID);

                } else if ("Cancelled".equals(newStatus)) {
                    // Insert into appointment_cancellations
                    String cancelQuery = "INSERT INTO appointment_cancellations (appointment_id, cancelled_by, cancelled_at) VALUES (?, ?, NOW())";
                    try (PreparedStatement cancelStmt = conn.prepareStatement(cancelQuery)) {
                        cancelStmt.setInt(1, appointmentId);
                        cancelStmt.setInt(2, loggedInId);
                        cancelStmt.executeUpdate();
                    }

                    JOptionPane.showMessageDialog(null, "✅ Appointment cancelled successfully.");
                    displayAppointments(loggedInAccountID);
                }

            } else {
                JOptionPane.showMessageDialog(null, "❌ Update failed.");
            }
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "❌ Database error:\n" + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_ManageStatusbyDocActionPerformed

    
    
    public void showPrescriptionDetails(int prescriptionID, int loggedInAccountID) {
   String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    String user = "root";
    String password = "";

    String doctorName = "Unknown Doctor"; // Define this at the top so it's accessible later

    // Step 1: Get doctor full name using the account ID
    String doctorNameQuery = "SELECT firstName, middleName, lastName FROM accounts WHERE AccountID = ?";

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement nameStmt = conn.prepareStatement(doctorNameQuery)) {

        nameStmt.setInt(1, loggedInAccountID);
        ResultSet nameRs = nameStmt.executeQuery();
        if (nameRs.next()) {
            String middleName = nameRs.getString("middleName");
            String middleInitial = (middleName != null && !middleName.isEmpty()) ? middleName.substring(0, 1) + ". " : "";
            doctorName = "Dr. " + nameRs.getString("firstName") + " " + middleInitial + nameRs.getString("lastName");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error retrieving doctor name: " + ex.getMessage());
        return; // Exit early if we can't get the name
    }

    // Step 2: Get the prescription details
    String query = "SELECT pr.prescription_id, pr.patientID, pr.prescription_date, pr.status, " +
                   "ac_patient.firstName AS patient_firstName, ac_patient.middleName AS patient_middleName, ac_patient.lastName AS patient_lastName, " +
                   "pd.detail_id, pd.diagnosis, pd.medicine_id, pd.quantity, pd.frequency, pd.duration, " +
                   "pd.route, pd.notesDoc " +
                   "FROM prescriptions pr " +
                   "JOIN prescription_details pd ON pr.prescription_id = pd.prescription_id " +
                   "JOIN patient p ON pr.patientID = p.patientID " +
                   "JOIN accounts ac_patient ON p.AccountID = ac_patient.AccountID " +
                   "WHERE pr.prescription_id = ?";

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setInt(1, prescriptionID);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            StringBuilder info = new StringBuilder();
            info.append("📄 Prescription ID: ").append(rs.getInt("prescription_id")).append("\n");

            // Patient's full name
            String patientName = rs.getString("patient_firstName") + " " +
                                 rs.getString("patient_middleName") + " " +
                                 rs.getString("patient_lastName");
            info.append("👤 Patient Name: ").append(patientName).append("\n");

            // Use the logged-in doctor's name
            info.append("👨‍⚕️ Doctor Name: ").append(doctorName).append("\n");

            info.append("🗓️ Date: ").append(rs.getString("prescription_date")).append("\n");
            info.append("📌 Status: ").append(rs.getString("status")).append("\n\n");

            do {
                info.append("🔹 Detail ID: ").append(rs.getInt("detail_id")).append("\n");
                info.append("🩺 Diagnosis: ").append(rs.getString("diagnosis")).append("\n");
                info.append("💊 Medicine ID: ").append(rs.getInt("medicine_id")).append("\n");
                info.append("🔢 Quantity: ").append(rs.getInt("quantity")).append("\n");
                info.append("⏱️ Frequency: ").append(rs.getString("frequency")).append("\n");
                info.append("📆 Duration: ").append(rs.getString("duration")).append("\n");
                info.append("📍 Route: ").append(rs.getString("route")).append("\n");
                info.append("📝 Doctor's Notes: ").append(rs.getString("notesDoc")).append("\n");
                info.append("--------------------------------------------------\n");
            } while (rs.next());

            JTextArea textArea = new JTextArea(info.toString());
            textArea.setEditable(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new Dimension(450, 350));

            JOptionPane.showMessageDialog(null, scrollPane, "📋 Prescription Details", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "❌ No prescription found for the selected ID.");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
}

    
    
    
    
    private void fulldeetsPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fulldeetsPrescriptionActionPerformed
        int selectedRow = prescriptionsDoctor.getSelectedRow();
        if (selectedRow != -1) {
            int prescriptionID = (int) prescriptionsDoctor.getValueAt(selectedRow, 0); // assuming column 0 is prescription_id
            showPrescriptionDetails(prescriptionID, loggedInAccountID);
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Please select a prescription from the table first.");
        }
    }//GEN-LAST:event_fulldeetsPrescriptionActionPerformed

    private void backtomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtomainActionPerformed
        tabbdocsDashboard.setSelectedIndex(0);
    }//GEN-LAST:event_backtomainActionPerformed

    private void AvailabilityDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailabilityDocsActionPerformed
    
    JDialog dialog = new JDialog((Frame) null, "Set Availability", true);
    dialog.setSize(400, 200);
    dialog.setLocationRelativeTo(null);
    dialog.setLayout(new GridLayout(3, 2, 10, 10));

    JLabel fromLabel = new JLabel("Available From:");
    JLabel toLabel = new JLabel("Available To:");

    // Time options from 09:00 to 17:00
    String[] fromTimes = {
        "09:30:00", "10:00:00", "11:30:00", "12:30:00",
        "01:30:00", "02:00:00", "03:30:00", "04:00:00"
    };
    String[] toTimes = {
        "10:30:00", "11:00:00", "12:00:00",
        "01:30:00", "03:00:00", "04:30:00", "05:00:00", "05:30:00"
    };

    JComboBox<String> fromCombo = new JComboBox<>(fromTimes);
    JComboBox<String> toCombo = new JComboBox<>(toTimes);

    JButton addButton = new JButton("Add Availability");

    dialog.add(fromLabel);
    dialog.add(fromCombo);
    dialog.add(toLabel);
    dialog.add(toCombo);
    dialog.add(new JLabel());
    dialog.add(addButton);

    addButton.addActionListener(e -> {
        int accountId = loggedInAccountID;
        Connection conn = db_Teleclinicmed.getConnection();

        try {
            String doctorQuery = "SELECT doctor_id FROM telemed_doctors WHERE AccountID = ?";
            PreparedStatement doctorStmt = conn.prepareStatement(doctorQuery);
            doctorStmt.setInt(1, accountId);
            ResultSet rs = doctorStmt.executeQuery();

            if (rs.next()) {
                int doctorId = rs.getInt("doctor_id");

                // Get selected times (no date used, just time)
                String fromTimeStr = fromCombo.getSelectedItem().toString();
                String toTimeStr = toCombo.getSelectedItem().toString();

                // Convert time strings to SQL Time
                java.sql.Time availableFrom = java.sql.Time.valueOf(fromTimeStr);
                java.sql.Time availableTo = java.sql.Time.valueOf(toTimeStr);

                // Check for overlap with existing availability
                String checkOverlapQuery = "SELECT * FROM doctors_availability WHERE doctor_id = ? " +
                                           "AND ((available_from < ? AND available_to > ?) " +  // New slot overlaps an existing slot
                                           "OR (available_from < ? AND available_to > ?))";  // Reverse overlap condition
                PreparedStatement checkStmt = conn.prepareStatement(checkOverlapQuery);
                checkStmt.setInt(1, doctorId);
                checkStmt.setTime(2, availableFrom);
                checkStmt.setTime(3, availableFrom);
                checkStmt.setTime(4, availableTo);
                checkStmt.setTime(5, availableTo);
                ResultSet overlapRs = checkStmt.executeQuery();

                if (overlapRs.next()) {
                    JOptionPane.showMessageDialog(dialog, "❗ The selected time overlaps with an existing availability.");
                } else {
                    // Insert the new availability since no overlap was found
                    String insertQuery = "INSERT INTO doctors_availability (doctor_id, available_from, available_to, status) VALUES (?, ?, ?, ?)";
                    PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
                    insertStmt.setInt(1, doctorId);
                    insertStmt.setTime(2, availableFrom);
                    insertStmt.setTime(3, availableTo);
                    insertStmt.setString(4, "Available");

                    int result = insertStmt.executeUpdate();
                    if (result > 0) {
                        JOptionPane.showMessageDialog(dialog, "✅ Availability added!");
                        dialog.dispose();
                    } else {
                        JOptionPane.showMessageDialog(dialog, "❌ Failed to insert availability.");
                    }

                    insertStmt.close();
                }
                overlapRs.close();
                checkStmt.close();
            } else {
                JOptionPane.showMessageDialog(dialog, "❌ Doctor not found for this account.");
            }

            rs.close();
            doctorStmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(dialog, "Error: " + ex.getMessage());
        }
    });

    dialog.setVisible(true);
    }//GEN-LAST:event_AvailabilityDocsActionPerformed
    

    
    
    
    
    
    
    
    private void profilephotoBydocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilephotoBydocActionPerformed
       
       FileInputStream fis = null;
       File imageFile = null;

       Connection conn = null;
       PreparedStatement pst = null;
       ResultSet rs = null;

       try {
           int accountId = loggedInAccountID; // Get the current logged-in account ID

           // Connect to database
           conn = DriverManager.getConnection("jdbc:mysql://localhost/teleclinicmedproject", "root", "");

           // Check if account_id already exists in telemed_doctors
           String checkSql = "SELECT * FROM telemed_doctors WHERE AccountID = ?";
           pst = conn.prepareStatement(checkSql);
           pst.setInt(1, accountId);
           rs = pst.executeQuery();

           if (rs.next()) {
               // If account already has a profile, ask if the user wants to update the picture
               int response = JOptionPane.showConfirmDialog(null, "You already have a profile. Do you want to update your profile picture?", "Update Profile", JOptionPane.YES_NO_OPTION);

               if (response == JOptionPane.YES_OPTION) {
                   // Allow the user to select a new image
                   JFileChooser fileChooser = new JFileChooser();
                   fileChooser.setDialogTitle("Choose an image");
                   fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

                   int result = fileChooser.showOpenDialog(null);
                   if (result == JFileChooser.APPROVE_OPTION) {
                       imageFile = fileChooser.getSelectedFile();
                       fis = new FileInputStream(imageFile);

                       // Update the profile picture
                       String updateSql = "UPDATE telemed_doctors SET profilePic = ? WHERE AccountID = ?";
                       pst = conn.prepareStatement(updateSql);
                       pst.setBinaryStream(1, fis, (int) imageFile.length());
                       pst.setInt(2, accountId);

                       int rows = pst.executeUpdate();
                       if (rows > 0) {
                           JOptionPane.showMessageDialog(null, "Doctor profile picture updated successfully.");
                       }
                   } else {
                       JOptionPane.showMessageDialog(null, "No file selected.");
                   }
               } else {
                   // If user chooses not to update, show a message and exit
                   JOptionPane.showMessageDialog(null, "Profile picture not updated.");
               }
           } else {
               // If no profile exists, ask for the doctor name and insert new profile
               String name = JOptionPane.showInputDialog(null, "Enter doctor name:");
               if (name == null || name.trim().isEmpty()) {
                   JOptionPane.showMessageDialog(null, "Please enter a name.");
                   return;
               }

               // Allow the user to select a profile image
               JFileChooser fileChooser = new JFileChooser();
               fileChooser.setDialogTitle("Choose an image");
               fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

               int result = fileChooser.showOpenDialog(null);
               if (result == JFileChooser.APPROVE_OPTION) {
                   imageFile = fileChooser.getSelectedFile();
                   fis = new FileInputStream(imageFile);

                   // Insert a new profile with name and profile picture
                   String insertSql = "INSERT INTO telemed_doctors ( nameDocprof, profilePic) VALUES ( ?, ?)";
                   pst = conn.prepareStatement(insertSql);
                   
                   pst.setString(1, name.trim()); // Insert doctor name
                   pst.setBinaryStream(2, fis, (int) imageFile.length()); // Insert profile picture

                   int rows = pst.executeUpdate();
                   if (rows > 0) {
                       JOptionPane.showMessageDialog(null, "Doctor profile created successfully.");
                   }
               } else {
                   JOptionPane.showMessageDialog(null, "No file selected.");
               }
           }

       } catch (Exception e) {
           e.printStackTrace();
           JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
       } finally {
           try {
               if (rs != null) rs.close();
               if (fis != null) fis.close();
               if (pst != null) pst.close();
               if (conn != null) conn.close();
           } catch (Exception ex) {
               ex.printStackTrace();
           }}
    }//GEN-LAST:event_profilephotoBydocActionPerformed

    
    
    
    private void backtoMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoMainActionPerformed
        tabbdocsDashboard.setSelectedIndex(0);
    }//GEN-LAST:event_backtoMainActionPerformed
            
            
        public void displayProfile(int accountId, JLabel picniDoc) {
            Connection conn = null;
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
                // Connect to the database
                conn = DriverManager.getConnection("jdbc:mysql://localhost/teleclinicmedproject", "root", "");

                // Query to fetch the profile picture based on AccountID
                String selectSql = "SELECT profilePic FROM telemed_doctors WHERE AccountID = ?";
                pst = conn.prepareStatement(selectSql);
                pst.setInt(1, accountId);
                rs = pst.executeQuery();

                if (rs.next()) {
                    // Get the profile picture (binary stream)
                    java.sql.Blob blob = rs.getBlob("profilePic");

                    // Convert the Blob (image) into an InputStream
                    InputStream inputStream = blob.getBinaryStream();

                    // Convert InputStream to ImageIcon to set it in the existing JLabel
                    ImageIcon imageIcon = new ImageIcon(inputStream.readAllBytes()); // Read image bytes and convert to ImageIcon
                    picniDoc.setIcon(imageIcon); // Set the profile picture on the existing JLabel
                } else {
                    // If no profile picture is found, set a default image or null
                    this.picniDoc.setIcon(null); // Clear the image if not found
                }

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (pst != null) pst.close();
                    if (conn != null) conn.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    
    
            public void displayAppointments(int doctorID) {
            String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
            String user = "root";
            String password = "";

            // Add "Appointment ID" to the column names
            String[] columnNames = {"Appointment ID", "Patient ID", "Patient Name", "Appointment Date", "Appointment Time", "Consultation Reason", "Status"};

            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            String query = "SELECT a.appointment_id, p.patientID, " +
                           "CONCAT(ac.firstName, ' ', ac.middleName, ' ', ac.lastName) AS patient_name, " +
                           "a.appointment_date, a.appointment_time, a.status, cr.reason_description " +
                           "FROM appointment a " +
                           "JOIN patient p ON a.patient_id = p.patientID " +
                           "JOIN accounts ac ON p.accountID = ac.accountID " +
                           "JOIN appointment_reason cr ON a.consultation_reason_id = cr.consultation_reason_id " +
                           "WHERE a.doctor_id = ?";

            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pst = conn.prepareStatement(query)) {

                pst.setInt(1, doctorID);

                try (ResultSet rs = pst.executeQuery()) {
                    while (rs.next()) {
                        int appointmentId = rs.getInt("appointment_id");
                        int patientID = rs.getInt("patientID");
                        String patientName = rs.getString("patient_name");
                        Date appointmentDate = rs.getDate("appointment_date");
                        String appointmentTime = rs.getString("appointment_time");
                        String reason = rs.getString("reason_description");
                        String status = rs.getString("status");

                        model.addRow(new Object[]{appointmentId, patientID, patientName, appointmentDate, appointmentTime, reason, status});
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
                e.printStackTrace();
            }

            tabbDocapp.setModel(model);  // Set data to JTable
        }


            
            public void displayUpcomingAppointments(int loggedInAccountID) {
            String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
            String user = "root";
            String password = "";

            String procedureCall = "{CALL GetUpcomingAppointmentsByDoctor(?)}";


            try (Connection conn = DriverManager.getConnection(url, user, password);
                 java.sql.CallableStatement cst = conn.prepareCall(procedureCall)) {

                cst.setInt(1, loggedInAccountID);  // Pass doctor account ID
                ResultSet rs = cst.executeQuery();

                StringBuilder summary = new StringBuilder();

                while (rs.next()) {
                    int appointmentId = rs.getInt("appointment_id");
                    String doctorName = rs.getString("doctor_name");
                    String reason = rs.getString("reason_description");
                    String appointmentDate = rs.getString("appointment_date");
                    String appointmentTime = rs.getString("appointment_time");
                    String status = rs.getString("status");

                    summary.append("Appointment ID: ").append(appointmentId)
                           .append(" | Doctor: ").append(doctorName)
                           .append(" | Reason: ").append(reason)
                           .append(" | Date: ").append(appointmentDate)
                           .append(" | Time: ").append(appointmentTime)
                           .append(" | Status: ").append(status)
                           .append("\n\n");
                }

                if (summary.length() > 0) {
                    upcomingappniDoc.setText(summary.toString());
                } else {
                    upcomingappniDoc.setText("No upcoming appointments within the next 3 days.");
                }

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error fetching appointment details: " + e.getMessage());
            }
        }
            
            public void displayPrescriptionTable() {
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        String[] columnNames = {
        "Prescription ID", "Patient ID", "Patient Name", "Date", "Status",
        "Medicine Name", "Quantity", "Frequency", "Duration", "Route"
         };


        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        String query = "SELECT p.prescription_id, p.patientID, ac.firstName, ac.middleName, ac.lastName, " +
                   "p.prescription_date, p.status, " +
                   "m.name AS medicine_name, d.quantity, d.frequency, d.duration, d.route " +
                   "FROM prescriptions p " +
                   "JOIN patient pa ON p.patientID = pa.patientID " +  // Ensure you're joining `patients` table, not `accounts`
                   "JOIN accounts ac ON pa.AccountID = ac.AccountID " +  // Link account to patient
                   "JOIN prescription_details d ON p.prescription_id = d.prescription_id " +
                   "JOIN medicine_basis m ON d.medicine_id = m.medicine_id";


        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = conn.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
              int prescriptionId = rs.getInt("prescription_id");
            int patientId = rs.getInt("patientID");
            String patientName = rs.getString("firstName") + " " +
                                 rs.getString("middleName") + " " +
                                 rs.getString("lastName");
            Date date = rs.getDate("prescription_date");
            String status = rs.getString("status");
            String medName = rs.getString("medicine_name");
            int quantity = rs.getInt("quantity");
            String frequency = rs.getString("frequency");
            String duration = rs.getString("duration");
            String route = rs.getString("route");

            model.addRow(new Object[]{
                prescriptionId, patientId, patientName, date, status,
                medName, quantity, frequency, duration, route
            });

            }

            // Assuming your JTable is named `prescriptionTable`
            prescriptionsDoctor.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading prescription data: " + e.getMessage());
            e.printStackTrace();
        }
    }




    
    
    
    
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
            java.util.logging.Logger.getLogger(doctorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctorDashboard(loggedInAccountID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvailabilityDocs;
    private javax.swing.JButton MENUBTN;
    private javax.swing.JButton ManageStatusbyDoc;
    private javax.swing.JTextArea NoteDocPrescription;
    private javax.swing.JLabel ReasonforAppointment;
    private javax.swing.JComboBox<String> Typemedicine;
    private javax.swing.JButton addPrescription;
    private javax.swing.JButton announcePerpatient;
    private javax.swing.JTextArea announcementsDoc;
    private javax.swing.JButton backtoMain;
    private javax.swing.JButton backtomain;
    private javax.swing.JComboBox<String> comboAppDoc;
    private javax.swing.JComboBox<String> comboPatientDoc;
    private javax.swing.JToggleButton confirmPrescription;
    private javax.swing.JTextArea diagnosisNiDoc;
    private javax.swing.JLabel docContact;
    private javax.swing.JLabel docEmail;
    private javax.swing.JLabel docLicense;
    private javax.swing.JLabel docName;
    private javax.swing.JLabel docSpecial;
    private javax.swing.JComboBox<String> durationMEd;
    private javax.swing.JComboBox<String> frequencyMEd;
    private javax.swing.JButton fulldeetsPrescription;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JComboBox<String> nameMEdicine;
    private javax.swing.JTable patientDoctor;
    private javax.swing.JLabel picniDoc;
    private javax.swing.JButton postOverallAnnouncement;
    private javax.swing.JTable prescriptionsDoctor;
    private javax.swing.JButton profilephotoBydoc;
    private javax.swing.JTextField quantityMEd;
    private javax.swing.JComboBox<String> routeMed;
    private javax.swing.JTable tabbDocapp;
    private javax.swing.JTabbedPane tabbdocsDashboard;
    private javax.swing.JTextArea upcomingappniDoc;
    private javax.swing.JButton updatePrescriptionbyDoc;
    private javax.swing.JButton updateProfileniDOc;
    private javax.swing.JButton viewAppbyDoc;
    private javax.swing.JButton viewfullDetailsbyDoc;
    // End of variables declaration//GEN-END:variables
}
