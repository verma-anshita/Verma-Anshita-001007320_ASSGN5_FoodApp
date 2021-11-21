/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.CityName;
import Business.CityNetwork;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userLogged;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userLogged) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.userLogged=userLogged;
        populateCities();
    }
    
    private void populateCities() {
        
        List<CityNetwork> cityNetworks = ecosystem.getCityNetworks();
        cityjComboBox.removeAllItems();
        for(CityNetwork cityNetwork:cityNetworks){
            cityjComboBox.addItem(cityNetwork.getCityName().name());
        }
        
        addCityjComboBox.removeAllItems();
        for(String cityName:CityName.getCitiesList()){
            addCityjComboBox.addItem(cityName);
        }
        addCityjComboBox.setSelectedIndex(addCityjComboBox.getItemCount()-1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cityjComboBox = new javax.swing.JComboBox<>();
        headerjLabel = new javax.swing.JLabel();
        proceedjButton = new javax.swing.JButton();
        headerjLabel1 = new javax.swing.JLabel();
        addCityjComboBox = new javax.swing.JComboBox<>();
        addCityjButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        headerjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText("Please Select a City to Manage");

        proceedjButton.setText("Proceed ");
        proceedjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedjButtonActionPerformed(evt);
            }
        });

        headerjLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        headerjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel1.setText("Select a City to Add");

        addCityjButton.setText("Add ");
        addCityjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCityjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(headerjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(cityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(proceedjButton)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(addCityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(addCityjButton)))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headerjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proceedjButton)
                    .addComponent(addCityjButton))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void proceedjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedjButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = cityjComboBox.getSelectedIndex();
        
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("adminMasterCityPanel",new SystemAdminManageCity(userProcessContainer,ecosystem,
                ecosystem.getCityNetworks().get(selectedIndex), userLogged));
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_proceedjButtonActionPerformed

    private void addCityjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCityjButtonActionPerformed
        // TODO add your handling code here:
        
        for(CityNetwork cityNetwork:ecosystem.getCityNetworks()) {
            if(cityNetwork.getCityName().name().equalsIgnoreCase((String) addCityjComboBox.getSelectedItem())){
                JOptionPane.showMessageDialog(this, "City Already Exists. Please select another one");
                return;
            }
        }
        ecosystem.getCityNetworks().add(new CityNetwork(CityName.valueOf((String) addCityjComboBox.getSelectedItem()), new Date(), 
                new Date(), userLogged.getName(), userLogged.getName()));
        populateCities();
    }//GEN-LAST:event_addCityjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCityjButton;
    private javax.swing.JComboBox<String> addCityjComboBox;
    private javax.swing.JComboBox<String> cityjComboBox;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JLabel headerjLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton proceedjButton;
    // End of variables declaration//GEN-END:variables
}