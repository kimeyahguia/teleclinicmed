
package mainInterfaces;

import java.awt.Font;
import java.security.Timestamp;
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
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import subInterfaces.bookaAppointment;
import subInterfaces.MedicinetoBuy;

//pdf 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.File;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import db_clinicproj.db_Teleclinicmed;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class patientDashboard extends javax.swing.JFrame {

    private static int loggedInAccountID; // Store AccountID
    private int AccountId;

    public patientDashboard(int AccountId) {
        this.loggedInAccountID = AccountId;
        initComponents();
        setLoggedInAccountID(AccountId); 
        loadPatientDetails();
        loadNotifications();
        displayUpcomingAppointments(loggedInAccountID);
        displayAppointments(loggedInAccountID);
        loadMyPaymentsIntoTable(loggedInAccountID);
        loadPrescriptionTable();
        displayPrescriptionDetails(PROPERTIES);
        clearPrescriptionDisplay();
        loadBuyedMedicinesTable(loggedInAccountID);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medhistoArea = new javax.swing.JTextArea();
        dugonibes = new javax.swing.JLabel();
        fullAddres = new javax.swing.JLabel();
        contects = new javax.swing.JLabel();
        namehere = new javax.swing.JLabel();
        idHere = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bdaybes = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sexInfo = new javax.swing.JLabel();
        updateProfilepatient = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notificationPatient = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        patientTbbb = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        appointmentTAble = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        UpcomingAppointment = new javax.swing.JTextArea();
        reschedAppointment = new javax.swing.JButton();
        cancelAppointment = new javax.swing.JButton();
        refreshTables = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        diagnosisnidoc = new javax.swing.JLabel();
        doctorname = new javax.swing.JLabel();
        viewFulldetailsofprescriptionByPatient = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        prescriptionTabb = new javax.swing.JTable();
        generatePrescription = new javax.swing.JButton();
        dateofPrescription = new javax.swing.JLabel();
        patientname = new javax.swing.JLabel();
        diagnosislbl = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        medicinedeets = new javax.swing.JTextArea();
        buymedsbtn = new javax.swing.JButton();
        notesprescription1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        GeneraterecieptPAyment = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        viewfulldetailspayment = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablemedsBuyed = new javax.swing.JTable();
        buynewMEds = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        RecieptMeds = new javax.swing.JButton();
        SummaryofMeds = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        viewPrescription = new javax.swing.JButton();
        bookAppbutton = new javax.swing.JButton();
        appointmentbtn = new javax.swing.JButton();
        billsAndpayment = new javax.swing.JButton();
        MENUBTN = new javax.swing.JButton();
        appointmentbtn1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel7.setText("PATIENT PROFILE");

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        jLabel8.setText("Name: ");

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        jLabel9.setText("Patient ID: ");

        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        jLabel10.setText("Contact No. : ");

        jLabel11.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        jLabel11.setText("Address:");

        jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        jLabel13.setText("Blood Type: ");

        jLabel14.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));

        medhistoArea.setColumns(20);
        medhistoArea.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        medhistoArea.setRows(5);
        medhistoArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(medhistoArea);

        dugonibes.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        dugonibes.setText("o kaba");

        fullAddres.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        fullAddres.setText("add");

        contects.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        contects.setText("07");

        namehere.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        namehere.setText("name here");

        idHere.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        idHere.setText("id here");

        jLabel12.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        jLabel12.setText("Birthday: ");

        bdaybes.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        bdaybes.setText("bday bes");

        jLabel15.setFont(new java.awt.Font("Century Schoolbook", 1, 13)); // NOI18N
        jLabel15.setText("Sex: ");

        sexInfo.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        sexInfo.setText("add");

        updateProfilepatient.setBackground(new java.awt.Color(255, 255, 255));
        updateProfilepatient.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        updateProfilepatient.setForeground(new java.awt.Color(0, 51, 153));
        updateProfilepatient.setText("Update Profile");
        updateProfilepatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfilepatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexInfo)
                                    .addComponent(bdaybes)
                                    .addComponent(dugonibes)
                                    .addComponent(fullAddres)
                                    .addComponent(contects)
                                    .addComponent(idHere)
                                    .addComponent(namehere)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateProfilepatient)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(updateProfilepatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(idHere)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namehere)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contects)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(bdaybes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(sexInfo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fullAddres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dugonibes)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 420, 320));

        notificationPatient.setEditable(false);
        notificationPatient.setColumns(20);
        notificationPatient.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        notificationPatient.setRows(5);
        jScrollPane2.setViewportView(notificationPatient);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 430, 130));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WHAT'S NEW?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        patientTbbb.setBackground(new java.awt.Color(255, 255, 255));
        patientTbbb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        patientTbbb.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        patientTbbb.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));

        jLabel16.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel16.setText("UPCOMING APPOINTMENT ");

        jLabel17.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel17.setText("Appointment history ");

        appointmentTAble.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        appointmentTAble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "Doctor Name ", "Date", "Time", "Reason", "Status", "Total Fee"
            }
        ));
        jScrollPane3.setViewportView(appointmentTAble);

        UpcomingAppointment.setColumns(20);
        UpcomingAppointment.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        UpcomingAppointment.setRows(5);
        jScrollPane4.setViewportView(UpcomingAppointment);

        reschedAppointment.setBackground(new java.awt.Color(255, 255, 255));
        reschedAppointment.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        reschedAppointment.setForeground(new java.awt.Color(0, 51, 153));
        reschedAppointment.setText("RESCHEDULE");
        reschedAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reschedAppointmentActionPerformed(evt);
            }
        });

        cancelAppointment.setBackground(new java.awt.Color(255, 255, 255));
        cancelAppointment.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cancelAppointment.setForeground(new java.awt.Color(0, 51, 153));
        cancelAppointment.setText("CANCEL");
        cancelAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAppointmentActionPerformed(evt);
            }
        });

        refreshTables.setBackground(new java.awt.Color(255, 255, 255));
        refreshTables.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        refreshTables.setForeground(new java.awt.Color(0, 51, 153));
        refreshTables.setText("Refresh");
        refreshTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTablesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(312, 312, 312))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(reschedAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelAppointment))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(refreshTables)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(refreshTables, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reschedAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(424, 424, 424))
        );

        patientTbbb.addTab("", jPanel5);

        jPanel7.setBackground(new java.awt.Color(0, 153, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diagnosisnidoc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        diagnosisnidoc.setForeground(new java.awt.Color(255, 255, 255));
        diagnosisnidoc.setText("MEDICINES: ");
        jPanel7.add(diagnosisnidoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 310, 30));

        doctorname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        doctorname.setForeground(new java.awt.Color(255, 255, 255));
        doctorname.setText("Doctor Name");
        jPanel7.add(doctorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        viewFulldetailsofprescriptionByPatient.setBackground(new java.awt.Color(255, 255, 255));
        viewFulldetailsofprescriptionByPatient.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        viewFulldetailsofprescriptionByPatient.setForeground(new java.awt.Color(0, 51, 153));
        viewFulldetailsofprescriptionByPatient.setText("Prescription Full Details");
        viewFulldetailsofprescriptionByPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFulldetailsofprescriptionByPatientActionPerformed(evt);
            }
        });
        jPanel7.add(viewFulldetailsofprescriptionByPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 210, 30));

        prescriptionTabb.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        prescriptionTabb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Prescription ID", "Doctor", "Diagnosis", "Medicine"
            }
        ));
        jScrollPane6.setViewportView(prescriptionTabb);

        jPanel7.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 420, 390));

        generatePrescription.setBackground(new java.awt.Color(255, 255, 255));
        generatePrescription.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        generatePrescription.setForeground(new java.awt.Color(0, 51, 153));
        generatePrescription.setText("Download Prescription");
        generatePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePrescriptionActionPerformed(evt);
            }
        });
        jPanel7.add(generatePrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 200, 30));

        dateofPrescription.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dateofPrescription.setForeground(new java.awt.Color(255, 255, 255));
        dateofPrescription.setText("DATE");
        jPanel7.add(dateofPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 180, -1));

        patientname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        patientname.setForeground(new java.awt.Color(255, 255, 255));
        patientname.setText("Patient Name");
        jPanel7.add(patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        diagnosislbl.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        diagnosislbl.setForeground(new java.awt.Color(255, 255, 255));
        diagnosislbl.setText("Diagnosis : ");
        jPanel7.add(diagnosislbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 160, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("NOTE: ");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 160, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("MEDICINES: ");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 170, -1));

        medicinedeets.setColumns(20);
        medicinedeets.setRows(5);
        jScrollPane7.setViewportView(medicinedeets);

        jPanel7.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 226, 310, 80));

        buymedsbtn.setBackground(new java.awt.Color(255, 255, 255));
        buymedsbtn.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        buymedsbtn.setForeground(new java.awt.Color(0, 51, 153));
        buymedsbtn.setText("Buy Medicines");
        buymedsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buymedsbtnActionPerformed(evt);
            }
        });
        jPanel7.add(buymedsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 170, -1));

        notesprescription1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        notesprescription1.setForeground(new java.awt.Color(255, 255, 255));
        notesprescription1.setText("MEDICINES: ");
        jPanel7.add(notesprescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 310, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainInterfaces/prescription patient 2.png"))); // NOI18N
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 390, 430));

        patientTbbb.addTab("", jPanel7);

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 153));
        jButton3.setText("PAY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GeneraterecieptPAyment.setBackground(new java.awt.Color(255, 255, 255));
        GeneraterecieptPAyment.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        GeneraterecieptPAyment.setForeground(new java.awt.Color(0, 51, 153));
        GeneraterecieptPAyment.setText("GENERATE RECIEPT");
        GeneraterecieptPAyment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneraterecieptPAymentActionPerformed(evt);
            }
        });

        paymentTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PaymentID", "Appointment ID", "To be Paid", "Total Paid", "Payment Method", "Payment Details ", "Change", "Payment Date", "Status", "Payed At"
            }
        ));
        jScrollPane5.setViewportView(paymentTable);

        jLabel18.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        jLabel18.setText("TELECLINICMED : SMART CARE, ANYTIME! ");

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 51, 153));
        jButton11.setText("Refresh");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        viewfulldetailspayment.setBackground(new java.awt.Color(255, 255, 255));
        viewfulldetailspayment.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        viewfulldetailspayment.setForeground(new java.awt.Color(0, 51, 153));
        viewfulldetailspayment.setText("VIEW PAYMENT FULL DETAILS");
        viewfulldetailspayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewfulldetailspaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(GeneraterecieptPAyment, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(viewfulldetailspayment)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(GeneraterecieptPAyment, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(viewfulldetailspayment, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(292, 292, 292))
        );

        patientTbbb.addTab("", jPanel6);

        jPanel8.setBackground(new java.awt.Color(0, 153, 255));

        tablemedsBuyed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Acc ID", "Medicine ", "Price", "Quantity", "Total", "Payment Details", "Buyed When", "Payment Status"
            }
        ));
        jScrollPane8.setViewportView(tablemedsBuyed);

        buynewMEds.setBackground(new java.awt.Color(255, 255, 255));
        buynewMEds.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buynewMEds.setForeground(new java.awt.Color(0, 51, 153));
        buynewMEds.setText("BUY MEDICINE");
        buynewMEds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buynewMEdsActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Century Schoolbook", 3, 15)); // NOI18N
        jLabel20.setText("TAKE YOUR MEDS ON TIME! SMART CARE, ANYTIME, TCM CARES!");

        RecieptMeds.setBackground(new java.awt.Color(255, 255, 255));
        RecieptMeds.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RecieptMeds.setForeground(new java.awt.Color(0, 51, 153));
        RecieptMeds.setText("PRINT MEDS RECIEPT");
        RecieptMeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecieptMedsActionPerformed(evt);
            }
        });

        SummaryofMeds.setBackground(new java.awt.Color(255, 255, 255));
        SummaryofMeds.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SummaryofMeds.setForeground(new java.awt.Color(0, 51, 153));
        SummaryofMeds.setText("PREVIEW DETAILS");
        SummaryofMeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummaryofMedsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(buynewMEds)
                        .addGap(11, 11, 11)
                        .addComponent(SummaryofMeds)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RecieptMeds)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buynewMEds, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecieptMeds, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SummaryofMeds, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(410, Short.MAX_VALUE))
        );

        patientTbbb.addTab("", jPanel8);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientTbbb)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientTbbb)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 910, 500));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WHAT'S NEW?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));

        viewPrescription.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        viewPrescription.setForeground(new java.awt.Color(0, 0, 102));
        viewPrescription.setText("View Prescription");
        viewPrescription.setBorderPainted(false);
        viewPrescription.setContentAreaFilled(false);
        viewPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrescriptionActionPerformed(evt);
            }
        });
        jPanel1.add(viewPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 130, 280, 60));

        bookAppbutton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        bookAppbutton.setForeground(new java.awt.Color(0, 0, 102));
        bookAppbutton.setText("Book an Appointment");
        bookAppbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(bookAppbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 180, 30));

        appointmentbtn.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        appointmentbtn.setForeground(new java.awt.Color(0, 0, 102));
        appointmentbtn.setText("Medicines");
        appointmentbtn.setBorderPainted(false);
        appointmentbtn.setContentAreaFilled(false);
        appointmentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentbtnActionPerformed(evt);
            }
        });
        jPanel1.add(appointmentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 280, 60));

        billsAndpayment.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        billsAndpayment.setForeground(new java.awt.Color(0, 0, 102));
        billsAndpayment.setText("Bills & Payment");
        billsAndpayment.setBorderPainted(false);
        billsAndpayment.setContentAreaFilled(false);
        billsAndpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsAndpaymentActionPerformed(evt);
            }
        });
        jPanel1.add(billsAndpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 60, 280, 60));

        MENUBTN.setContentAreaFilled(false);
        MENUBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUBTNActionPerformed(evt);
            }
        });
        jPanel1.add(MENUBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 40, 100, 70));

        appointmentbtn1.setFont(new java.awt.Font("Century Schoolbook", 1, 20)); // NOI18N
        appointmentbtn1.setForeground(new java.awt.Color(0, 0, 102));
        appointmentbtn1.setText("Appointments");
        appointmentbtn1.setBorderPainted(false);
        appointmentbtn1.setContentAreaFilled(false);
        appointmentbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(appointmentbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 280, 60));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 440, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainInterfaces/patient ui 2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1490, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public static void setLoggedInAccountID(int AccountID) {
        loggedInAccountID = AccountID; // Store globally
    }
    
    private void viewPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPrescriptionActionPerformed
        patientTbbb.setSelectedIndex(1);
    }//GEN-LAST:event_viewPrescriptionActionPerformed

    private void billsAndpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsAndpaymentActionPerformed
        patientTbbb.setSelectedIndex(2);
    }//GEN-LAST:event_billsAndpaymentActionPerformed

    private void bookAppbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppbuttonActionPerformed
       new bookaAppointment(loggedInAccountID).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bookAppbuttonActionPerformed

    private void appointmentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentbtnActionPerformed
       patientTbbb.setSelectedIndex(3);
    }//GEN-LAST:event_appointmentbtnActionPerformed
    
    private void loadPatientDetails() {
    String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    String user = "root";
    String password = "";

    // 🔹 Complete query: Get all needed data from both tables
    String query = "SELECT a.firstName, a.middleName, a.lastName, a.birthDate, a.Sex, " +
                   "a.contactNum, a.emailAdd, p.AddCity, p.AddBrgy, p.AddStreet, " +
                   "p.bloodType, p.medicalHistory " +
                   "FROM patient p " +
                   "JOIN accounts a ON p.AccountID = a.AccountID " +
                   "WHERE p.AccountID = ?";

    System.out.println("🔍 Checking AccountID: " + loggedInAccountID); // Debugging ID

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setInt(1, loggedInAccountID); // Use the logged-in Account ID
        ResultSet rs = pstmt.executeQuery();

        // 🔹 Clear UI before setting new data
        namehere.setText("Loading...");
        sexInfo.setText("Loading...");
        bdaybes.setText("Loading...");
        contects.setText("Loading...");
        fullAddres.setText("Loading...");
        dugonibes.setText("Loading...");
        idHere.setText("Loading...");
        medhistoArea.setText("Loading...");

        if (rs.next()) {
            System.out.println("✅ Data Found!");

            // 🔹 Fetch Data from ResultSet
            String fullName = rs.getString("firstName") + " " + rs.getString("middleName") + " " + rs.getString("lastName");
            String birthDate = rs.getString("birthDate");
            String sex = rs.getString("Sex");
            String contactNumber = rs.getString("contactNum");
            String email = rs.getString("emailAdd");
            String fullAddress = rs.getString("AddStreet") + ", " + rs.getString("AddBrgy") + ", " + rs.getString("AddCity");
            String bloodType = rs.getString("bloodType");
        
            // 🔹 Convert medicalHistory for new lines
            String medicalHistory = "📌 Medical History:\n\n" + rs.getString("medicalHistory").replace(". ", ".\n");


            // 🔹 Set values to UI components
            namehere.setText(fullName);
            sexInfo.setText(sex);
            bdaybes.setText(birthDate);
            contects.setText(contactNumber);
            fullAddres.setText(fullAddress);
            dugonibes.setText(bloodType);
            idHere.setText(String.valueOf(loggedInAccountID));
            medhistoArea.setText(medicalHistory);

            // 🔹 Debugging: Print values to console
            System.out.println("📌 Name: " + fullName);
            System.out.println("📌 Birth Date: " + birthDate);
            System.out.println("📌 Sex: " + sex);
            System.out.println("📌 Contact: " + contactNumber);
            System.out.println("📌 Email: " + email);
            System.out.println("📌 Address: " + fullAddress);
            System.out.println("📌 Blood Type: " + bloodType);
            System.out.println("📌 Medical History: " + medicalHistory);

        } else {
            System.out.println("⚠ No data found for AccountID: " + loggedInAccountID);
            JOptionPane.showMessageDialog(null, "No data found.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
    }
}
        
       private void loadNotifications() {
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        String query = "CALL GetNotificationsForGroups('Patients', 'Everyone')";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             CallableStatement cstmt = conn.prepareCall(query);
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
                notificationPatient.setText(notificationsText.toString());
            });

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading notifications: " + e.getMessage());
        
    }
}

        public void displayAppointments(int loggedInAccountID) {
        try {
        // Connect to database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");

        String query = "SELECT ap.appointment_id, " + // Added appointment_id
               "CONCAT('Dr. ', acc.firstname, ' ', acc.lastname) AS doctor_name, " +
               "ap.appointment_date, ap.appointment_time, cr.reason_description AS consultation_reason, " +
               "ap.status, ap.fee " +
               "FROM appointment ap " +
               "JOIN telemed_doctors d ON ap.doctor_id = d.doctor_id " +
               "JOIN accounts acc ON d.AccountID = acc.AccountID " +
               "JOIN appointment_reason cr ON ap.consultation_reason_id = cr.consultation_reason_id " +
               "WHERE ap.AccountID = ?";



        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, loggedInAccountID);

        ResultSet rs = pst.executeQuery();
        DefaultTableModel model = (DefaultTableModel) appointmentTAble.getModel();
        model.setRowCount(0); // clear existing rows

         while (rs.next()) {
        int appointmentId = rs.getInt("appointment_id");

        String doctorName = rs.getString("doctor_name");
        String appointmentDate = rs.getDate("appointment_date").toString();
        String appointmentTime = rs.getString("appointment_time"); // ✅ fixed here
        String consultationReason = rs.getString("consultation_reason");
        String status = rs.getString("status");
        String fee = String.format("%.2f", rs.getDouble("fee"));

        Object[] row = {
            appointmentId, 
            doctorName,
            appointmentDate,
            appointmentTime,
            consultationReason,
            status,
            fee
        };

        model.addRow(row);
    }


        // Close resources
        rs.close();
        pst.close();
        con.close();

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error displaying appointments: " + e.getMessage());
    }
}
    
    
    
    
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
    
    public void displayUpcomingAppointments(int loggedInAccountID) {
     String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
     String user = "root";
     String password = "";

     // SQL query to fetch upcoming appointments for the next 3 days
     String query = "SELECT a.appointment_id, CONCAT(ac.firstName, ' ', ac.lastName) AS doctor_name, " +
                    "r.reason_description, a.appointment_date, a.appointment_time, a.status " +
                    "FROM appointment a " +
                    "JOIN accounts ac ON a.doctor_id = ac.AccountID " +
                    "JOIN appointment_reason r ON a.consultation_reason_id = r.consultation_reason_id " +
                    "WHERE a.AccountID = ? " +
                    "AND a.appointment_date BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 3 DAY) " + // Filter for the next 3 days
                    "ORDER BY a.appointment_date ASC, a.appointment_time ASC"; // Sort by date and time in ascending order

     try (Connection conn = DriverManager.getConnection(url, user, password);
          PreparedStatement pst = conn.prepareStatement(query)) {

         pst.setInt(1, loggedInAccountID); // Set the logged-in AccountID
         ResultSet rs = pst.executeQuery();

         StringBuilder summary = new StringBuilder(); // Use StringBuilder to accumulate multiple appointments

         while (rs.next()) {
             // Retrieve the data from the result set
             int appointmentId = rs.getInt("appointment_id");
             String doctorName = rs.getString("doctor_name");  // Doctor's name from accounts
             String reason = rs.getString("reason_description");  // Reason for the appointment
             String appointmentDate = rs.getString("appointment_date");
             String appointmentTime = rs.getString("appointment_time");
             String status = rs.getString("status");

             // Build the output string for each appointment
             summary.append("Appointment ID: ").append(appointmentId)
                    .append(" | Doctor: ").append(doctorName)
                    .append(" | Reason: ").append(reason)
                    .append(" | Date: ").append(appointmentDate)  // Directly display the date
                    .append(" | Time: ").append(appointmentTime) // Directly display the time
                    .append(" | Status: ").append(status)
                    .append("\n\n");
         }

         if (summary.length() > 0) {
             // Display all upcoming appointments in the JTextArea
             UpcomingAppointment.setText(summary.toString());
         } else {
             UpcomingAppointment.setText("No upcoming appointments within the next 3 days.");
         }

     } catch (Exception e) {
         e.printStackTrace();
         JOptionPane.showMessageDialog(null, "Error fetching appointment details: " + e.getMessage());
     }
 }

    
    /////// PDF GENERATE 
            public void generatePDFReceipt(int paymentId, double totalDue, double totalPaid, String method, double change,
                               java.sql.Timestamp paymentDate, String status, java.sql.Timestamp payedWhen) {
             Document document = new Document();
              try {
        // Save to Downloads
                String userHome = System.getProperty("user.home");
                String downloadsPath = Paths.get(userHome, "Downloads").toString(); // Use Paths for better platform compatibility
                String outputPath = downloadsPath + "/receipt_" + paymentId + ".pdf";

                // Check if the Downloads directory exists
                if (!Files.exists(Paths.get(downloadsPath))) {
                    JOptionPane.showMessageDialog(null, "❌ Downloads path doesn't exist. Unable to save receipt.");
                    return; // Exit if the Downloads path doesn't exist
                }
                
                
                 String userName = getLoggedInUserName(loggedInAccountID);
                // Ensure the file is accessible and writable
                PdfWriter.getInstance(document, new FileOutputStream(outputPath));
                document.open();

                 // Use Century Gothic (System font) or a custom font
                 com.itextpdf.text.Font titleFont = FontFactory.getFont("path/to/CenturyGothic.ttf", 18, Font.BOLD);
                 com.itextpdf.text.Font bodyFont = FontFactory.getFont("path/to/CenturyGothic.ttf", 12);

                 // Title
                 document.add(new Paragraph("🧾 TELECLINIC PAYMENT RECEIPT", titleFont));
                 document.add(new Paragraph(" ")); // Spacer
                 
                 document.add(new Paragraph("Patient: " + userName, bodyFont));
                 document.add(new Paragraph(" ")); // Spacer
                 
                 // Format timestamps
                 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                 String formattedPaymentDate = sdf.format(paymentDate);
                 String formattedPayedWhen = sdf.format(payedWhen);

                 // Receipt Details
                 document.add(new Paragraph("Receipt #: " + paymentId, bodyFont));
                 document.add(new Paragraph("Status: " + status, bodyFont));
                 document.add(new Paragraph("Payment Method: " + method, bodyFont));
                 document.add(new Paragraph("Payment Date: " + formattedPaymentDate, bodyFont));
                 document.add(new Paragraph("Recorded At: " + formattedPayedWhen, bodyFont));
                 document.add(new Paragraph(" "));

                 // Payment Summary
                 document.add(new Paragraph("Total Amount Due: ₱" + totalDue, bodyFont));
                 document.add(new Paragraph("Total Paid: ₱" + totalPaid, bodyFont));
                 document.add(new Paragraph("Change: ₱" + change, bodyFont));
                 document.add(new Paragraph(" "));

                 document.add(new Paragraph("Thank you for your payment!", bodyFont));

                 document.close();

                 JOptionPane.showMessageDialog(null, "📄 Receipt saved to your Desktop as: receipt_" + paymentId + ".pdf");

             } catch (DocumentException | IOException e) {
                 JOptionPane.showMessageDialog(null, "❌ Error generating receipt: " + e.getMessage());
                 e.printStackTrace();
             }
         }
            
            private String getLoggedInUserName(int accountId) {
            String userName = "";
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
                String sql = "SELECT firstName, lastName FROM accounts WHERE accountID = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, accountId);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String firstName = rs.getString("firstName");
                    String lastName = rs.getString("lastName");
                    userName = firstName + " " + lastName;
                }

                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "❌ Error fetching user name: " + e.getMessage());
                e.printStackTrace();
            }
            return userName;
        }
        
    
    private void reschedAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reschedAppointmentActionPerformed
    int selectedRow = appointmentTAble.getSelectedRow();

    if (selectedRow == -1) {
    JOptionPane.showMessageDialog(null, "Please select an appointment to reschedule.");
    return;
    }

    int appointmentId = (Integer) appointmentTAble.getValueAt(selectedRow, 0);
    String originalDate = (String) appointmentTAble.getValueAt(selectedRow, 2);
    String originalTime = (String) appointmentTAble.getValueAt(selectedRow, 3);

    String newDate = JOptionPane.showInputDialog(null, "Enter new date (e.g. 2025-04-21):");
    String newTime = JOptionPane.showInputDialog(null, "Enter new time (e.g. 11:00:00 - 12:00:00):");
    String reason = JOptionPane.showInputDialog(null, "Enter reason for rescheduling:");

    if (newDate == null || newTime == null || reason == null ||
        newDate.trim().isEmpty() || newTime.trim().isEmpty() || reason.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required.");
        return;
    }

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "")) {
        
        String newstat = "Rescheduled";
        String updateQuery = "UPDATE appointment SET appointment_date = ?, appointment_time = ?, status = ?  WHERE appointment_id = ?";

        try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
            updateStmt.setString(1, newDate);
            updateStmt.setString(2, newTime);
            updateStmt.setString(3, newstat);
            updateStmt.setInt(4, appointmentId);
            updateStmt.executeUpdate();
        }

        // Step 2: Insert into appointment_reschedules to track the reschedule request
        String status = "Reschedule";
        String logQuery = "INSERT INTO appointment_reschedules (appointment_id, rescheduled_by, original_date, original_time, new_date, new_time, reason, rescheduled_at) " +
                          "VALUES (?, ?, ?, ?, ?, ?, ?, NOW())";
        try (PreparedStatement logStmt = conn.prepareStatement(logQuery)) {
            logStmt.setInt(1, appointmentId);
            logStmt.setInt(2, loggedInAccountID);
            logStmt.setString(3, originalDate);
            logStmt.setString(4, originalTime);
            logStmt.setString(5, newDate);
            logStmt.setString(6, newTime);
            logStmt.setString(7, reason);
            logStmt.executeUpdate();
        }

        
        displayUpcomingAppointments(loggedInAccountID);
        displayAppointments(loggedInAccountID);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_reschedAppointmentActionPerformed

    private void cancelAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAppointmentActionPerformed
       int selectedRow = appointmentTAble.getSelectedRow();

       if (selectedRow == -1) {
           JOptionPane.showMessageDialog(null, "Please select an appointment to cancel.");
           return;
       }
       int appointmentId = (Integer) appointmentTAble.getValueAt(selectedRow, 0);
       String reason = JOptionPane.showInputDialog(null, "Enter reason for cancellation:");
       if (reason == null || reason.trim().isEmpty()) {
           JOptionPane.showMessageDialog(null, "Cancellation reason is required.");
           return;
       }

       String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
       String user = "root";
       String password = "";

       try (Connection conn = DriverManager.getConnection(url, user, password)) {
           conn.setAutoCommit(false); // Start transaction

           try {
               // 1. Update appointment status
               String updateAppointment = "UPDATE appointment SET status = 'Cancelled' WHERE appointment_id = ?";
               try (PreparedStatement pst1 = conn.prepareStatement(updateAppointment)) {
                   pst1.setInt(1, appointmentId);
                   pst1.executeUpdate();
               }

               // 2. Insert into appointment_cancellations
               String insertCancellation = "INSERT INTO appointment_cancellations (appointment_id, cancelled_by, reason) VALUES (?, ?, ?)";
               try (PreparedStatement pst2 = conn.prepareStatement(insertCancellation)) {
                   pst2.setInt(1, appointmentId);
                   pst2.setInt(2, loggedInAccountID);  // Who cancelled
                   pst2.setString(3, reason);
                   pst2.executeUpdate();
               }

               conn.commit(); // Everything succeeded
               JOptionPane.showMessageDialog(null, "Appointment successfully cancelled.");
               displayAppointments(loggedInAccountID);

           } catch (SQLException ex) {
               conn.rollback(); // Undo if anything failed
               JOptionPane.showMessageDialog(null, "Failed to cancel appointment. Rolled back changes.");
               ex.printStackTrace();
           }

       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
           e.printStackTrace();
       }

    }//GEN-LAST:event_cancelAppointmentActionPerformed

    private void refreshTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTablesActionPerformed
    
       
        JDialog refreshDialog = new JDialog();
        refreshDialog.setModal(true);
        refreshDialog.setSize(200, 100);
        refreshDialog.setLocationRelativeTo(null);
        refreshDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        refreshDialog.add(new JLabel("Refreshing appointments...", JLabel.CENTER));

        
        
        new Thread(() -> {
            try {
                displayUpcomingAppointments(loggedInAccountID); 
                loadPrescriptionTable();
                displayAppointments(loggedInAccountID);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error refreshing appointments: " + e.getMessage());
            } finally {
                refreshDialog.dispose(); // Close the dialog after refreshing
            }
        }).start();

        refreshDialog.setVisible(true);
    }//GEN-LAST:event_refreshTablesActionPerformed
        
    
            private double getAppointmentFee(int accountId, int appointmentId) {
            double fee = -1;
            try {
                System.out.println("Fetching fee for Account ID: " + accountId + ", Appointment ID: " + appointmentId);

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
                String sql = "SELECT fee FROM appointment WHERE AccountID = ? AND appointment_id = ?";

                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, accountId);        // Use account_id instead of patient_id
                ps.setInt(2, appointmentId);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    fee = rs.getDouble("fee");
                } else {
                    System.out.println("No appointment found for Account ID: " + accountId + ", Appointment ID: " + appointmentId);
                }

                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return fee;
        }

            
            
             public void processPayment() {
                try {
                    int accountId = loggedInAccountID;

                    String appointmentIdStr = JOptionPane.showInputDialog(null, "Enter Appointment ID:");
                    if (appointmentIdStr == null) return;
                    int appointmentId = Integer.parseInt(appointmentIdStr);

                    // Fetch appointment fee
                    double appointmentFee = getAppointmentFee(accountId, appointmentId);
                    if (appointmentFee == -1) {
                        JOptionPane.showMessageDialog(null, "⚠️ Appointment not found.");
                        return;
                    }

                    String amountStr = JOptionPane.showInputDialog(null, "Enter Payment Amount (₱):");
                    if (amountStr == null) return;
                    double amountPaid = Double.parseDouble(amountStr);

                    if (amountPaid < appointmentFee) {
                        JOptionPane.showMessageDialog(null, "❌ Payment is less than the appointment fee.");
                        return;
                    }

                    double change = amountPaid - appointmentFee;

                    String[] paymentMethods = {"Cash", "GCash", "Bank Transfer"};
                    String method = (String) JOptionPane.showInputDialog(
                            null, "Select Payment Method:",
                            "Payment Method",
                            JOptionPane.QUESTION_MESSAGE,
                            null, paymentMethods,
                            paymentMethods[0]);

                    if (method == null) return;

                    String type = method.equals("Cash") ? "Over-the-Counter" : "Online";

                    String paymentDetails = "";
                    switch (method) {
                        case "Cash":
                            paymentDetails = "Paid in Cash";
                            break;
                        case "GCash":
                            paymentDetails = JOptionPane.showInputDialog(null, "Enter GCash number:");
                            break;
                        case "Bank Transfer":
                            paymentDetails = JOptionPane.showInputDialog(null, "Enter bank name and reference number:");
                            break;
                    }

                    if (paymentDetails == null || paymentDetails.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "⚠️ Payment details are required.");
                        return;
                    }

                    int confirm = JOptionPane.showConfirmDialog(null,
                            "Confirm payment?\n" +
                                    "Appointment Fee: ₱" + appointmentFee + "\n" +
                                    "Amount Paid: ₱" + amountPaid + "\n" +
                                    "Change: ₱" + change + "\n" +
                                    "Method: " + method + " (" + type + ")\n" +
                                    "Details: " + paymentDetails,
                            "Confirm Payment", JOptionPane.YES_NO_OPTION);

                    if (confirm != JOptionPane.YES_OPTION) return;

                    // Always update, never insert
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");

                    String updateQuery = "UPDATE payments SET total_amount = ?, payment_method = ?, payment_type = ?, " +
                            "pay_change = ?, status = 'Paid', payed_when = NOW(), payment_details = ? " +
                            "WHERE appointment_id = ? AND account_id = ?";

                    PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
                    updateStmt.setDouble(1, amountPaid);
                    updateStmt.setString(2, method);
                    updateStmt.setString(3, type);
                    updateStmt.setDouble(4, change);
                    updateStmt.setString(5, paymentDetails);
                    updateStmt.setInt(6, appointmentId);
                    updateStmt.setInt(7, accountId);

                    int result = updateStmt.executeUpdate();

                    if (result > 0) {
                        JOptionPane.showMessageDialog(null, "✅ Payment updated successfully! Change: ₱" + change);
                    } else {
                        JOptionPane.showMessageDialog(null, "⚠️ No pending payment found to update.");
                    }

                    updateStmt.close();
                    conn.close();

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "❌ Invalid number input.");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "❌ Database error: " + e.getMessage());
                    e.printStackTrace();
                }
            }

             
             
             public void processMedicinePayment() {
                try {
                    int accountId = loggedInAccountID;
                    
                    // Show list of pending transactions
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
                    String pendingQuery = "SELECT buyedmed_id, total FROM buyedmeds WHERE account_id = ? AND payment_status = 'Pending'";
                    PreparedStatement pendingStmt = conn.prepareStatement(pendingQuery);
                    pendingStmt.setInt(1, accountId);
                    ResultSet pendingRs = pendingStmt.executeQuery();

                    StringBuilder pendingList = new StringBuilder("Pending Transactions:\n");
                    boolean hasPending = false;

                    while (pendingRs.next()) {
                        hasPending = true;
                        int id = pendingRs.getInt("buyedmed_id");
                        double amount = pendingRs.getDouble("total");
                        pendingList.append("ID: ").append(id).append(" | Total: ₱").append(amount).append("\n");
                    }

                    pendingRs.close();
                    pendingStmt.close();

                    if (hasPending) {
                        JOptionPane.showMessageDialog(null, pendingList.toString(), "Pending Payments", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "🎉 No pending medicine transactions to pay.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        conn.close();
                        return;
                    }

                    
                    String buyedMedIdStr = JOptionPane.showInputDialog(null, "Enter Buyed Medicine Transaction ID:");
                    if (buyedMedIdStr == null) return;
                    int buyedMedId = Integer.parseInt(buyedMedIdStr);

                    
                    String statusCheckQuery = "SELECT payment_status, total FROM buyedmeds WHERE buyedmed_id = ? AND account_id = ?";
                    PreparedStatement statusStmt = conn.prepareStatement(statusCheckQuery);
                    statusStmt.setInt(1, buyedMedId);
                    statusStmt.setInt(2, accountId);
                    ResultSet rs = statusStmt.executeQuery();

                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(null, "⚠️ Transaction not found or doesn't belong to your account.");
                        rs.close();
                        statusStmt.close();
                        conn.close();
                        return;
                    }

                    String currentStatus = rs.getString("payment_status");
                    double totalAmount = rs.getDouble("total");

                    rs.close();
                    statusStmt.close();

                    if (currentStatus.equalsIgnoreCase("Paid")) {
                        JOptionPane.showMessageDialog(null, "✅ This transaction has already been paid.");
                        conn.close();
                        return;
                    }

                    // Proceed with payment
                    String amountStr = JOptionPane.showInputDialog(null, "Enter Payment Amount (₱):");
                    if (amountStr == null) {
                        conn.close();
                        return;
                    }
                    double amountPaid = Double.parseDouble(amountStr);

                    if (amountPaid < totalAmount) {
                        JOptionPane.showMessageDialog(null, "❌ Payment is less than total price.");
                        conn.close();
                        return;
                    }

                    double change = amountPaid - totalAmount;

                    String[] paymentMethods = {"Cash", "GCash", "Bank Transfer"};
                    String method = (String) JOptionPane.showInputDialog(
                            null, "Select Payment Method:",
                            "Payment Method",
                            JOptionPane.QUESTION_MESSAGE,
                            null, paymentMethods,
                            paymentMethods[0]);

                    if (method == null) {
                        conn.close();
                        return;
                    }

                    String type = method.equals("Cash") ? "Over-the-Counter" : "Online";
                    String paymentDetails = "";

                    switch (method) {
                        case "Cash":
                            paymentDetails = "Paid in Cash";
                            break;
                        case "GCash":
                            paymentDetails = JOptionPane.showInputDialog(null, "Enter GCash number:");
                            break;
                        case "Bank Transfer":
                            paymentDetails = JOptionPane.showInputDialog(null, "Enter bank name and reference number:");
                            break;
                    }

                    if (paymentDetails == null || paymentDetails.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "⚠️ Payment details are required.");
                        conn.close();
                        return;
                    }

                    int confirm = JOptionPane.showConfirmDialog(null,
                            "Confirm payment?\n" +
                                    "Total Price: ₱" + totalAmount + "\n" +
                                    "Amount Paid: ₱" + amountPaid + "\n" +
                                    "Change: ₱" + change + "\n" +
                                    "Method: " + method + " (" + type + ")\n" +
                                    "Details: " + paymentDetails,
                            "Confirm Payment", JOptionPane.YES_NO_OPTION);

                    if (confirm != JOptionPane.YES_OPTION) {
                        conn.close();
                        return;
                    }

                    String updateQuery = "UPDATE buyedmeds SET payment_status = 'Paid', total = ?, payment_method = ?, " +
                            "payment_type = ?, med_change = ?, payedAt= NOW(), payment_details = ? " +
                            "WHERE buyedmed_id = ? AND account_id = ?";

                    PreparedStatement stmt = conn.prepareStatement(updateQuery);
                    stmt.setDouble(1, amountPaid);
                    stmt.setString(2, method);
                    stmt.setString(3, type);
                    stmt.setDouble(4, change);
                    stmt.setString(5, paymentDetails);
                    stmt.setInt(6, buyedMedId);
                    stmt.setInt(7, accountId);

                    int result = stmt.executeUpdate();
                    if (result > 0) {
                        JOptionPane.showMessageDialog(null, "✅ Payment successful! Change: ₱" + change);
                    } else {
                        JOptionPane.showMessageDialog(null, "❌ Payment update failed.");
                    }

                    stmt.close();
                    conn.close();

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "❌ Invalid number input.");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "❌ Database error: " + e.getMessage());
                    e.printStackTrace();
                }
            }

       
        
    public void loadMyPaymentsIntoTable(int loggedInAccountID) {
        DefaultTableModel model = (DefaultTableModel) paymentTable.getModel();
        model.setRowCount(0); 

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");

            String sql = "SELECT p.payment_id, p.appointment_id, a.appointment_date, a.appointment_time, " +
                         "p.totalAmout_tobepaid, p.total_amount, p.payment_method, p.payment_details, p.pay_change, " +
                         "p.payment_date, p.status, p.payed_when " +
                         "FROM payments p " +
                         "JOIN appointment a ON p.appointment_id = a.appointment_id " +
                         "WHERE p.account_id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, loggedInAccountID);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("payment_id"),
                    rs.getInt("appointment_id"),
                    rs.getDouble("totalAmout_tobepaid"),
                    rs.getDouble("total_amount"),
                    rs.getString("payment_method"),
                    rs.getString("payment_details"),
                    rs.getDouble("pay_change"),
                    rs.getTimestamp("payment_date"),
                    rs.getString("status"),
                    rs.getTimestamp("payed_when")
                };
                model.addRow(row);
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error loading payments: " + e.getMessage());
            e.printStackTrace();
        }
    }


        public void loadPrescriptionTable() {
           DefaultTableModel model = (DefaultTableModel) prescriptionTabb.getModel();
           model.setRowCount(0); // Clear existing rows

           // Updated SQL query to load prescriptions based on the logged-in patient's AccountID from the patient table
           String sql = "SELECT p.prescription_id, p.doctor_id, pd.diagnosis, m.name AS medicine_name " +
                        "FROM prescriptions p " +
                        "JOIN prescription_details pd ON p.prescription_id = pd.prescription_id " +
                        "JOIN medicine_basis m ON pd.medicine_id = m.medicine_id " +
                        "JOIN patient pt ON p.patientID = pt.patientID " +  // Join with patient table
                        "JOIN accounts ac ON pt.AccountID = ac.AccountID " + // Match AccountID in the patient table with logged-in AccountID
                        "WHERE ac.AccountID = ?";  // Use logged-in AccountID to filter prescriptions

           try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/teleclinicmedproject", "root", "");
                PreparedStatement pst = conn.prepareStatement(sql)) {

               pst.setInt(1, loggedInAccountID); // Bind the current logged-in AccountID
               ResultSet rs = pst.executeQuery();

               while (rs.next()) {
                   String prescriptionId = rs.getString("prescription_id");
                   String doctorId = rs.getString("doctor_id");
                   String diagnosis = rs.getString("diagnosis");
                   String medicine = rs.getString("medicine_name");

                   model.addRow(new Object[]{prescriptionId, doctorId, diagnosis, medicine});
               }
               
               displayPrescriptionDetails(PROPERTIES);
               loadMyPaymentsIntoTable(loggedInAccountID);
               rs.close();
               pst.close();

           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error loading prescriptions: " + e.getMessage());
           }
       }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
    String[] options = {"Consultation Payment", "Medicine Payment"};
    int choice = JOptionPane.showOptionDialog(null,
            "What would you like to pay for?",
            "Select Payment Type",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null, options, options[0]);

    if (choice == -1) return;

    switch (choice) {
        case 0:
            processPayment(); // Replace with your actual method for consultation payment
            loadMyPaymentsIntoTable(loggedInAccountID);
            break;
        case 1:
            processMedicinePayment(); // This is your existing method for medicine payment
            loadBuyedMedicinesTable(loggedInAccountID);
            break;
    
}

            
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
    ////update profile 
    private void updateProfilepatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfilepatientActionPerformed
            // Assume loggedInAccountID is the AccountID of the currently logged-in user
    int accountId = loggedInAccountID;

    String query = "SELECT a.AccountID, a.firstName, a.middleName, a.lastName, a.emailAdd, a.contactNum, " +
                   "p.AddCity, p.AddBrgy, p.AddStreet, p.medicalHistory, p.bloodType " +
                   "FROM accounts a " +
                   "LEFT JOIN patient p ON a.AccountID = p.AccountID " +
                   "WHERE a.AccountID = ?";

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setInt(1, accountId);  // Using the logged-in AccountID

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                // Prepare the string with the current patient's details
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

                // Show the current patient details in a popup
                JOptionPane.showMessageDialog(null, info);
            } else {
                JOptionPane.showMessageDialog(null, "❌ No patient found with this AccountID.");
                System.out.println("Debug: No records found.");
            }
        }
    } catch (SQLException e) {
        System.out.println("SQL Error: " + e.getMessage());
        e.printStackTrace();
    }

        // Prompt to choose which field to update
        String[] choices = {
            "Email", "Contact Number", "City", "Barangay", "Street", "Medical History", "Blood Type"
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
            case "City" -> sql = "UPDATE patient SET AddCity=? WHERE AccountID=?";
            case "Barangay" -> sql = "UPDATE patient SET AddBrgy=? WHERE AccountID=?";
            case "Street" -> sql = "UPDATE patient SET AddStreet=? WHERE AccountID=?";
            case "Medical History" -> sql = "UPDATE patient SET medicalHistory=? WHERE AccountID=?";
            case "Blood Type" -> sql = "UPDATE patient SET bloodType=? WHERE AccountID=?";
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newVal);  // Set the new value for the selected field
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

    }//GEN-LAST:event_updateProfilepatientActionPerformed

    private void viewFulldetailsofprescriptionByPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFulldetailsofprescriptionByPatientActionPerformed
         int selectedRow = prescriptionTabb.getSelectedRow();  // Get selected row in the table

         if (selectedRow != -1) {
        String prescIDStr = prescriptionTabb.getValueAt(selectedRow, 0).toString();
        int prescriptionID = Integer.parseInt(prescIDStr);
        displayPrescriptionDetails(prescriptionID);
        } else {
        JOptionPane.showMessageDialog(null, "⚠️ Please select a prescription from the table first.");
    }
    }//GEN-LAST:event_viewFulldetailsofprescriptionByPatientActionPerformed

    private void generatePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePrescriptionActionPerformed

        int selectedRow = prescriptionTabb.getSelectedRow();
      if (selectedRow == -1) {
          JOptionPane.showMessageDialog(null, "⚠️ Please select a prescription from the table.");
          return; 
      }

      try {
          // Retrieve the value as a String and then parse it to an integer
          String prescriptionIdStr = (String) prescriptionTabb.getValueAt(selectedRow, 0);
          int prescriptionId = Integer.parseInt(prescriptionIdStr);  // Convert the String to int

          generateAestheticPrescriptionPDF(prescriptionId);
      } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "❌ Invalid prescription ID format.");
          e.printStackTrace();
      }
    }//GEN-LAST:event_generatePrescriptionActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    public void showPaymentDetails(int paymentID) {
    String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    String user = "root";
    String password = "";

    String query = "SELECT payment_id, account_id, appointment_id, totalAmout_tobepaid, total_amount, " +
                   "payment_method, payment_details, payment_type, payment_date, pay_change, status, payed_when " +
                   "FROM payments WHERE payment_id = ?";

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setInt(1, paymentID);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            StringBuilder info = new StringBuilder();
            info.append("🧾 Payment ID: ").append(rs.getInt("payment_id")).append("\n");
            info.append("👤 Account ID: ").append(rs.getInt("account_id")).append("\n");
            info.append("📅 Appointment ID: ").append(rs.getInt("appointment_id")).append("\n");
            info.append("💸 Amount Due: ₱").append(rs.getDouble("totalAmout_tobepaid")).append("\n");
            info.append("💵 Amount Paid: ₱").append(rs.getDouble("total_amount")).append("\n");
            info.append("💳 Method: ").append(rs.getString("payment_method")).append("\n");
            info.append("📝 Details: ").append(rs.getString("payment_details")).append("\n");
            info.append("🔖 Type: ").append(rs.getString("payment_type")).append("\n");
            info.append("🕒 Payment Date: ").append(rs.getString("payment_date")).append("\n");
            info.append("🧾 Change Given: ₱").append(rs.getDouble("pay_change")).append("\n");
            info.append("📌 Status: ").append(rs.getString("status")).append("\n");
            info.append("📆 Payed When: ").append(rs.getString("payed_when")).append("\n");

            JTextArea textArea = new JTextArea(info.toString());
            textArea.setEditable(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new Dimension(400, 300));

            JOptionPane.showMessageDialog(null, scrollPane, "💰 Payment Full Details", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "❌ Payment record not found.");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
    }
}
    
    
    
    
    private void buymedsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buymedsbtnActionPerformed
        sessionManager.setAccountId(loggedInAccountID);  // Save current session
        MedicinetoBuy buyMedFrame = new MedicinetoBuy(); // Open next frame
        buyMedFrame.setVisible(true);
        this.dispose(); 
       
    }//GEN-LAST:event_buymedsbtnActionPerformed

    private void viewfulldetailspaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewfulldetailspaymentActionPerformed
        int selectedRow = paymentTable.getSelectedRow();
        if (selectedRow != -1) {
            int paymentID = (int) paymentTable.getValueAt(selectedRow, 0); // assuming column 0 = payment_id
            showPaymentDetails(paymentID);
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Please select a payment from the table first.");
        }
    }//GEN-LAST:event_viewfulldetailspaymentActionPerformed

    private void GeneraterecieptPAymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneraterecieptPAymentActionPerformed
        // Get the selected row from the table
        int selectedRow = paymentTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "⚠️ Please select a payment from the table.");
            return; // No row selected, so we exit the method
        }

        try {
            // Get the data from the selected row
            int paymentId = (int) paymentTable.getValueAt(selectedRow, 0);
            double totalDue = (Double) paymentTable.getValueAt(selectedRow, 1); // ensure it's cast to Double
            double totalPaid = (Double) paymentTable.getValueAt(selectedRow, 2); // ensure it's cast to Double
            String method = (String) paymentTable.getValueAt(selectedRow, 3);
            double change = (Double) paymentTable.getValueAt(selectedRow, 4); // ensure it's cast to Double
            java.sql.Timestamp paymentDate = (java.sql.Timestamp) paymentTable.getValueAt(selectedRow, 5);
            String status = (String) paymentTable.getValueAt(selectedRow, 6);
            java.sql.Timestamp payedWhen = (java.sql.Timestamp) paymentTable.getValueAt(selectedRow, 7);

            // Call the method to generate PDF receipt
            generatePDFReceipt(paymentId, totalDue, totalPaid, method, change, paymentDate, status, payedWhen);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "❌ Error generating receipt: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_GeneraterecieptPAymentActionPerformed

    private void buynewMEdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buynewMEdsActionPerformed
       sessionManager.setAccountId(loggedInAccountID);  // Save current session
        MedicinetoBuy buyMedFrame = new MedicinetoBuy(); // Open next frame
        buyMedFrame.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_buynewMEdsActionPerformed
    
        public void loadBuyedMedicinesTable(int loggedInAccountId) {
        try {
            // Define the table columns
            String[] columnNames = {
                "BuyedMed ID", "Account ID", "Medicine Name", "Price", "Quantity", "Total",
                "Buyed When", "Payment Info", "Payment Status"
            };

            // Prepare the table model
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            tablemedsBuyed.setModel(model); // yourTable = name of your JTable

            // Establish database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");

            // Query to get only the medicines for the logged-in account
            String sql = "SELECT * FROM buyedmeds WHERE account_id = ?"; // filter by account_id
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, loggedInAccountId); // Set the logged-in account ID as a parameter
            ResultSet rs = stmt.executeQuery();

            // Loop through the results and add to the table
            while (rs.next()) {
                String paymentInfo = "Method: " + rs.getString("payment_method") +
                                     ", Type: " + rs.getString("payment_type") +
                                     ", Details: " + rs.getString("payment_details");

                Object[] row = {
                    rs.getInt("buyedmed_id"),
                    rs.getInt("account_id"),
                    rs.getString("medicine_name"),
                    rs.getDouble("price"),
                    rs.getInt("quantity"),
                    rs.getDouble("total"),
                    rs.getTimestamp("buyed_when"),
                    paymentInfo,
                    rs.getString("payment_status")
                };
                model.addRow(row);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }
    }

    
       public void generateMedicineReceiptPDF(int buyedMedId) {
        Document document = new Document();
        try {
            String userHome = System.getProperty("user.home");
            String downloadsPath = Paths.get(userHome, "Downloads").toString();
            String outputPath = downloadsPath + "/medicine_receipt_" + buyedMedId + ".pdf";

            if (!Files.exists(Paths.get(downloadsPath))) {
                JOptionPane.showMessageDialog(null, "❌ Downloads folder not found.");
                return;
            }

            PdfWriter.getInstance(document, new FileOutputStream(outputPath));
            document.open();

            // Define fonts
            com.itextpdf.text.Font titleFont = FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLD);
            com.itextpdf.text.Font subtitleFont = FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD);
            com.itextpdf.text.Font bodyFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
            com.itextpdf.text.Font smallFont = FontFactory.getFont(FontFactory.HELVETICA, 10);

            // Title
            document.add(new Paragraph("🧾 MEDICINE PAYMENT RECEIPT", titleFont));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Receipt ID: " + buyedMedId, subtitleFont));
            document.add(new Paragraph(" "));

            // Fetch data from database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
            String query = """
                SELECT bm.buyedmed_id, bm.account_id, a.firstName, a.middleName, a.lastName,
                       bm.medicine_name, bm.price, bm.quantity, bm.total,
                       bm.total_payed, bm.med_change, bm.buyed_when,
                       bm.payment_method, bm.payment_type, bm.payment_details, bm.payment_status
                FROM buyedmeds bm
                JOIN accounts a ON bm.account_id = a.AccountID
                WHERE bm.buyedmed_id = ?
            """;

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, buyedMedId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String fullName = rs.getString("firstName") + " " +
                                  rs.getString("middleName") + " " +
                                  rs.getString("lastName");

                document.add(new Paragraph("👤 Buyer: " + fullName, bodyFont));
                document.add(new Paragraph("🆔 Account ID: " + rs.getInt("account_id"), bodyFont));
                document.add(new Paragraph("🕓 Date of Purchase: " + rs.getString("buyed_when"), smallFont));
                document.add(new Paragraph(" "));

                document.add(new Paragraph("💊 Medicine Purchased", subtitleFont));
                document.add(new Paragraph("Name: " + rs.getString("medicine_name"), bodyFont));
                document.add(new Paragraph("Price: ₱" + String.format("%.2f", rs.getDouble("price")), bodyFont));
                document.add(new Paragraph("Quantity: " + rs.getInt("quantity"), bodyFont));
                document.add(new Paragraph("Subtotal: ₱" + String.format("%.2f", rs.getDouble("total")), bodyFont));
                document.add(new Paragraph(" "));

                document.add(new Paragraph("💵 Payment Summary", subtitleFont));
                document.add(new Paragraph("Total Paid: ₱" + String.format("%.2f", rs.getDouble("total_payed")), bodyFont));
                document.add(new Paragraph("Change: ₱" + String.format("%.2f", rs.getDouble("med_change")), bodyFont));
                document.add(new Paragraph(" ", bodyFont));

                String paymentDetails = "Method: " + rs.getString("payment_method") +
                                        ", Type: " + rs.getString("payment_type") +
                                        ", Details: " + rs.getString("payment_details");

                document.add(new Paragraph("💳 Payment Information", subtitleFont));
                document.add(new Paragraph(paymentDetails, bodyFont));
                document.add(new Paragraph("Status: " + rs.getString("payment_status"), bodyFont));
                document.add(new Paragraph(" "));

                document.add(new Paragraph("📌 Note: This receipt serves as proof of your purchase. Please keep it for your records.", smallFont));
                document.add(new Paragraph("Please go to the clinic to pick up your medicine and show this receipt.", smallFont));

            } else {
                JOptionPane.showMessageDialog(null, "⚠️ No record found for receipt ID: " + buyedMedId);
            }

            rs.close();
            ps.close();
            conn.close();

            document.close();
            JOptionPane.showMessageDialog(null, "✅ Receipt PDF saved to Downloads: medicine_receipt_" + buyedMedId + ".pdf");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "❌ Error generating receipt PDF: " + e.getMessage());
            e.printStackTrace();
        }
    }


    private void RecieptMedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecieptMedsActionPerformed
         int selectedRow = tablemedsBuyed.getSelectedRow(); // Make sure 'tablemedsBuyed' is your JTable
        if (selectedRow != -1) {
            int buyedMedId = (int) tablemedsBuyed.getValueAt(selectedRow, 0); // Column 0 = buyedmed_id
            generateMedicineReceiptPDF(buyedMedId); // Call your function
        } else {
            JOptionPane.showMessageDialog(null, "⚠️ Please select a row to generate a receipt.");
        }

    }//GEN-LAST:event_RecieptMedsActionPerformed

    private void appointmentbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentbtn1ActionPerformed
        patientTbbb.setSelectedIndex(0);
    }//GEN-LAST:event_appointmentbtn1ActionPerformed
    
    
        public void showSelectedAccountPurchaseSummary(JTable table) {
    int selectedRow = table.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "⚠️ Please select a row first.");
        return;
    }

    try {
        int accountId = Integer.parseInt(table.getValueAt(selectedRow, 1).toString()); // Column 1 = account_id

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");

        // Get full name of the account
        String nameQuery = "SELECT firstName, middleName, lastName FROM accounts WHERE AccountID = ?";
        PreparedStatement namePS = conn.prepareStatement(nameQuery);
        namePS.setInt(1, accountId);
        ResultSet nameRS = namePS.executeQuery();

        String fullName = "Unknown User";
        if (nameRS.next()) {
            fullName = nameRS.getString("firstName") + " " +
                       nameRS.getString("middleName") + " " +
                       nameRS.getString("lastName");
        }

        nameRS.close();
        namePS.close();

        // Get summary of purchases
        String summaryQuery = """
            SELECT 
                COUNT(*) AS totalItems,
                SUM(quantity) AS totalQuantity,
                SUM(total) AS totalAmount
            FROM buyedmeds
            WHERE account_id = ?
        """;

        PreparedStatement summaryPS = conn.prepareStatement(summaryQuery);
        summaryPS.setInt(1, accountId);
        ResultSet summaryRS = summaryPS.executeQuery();

        StringBuilder message = new StringBuilder();
        
        if (summaryRS.next()) {
            int totalItems = summaryRS.getInt("totalItems");
            int totalQuantity = summaryRS.getInt("totalQuantity");
            double totalAmount = summaryRS.getDouble("totalAmount");

            message.append(String.format("""
                🧾 MEDICINE PURCHASE SUMMARY
                ─────────────────────────────
                👤 Account Name: %s
                📦 Total Transactions: %d
                💊 Total Quantity Bought: %d 
                                               
                💸 Total Amount Spent: ₱%.2f
                """, fullName, totalItems, totalQuantity, totalAmount));
        }

        summaryRS.close();
        summaryPS.close();

        // Now, get full detailed list of purchases
        message.append("\n\n📋 DETAILED PURCHASES:\n─────────────────────────────\n");

        String detailsQuery = """
            SELECT medicine_name, price, quantity, total
            FROM buyedmeds
            WHERE account_id = ?
        """;

        PreparedStatement detailsPS = conn.prepareStatement(detailsQuery);
        detailsPS.setInt(1, accountId);
        ResultSet detailsRS = detailsPS.executeQuery();

        int count = 1;
        while (detailsRS.next()) {
            String medName = detailsRS.getString("medicine_name");
            double price = detailsRS.getDouble("price");
            int quantity = detailsRS.getInt("quantity");
            double total = detailsRS.getDouble("total");

            message.append(String.format("""
                %d. %s
                   - Price: ₱%.2f
                   - Quantity: %d
                   - Total: ₱%.2f

                """, count++, medName, price, quantity, total));
        }

        detailsRS.close();
        detailsPS.close();
        conn.close();

        // Show the whole summary + details
        JOptionPane.showMessageDialog(null, message.toString(), "📊 Purchase Summary", JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "❌ Error showing summary: " + e.getMessage());
        e.printStackTrace();
    }
}


    private void SummaryofMedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SummaryofMedsActionPerformed
       showSelectedAccountPurchaseSummary(tablemedsBuyed);
    }//GEN-LAST:event_SummaryofMedsActionPerformed
    
    
    
    public void generateAestheticPrescriptionPDF(int prescriptionId) {
       Document document = new Document();
        try {
            String userHome = System.getProperty("user.home");
            String downloadsPath = Paths.get(userHome, "Downloads").toString();
            String outputPath = downloadsPath + "/prescription_" + prescriptionId + ".pdf";

            if (!Files.exists(Paths.get(downloadsPath))) {
                JOptionPane.showMessageDialog(null, "❌ Downloads folder not found.");
                return;
            }

            PdfWriter.getInstance(document, new FileOutputStream(outputPath));
            document.open();

            // Define fonts using iText's FontFactory
            com.itextpdf.text.Font titleFont = FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLD);
            com.itextpdf.text.Font subtitleFont = FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD);
            com.itextpdf.text.Font bodyFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
            com.itextpdf.text.Font smallFont = FontFactory.getFont(FontFactory.HELVETICA, 10);

            // Title
            document.add(new Paragraph("📄 TELECLINIC PRESCRIPTION", titleFont));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Prescription #: " + prescriptionId, subtitleFont));

            // Database query to get doctor and patient info
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");

            String headerQuery = """
                SELECT pr.prescription_id, pr.prescription_date,
                       ac_patient.firstName AS patientFN, ac_patient.middleName AS patientMN, ac_patient.lastName AS patientLN,
                       ac_doctor.firstName AS doctorFN, ac_doctor.middleName AS doctorMN, ac_doctor.lastName AS doctorLN,
                       td.licenseNum, td.specialty
                FROM prescriptions pr
                JOIN patient p ON pr.patientID = p.patientID
                JOIN accounts ac_patient ON p.AccountID = ac_patient.AccountID
                JOIN telemed_doctors td ON pr.doctor_id = td.doctor_id
                JOIN accounts ac_doctor ON td.AccountID = ac_doctor.AccountID
                WHERE pr.prescription_id = ?
            """;

            PreparedStatement ps = conn.prepareStatement(headerQuery);
            ps.setInt(1, prescriptionId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Patient & doctor info
                String patientName = rs.getString("patientFN") + " " + rs.getString("patientMN") + " " + rs.getString("patientLN");
                String doctorName = rs.getString("doctorFN") + " " + rs.getString("doctorMN") + " " + rs.getString("doctorLN");
                String license = rs.getString("licenseNum");
                String specialty = rs.getString("specialty");
                String date = rs.getString("prescription_date");

                // Prescription Header
                document.add(new Paragraph("Patient: " + patientName, bodyFont));
                document.add(new Paragraph("Prescribed by: Dr. " + doctorName, bodyFont));
                document.add(new Paragraph("License #: " + license, smallFont));
                document.add(new Paragraph("Specialty: " + specialty, smallFont));
                document.add(new Paragraph("Date Issued: " + date, smallFont));
                document.add(new Paragraph(" "));
            }

            rs.close();
            ps.close();

            // Medicine Details
            String detailQuery = """
                SELECT pd.medicine_id, pd.diagnosis, m.name AS medicine_name, 
                       pd.quantity, pd.frequency, pd.duration, pd.route, pd.notesDoc
                FROM prescription_details pd
                JOIN medicine_basis m ON pd.medicine_id = m.medicine_id
                WHERE pd.prescription_id = ?
            """;

            ps = conn.prepareStatement(detailQuery);
            ps.setInt(1, prescriptionId);
            rs = ps.executeQuery();

            // Add each medicine as a paragraph in the document
            int count = 1;
            while (rs.next()) {
                Paragraph medDetail = new Paragraph("Medicine #" + count++, subtitleFont);
                medDetail.add(new Paragraph("🆔 Medicine ID: " + rs.getInt("medicine_id"), bodyFont));
                medDetail.add(new Paragraph("💊 Name: " + rs.getString("medicine_name"), bodyFont));
                medDetail.add(new Paragraph("🦠 Diagnosis: " + rs.getString("diagnosis"), bodyFont));
                medDetail.add(new Paragraph("📦 Quantity: " + rs.getInt("quantity"), bodyFont));
                medDetail.add(new Paragraph("🕐 Frequency: " + rs.getString("frequency"), bodyFont));
                medDetail.add(new Paragraph("📅 Duration: " + rs.getString("duration"), bodyFont));
                medDetail.add(new Paragraph("➡️ Route: " + rs.getString("route"), bodyFont));
                medDetail.add(new Paragraph(" ")); // Add spacing for separation

                document.add(medDetail);
            }

            rs.close();
            ps.close();
            conn.close();

            // Footer message
            document.add(new Paragraph(" "));
            document.add(new Paragraph("🩺 Please follow the prescribed dosage and schedule. Stay safe and healthy!", smallFont));
            document.add(new Paragraph("📍 For inquiries, contact your healthcare provider.", smallFont));

            // Close the document
            document.close();

            JOptionPane.showMessageDialog(null, "✅ Prescription PDF saved to Downloads: prescription_" + prescriptionId + ".pdf");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "❌ Error generating prescription PDF: " + e.getMessage());
            e.printStackTrace();
        }
    }

        public void displayPrescriptionDetails(int prescriptionID) {
    // Use the connection from the db_Teleclinicmed singleton
    Connection conn = db_Teleclinicmed.getConnection();

    String query = "SELECT pr.prescription_id, pr.prescription_date, pr.patientID, pr.doctor_id, " +
                   "pd.diagnosis, pd.notesDoc, pd.quantity, pd.frequency, pd.duration, pd.route, " +
                   "mb.name AS medicine_name, " +
                   "pac.firstName AS pFirst, pac.middleName AS pMiddle, pac.lastName AS pLast, " +
                   "dac.firstName AS dFirst, dac.middleName AS dMiddle, dac.lastName AS dLast " +
                   "FROM prescriptions pr " +
                   "JOIN prescription_details pd ON pr.prescription_id = pd.prescription_id " +
                   "JOIN medicine_basis mb ON pd.medicine_id = mb.medicine_id " +
                   "JOIN patient pt ON pr.patientID = pt.patientID " +
                   "JOIN accounts pac ON pt.AccountID = pac.AccountID " +
                   "JOIN telemed_doctors td ON pr.doctor_id = td.doctor_id " +
                   "JOIN accounts dac ON td.AccountID = dac.AccountID " +
                   "WHERE pr.prescription_id = ?";

    try (PreparedStatement pstmt = conn.prepareStatement(query)) {
        pstmt.setInt(1, prescriptionID);
        ResultSet rs = pstmt.executeQuery();

        StringBuilder medDetails = new StringBuilder();
        boolean found = false;

        while (rs.next()) {
            if (!found) {
                // Get full names
                String patientName = rs.getString("pFirst") + " " +
                                     rs.getString("pMiddle") + " " +
                                     rs.getString("pLast");

                String doctorName = rs.getString("dFirst") + " " +
                                    rs.getString("dMiddle") + " " +
                                    rs.getString("dLast");

                String date = rs.getString("prescription_date");
                String notes = rs.getString("notesDoc");
                String diagnosis = rs.getString("diagnosis");

                // Set label texts
                patientname.setText("Patient: " + patientName);
                doctorname.setText("Doctor: " + doctorName);
                diagnosisnidoc.setText("" + diagnosis);
                dateofPrescription.setText("" + date);
                notesprescription1.setText("" + notes);

                found = true;
            }

            // Append medicine details
            medDetails.append("Medicine: ").append(rs.getString("medicine_name")).append("\n");
            medDetails.append("Quantity: ").append(rs.getInt("quantity")).append("\n");
            medDetails.append("Frequency: ").append(rs.getString("frequency")).append("\n");
            medDetails.append("Duration: ").append(rs.getString("duration")).append("\n");
            medDetails.append("Route: ").append(rs.getString("route")).append("\n");
            medDetails.append("--------------------------------------------------\n");
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "❌ No prescription details found.");
        } else {
            medicinedeets.setText(medDetails.toString());
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
    }
}

    
        
        public void clearPrescriptionDisplay() {
        
        patientname.setText("");
        doctorname.setText("");
        dateofPrescription.setText("");
        diagnosisnidoc.setText("");
        medicinedeets.setText("");
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
            java.util.logging.Logger.getLogger(patientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new patientDashboard(loggedInAccountID).setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GeneraterecieptPAyment;
    private javax.swing.JButton MENUBTN;
    private javax.swing.JButton RecieptMeds;
    private javax.swing.JButton SummaryofMeds;
    private javax.swing.JTextArea UpcomingAppointment;
    private javax.swing.JTable appointmentTAble;
    private javax.swing.JButton appointmentbtn;
    private javax.swing.JButton appointmentbtn1;
    private javax.swing.JLabel bdaybes;
    private javax.swing.JButton billsAndpayment;
    private javax.swing.JButton bookAppbutton;
    private javax.swing.JButton buymedsbtn;
    private javax.swing.JButton buynewMEds;
    private javax.swing.JButton cancelAppointment;
    private javax.swing.JLabel contects;
    private javax.swing.JLabel dateofPrescription;
    private javax.swing.JLabel diagnosislbl;
    private javax.swing.JLabel diagnosisnidoc;
    private javax.swing.JLabel doctorname;
    private javax.swing.JLabel dugonibes;
    private javax.swing.JLabel fullAddres;
    private javax.swing.JButton generatePrescription;
    private javax.swing.JLabel idHere;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea medhistoArea;
    private javax.swing.JTextArea medicinedeets;
    private javax.swing.JLabel namehere;
    private javax.swing.JLabel notesprescription1;
    private javax.swing.JTextArea notificationPatient;
    private javax.swing.JTabbedPane patientTbbb;
    private javax.swing.JLabel patientname;
    private javax.swing.JTable paymentTable;
    private javax.swing.JTable prescriptionTabb;
    private javax.swing.JButton refreshTables;
    private javax.swing.JButton reschedAppointment;
    private javax.swing.JLabel sexInfo;
    private javax.swing.JTable tablemedsBuyed;
    private javax.swing.JButton updateProfilepatient;
    private javax.swing.JButton viewFulldetailsofprescriptionByPatient;
    private javax.swing.JButton viewPrescription;
    private javax.swing.JButton viewfulldetailspayment;
    // End of variables declaration//GEN-END:variables
}
