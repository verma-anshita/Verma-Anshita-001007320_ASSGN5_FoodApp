/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.CityName;
import Business.CityNetwork;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.RestaurantEmployee;
import Business.Restaurant.MenuItem;
import Business.Restaurant.Order;
import Business.Restaurant.OrderStatus;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anshitaverma
 */
public class ManageOrdersRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersRestaurantJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Restaurant restaurant;
    private EcoSystem ecoSystem;
    private CityNetwork cityNetwork;
        
    public ManageOrdersRestaurantJPanel(JPanel userProcessContainer,UserAccount userAccount,Restaurant restaurant,
        EcoSystem ecoSystem, CityNetwork cityNetwork) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount=userAccount;
        this.cityNetwork = cityNetwork;
        this.ecoSystem=ecoSystem;
        this.restaurant=restaurant;
        initComponents();
        populateData();
    }
    
    private void populateData() {
        
        deliveryManjComboBox.removeAllItems();
        for(DeliveryMan deliveryMan:cityNetwork.getDeliveryManDirectory().getDeliveryMan()){
            deliveryManjComboBox.addItem(deliveryMan.getName());
        }
        
        DefaultTableModel currentOrdersModel = (DefaultTableModel) currentOrdersjTable.getModel();
        currentOrdersModel.setRowCount(0);
        int currentOrderCount=0;
        
        DefaultTableModel successOrderModel = (DefaultTableModel) ordersDeliveredjTable.getModel();
        successOrderModel.setRowCount(0);
        int successOrderCount=0;
        
        
        for(Order order:restaurant.getOrders()){
            if(order.getOrderStatus().name().equalsIgnoreCase(OrderStatus.Delivered.name())){
                successOrderCount++;
                Object[] row = new Object[6];
                row[0] = successOrderCount;
                row[1] = order.getOrderedBy().getName();
                row[2] = order.getCustomerInstructions();
                row[3] = order;
                row[4] = order.getOrderStatus();
                row[5] = order.getDeliveryMan().getName();
                
                successOrderModel.addRow(row);
            }else{
                currentOrderCount++;
                Object[] row = new Object[6];
                row[0] = currentOrderCount;
                row[1] = order.getOrderedBy().getName();
                row[2] = order.getCustomerInstructions();
                row[3] = order;
                row[4] = order.getOrderStatus();
                if(order.getDeliveryMan()!=null){
                    row[5] = order.getDeliveryMan().getName();
                }
                currentOrdersModel.addRow(row);
            }
        }
        
        DefaultTableModel deliveredMenuItemsModel = (DefaultTableModel) deliveredMenuItemjTable.getModel();
        deliveredMenuItemsModel.setRowCount(0);
        
        DefaultTableModel currentMenuItemsModel = (DefaultTableModel) currentMenuItemjTable.getModel();
        currentMenuItemsModel.setRowCount(0);
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
        currentOrdersHeaderjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentOrdersjTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        currentMenuItemjTable = new javax.swing.JTable();
        currentOrdersHeaderjLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ordersDeliveredjTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        deliveredMenuItemjTable = new javax.swing.JTable();
        deliveryManjComboBox = new javax.swing.JComboBox<>();
        deliveryPersonjLabel = new javax.swing.JLabel();
        acceptjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        btnBack.setText("< < Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        currentOrdersHeaderjLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        currentOrdersHeaderjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentOrdersHeaderjLabel.setText("Orders On Plate");

        currentOrdersjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "CustomerName", "SpecialRequests", "Total Price", "Status", "DeliveryMan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        currentOrdersjTable.getTableHeader().setReorderingAllowed(false);
        currentOrdersjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentOrdersjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(currentOrdersjTable);
        if (currentOrdersjTable.getColumnModel().getColumnCount() > 0) {
            currentOrdersjTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        currentMenuItemjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item No", "Menu Item"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(currentMenuItemjTable);
        if (currentMenuItemjTable.getColumnModel().getColumnCount() > 0) {
            currentMenuItemjTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        currentOrdersHeaderjLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        currentOrdersHeaderjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentOrdersHeaderjLabel1.setText("Orders Delivered");

        ordersDeliveredjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Serial-No", "CustomerName", "SpecialRequests", "Total Price", "Status", "DeliveryMan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ordersDeliveredjTable.getTableHeader().setReorderingAllowed(false);
        ordersDeliveredjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersDeliveredjTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ordersDeliveredjTable);
        if (ordersDeliveredjTable.getColumnModel().getColumnCount() > 0) {
            ordersDeliveredjTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        deliveredMenuItemjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item No", "Menu Item"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(deliveredMenuItemjTable);
        if (deliveredMenuItemjTable.getColumnModel().getColumnCount() > 0) {
            deliveredMenuItemjTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        deliveryPersonjLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deliveryPersonjLabel.setText("Choose Delivery Person :");

        acceptjButton.setText("Accept and Assign Order");
        acceptjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(currentOrdersHeaderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(currentOrdersHeaderjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deliveryPersonjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(deliveryManjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136)
                                        .addComponent(acceptjButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(currentOrdersHeaderjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryManjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryPersonjLabel)
                    .addComponent(acceptjButton))
                .addGap(24, 24, 24)
                .addComponent(currentOrdersHeaderjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void acceptjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptjButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = currentOrdersjTable.getSelectedRow();
        if(selectedIndex<0 || deliveryManjComboBox.getSelectedIndex()<0) {
            JOptionPane.showMessageDialog(this, "Please select a row or make sure you assign a delivery guy");
            return;
        }
        DefaultTableModel currentOrdersModel = (DefaultTableModel) currentOrdersjTable.getModel();
        Order order = (Order) currentOrdersModel.getValueAt(selectedIndex, 3);
        
        order.setAssignedBy((RestaurantEmployee) userAccount);
        order.setDeliveryMan(cityNetwork.getDeliveryManDirectory().getDeliveryMan().get(deliveryManjComboBox.getSelectedIndex()));
        order.setLastUpdatedDate(new Date());
        order.setModifiedBy(userAccount.getName());
        order.setOrderStatus(OrderStatus.DeliveryGuyAssigned);
        cityNetwork.getDeliveryManDirectory().getDeliveryMan().get(deliveryManjComboBox.getSelectedIndex()).getOrders().add(order);
        populateData();
    }//GEN-LAST:event_acceptjButtonActionPerformed

    private void currentOrdersjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentOrdersjTableMouseClicked
        // TODO add your handling code here:
        int selectedIndex = currentOrdersjTable.getSelectedRow();
        if(selectedIndex<0) {
            return;
        }
        DefaultTableModel currentOrdersModel = (DefaultTableModel) currentOrdersjTable.getModel();
        Order order = (Order) currentOrdersModel.getValueAt(selectedIndex, 3);
        
        DefaultTableModel currentOrderItemModel = (DefaultTableModel) currentMenuItemjTable.getModel();
        currentOrderItemModel.setRowCount(0);
        int count=0;
        System.out.println(order.getMenuItems().size());
        for(MenuItem menuItem:order.getMenuItems()){
            count++;
            Object[] row = new Object[2];
            row[0]= count;
            row[1]= menuItem.getProductName();
            
            currentOrderItemModel.addRow(row);
        }
    }//GEN-LAST:event_currentOrdersjTableMouseClicked

    private void ordersDeliveredjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersDeliveredjTableMouseClicked
        // TODO add your handling code here:
        int selectedIndex = ordersDeliveredjTable.getSelectedRow();
        if(selectedIndex<0) {
            return;
        }
        DefaultTableModel ordersDeliveredModel = (DefaultTableModel) ordersDeliveredjTable.getModel();
        Order order = (Order) ordersDeliveredModel.getValueAt(selectedIndex, 3);
        
        DefaultTableModel deliveredMenuItemModel = (DefaultTableModel) deliveredMenuItemjTable.getModel();
        deliveredMenuItemModel.setRowCount(0);
        int count=0;
        System.out.println(order.getMenuItems().size());
        for(MenuItem menuItem:order.getMenuItems()){
            count++;
            Object[] row = new Object[2];
            row[0]= count;
            row[1]= menuItem.getProductName();
            
            deliveredMenuItemModel.addRow(row);
        }
    }//GEN-LAST:event_ordersDeliveredjTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptjButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable currentMenuItemjTable;
    private javax.swing.JLabel currentOrdersHeaderjLabel;
    private javax.swing.JLabel currentOrdersHeaderjLabel1;
    private javax.swing.JTable currentOrdersjTable;
    private javax.swing.JTable deliveredMenuItemjTable;
    private javax.swing.JComboBox<String> deliveryManjComboBox;
    private javax.swing.JLabel deliveryPersonjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable ordersDeliveredjTable;
    // End of variables declaration//GEN-END:variables
}
