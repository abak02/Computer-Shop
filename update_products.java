
package project;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class update_products extends javax.swing.JFrame {
    Connection myconn=null;
    ResultSet myrs=null;
    Statement mystmt=null;
    public update_products() {
        initComponents();
        showtable();
        this.setLocationRelativeTo(null);
    }
    public void showtable(){
         try{
            myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root" , "abak");
            String sql="select *from products "; 
            mystmt=myconn.createStatement();
            myrs=mystmt.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(myrs));
            
        }catch(Exception exc){
            exc.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        upr = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        uquan = new javax.swing.JTextField();
        aadd = new javax.swing.JButton();
        aadd1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Products");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Products");

        jLabel18.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Enter ID");

        uid.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        uid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel21.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Enter New Price");

        upr.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        upr.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel22.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Enter New Quantity");

        uquan.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        uquan.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aadd.setBackground(new java.awt.Color(255, 255, 255));
        aadd.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        aadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-installing-updates-36.png"))); // NOI18N
        aadd.setText("Update");
        aadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aaddActionPerformed(evt);
            }
        });

        aadd1.setBackground(new java.awt.Color(255, 255, 255));
        aadd1.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        aadd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-delete-36.png"))); // NOI18N
        aadd1.setText("Delete");
        aadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadd1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/baseline_keyboard_arrow_left_black_36dp.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(100, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jLabel3.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Products");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uquan, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(upr, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(79, 79, 79))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(77, 77, 77))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(88, 88, 88)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(aadd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aadd1)))
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uquan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upr, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aadd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aaddActionPerformed
        Connection myconn=null;
        Statement mystmt = null;
        ResultSet myrs=null;
        String q=null;
        String Id=uid.getText();
        int id=Integer.parseInt(Id);
        String price=upr.getText();
        String quan=uquan.getText();
        int qu=Integer.parseInt(quan);
        try{
            myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root" , "abak");
            String sq="use products";
            mystmt=myconn.createStatement();
            mystmt.executeQuery(sq);
            String sql1="select *from products where ID="+id;
            mystmt=myconn.createStatement();
            myrs=mystmt.executeQuery(sql1);
            while(myrs.next()){
            q=myrs.getString("Quantity");
            }
            
            int qua=Integer.parseInt(q)+qu;
            
            String sql="update products set price ='"+price+"',Quantity='"+qua+"' where ID="+id;
            mystmt=myconn.createStatement();
            mystmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Update Complete");
        }catch(Exception exc){
            exc.printStackTrace();
        }finally{
            if(myrs!=null){
                try {
                    myrs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(update_products.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(mystmt!=null){
              
                try {
                    mystmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(update_products.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
                } 
            if(myconn!=null){
                
                try {
                    myconn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(update_products.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }
    }//GEN-LAST:event_aaddActionPerformed

    private void aadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadd1ActionPerformed
        Connection myconn=null;
        Statement mystmt=null;
        String Id=uid.getText();
        int id=Integer.parseInt(Id);
        try{
            myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root" , "abak");
            mystmt=myconn.createStatement();
            String sql="delete from products where ID = "+id;
            mystmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Delete Complete");
            dispose();
            new update_products().setVisible(true);
        }catch(Exception exc){
            exc.printStackTrace();
        }
        finally{
            if(mystmt!=null){
                try {
                    mystmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(update_products.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(myconn!=null){
                try {
                    myconn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(update_products.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_aadd1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new admin_menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row=table.getSelectedRow();
        String id=(table.getModel().getValueAt(row, 0).toString());
        String quan=(table.getModel().getValueAt(row, 5).toString());
        String pri=(table.getModel().getValueAt(row,4).toString());
        uid.setText(id);
        uquan.setText(quan);
        upr.setText(pri);
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(update_products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aadd;
    private javax.swing.JButton aadd1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField uid;
    private javax.swing.JTextField upr;
    private javax.swing.JTextField uquan;
    // End of variables declaration//GEN-END:variables
}
