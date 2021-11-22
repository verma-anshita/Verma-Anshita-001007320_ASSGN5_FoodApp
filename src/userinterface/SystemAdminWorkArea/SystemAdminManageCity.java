/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.CityNetwork;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author anshitaverma
 */
public class SystemAdminManageCity extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminManageCity
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    CityNetwork cityNetwork;
    UserAccount userLogged;
    
    public SystemAdminManageCity(JPanel userProcessContainer,EcoSystem ecosystem,CityNetwork cityNetwork,UserAccount userLogged) {
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.cityNetwork = cityNetwork;
        this.userLogged = userLogged;
        initComponents();
        updateLabel();
    }
    
    private void updateLabel(){
        headerjLabel.setText(headerjLabel.getText()+cityNetwork.getCityName().name());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        headerjLabel = new javax.swing.JLabel();
        manageRestaurantjButton = new javax.swing.JButton();
        manageCustomersjButton = new javax.swing.JButton();
        manageDeliveryPersonsjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        btnBack.setText("< < Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        headerjLabel.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("QuickEats:");

        manageRestaurantjButton.setText("Manage Restaurants ");
        manageRestaurantjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRestaurantjButtonActionPerformed(evt);
            }
        });

        manageCustomersjButton.setText("Manage Customers ");
        manageCustomersjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomersjButtonActionPerformed(evt);
            }
        });

        manageDeliveryPersonsjButton.setText("Manage DeliveryPersons ");
        manageDeliveryPersonsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDeliveryPersonsjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageRestaurantjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(manageDeliveryPersonsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageCustomersjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(181, 181, 181))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {manageCustomersjButton, manageDeliveryPersonsjButton, manageRestaurantjButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(manageRestaurantjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageCustomersjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageDeliveryPersonsjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void manageCustomersjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomersjButtonActionPerformed
        // TODO add your handling code here:
        
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("adminCustomerManagePanel", new ManageCustomerJpanel(userProcessContainer, userLogged, ecosystem));
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_manageCustomersjButtonActionPerformed

    private void manageDeliveryPersonsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDeliveryPersonsjButtonActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("adminDeliveryPersonManagePanel", new ManageDeliveryPersonsJPanel(userProcessContainer, userLogged, ecosystem, cityNetwork));
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_manageDeliveryPersonsjButtonActionPerformed

    private void manageRestaurantjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRestaurantjButtonActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("adminRestaurantManagePanel", new ManageRestaurantJPanel(userProcessContainer, userLogged, ecosystem, cityNetwork));
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_manageRestaurantjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JButton manageCustomersjButton;
    private javax.swing.JButton manageDeliveryPersonsjButton;
    private javax.swing.JButton manageRestaurantjButton;
    // End of variables declaration//GEN-END:variables
}
