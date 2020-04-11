package oneClick;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenu extends javax.swing.JFrame {

    public String username;
    public MainMenu() {
        initComponents();
        Home home = new Home();
        mainDesktopPane.add(home);
        home.setVisible(true);
        try {
            home.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        //For Maximizing crrent jframe. It will appear fullscreen
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mainDesktopPane = new javax.swing.JDesktopPane();
        carButton = new javax.swing.JButton();
        busButton = new javax.swing.JButton();
        bikeButton = new javax.swing.JButton();
        truckButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        changePassword = new javax.swing.JButton();
        home = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainMenu");

        javax.swing.GroupLayout mainDesktopPaneLayout = new javax.swing.GroupLayout(mainDesktopPane);
        mainDesktopPane.setLayout(mainDesktopPaneLayout);
        mainDesktopPaneLayout.setHorizontalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        mainDesktopPaneLayout.setVerticalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        carButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/car.png"))); // NOI18N
        carButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carButtonActionPerformed(evt);
            }
        });

        busButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bus.png"))); // NOI18N
        busButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busButtonActionPerformed(evt);
            }
        });

        bikeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bike.png"))); // NOI18N
        bikeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikeButtonActionPerformed(evt);
            }
        });

        truckButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/truck.png"))); // NOI18N
        truckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truckButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        changePassword.setText("Change Password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePassword)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(truckButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(busButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bikeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainDesktopPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainDesktopPane)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changePassword)
                        .addGap(42, 42, 42)
                        .addComponent(busButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(truckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(carButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(bikeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(home)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitButton)
                        .addGap(60, 60, 60))))
        );

        setBounds(0, 0, 719, 581);
    }// </editor-fold>//GEN-END:initComponents

    private void busButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busButtonActionPerformed
       Bus busFrame = new Bus();
       mainDesktopPane.removeAll();
       mainDesktopPane.add(busFrame);
       busFrame.setVisible(true);
       try{
           busFrame.setMaximum(true);
       } 
       catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
       try{
           busFrame.setSelected(true);
       } 
       catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_busButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void truckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truckButtonActionPerformed
        Truck truckFrame = new Truck();
       mainDesktopPane.removeAll();
       mainDesktopPane.add(truckFrame);
       truckFrame.setVisible(true);
       try{
           truckFrame.setMaximum(true);
       } 
       catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
       try{
           truckFrame.setSelected(true);
       } 
       catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_truckButtonActionPerformed

    private void carButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carButtonActionPerformed
        Car carFrame = new Car();
       mainDesktopPane.removeAll();
       mainDesktopPane.add(carFrame);
       carFrame.setVisible(true);
       try{
           carFrame.setMaximum(true);
       } 
       catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
       try{
           carFrame.setSelected(true);
       } 
       catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_carButtonActionPerformed

    private void bikeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikeButtonActionPerformed
        Bike bikeFrame = new Bike();
       mainDesktopPane.removeAll();
       mainDesktopPane.add(bikeFrame);
       bikeFrame.setVisible(true);
       try{
           bikeFrame.setMaximum(true);
       } 
       catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
       try{
           bikeFrame.setSelected(true);
       } 
       catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_bikeButtonActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        Home home = new Home();
        mainDesktopPane.add(home);
        home.setVisible(true);
        try {
            home.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE,null,ex);
        }
        ChangePassword changePassword = new ChangePassword();
        changePassword.setVisible(true);
        changePassword.username = this.username;
    }//GEN-LAST:event_changePasswordActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Home home = new Home();
        mainDesktopPane.removeAll();
        mainDesktopPane.add(home);
        home.setVisible(true);
        try {
            home.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE,null,ex);
        }
        try{
           home.setSelected(true);
       } 
       catch (PropertyVetoException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bikeButton;
    private javax.swing.JButton busButton;
    private javax.swing.JButton carButton;
    private javax.swing.JButton changePassword;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JDesktopPane mainDesktopPane;
    private javax.swing.JButton truckButton;
    // End of variables declaration//GEN-END:variables
}
