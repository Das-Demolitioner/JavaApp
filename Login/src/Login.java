import java.sql.*;
import java.awt.Color;
import javax.naming.spi.DirStateFactory;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    
    public Login() {
        initComponents();
        
        Border borderPanel = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow);
        panelLogin.setBorder(borderPanel);
        
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        lblMinimize.setBorder(borderLabel);
        lblClose.setBorder(borderLabel);
        
        Border borderTextField = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        txtUsername.setBorder(borderTextField);
        txtPassword.setBorder(borderTextField);
               
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        lblRegister = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(153, 153, 153));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, 30));

        lblMinimize.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
        lblMinimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMinimize.setPreferredSize(new java.awt.Dimension(17, 17));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });
        panelLogin.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 10, 20, 20));

        lblClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblClose.setPreferredSize(new java.awt.Dimension(17, 17));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });
        panelLogin.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 20, 20));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Username :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtPassword.addActionListener(this::txtPasswordActionPerformed);
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 40));

        txtUsername.addActionListener(this::txtUsernameActionPerformed);
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 210, 40));

        lblRegister.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegister.setText(">> No Account ? Create One");
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
        });
        getContentPane().add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(this::btnLoginActionPerformed);
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, 40));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 420, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (checkEmptyFields()){
            JOptionPane.showMessageDialog(null, "please enter your username and your password !", "Missing Information !", JOptionPane.ERROR_MESSAGE);
        }
        else{
            PreparedStatement ps;
            ResultSet rs;
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String query = "SELECT * FROM users.users WHERE username=? AND password=?";
            
            try{
                ps = ConnectionDB.getConnection().prepareStatement(query);
                ps.setString(1, username);
                ps.setString(2, password);
                rs = ps.executeQuery();
                System.out.print(rs);

                if(rs.next()){
                    Menu menu = new Menu();
                    menu.setVisible(true);
                    menu.setLocationRelativeTo(null);
                    menu.getLblWelcome().setText("Welcome "+rs.getString(1));
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "No user with this username or password", "Incorrect Data", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Connection with the DB Failed !");
                
            }
            
            
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    
    private boolean checkEmptyFields(){
        return (txtUsername.getText().equals("") || txtPassword.getText().equals(""));
    }
    
    
    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setBackground(new Color(0,100,195));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_btnLoginMouseExited

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setForeground(Color.black);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        lblMinimize.setForeground(Color.white);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        lblMinimize.setForeground(Color.black);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        lblRegister.setForeground(Color.white);
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        lblRegister.setForeground(Color.black);
    }//GEN-LAST:event_lblRegisterMouseExited

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        Register register = new Register();
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblRegisterMouseClicked

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
    @Override
    public void run() {
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
});    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
