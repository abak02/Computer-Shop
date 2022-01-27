package project;

import java.awt.Dimension;
import java.awt.Font;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class view_products1 extends javax.swing.JFrame {

    public Connection myconn = null;
    public Statement mystmt = null;
    public ResultSet myrs = null;
    public PreparedStatement ps = null;
    int id1;
    String det = null;
    String com = null;
    String com1 = null;
    public String newid, Table_click;
    String category,manufacturer,userName;
    public view_products1() {
        initComponents();
        this.setLocationRelativeTo(null);
        show_products1();

    }
    public view_products1(String para) {
        initComponents();
        userName=para;
        this.setLocationRelativeTo(null);
        show_products1();

    }
    public view_products1(String a,String b) {
        initComponents();
        this.setLocationRelativeTo(null);
        category = a;
        manufacturer = b;
        show_products();

    }
    public void show_products1(){
        try {
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "abak");
            String sql = "select *from products";
            mystmt = myconn.createStatement();
            myrs = mystmt.executeQuery(sql);

            table.setModel(DbUtils.resultSetToTableModel(myrs));

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    public void show_products(){
        
        try {
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "abak");
            String sql = "select *from products where Category=" + "'" + category + "'"+"and Manufacturer="+"'"+manufacturer+"'";
            mystmt = myconn.createStatement();
            myrs = mystmt.executeQuery(sql);

            table.setModel(DbUtils.resultSetToTableModel(myrs));

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vdb = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        addcart = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        textFieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Products");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        vdb.setBackground(new java.awt.Color(255, 255, 255));
        vdb.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N
        vdb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-view-details-36.png"))); // NOI18N
        vdb.setText("View Details");
        vdb.setToolTipText("Press Here to see details of selected product");
        vdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vdbActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sofia Pro    Cond 7", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("View Products");

        addcart.setBackground(new java.awt.Color(255, 255, 255));
        addcart.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N
        addcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-add-shopping-cart-36.png"))); // NOI18N
        addcart.setText("Add To Cart");
        addcart.setToolTipText("Press Here to see details of selected product");
        addcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcartActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Sofia Pro   Cond 2", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/baseline_keyboard_arrow_left_black_36dp.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Sofia Pro   Cond 2", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        textFieldSearch.setFont(new java.awt.Font("Sofia Pro   Cond", 0, 18)); // NOI18N
        textFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sofia Pro    Cond 4", 0, 18)); // NOI18N
        jLabel1.setText("Search :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(vdb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addcart))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(textFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vdb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addcart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vdbActionPerformed
        if (Table_click == null) {
            JOptionPane.showMessageDialog(null, "Sorry sir! You didn't select any Product.");
        } else {
            try {
                String sql = "select *from products where ID=" + id1;
                mystmt = myconn.createStatement();
                myrs = mystmt.executeQuery(sql);
                while (myrs.next()) {
                    det = myrs.getString("Details");

                    JTextArea textArea = new JTextArea(det);
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    textArea.setFont(new Font("Sofia Pro  Cond 6", Font.PLAIN, 16));
                    textArea.setLineWrap(true);
                    textArea.setWrapStyleWord(true);
                    scrollPane.setPreferredSize(new Dimension(500, 500));
                    JOptionPane.showMessageDialog(null, scrollPane, "Product Details",
                            JOptionPane.YES_NO_OPTION);

                }
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }

    }//GEN-LAST:event_vdbActionPerformed

    private void addcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcartActionPerformed
        if (Table_click == null) {
            JOptionPane.showMessageDialog(null, "You didn't select any item !");
        } else {
            int response = JOptionPane.showConfirmDialog(this, "Do you have an account?", "Account!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                dispose();
                new Customer_login_1(newid).setVisible(true);

            }
            else if(response == JOptionPane.NO_OPTION){
                Sign_up1 frame = new Sign_up1(newid);
                dispose();
                frame.setVisible(true);
            }
           
        }


    }//GEN-LAST:event_addcartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new chooseproduct1(userName).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try {
            int row = table.getSelectedRow();
            Table_click = (table.getModel().getValueAt(row, 0).toString());
            int id = Integer.parseInt(Table_click);
            String sql = "select *from products where ID=" + id;
            mystmt = myconn.createStatement();
            myrs = mystmt.executeQuery(sql);
            if (myrs.next()) {
                id1 = myrs.getInt("ID");

            }
            newid = Integer.toString(id1);

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }//GEN-LAST:event_tableMouseClicked

    private void textFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldSearchKeyReleased
        try{
            String query="select *from products where Name like '%"+textFieldSearch.getText()+"%'";
            ps = myconn.prepareStatement(query);
            myrs = ps.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(myrs));
            ps.close();
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }//GEN-LAST:event_textFieldSearchKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {

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
            java.util.logging.Logger.getLogger(view_products1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_products1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_products1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_products1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_products1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTextField textFieldSearch;
    private javax.swing.JButton vdb;
    // End of variables declaration//GEN-END:variables
}
