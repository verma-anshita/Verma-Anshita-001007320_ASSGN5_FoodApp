/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Restaurant.MenuItem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anshitaverma
 */
public class UpdateMenuItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateMenuItemJPanel
     */
    
    private MenuItem menuItem;
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    
    public UpdateMenuItemJPanel( JPanel userProcessContainer,MenuItem menuItem,UserAccount userAccount ) {
        this.menuItem = menuItem;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        initComponents();
        initializeData();
    }

    private void initializeData() {
        menuNamejTextField.setText(menuItem.getProductName());
        pricejTextField.setText(String.valueOf(menuItem.getPrice()));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButtonjButton = new javax.swing.JButton();
        savejButton = new javax.swing.JButton();
        headerjLabel = new javax.swing.JLabel();
        pricejTextField = new javax.swing.JTextField();
        menuNamejLabel = new javax.swing.JLabel();
        menuNamejTextField = new javax.swing.JTextField();
        pricejLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        backButtonjButton.setText("< < Back");
        backButtonjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonjButtonActionPerformed(evt);
            }
        });

        savejButton.setText("Update");
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Update Menu ");

        menuNamejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        menuNamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuNamejLabel.setText("Menu Name :");

        pricejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pricejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pricejLabel.setText("Price :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pricejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(pricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(menuNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(menuNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backButtonjButton)
                .addGap(18, 18, 18)
                .addComponent(savejButton)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuNamejLabel)
                    .addComponent(menuNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricejLabel)
                    .addComponent(pricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savejButton)
                    .addComponent(backButtonjButton))
                .addContainerGap(101, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonjButtonActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] components = userProcessContainer.getComponents();
        ManageMenuItemJPanel managaeMenuItemJPanel = (ManageMenuItemJPanel) components[components.length-1];
        managaeMenuItemJPanel.populateMenuItems();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonjButtonActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        // TODO add your handling code here:
        if(isDataEnteredValid()) {
            menuItem.setProductName(menuNamejTextField.getText());
            menuItem.setPrice(Double.valueOf(pricejTextField.getText()));
            menuItem.setLastUpdatedDate(new Date());
            menuItem.setModifiedBy(userAccount.getName());
            JOptionPane.showMessageDialog(this, "MenuItem Updated Successfully");
        }else{
            JOptionPane.showMessageDialog(this, "Error Updating MenuItem. Please check correct DataTypes");
        }
    }//GEN-LAST:event_savejButtonActionPerformed

    private boolean isDataEnteredValid() {
        if(!menuNamejTextField.getText().isEmpty() && menuNamejTextField.getText().matches("^[a-zA-Z0-9]+$") 
                && isPriceValid()){
            return true;
        }
        return false;
    }
    
    private boolean isPriceValid() {
        
        try{
            Double.valueOf(pricejTextField.getText());
            return true;
        }catch (Exception e){
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButtonjButton;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel menuNamejLabel;
    private javax.swing.JTextField menuNamejTextField;
    private javax.swing.JLabel pricejLabel;
    private javax.swing.JTextField pricejTextField;
    private javax.swing.JButton savejButton;
    // End of variables declaration//GEN-END:variables
}
