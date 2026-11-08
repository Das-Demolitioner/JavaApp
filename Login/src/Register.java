import java.sql.*;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Register extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Register.class.getName());

        public Register() {
        initComponents();
        Border borderPanel = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black);
        panelRegister.setBorder(borderPanel);
        
        Border borderLabel = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        lblMinimize.setBorder(borderLabel);
        lblClose.setBorder(borderLabel);
        
        Border borderTextField = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        txtName.setBorder(borderTextField);
        txtUsername.setBorder(borderTextField);
        txtPassword.setBorder(borderTextField);
        txtPasswordConfirm.setBorder(borderTextField);
        txtPhone.setBorder(borderTextField);
        txtMail.setBorder(borderTextField);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelRegister = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        rbFemale = new javax.swing.JRadioButton();
        rbMale = new javax.swing.JRadioButton();
        btnRegister = new javax.swing.JButton();
        btnImage = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        lblPathImage = new javax.swing.JLabel();
        txtPasswordConfirm = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegister.setBackground(new java.awt.Color(153, 153, 153));
        panelRegister.setForeground(new java.awt.Color(255, 255, 255));
        panelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
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
        panelRegister.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 20));

        lblRegister.setBackground(new java.awt.Color(51, 153, 255));
        lblRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("Register");
        lblRegister.setOpaque(true);
        panelRegister.add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 30));

        lblClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
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
        panelRegister.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 20, 20));

        getContentPane().add(panelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Image :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 100, 30));
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 240, 30));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 240, 30));

        txtPhone.addActionListener(this::txtPhoneActionPerformed);
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 240, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Name :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Username :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Password :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Confirm Password :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Phone :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Mail :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Gender :");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 100, 30));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 240, 30));

        buttonGroup1.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        buttonGroup1.add(rbMale);
        rbMale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbMale.setText("Male");
        rbMale.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        btnRegister.setBackground(new java.awt.Color(0, 204, 153));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegister.setOpaque(true);
        btnRegister.addActionListener(this::btnRegisterActionPerformed);
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 280, 40));

        btnImage.setBackground(new java.awt.Color(204, 204, 204));
        btnImage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImage.setText("Select Image");
        btnImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImage.addActionListener(this::btnImageActionPerformed);
        getContentPane().add(btnImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 120, 30));

        lblBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBack.setText(">> Already Have Account ? Login");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });
        jPanel1.add(lblBack);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 410, 20));

        lblPathImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPathImage.setText("Image Path");
        lblPathImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPathImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblPathImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 420, -1));
        getContentPane().add(txtPasswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 240, 30));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 240, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
       Border lblBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        lblClose.setBorder(lblBorder);
        lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseEntered

 
    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        Border lblBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblClose.setBorder(lblBorder);
        lblClose.setForeground(Color.black);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        Border lblBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        lblMinimize.setBorder(lblBorder);
        lblMinimize.setForeground(Color.white);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        Border lblBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        lblMinimize.setBorder(lblBorder);
        lblMinimize.setForeground(Color.black);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(verifyEmptyFields())
        {
            //verification empty fields if True Show this Error Message
            JOptionPane.showMessageDialog(null, "Please Enter your informations ", "Empty Field ", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //Variables for check values with DB
            String name = txtName.getText();
            String username = txtUsername.getText();
            String password = String.valueOf(txtPassword.getPassword());
            String confirmPassword = String.valueOf(txtPasswordConfirm.getPassword());
            String phone = txtPhone.getText();
            String mail = txtMail.getText();
            String gender = "Male";
            if(rbFemale.isSelected())
            {
                gender = "Female";
            }
            if(!checkPassword(password, confirmPassword))
            {
                JOptionPane.showMessageDialog(null, "Please verify your passwords ", "No matching Passwords ! ", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                PreparedStatement ps;
                String query = "INSERT INTO users.users(name,username,password,phone,mail,gender,image) values(?,?,?,?,?,?,?)";
                System.out.println("csd");
                try
                {
                    ps = ConnectionDB.getConnection().prepareStatement(query);
                    ps.setString(1, name);
                    ps.setString(2, username);
                    ps.setString(3, password);
                    ps.setString(4, phone);
                    ps.setString(5, mail);
                    ps.setString(6, gender);
                    System.out.println("csd2");
                    try{
                        InputStream image = new FileInputStream(new File(lblPathImage.getText()));
                        ps.setBlob(7, image);
                        
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Image not copied to the DB ", "Image Error ", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    //Condition CheckUserExist if the username already exist in the Data base Show error message if not Account created Successfully
                    if(!checkUserExist()){
                        if(ps.executeUpdate() != 0)
                    {
                        JOptionPane.showMessageDialog(null, "Your account has been created successfully ! ", " Succes  ", JOptionPane.PLAIN_MESSAGE);
                        System.out.println("csd3");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Account has not been created ! ", "Error  ", JOptionPane.ERROR_MESSAGE);
                    }
                    }
                    
                    
                }catch(Exception ex) {
                        
                            JOptionPane.showMessageDialog(null, "Connection Failed to the DATA BASE ! ", "ERROR Connection ", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
    }//GEN-LAST:event_btnRegisterActionPerformed
    
    //Methode to verify if Identical Password and Confirm Password
    private boolean checkPassword(String password , String confirmPassword){
        return(password.equals(confirmPassword));
    }
    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        lblBack.setForeground(Color.white);
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        lblBack.setForeground(Color.black);
    }//GEN-LAST:event_lblBackMouseExited
    
    //Method to verify If Fields are Empty return True if Empty
    private boolean verifyEmptyFields(){
        return (txtName.getText().equals("") || txtUsername.getText().equals("") || String.valueOf(txtPassword.getPassword()).equals("") ||
                String.valueOf(txtPasswordConfirm.getPassword()).equals("") || txtPhone.getText().equals("") || txtMail.getText().equals("")
                || lblPathImage.getText().equals("Image Path"));
    }
    
    private boolean checkUserExist(){
        PreparedStatement ps;
        ResultSet rs;
        boolean userExist = false;
        String query = "SELECT username FROM users.users WHERE username = ?";
        try{
            ps = ConnectionDB.getConnection().prepareStatement(query);
            ps.setString(1, txtUsername.getText());
            rs = ps.executeQuery();
            
            if(rs.next()){
                userExist = true;
                JOptionPane.showMessageDialog(null, "This username already exist !", "Error !", JOptionPane.ERROR_MESSAGE);
            }
       
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Connection Failed to the DATA BASE ! ", "ERROR Connection ", JOptionPane.ERROR_MESSAGE);
        }
        return userExist;
    }
    
    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("images", "jpeg","png","jng");
        chooser.addChoosableFileFilter(filter);
        chooser.setDialogTitle("Choose your image");
        
        int filestate = chooser.showDialog(null, "OK");
        if(filestate == JFileChooser.APPROVE_OPTION)
        {
            File selectedImage = chooser.getSelectedFile();
            String path = selectedImage.getAbsolutePath();
            lblPathImage.setText(path);
            
            
        }
    }//GEN-LAST:event_btnImageActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char key = evt.getKeyChar();
        if( !Character.isDigit(key)){
            evt.consume(); 
        }
    }//GEN-LAST:event_txtPhoneKeyTyped
   
    
    
    
    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(() -> new Register().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblPathImage;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfirm;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
