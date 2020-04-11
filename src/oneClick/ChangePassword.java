package oneClick;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ChangePassword extends javax.swing.JFrame {

    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    String username;
    
    public ChangePassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oldPassword = new javax.swing.JPasswordField();
        newPassword = new javax.swing.JPasswordField();
        retypeNewPassword = new javax.swing.JPasswordField();
        oldPasswordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        retypeNewPasswordLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(50, 50));
        setResizable(false);

        oldPasswordLabel.setText("Old Password");

        newPasswordLabel.setText("New Password");

        retypeNewPasswordLabel.setText("Re-Type New Password");

        saveButton.setText("save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(retypeNewPasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oldPasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(retypeNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(newPassword)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPasswordLabel))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordLabel))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retypeNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retypeNewPasswordLabel))
                .addGap(39, 39, 39)
                .addComponent(saveButton)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setBounds(50, 50, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        connection = DatabaseConnection.Connect();
        
        
            String oldPassword = new String(this.oldPassword.getPassword());
            String newPassword = new String(this.newPassword.getPassword());
            String retypeNewPassword = new String(this.retypeNewPassword.getPassword());
            int jOptionClicked = 123456789;
            System.out.println(this.username);
            if (newPassword.equals(retypeNewPassword)) {
                try{
                    String query = "select * from users where username='"+this.username+"' and password = '"+oldPassword+"'";
                    preparedStatement = connection.prepareStatement(query);
                    resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()) {
                        connection.close();
                        
                    } 
                    else {
                       jOptionClicked = JOptionPane.showConfirmDialog(null,"Old Password Did Not Match!!!", "Error!", 
                               JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                    }
                    UpdatePassword(newPassword);
                    if(jOptionClicked == JOptionPane.OK_OPTION){
                           //username.setText("");
                           this.oldPassword.setText(null);
                           this.newPassword.setText(null);
                           this.retypeNewPassword.setText(null);
                       }
                }
                catch(Exception exception){
                JOptionPane.showMessageDialog(rootPane, "Following error found!!!\n"+exception, "Error!!!", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                
                jOptionClicked = JOptionPane.showConfirmDialog(null, "Your password doesn't match!\nPlease Try again!", "Error!!!",JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                if(jOptionClicked == JOptionPane.OK_OPTION){
                    this.oldPassword.setText(null);
                    this.retypeNewPassword.setText(null);
                    this.newPassword.setText(null);
                    
                }
            }
            
    }//GEN-LAST:event_saveButtonActionPerformed

    private void UpdatePassword(String password){
        try {
                connection = DatabaseConnection.Connect();
                Statement statement = connection.createStatement();
                String update = "UPDATE users SET password='"+password+"' where username='"+this.username+"'";
                statement.executeUpdate(update);
                connection.close();
                JOptionPane.showConfirmDialog(null,"Password Updated Successfully", "Success", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                connection.close();
                this.dispose();
        } 
        catch (SQLException sQLException) {
                System.out.println(sQLException);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField oldPassword;
    private javax.swing.JLabel oldPasswordLabel;
    private javax.swing.JPasswordField retypeNewPassword;
    private javax.swing.JLabel retypeNewPasswordLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
