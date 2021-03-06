package oneClick;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Truck extends javax.swing.JInternalFrame {

    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    public Truck() {
        initComponents();
        ShowData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ruleScrollPane = new javax.swing.JScrollPane();
        rulesDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rulesDisplay.setEditable(false);
        rulesDisplay.setColumns(20);
        rulesDisplay.setFont(new java.awt.Font("Kalpurush", 1, 18)); // NOI18N
        rulesDisplay.setLineWrap(true);
        rulesDisplay.setRows(5);
        rulesDisplay.setWrapStyleWord(true);
        ruleScrollPane.setViewportView(rulesDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ruleScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ruleScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowData(){
    connection = DatabaseConnection.Connect();
        
        try{
            String query = "select truck from vahicle_rules";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               rulesDisplay.setText(resultSet.getString(1));
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(Bike.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ruleScrollPane;
    private javax.swing.JTextArea rulesDisplay;
    // End of variables declaration//GEN-END:variables
}
