/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class cart extends javax.swing.JFrame {

    public Connection myconn = null;
    public Statement mystmt = null;
    public ResultSet myrs = null;
    String det = null, newid = null;
    int id1;
    String cid = null;
    public String user = null, pname = null, pdet = null, Table_click = null;

    public cart() {
        initComponents();

        this.setLocationRelativeTo(null);
    }

    public cart(String user_id) {
        initComponents();

        id.setText(user_id);
        cid = user_id;
        this.setLocationRelativeTo(null);
        showtable();
    }

    public void showtable() {
        try {
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cart", "root", "abak");
            String sql = "select *from cart where customer_id =" + "'" + cid + "'";
            mystmt = myconn.createStatement();
            myrs = mystmt.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(myrs));

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (mystmt != null) {
                try {
                    mystmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Add_products1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (myconn != null) {
                try {
                    myconn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Add_products1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        viewdet = new javax.swing.JButton();
        buynow = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Your Cart");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Your Cart");

        table.setFont(new java.awt.Font("Sofia Pro   Cond 3", 0, 16)); // NOI18N
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
        jScrollPane1.setViewportView(table);

        viewdet.setBackground(new java.awt.Color(255, 255, 255));
        viewdet.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        viewdet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-view-details-36.png"))); // NOI18N
        viewdet.setText("View Details");
        viewdet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdetActionPerformed(evt);
            }
        });

        buynow.setBackground(new java.awt.Color(255, 255, 255));
        buynow.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        buynow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-checkout-36.png"))); // NOI18N
        buynow.setText("Checkout");
        buynow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buynowActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        jLabel2.setText("Your ID - ");

        id.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/baseline_keyboard_arrow_left_black_36dp.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(viewdet)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buynow))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buynow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void viewdetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdetActionPerformed
        if (Table_click == null) {
            JOptionPane.showMessageDialog(null, "Sorry sir!Please Select a product from your cart and press details.Thank You.");
        } else {
            try {
                myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cart", "root", "abak");
                String sql = "select *from cart where Product_id=" + "'" + newid + "'"+"and customer_id="+"'"+cid+"'";
                mystmt = myconn.createStatement();
                myrs = mystmt.executeQuery(sql);
                while (myrs.next()) {
                    det = myrs.getString("Details");

                    JTextArea textArea = new JTextArea(det);
                    JScrollPane scrollPane = new JScrollPane(textArea);
                    textArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
                    textArea.setLineWrap(true);
                    textArea.setWrapStyleWord(true);
                    scrollPane.setPreferredSize(new Dimension(500, 500));
                    JOptionPane.showMessageDialog(null, scrollPane, "Product Details",
                            JOptionPane.YES_NO_OPTION);

                }
            } catch (Exception exc) {
                exc.printStackTrace();
            } finally {
                if (mystmt != null) {
                    try {
                        mystmt.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Add_products1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (myconn != null) {
                    try {
                        myconn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Add_products1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }


    }//GEN-LAST:event_viewdetActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try {
            int row = table.getSelectedRow();
            Table_click = (table.getModel().getValueAt(row, 1).toString());
            user = (table.getModel().getValueAt(row, 0).toString());
            pname = (table.getModel().getValueAt(row, 2).toString());
            pdet = (table.getModel().getValueAt(row, 6).toString());
            int id = Integer.parseInt(Table_click);
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "abak");
            String sql = "select *from products where ID=" + id;
            mystmt = myconn.createStatement();
            myrs = mystmt.executeQuery(sql);
            if (myrs.next()) {
                id1 = myrs.getInt("ID");

            }
            newid = Integer.toString(id1);

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (mystmt != null) {
                try {
                    mystmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Add_products1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (myconn != null) {
                try {
                    myconn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Add_products1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_tableMouseClicked

    private void buynowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buynowActionPerformed
        if (Table_click == null) {
            JOptionPane.showMessageDialog(null, "Please select a product from your cart!");
        } else {
            new customer_profile(user, Table_click, pname, pdet).setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_buynowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new customer_profile1(cid).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buynow;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JButton viewdet;
    // End of variables declaration//GEN-END:variables
}
