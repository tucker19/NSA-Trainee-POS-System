


import Menu.StephensDepotMenu;
import Menu.MenuItem;
//import Menu.orderDisplay;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class POS_GUI extends javax.swing.JFrame {
    
    public DefaultListModel listModel;
    //public DefaultTableModel tableModelBase; 
    public Order[] orders = new Order[23];
    public EmployeeList employees = new EmployeeList();
    public ArrayList<MenuItem> currentMenu = new ArrayList<MenuItem>();
    
    /**
     * Creates new form POS_GUI
     */
    public POS_GUI() {
       // tableModelBase = (DefaultTableModel) tableOrder.getModel();
//        Order[] orders = new Order[23];
        initComponents();
        Timer t = new Timer(1000, updateClockAction);
        t.start();
        SQLiteJDBC.main();
        SQLiteJDBC.create();
//        SQLiteJDBC.getjdbc();
        //SQLiteData.insert(int id, int emid, String name, double time, int manager, int owner)
        
        
        StephensDepotMenu menu = new StephensDepotMenu();
        menu.createMenus();
        totalBill.setVisible(false);
        paymentMenu.setVisible(false);
        menuItemMenu.setVisible(false);
        
        employees.insert("Owner", 1234, 0, 0, 1234, 0);
        employees.printList();
        
        employees.addOwner(1234, "Owner" ,0,0);
        
        testText.setText(employees.isLOwner(1234));
//        testText.setText(employees.printList());
        
        listModel = new DefaultListModel();
        for(int i = 1; i <= 23; i++){
            listModel.addElement("Table " + i);
        }
        tableList.setModel(listModel);
        tableList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableList.setSelectedIndex(0);
        
       // jPanel3.setLayout(new GridLayout(3,4));
//        jPanel3.add(new JButton("this is fake"));
//        jPanel3.add(new JButton("this is fake 2"));
//        jPanel3.add(new JButton("this is fake 3"));
//        jPanel3.add(new JButton("this is fake 4"));
//        jPanel3.add(new JButton("this is fake 5"));
//        jPanel3.add(new JButton("this is fake 6"));
//        jPanel3.add(new JButton("this is fake 7"));
//        jPanel3.add(new JButton("this is fake 8"));
//        jPanel3.add(new JButton("this is fake 9"));
//        jPanel3.add(new JButton("this is fake 9"));
//        jPanel3.add(new JButton("this is fake 9"));
//        jPanel3.add(new JButton("this is fake 9"));
//        jPanel3.add(new JButton("this is fake 9"));
//        jPanel3.add(new JButton("this is fake 9"));
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
//        jPanel5.add(new orderDisplay());
        
        
        
        
        
        
        orders[1] = new Order(1);
        orders[1].addItem( StephensDepotMenu.dinnerMenu.get(1));
        
        
        
        
//        int dinnerSize = StephensDepotMenu.dinnerMenu.size();
//        for(int i=0; i < dinnerSize; i++){
//            MenuItem obj = StephensDepotMenu.dinnerMenu.get(i);
//            menuTable1.addRow(new Object[]{obj.getId(), obj.getName(), obj.description(), obj.getPrice()});
//        }
//        int breakfastSize = StephensDepotMenu.breakfastMenu.size();
//        for(int i=0; i < breakfastSize; i++){
//            MenuItem obj = StephensDepotMenu.breakfastMenu.get(i);
//            menuTable1.addRow(new Object[]{obj.getId(), obj.getName(), obj.description(), obj.getPrice()});
//        }
//        int drinkSize = StephensDepotMenu.drinkMenu.size();
//        for(int i=0; i < drinkSize; i++){
//            MenuItem obj = StephensDepotMenu.drinkMenu.get(i);
//            menuTable1.addRow(new Object[]{obj.getId(), obj.getName(), obj.description(), obj.getPrice()});
//        }
         
        
        
        
//        DefaultTableModel tableModel1 = (DefaultTableModel) tableOrder.getModel(); 
//        tableModel1.addRow(new Object[]{"this","is","new"});
////        }
//        tableOrder.setModel(tableModel1);      
    }
    
ActionListener updateClockAction = new ActionListener() {
  public void actionPerformed(ActionEvent e) {
      timeClock.setText(new Date().toString()); 
    }
};

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalBill = new javax.swing.JLayeredPane();
        jPanel7 = new javax.swing.JPanel();
        splitBillDisplay = new javax.swing.JComboBox();
        taxRateDisplay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        subTotalDisplay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalDisplay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        taxDisplay = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JList();
        tableNumber = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        addOrderItem = new javax.swing.JButton();
        deleteOrderItem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        orderComment = new javax.swing.JTextField();
        totalButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        payButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        addItemToOrder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        menuOrderNumber = new javax.swing.JTextPane();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        editMenuItemButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        menuTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        employeeNumber = new javax.swing.JTextField();
        clockIn = new javax.swing.JButton();
        clockOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        timeClock = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        testText = new javax.swing.JTextArea();
        paymentMenu = new javax.swing.JLayeredPane();
        jPanel8 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        changeDisplay = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        menuItemMenu = new javax.swing.JLayeredPane();
        jPanel9 = new javax.swing.JPanel();
        editItemName = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        editItemDescription = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        exitItemMenu = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        editItemPrice = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NSA Trainee POS");
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        splitBillDisplay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        splitBillDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                splitBillDisplayActionPerformed(evt);
            }
        });

        taxRateDisplay.setText("8.0");
        taxRateDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxRateDisplayActionPerformed(evt);
            }
        });

        jLabel6.setText("Tax: (Percent)");

        subTotalDisplay.setEditable(false);
        subTotalDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subTotalDisplayActionPerformed(evt);
            }
        });

        jLabel7.setText("Sub-Total:");

        jLabel8.setText("Split Bill:");

        totalDisplay.setEditable(false);

        jLabel9.setText("Total:");

        jButton10.setText("Accept");

        jButton11.setText("Cancel");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        taxDisplay.setEditable(false);

        jLabel10.setText("Tax:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addGap(29, 29, 29))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(taxRateDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(subTotalDisplay)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton10)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(splitBillDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(taxDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subTotalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxRateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(splitBillDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton10))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout totalBillLayout = new javax.swing.GroupLayout(totalBill);
        totalBill.setLayout(totalBillLayout);
        totalBillLayout.setHorizontalGroup(
            totalBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        totalBillLayout.setVerticalGroup(
            totalBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalBillLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        totalBill.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(totalBill);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel1.setText("Table");

        tableList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        tableList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tableListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tableList);

        tableNumber.setText("jLabel3");

        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Item", "Comments", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableOrder);
        if (tableOrder.getColumnModel().getColumnCount() > 0) {
            tableOrder.getColumnModel().getColumn(0).setResizable(false);
            tableOrder.getColumnModel().getColumn(0).setPreferredWidth(2);
            tableOrder.getColumnModel().getColumn(2).setResizable(false);
        }

        addOrderItem.setText("Add Item");
        addOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderItemActionPerformed(evt);
            }
        });

        deleteOrderItem.setText("Delete Item");
        deleteOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrderItemActionPerformed(evt);
            }
        });

        jLabel3.setText("Comments:");

        orderComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderCommentActionPerformed(evt);
            }
        });

        totalButton.setText("Total Order");
        totalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Send Order");

        payButton.setText("Pay");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(223, 223, 223)
                .addComponent(tableNumber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addComponent(orderComment)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteOrderItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addOrderItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalButton)
                                .addGap(18, 18, 18)
                                .addComponent(payButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tableNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteOrderItem)
                            .addComponent(totalButton)
                            .addComponent(jButton2)
                            .addComponent(addOrderItem)
                            .addComponent(payButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Ordering", jPanel1);

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Notes", "Price"
            }
        ));
        jScrollPane3.setViewportView(menuTable);

        addItemToOrder.setText("Add");
        addItemToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemToOrderActionPerformed(evt);
            }
        });

        jLabel4.setText("Add Item to order number:");

        jScrollPane4.setViewportView(menuOrderNumber);

        jButton4.setText("Add Item");

        jButton5.setText("Delete Item");

        editMenuItemButton.setText("Edit Item");
        editMenuItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editMenuItemButton)
                        .addGap(1, 1, 1)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addItemToOrder))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(editMenuItemButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addItemToOrder))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Menu", jPanel2);

        menuTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Notes", "Price"
            }
        ));
        jScrollPane6.setViewportView(menuTable1);

        jButton7.setText("Add Special");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Remove Special");

        jButton9.setText("Edit Specials");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addGap(22, 22, 22)
                        .addComponent(jButton8)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Specials", jPanel6);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setMaximumSize(new java.awt.Dimension(300, 32767));

        jPanel5.setMaximumSize(new java.awt.Dimension(696, 32767));
        jPanel5.setLayout(new java.awt.GridLayout(8, 4));
        jScrollPane5.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Current Orders", jPanel3);

        clockIn.setText("Clock-In");
        clockIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockInActionPerformed(evt);
            }
        });

        clockOut.setText("Clock-Out");
        clockOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockOutActionPerformed(evt);
            }
        });

        jLabel2.setText("Employee ID");

        timeClock.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        timeClock.setText("jLabel3");

        jLabel5.setText("Manager ID");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        testText.setColumns(20);
        testText.setRows(5);
        jScrollPane8.setViewportView(testText);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(clockIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clockOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeNumber)
                    .addComponent(jTextField1))
                .addGap(78, 78, 78)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(timeClock))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(timeClock)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clockIn)
                    .addComponent(clockOut))
                .addContainerGap(332, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Time Keeping", jPanel4);

        getContentPane().add(jTabbedPane1);

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton12.setText("Accept");

        jButton13.setText("Cancel");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel16.setText("Tab");

        jLabel17.setText("Payment Type");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Credit", "Debit", "Cash", "Gift Card" }));

        jLabel18.setText("Amount:");

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel11.setText("Tip:");

        jLabel12.setText("Change:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel16))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton12)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changeDisplay))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton12))
                .addContainerGap())
        );

        javax.swing.GroupLayout paymentMenuLayout = new javax.swing.GroupLayout(paymentMenu);
        paymentMenu.setLayout(paymentMenuLayout);
        paymentMenuLayout.setHorizontalGroup(
            paymentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        paymentMenuLayout.setVerticalGroup(
            paymentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentMenuLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );
        paymentMenu.setLayer(jPanel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(paymentMenu);

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        editItemDescription.setColumns(20);
        editItemDescription.setRows(5);
        jScrollPane7.setViewportView(editItemDescription);

        jLabel15.setText("Name:");

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel22.setText("View/Edit Item");

        jLabel13.setText("Description:");

        exitItemMenu.setText("Cancel");

        jLabel14.setText("Price:");

        editItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemPriceActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));

        jLabel19.setText("Special:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinner", "Lunch", "Drink" }));

        jLabel20.setText("Menu");

        jButton1.setText("Accept");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15)
                            .addComponent(editItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(exitItemMenu))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addGap(18, 18, 18)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(jButton1)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(editItemPrice))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(4, 4, 4)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel22)))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitItemMenu)
                            .addComponent(jButton1))))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout menuItemMenuLayout = new javax.swing.GroupLayout(menuItemMenu);
        menuItemMenu.setLayout(menuItemMenuLayout);
        menuItemMenuLayout.setHorizontalGroup(
            menuItemMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuItemMenuLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuItemMenuLayout.setVerticalGroup(
            menuItemMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuItemMenuLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        menuItemMenu.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(menuItemMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clockInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockInActionPerformed
        // TODO add your handling code here:
        GregorianCalendar now = new GregorianCalendar();
        //employees.insert("", Double.parseDouble(employeeNumber.getText()), now.get(Calendar.HOUR_OF_DAY));
    }//GEN-LAST:event_clockInActionPerformed

    private void tableListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tableListValueChanged
        // TODO add your handling code here:
        //DefaultTableModel tableModel1 = tableModelBase;
        DefaultTableModel tableModel1 = (DefaultTableModel) tableOrder.getModel();
        tableModel1.setNumRows(0);
        int tableInt;
        tableInt = tableList.getSelectedIndex();
        tableNumber.setText("Table "+(tableInt + 1));
        if(orders[tableInt] != null){
//            ArrayList <MenuItem> orderItems = orders[tableInt].getItems();
            ArrayList <OrderItem> orderItems = orders[tableInt].getItems();
            //Iterator<MenuItem> it = orderItems.iterator();
            Iterator<OrderItem> it = orderItems.iterator();
            int i = 0;
            while(it.hasNext())
            {
                //MenuItem obj = it.next();
                OrderItem obj = it.next();
                
                tableModel1.addRow(new Object[]{obj.getItem().getName(), obj.getComment(), obj.getItem().getPrice()});

                //Do something with obj
            }
            
        }else{
            orders[tableInt] = new Order(tableInt);
        }
        //orderComment.setText(orders[tableInt].getComment());
        tableOrder.setModel(tableModel1); 
        
    }//GEN-LAST:event_tableListValueChanged

    private void addOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderItemActionPerformed
        // TODO add your handling code here:
        menuOrderNumber.setText(Integer.toString(tableList.getSelectedIndex()));
        jTabbedPane1.setSelectedIndex(1);
        
    }//GEN-LAST:event_addOrderItemActionPerformed

    private void orderCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderCommentActionPerformed
        // TODO add your handling code here:
        int tableInt;
        tableInt = tableList.getSelectedIndex();
       // orders[tableInt].setComment(orderComment.getText());
    }//GEN-LAST:event_orderCommentActionPerformed

    private void clockOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockOutActionPerformed
        // TODO add your handling code here:
        GregorianCalendar now = new GregorianCalendar();
       // employees.insert("", Double.parseDouble(employeeNumber.getText()), now.get(Calendar.HOUR_OF_DAY));
    }//GEN-LAST:event_clockOutActionPerformed

    private void addItemToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemToOrderActionPerformed
        int orderNumber = Integer.parseInt(menuOrderNumber.getText());
        int itemId = menuTable.getSelectedRow();
        if(orders[orderNumber] == null){
            orders[orderNumber] = new Order(orderNumber);
        }
        if(itemId <= 34){
            orders[orderNumber].addItem(StephensDepotMenu.dinnerMenu.get(itemId));
        }
        if(itemId >= 35 && itemId <= 56){
            orders[orderNumber].addItem(StephensDepotMenu.breakfastMenu.get((itemId - 34)));
        }
        if(itemId >= 57){
            orders[orderNumber].addItem(StephensDepotMenu.drinkMenu.get((itemId - 56)));
        }
        jTabbedPane1.setSelectedIndex(0);
        tableList.setSelectedIndex(orderNumber);
// TODO add your handling code here:
    }//GEN-LAST:event_addItemToOrderActionPerformed

    private void deleteOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrderItemActionPerformed
        // TODO add your handling code here:
        int orderNumber = tableList.getSelectedIndex();
        int orderItemId = tableOrder.getSelectedRow();
        orders[orderNumber].deleteItem(orderItemId);
    }//GEN-LAST:event_deleteOrderItemActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void taxRateDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxRateDisplayActionPerformed
        // TODO add your handling code here:
        calcTotal();
    }//GEN-LAST:event_taxRateDisplayActionPerformed

    private void subTotalDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subTotalDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subTotalDisplayActionPerformed

    private void totalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalButtonActionPerformed
        // TODO add your handling code here:
        totalBill.setVisible(true);
        calcTotal();
        
    }//GEN-LAST:event_totalButtonActionPerformed

    private void splitBillDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitBillDisplayActionPerformed
        calcTotal();
           // TODO add your handling code here:
    }//GEN-LAST:event_splitBillDisplayActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        totalBill.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        paymentMenu.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
        payTotal(1);
    }//GEN-LAST:event_payButtonActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        displayMenu();
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void editItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editItemPriceActionPerformed

    private void editMenuItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuItemButtonActionPerformed
        // TODO add your handling code here:
        menuItemMenu.setVisible(true);
        displayEditItem();
    }//GEN-LAST:event_editMenuItemButtonActionPerformed

    private void displayMenu(){
       DefaultTableModel menuTable1 = (DefaultTableModel) menuTable.getModel();
        menuTable1.setNumRows(0);
        currentMenu.clear();
        Iterator<MenuItem> it = StephensDepotMenu.dinnerMenu.iterator();
        while(it.hasNext()){
            MenuItem obj = it.next();
            currentMenu.add(obj);
            menuTable1.addRow(new Object[]{obj.getId(), obj.getName(), obj.getDescription(), obj.getPrice()});
        }
        Iterator<MenuItem> it1 = StephensDepotMenu.breakfastMenu.iterator();
        while(it1.hasNext()){
            MenuItem obj = it1.next();
            currentMenu.add(obj);
            menuTable1.addRow(new Object[]{obj.getId(), obj.getName(), obj.getDescription(), obj.getPrice()});
        }
        Iterator<MenuItem> it2 = StephensDepotMenu.drinkMenu.iterator();
        while(it2.hasNext()){
            MenuItem obj = it2.next();
            currentMenu.add(obj);
            menuTable1.addRow(new Object[]{obj.getId(), obj.getName(), obj.getDescription(), obj.getPrice()});
        } 
        menuTable.setModel(menuTable1);
    }
    private void payTotal(int i){
        paymentMenu.setVisible(true);
    
    }
    
    private void displayEditItem(){
        MenuItem currentItem = currentMenu.get(menuTable.getSelectedRow());
        editItemName.setText(currentItem.getName());
        editItemDescription.setText(currentItem.getDescription());
        editItemPrice.setText(Double.toString(currentItem.getPrice()));
  
    }
    
    private void calcTotal(){
        DecimalFormat df = new DecimalFormat("####0.00");
        int tableInt;
        tableInt = tableList.getSelectedIndex();
        double subTotal = 0;
        
        subTotal = orders[tableInt].getPrice();
        subTotalDisplay.setText(Double.toString(subTotal));
        double tax = subTotal * (Double.parseDouble(taxRateDisplay.getText()) * 0.01);
        taxDisplay.setText(Double.toString(tax));
        double totalWithTax = subTotal + tax;
        double totalWithSplit = totalWithTax / (splitBillDisplay.getSelectedIndex()+1);
        totalDisplay.setText(df.format(totalWithSplit));
        
    }

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
            java.util.logging.Logger.getLogger(POS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS_GUI().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemToOrder;
    private javax.swing.JButton addOrderItem;
    private javax.swing.JTextField changeDisplay;
    private javax.swing.JButton clockIn;
    private javax.swing.JButton clockOut;
    private javax.swing.JButton deleteOrderItem;
    private javax.swing.JTextArea editItemDescription;
    private javax.swing.JTextField editItemName;
    private javax.swing.JTextField editItemPrice;
    private javax.swing.JButton editMenuItemButton;
    private javax.swing.JTextField employeeNumber;
    private javax.swing.JButton exitItemMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLayeredPane menuItemMenu;
    private javax.swing.JTextPane menuOrderNumber;
    private javax.swing.JTable menuTable;
    private javax.swing.JTable menuTable1;
    private javax.swing.JTextField orderComment;
    private javax.swing.JButton payButton;
    private javax.swing.JLayeredPane paymentMenu;
    private javax.swing.JComboBox splitBillDisplay;
    private javax.swing.JTextField subTotalDisplay;
    private javax.swing.JList tableList;
    private javax.swing.JLabel tableNumber;
    private javax.swing.JTable tableOrder;
    private javax.swing.JTextField taxDisplay;
    private javax.swing.JTextField taxRateDisplay;
    private javax.swing.JTextArea testText;
    private javax.swing.JLabel timeClock;
    private javax.swing.JLayeredPane totalBill;
    private javax.swing.JButton totalButton;
    private javax.swing.JTextField totalDisplay;
    // End of variables declaration//GEN-END:variables
}
