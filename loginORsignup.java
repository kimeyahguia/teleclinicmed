
package mainInterfaces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class loginORsignup extends javax.swing.JFrame {

    /**
     * Creates new form loginORsignup
     */
    public loginORsignup() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signUpbtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        passFld = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel4.setText("Enter username: ");

        usernameFld.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        jLabel5.setText("Enter Password: ");

        jLabel6.setText("Don't have an account? Sign up here");

        signUpbtn.setBackground(new java.awt.Color(255, 255, 255));
        signUpbtn.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        signUpbtn.setText("SIGN UP");
        signUpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpbtnActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(0, 51, 153));
        loginBtn.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LOGIN ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passFld, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(signUpbtn))))
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addComponent(passFld, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(signUpbtn))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 430, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kimberly urge\\Downloads\\PROJ PICS\\login at sign up 1.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 1030, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 490, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
    String username = usernameFld.getText();
    String password = new String(passFld.getPassword());

    // Updated SQL query to fetch firstName, middleName, lastName along with AccountID and Role
    String sql = "SELECT AccountID, Role, firstName, middleName, lastName FROM accounts WHERE BINARY username = ? AND BINARY password = ?";

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/teleclinicmedproject", "root", "");
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, username);
        pstmt.setString(2, password);

        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                int accountId = rs.getInt("AccountID"); // Get Account ID
                String role = rs.getString("Role");
                String firstName = rs.getString("firstName");
                String middleName = rs.getString("middleName");
                String lastName = rs.getString("lastName");

                // Concatenate the full name
                String fullName = firstName + " " + (middleName != null && !middleName.isEmpty() ? middleName + " " : "") + lastName;

                String activity = "Logged In";  

                // Log the login activity
                String logSql = "INSERT INTO useractivity_logs (AccountID, activity, activity_when) VALUES (?, ?, NOW())";
                try (PreparedStatement logStmt = conn.prepareStatement(logSql)) {
                    logStmt.setInt(1, accountId);
                    logStmt.setString(2, activity); // Must match ENUM values in DB
                    logStmt.executeUpdate();
                }

                // Modify the welcome message based on role
                String welcomeMessage = "Welcome ";
                if (role.equalsIgnoreCase("doctor")) {
                    welcomeMessage += "Dr. " + fullName + "!";
                } else if (role.equalsIgnoreCase("admin")) {
                    welcomeMessage += "Master " + fullName + "!";
                } else {
                    welcomeMessage += fullName + "!";
                }

                JOptionPane.showMessageDialog(null, welcomeMessage);

                // Open corresponding dashboard
                switch (role.toLowerCase()) {
                    case "doctor":
                        doctorDashboard.setLoggedInAccountID(accountId); // 🔹 Store globally for later use
                        new doctorDashboard(accountId).setVisible(true); // 🔹 Open dashboard
                        break;
                    case "patient":
                        new patientDashboard(accountId).setVisible(true); // Pass AccountID
                        break;
                    case "admin":
                        new adminDashboard(accountId).setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Unrecognized role. Contact admin.");
                        return;
                }

                this.dispose(); // Close login window
            } else {
                // No account found, ask the user if they want to sign up
                int choice = JOptionPane.showConfirmDialog(null, 
                        "No account found. Would you like to sign up?", 
                        "Account Not Found", 
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    new SignUpform().setVisible(true);
                    this.dispose();
                } else if (choice == JOptionPane.NO_OPTION) {
                    int retry = JOptionPane.showConfirmDialog(null, 
                            "Would you like to try logging in again?", 
                            "Retry Login", 
                            JOptionPane.YES_NO_OPTION);

                    if (retry == JOptionPane.YES_OPTION) {
                        return;
                    } else {
                        new getStarted().setVisible(true);
                        this.dispose();
                    }
                } else {
                    new getStarted().setVisible(true);
                    this.dispose();
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
    }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void signUpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpbtnActionPerformed
            String[] options = {"Doctor", "Patient"};
        int choice = JOptionPane.showOptionDialog(
            null,
            "Sign up as:",
            "Choose Role",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        // Open appropriate frame based on user choice
        if (choice == 0) {
            // Doctor selected
            SignUpform docForm = new SignUpform();
            docForm.setVisible(true);
        } else if (choice == 1) {
            // Patient selected
            SignUpformPatient patientForm = new SignUpformPatient();
            patientForm.setVisible(true);
        }

        // Close the current frame
        if (choice == 0 || choice == 1) {
            dispose();
        }
    }//GEN-LAST:event_signUpbtnActionPerformed

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
            java.util.logging.Logger.getLogger(loginORsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginORsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginORsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginORsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginORsignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passFld;
    private javax.swing.JButton signUpbtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
