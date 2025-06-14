
package subInterfaces;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import mainInterfaces.loginORsignup;
import mainInterfaces.patientDashboard;
import static mainInterfaces.patientDashboard.setLoggedInAccountID;


public class bookaAppointment extends javax.swing.JFrame {

    private static int loggedInAccountID; // Store AccountID
    
    public bookaAppointment(int AccountID) {
        initComponents();
        setLoggedInAccountID(AccountID); 
        
       //functions 
        loadAppointmentDetails();
        LoadDoctors();
        doctorAppointment.addActionListener(e -> {
        LoadDocRate(); });
        
        doctorAppointment.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
       
             
        //trigger para lumabas yong time ng doctor na selected
        String selectedDoctor = (String) doctorAppointment.getSelectedItem();
        int doctorId = getDoctorIdFromName(selectedDoctor);
        updateDoctorAvailability(doctorId);
        }
        });
        
         TypeofConsultation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            TypeofConsultationActionPerformed(evt);  // Call the method when a selection is made
        }
        });
        loadConsultationTypes();
        
        //calculate ng total
        reasonAppointment.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            calculateTotalFee(); // Call your method here
        }
        });
        
        
        
        
        
        
        }
    
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        patientID = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Pnamelbl = new javax.swing.JLabel();
        contactNum = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addressheres = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medHisto = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        SEXHERE = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        doctorAppointment = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        doctorRate = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        doctorSpeciality = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        doctorAvailability = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        reasonAppointment = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        TypeofConsultation = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        DoctorFee = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        consultFee = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        totalAmountappointment = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        SaveAppointment = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        MENUBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        jPanel3.setBackground(new java.awt.Color(122, 147, 250));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TELECLINICMED APPOINTMENT:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 630, -1));

        patientID.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        patientID.setForeground(new java.awt.Color(0, 0, 102));
        patientID.setText("ID HERE");

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("✅ PATIENT INFORMATION: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("PATIENT ID: ");

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("FULL NAME: ");

        jLabel9.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("CONTACT NO. : ");

        Pnamelbl.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        Pnamelbl.setForeground(new java.awt.Color(0, 0, 102));
        Pnamelbl.setText("Name here");

        contactNum.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
        contactNum.setForeground(new java.awt.Color(0, 0, 102));
        contactNum.setText("conatct here\\");

            jLabel10.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(0, 0, 102));
            jLabel10.setText("ADDRESS: ");

            addressheres.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
            addressheres.setForeground(new java.awt.Color(0, 0, 102));
            addressheres.setText("BDAY HERE");

            jLabel11.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(0, 0, 102));

            medHisto.setColumns(20);
            medHisto.setRows(5);
            jScrollPane1.setViewportView(medHisto);

            jLabel16.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
            jLabel16.setForeground(new java.awt.Color(0, 0, 102));
            jLabel16.setText("SEX: ");

            SEXHERE.setFont(new java.awt.Font("Century Schoolbook", 0, 13)); // NOI18N
            SEXHERE.setForeground(new java.awt.Color(0, 0, 102));
            SEXHERE.setText("conatct here\\");

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SEXHERE, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patientID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addressheres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                );
                jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientID)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Pnamelbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(contactNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(SEXHERE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(addressheres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addContainerGap())
                );

                jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 380, 280));

                jPanel7.setBackground(new java.awt.Color(0, 0, 102));

                jLabel12.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(255, 255, 255));
                jLabel12.setText("👨‍ SELECT A DOCTOR: ");

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                    jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(83, Short.MAX_VALUE))
                );
                jPanel7Layout.setVerticalGroup(
                    jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                );

                jLabel17.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel17.setForeground(new java.awt.Color(0, 0, 102));

                doctorAppointment.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
                doctorAppointment.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        doctorAppointmentActionPerformed(evt);
                    }
                });

                jLabel13.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(0, 0, 102));
                jLabel13.setText("DOCTOR: ");

                jLabel14.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(0, 0, 102));
                jLabel14.setText("RATE : ");

                doctorRate.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
                doctorRate.setForeground(new java.awt.Color(0, 0, 102));
                doctorRate.setText("RATE HERE");

                jLabel15.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(0, 0, 102));
                jLabel15.setText("Speciality: ");

                doctorSpeciality.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
                doctorSpeciality.setForeground(new java.awt.Color(0, 0, 102));
                doctorSpeciality.setText("RATE HERE");

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                    jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorAppointment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(doctorRate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(doctorSpeciality, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                );
                jPanel6Layout.setVerticalGroup(
                    jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel17))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorRate)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorSpeciality)
                        .addContainerGap(15, Short.MAX_VALUE))
                );

                jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 380, 230));

                jPanel11.setBackground(new java.awt.Color(0, 0, 102));

                jLabel19.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel19.setForeground(new java.awt.Color(255, 255, 255));
                jLabel19.setText("DATE AND TIME: ");

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                    jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel11Layout.setVerticalGroup(
                    jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                );

                jLabel20.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel20.setForeground(new java.awt.Color(0, 0, 102));

                jLabel23.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel23.setForeground(new java.awt.Color(0, 0, 102));
                jLabel23.setText("TIME: ");

                jLabel24.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel24.setForeground(new java.awt.Color(0, 0, 102));
                jLabel24.setText("DATE: ");

                doctorAvailability.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

                jPanel12.setBackground(new java.awt.Color(0, 0, 102));

                jLabel21.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel21.setForeground(new java.awt.Color(255, 255, 255));
                jLabel21.setText("REASON FOR CONSULTATION: ");

                javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
                jPanel12.setLayout(jPanel12Layout);
                jPanel12Layout.setHorizontalGroup(
                    jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel12Layout.setVerticalGroup(
                    jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                );

                reasonAppointment.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

                jLabel29.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel29.setForeground(new java.awt.Color(0, 0, 102));
                jLabel29.setText("Type: ");

                jLabel30.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel30.setForeground(new java.awt.Color(0, 0, 102));
                jLabel30.setText("Choose consultation: ");

                TypeofConsultation.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(
                    jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TypeofConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(reasonAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doctorAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))
                );
                jPanel10Layout.setVerticalGroup(
                    jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(doctorAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(jLabel20))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeofConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reasonAppointment)))
                        .addGap(25, 25, 25))
                );

                jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 520, 260));

                jPanel9.setBackground(new java.awt.Color(255, 255, 255));

                jPanel14.setBackground(new java.awt.Color(0, 0, 102));

                jLabel18.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel18.setForeground(new java.awt.Color(255, 255, 255));
                jLabel18.setText("💰 ESTIMATED BILL BREAKDOWN: ");

                javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
                jPanel14.setLayout(jPanel14Layout);
                jPanel14Layout.setHorizontalGroup(
                    jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel14Layout.setVerticalGroup(
                    jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                );

                jLabel25.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel25.setForeground(new java.awt.Color(0, 0, 102));
                jLabel25.setText("🩺 Doctor Consultation Fee: ");

                DoctorFee.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
                DoctorFee.setForeground(new java.awt.Color(0, 0, 102));
                DoctorFee.setText("FEE HERE");

                jLabel26.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel26.setForeground(new java.awt.Color(0, 0, 102));
                jLabel26.setText("📋 Consultation Service Fee :");

                consultFee.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
                consultFee.setForeground(new java.awt.Color(0, 0, 102));
                consultFee.setText("FEE HERE");

                jLabel27.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
                jLabel27.setForeground(new java.awt.Color(0, 0, 102));
                jLabel27.setText("🧾  TOTAL AMOUNT TO PAY:");

                totalAmountappointment.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
                totalAmountappointment.setForeground(new java.awt.Color(0, 0, 102));
                totalAmountappointment.setText("FEE HERE");

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                    jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(DoctorFee, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalAmountappointment, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(consultFee, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                );
                jPanel9Layout.setVerticalGroup(
                    jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DoctorFee))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consultFee)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalAmountappointment))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 520, 160));

                jPanel16.setBackground(new java.awt.Color(0, 0, 102));

                jButton2.setBackground(new java.awt.Color(255, 255, 255));
                jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
                jButton2.setText("CANCEL");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                });

                SaveAppointment.setBackground(new java.awt.Color(255, 255, 255));
                SaveAppointment.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
                SaveAppointment.setText(" CONFIRM ");
                SaveAppointment.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        SaveAppointmentActionPerformed(evt);
                    }
                });

                jLabel28.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
                jLabel28.setForeground(new java.awt.Color(255, 255, 255));
                jLabel28.setText("CONFIRM APPOINTMENT?");

                javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
                jPanel16.setLayout(jPanel16Layout);
                jPanel16Layout.setHorizontalGroup(
                    jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                );
                jPanel16Layout.setVerticalGroup(
                    jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                );

                jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 610, 520, 70));

                MENUBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/subInterfaces/back icon2.png"))); // NOI18N
                MENUBTN.setContentAreaFilled(false);
                MENUBTN.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        MENUBTNActionPerformed(evt);
                    }
                });
                jPanel3.add(MENUBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 690, 80, 50));

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/subInterfaces/bookinhui 2.jpg"))); // NOI18N
                jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1390, 790));

                getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 790));

                pack();
            }// </editor-fold>//GEN-END:initComponents
    
     public static void setLoggedInAccountID(int AccountID) {
        loggedInAccountID = AccountID; // Store globally
    }
    
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

     private void LoadDoctors() {
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
            doctorAppointment.removeAllItems();  // Clear the combo box before populating

            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "No available doctors found.");
                return;
            }

            // Populate the combo box with the doctor names
            while (rs.next()) {
                String doctorName = rs.getString("DoctorName");  // Retrieve the full doctor name with 'Dr.' prefix
                System.out.println("Retrieved Doctor: " + doctorName);  // Debugging

                doctorAppointment.addItem(doctorName);  // Add the doctor name to the combo box
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
    }
}

     private void LoadDocRate() {
    String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    String selectedDoctor = (String) doctorAppointment.getSelectedItem();

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
                doctorRate.setText( String.format("%.2f", consultationFee) + " Pesos " );
                doctorSpeciality.setText( specialty);
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
         doctorAvailability.removeAllItems();

         // Populate the doctorAvailability combo box with the fetched availability
         while (rs.next()) {
             String availability = rs.getString("availability");
             doctorAvailability.addItem(availability);
         }

         rs.close();
         pst.close();
     } catch (SQLException e) {
         System.err.println("SQL Exception: " + e.getMessage());
         JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
     }
 }


    private void loadAppointmentDetails() {
    String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
    String user = "root";
    String password = "";

    String query = "SELECT a.firstName, a.middleName, a.lastName, a.Sex, a.contactNum, p.medicalHistory, p.AddCity, p.AddBrgy, p.AddStreet  " +
                 
                   "FROM patient p " +
                   "JOIN accounts a ON p.AccountID = a.AccountID " +
                   "WHERE p.AccountID = ?";

    System.out.println("🔍 Checking AccountID for Appointment: " + loggedInAccountID); 

    try (Connection conn = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setInt(1, loggedInAccountID);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            System.out.println("✅ Appointment Data Found!");

            // Fetch Data
            String FullName = rs.getString("firstName") + " " + rs.getString("middleName") + " " + rs.getString("lastName");
            String sex = rs.getString("Sex");
            String contactNumber = rs.getString("contactNum");
            String FullAddress = rs.getString("AddStreet") + ", " + rs.getString("AddBrgy") + ", " + rs.getString("AddCity");
            String medicalHistory = "📌 Medical History:\n\n" + rs.getString("medicalHistory").replace(". ", ".\n");

            // Set UI Components
            Pnamelbl.setText(FullName);
            addressheres.setText(FullAddress);
            SEXHERE.setText(sex);
            contactNum.setText(contactNumber);
            medHisto.setText(medicalHistory);
            patientID.setText("Patient ID: " + loggedInAccountID);
            doctorRate.setText(""); // Placeholder

            // Debugging
            System.out.println("📌 Sex: " + sex);
            System.out.println("📌 Contact: " + contactNumber);
            System.out.println("📌 Medical History:\n" + medicalHistory);

        } else {
            System.out.println("⚠ No appointment data found for AccountID: " + loggedInAccountID);
            JOptionPane.showMessageDialog(null, "No appointment details found.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
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
        TypeofConsultation.removeAllItems();

        // Add the fetched consultation types to the combo box
        while (rs.next()) {
            String category = rs.getString("reason_type");
            TypeofConsultation.addItem(category);  // Add category to the combo box
        }

        rs.close();
        pst.close();
    } catch (SQLException e) {
        System.err.println("SQL Exception: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
    }
    }
    
    private void TypeofConsultationActionPerformed(java.awt.event.ActionEvent evt) {
   
    String selectedConsultationType = (String) TypeofConsultation.getSelectedItem();
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
            reasonAppointment.removeAllItems();

            // Add the fetched reasons to the combo box
            while (rs.next()) {
                String reason = rs.getString("reason_description");
                reasonAppointment.addItem(reason);  // Add reason to the combo box
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


    
        private void calculateTotalFee() {
        String url = "jdbc:mysql://localhost:3306/teleclinicmedproject";
        String user = "root";
        String password = "";

        String selectedDoctor = (String) doctorAppointment.getSelectedItem();
        String selectedReason = (String) reasonAppointment.getSelectedItem();

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

            // Calculate total
            double total = doctorFee + consultationFee;

            // Set values to JLabels
            DoctorFee.setText("₱" + String.format("%.2f", doctorFee));
            consultFee.setText("₱" + String.format("%.2f", consultationFee));
            totalAmountappointment.setText("₱" + String.format("%.2f", total));

        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
        }
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
    
    
    private void SaveAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAppointmentActionPerformed
            String selectedDoctor = (String) doctorAppointment.getSelectedItem();
        String selectedReason = (String) reasonAppointment.getSelectedItem();
        String selectedAvailability = (String) doctorAvailability.getSelectedItem();
        String appointmentStatus = "Scheduled";

        // Get and validate date from JDateChooser
        java.util.Date selectedDateRaw = jDateChooser2.getDate();
        if (selectedDateRaw == null) {
            JOptionPane.showMessageDialog(null, "Please select a date.");
            return;
        }

        // 🛑 Check if selected date is in the past
        java.util.Date currentDate = new java.util.Date(); // current date and time
        if (selectedDateRaw.before(currentDate)) {
            JOptionPane.showMessageDialog(null, "Appointment date cannot be in the past.");
            return;
        }

        // Format the date to "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String appointmentDate = dateFormat.format(selectedDateRaw); // formatted date

        // Split time range from selectedAvailability (e.g., "11:00:00 - 12:00:00")
        String[] timeRange = selectedAvailability.split(" - ");
        if (timeRange.length < 2) {
            JOptionPane.showMessageDialog(null, "Invalid time range format.");
            return;
        }
        String appointmentStart = timeRange[0].trim();
        String appointmentEnd = timeRange[1].trim();

        // Other fields
        int patientId = getPatientIdFromAccount(loggedInAccountID);
        int doctorId = getDoctorIdFromName(selectedDoctor);
        int consultationReasonId = getConsultationReasonId(selectedReason);

        String doctorRateStr = doctorRate.getText().replaceAll("[^\\d.]", "");
        String consultFeeStr = consultFee.getText().replaceAll("[^\\d.]", "");

        double totalFee = Double.parseDouble(doctorRateStr) + Double.parseDouble(consultFeeStr);

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "")) {

            // Check if selected time slot is already booked (checking both start and end times)
            String checkTimeQuery = "SELECT COUNT(*) FROM appointment "
                    + "WHERE doctor_id = ? AND appointment_date = ? "
                    + "AND ((appointment_time >= ? AND appointment_time < ?) OR (appointment_time <= ? AND appointment_time > ?))";
            try (PreparedStatement timeCheckStmt = conn.prepareStatement(checkTimeQuery)) {
                timeCheckStmt.setInt(1, doctorId);
                timeCheckStmt.setString(2, appointmentDate);
                timeCheckStmt.setString(3, appointmentStart);
                timeCheckStmt.setString(4, appointmentEnd);
                timeCheckStmt.setString(5, appointmentEnd);
                timeCheckStmt.setString(6, appointmentStart);

                ResultSet rsTime = timeCheckStmt.executeQuery();
                if (rsTime.next() && rsTime.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "This time slot is already booked. Please select a different one.");
                    return;
                }
            }

            // Check if the same appointment already exists
            String checkAppointmentQuery = "SELECT COUNT(*) FROM appointment "
                    + "WHERE patient_id = ? AND doctor_id = ? AND appointment_date = ? "
                    + "AND appointment_time = ? AND consultation_reason_id = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkAppointmentQuery)) {
                checkStmt.setInt(1, patientId);
                checkStmt.setInt(2, doctorId);
                checkStmt.setString(3, appointmentDate);
                checkStmt.setString(4, appointmentStart);
                checkStmt.setInt(5, consultationReasonId);

                ResultSet rs = checkStmt.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "You already have an existing appointment for this date and time.");
                    return;
                }
            }

            // Combine start and end time into one string
                String appointmentTime = appointmentStart + " - " + appointmentEnd;

                // Insert the appointment with single appointment_time column
                String insertAppointmentQuery = "INSERT INTO appointment "
                        + "(AccountID, patient_id, doctor_id, appointment_date, appointment_time, consultation_reason_id, status, fee) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pst = conn.prepareStatement(insertAppointmentQuery, Statement.RETURN_GENERATED_KEYS)) {
                    pst.setInt(1, loggedInAccountID);
                    pst.setInt(2, patientId);
                    pst.setInt(3, doctorId);
                    pst.setString(4, appointmentDate);
                    pst.setString(5, appointmentTime); // ✅ Combined time
                    pst.setInt(6, consultationReasonId);
                    pst.setString(7, appointmentStatus);
                    pst.setDouble(8, totalFee);

                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    ResultSet generatedKeys = pst.getGeneratedKeys();
                    int appointmentId = -1;
                    if (generatedKeys.next()) {
                        appointmentId = generatedKeys.getInt(1);
                    }

                    if (appointmentId != -1) {
                        // Insert payment
                        String insertPaymentQuery = "INSERT INTO payments (account_id, appointment_id, totalAmout_tobepaid, status) VALUES (?, ?, ?, ?)";
                        try (PreparedStatement paymentStmt = conn.prepareStatement(insertPaymentQuery)) {
                            paymentStmt.setInt(1, loggedInAccountID);
                            paymentStmt.setInt(2, appointmentId);
                            paymentStmt.setDouble(3, totalFee);
                            paymentStmt.setString(4, "Pending");
                            paymentStmt.executeUpdate();
                        }

                        // Update doctor_availability table to mark the time slot as unavailable
                        String updateAvailabilityQuery = "UPDATE doctors_availability SET status = 'Unavailable' "
                                + "WHERE doctor_id = ? AND available_from = ? AND available_to = ?";
                        try (PreparedStatement availabilityStmt = conn.prepareStatement(updateAvailabilityQuery)) {
                            availabilityStmt.setInt(1, doctorId);
                            availabilityStmt.setString(2, appointmentStart);
                            availabilityStmt.setString(3, appointmentEnd);
                            availabilityStmt.executeUpdate();
                        }

                        // Confirm appointment scheduling
                        int response = JOptionPane.showConfirmDialog(null,
                                "Appointment successfully scheduled!\n\nDo you want to schedule another appointment?",
                                "Success", JOptionPane.YES_NO_OPTION);

                        if (response == JOptionPane.YES_OPTION) {
                            doctorAppointment.setSelectedIndex(0);
                            reasonAppointment.setSelectedIndex(0);
                            doctorAvailability.setSelectedIndex(0);
                            doctorRate.setText("");
                            consultFee.setText("");
                        } else {
                            Window window = SwingUtilities.getWindowAncestor(doctorAppointment);
                            if (window != null) {
                                window.dispose();
                            }
                            new patientDashboard(loggedInAccountID).setVisible(true);
                            dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to retrieve appointment ID.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to schedule the appointment.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
        }

    }//GEN-LAST:event_SaveAppointmentActionPerformed

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
                new loginORsignup().setVisible(true); // Open the login/signup page
                this.dispose(); // Close current window
            }
            break;

            case 2:
            default:
            break;

        }
    }//GEN-LAST:event_MENUBTNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new patientDashboard(loggedInAccountID).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void doctorAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorAppointmentActionPerformed

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
            java.util.logging.Logger.getLogger(bookaAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookaAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookaAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookaAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookaAppointment(loggedInAccountID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoctorFee;
    private javax.swing.JButton MENUBTN;
    private javax.swing.JLabel Pnamelbl;
    private javax.swing.JLabel SEXHERE;
    private javax.swing.JButton SaveAppointment;
    private javax.swing.JComboBox<String> TypeofConsultation;
    private javax.swing.JLabel addressheres;
    private javax.swing.JLabel consultFee;
    private javax.swing.JLabel contactNum;
    private javax.swing.JComboBox<String> doctorAppointment;
    private javax.swing.JComboBox<String> doctorAvailability;
    private javax.swing.JLabel doctorRate;
    private javax.swing.JLabel doctorSpeciality;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea medHisto;
    private javax.swing.JLabel patientID;
    private javax.swing.JComboBox<String> reasonAppointment;
    private javax.swing.JLabel totalAmountappointment;
    // End of variables declaration//GEN-END:variables
}
