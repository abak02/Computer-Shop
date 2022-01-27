
package project;
import java.util.Date;
import java.sql.*;
import java.text.MessageFormat;
import java.text.*;
import java.awt.print.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class customer_profile extends javax.swing.JFrame {
    Connection myconn=null;
    Statement mystmt=null;
    ResultSet myrs=null;
    
    String deta,nam,pr,newproid,id,custid;
    public customer_profile() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public customer_profile(String username,String proid,String proname,String prodet){
        initComponents();
        user.setText(username);
        productid.setText(proid);
        name.setText(proname);
        details.setText(prodet);
        newproid=productid.getText();
        custid=user.getText();
        this.setLocationRelativeTo(null);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        productid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        qty = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Checkout");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N

        productid.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N

        details.setColumns(20);
        details.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N
        details.setLineWrap(true);
        details.setRows(5);
        details.setBorder(null);
        jScrollPane1.setViewportView(details);

        jLabel2.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N
        jLabel2.setText("Quantity :");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-buy-36.png"))); // NOI18N
        jButton1.setText("Buy Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N
        jLabel3.setText("Username :");

        jLabel1.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N
        jLabel1.setText("Product ID :");

        jLabel4.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N
        jLabel4.setText("Product Name :");

        name.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Checkout");

        jLabel6.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N
        jLabel6.setText("Price :");

        price.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N
        price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-price-tag-36.png"))); // NOI18N
        jButton2.setText("View Price");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        qty.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 16)); // NOI18N

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        jLabel7.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 24)); // NOI18N
        jLabel7.setText("Receipt");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-send-to-printer-36.png"))); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/baseline_keyboard_arrow_left_black_36dp.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jButton4))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel6))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int proid1=Integer.parseInt(newproid);
        
        try{
            myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root" , "abak");
            String sq="use products";
            mystmt=myconn.createStatement();
            mystmt.executeQuery(sq);
            String sql1="select *from products where ID="+proid1;
            mystmt=myconn.createStatement();
            myrs=mystmt.executeQuery(sql1);
            while(myrs.next()){
            pr=myrs.getString("Price");
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
        
        String value=qty.getText().toString();
        if(value == null){
            JOptionPane.showMessageDialog(null,"Please enter quantity!");
        }
        else{
            int val=Integer.parseInt(value);
        int pri=Integer.parseInt(pr);
        int total=val*pri;
        String tot=Integer.toString(total);
        price.setText(tot);
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       MessageFormat header= new MessageFormat("Computer Territory");
       MessageFormat footer= new MessageFormat("page{0,number,Integer}");
       try{
           area.print(header,footer);
       }catch(java.awt.print.PrinterException e){
           System.err.format("Can not print %s%n", e.getMessage());
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String q=null;
        String Id=newproid;
        int id=Integer.parseInt(Id);
        
        String quan=qty.getText();
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
            
            int qua=Integer.parseInt(q)-qu;
            if(qua>=0){
            String sql="update products set Quantity='"+qua+"' where ID="+id;
            mystmt=myconn.createStatement();
            mystmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Thank you for buying products.\n Your order has been Processed");
            area.setText("*******     Product Receipt **********\n");
            area.setText(area.getText()+"          Thank you for choosing us !!!         \n\n");
            Date obj = new Date();
            String date=obj.toString();
            area.setText(area.getText()+"Date : "+date+"\n\n");
            area.setText(area.getText()+"UserName : "+user.getText()+"\n");
            area.setText(area.getText()+"Product Id : "+productid.getText()+"\n");
            area.setText(area.getText()+"Product Name : "+name.getText()+"\n");
            area.setText(area.getText()+"Product Details : "+details.getText()+"\n\n");
            area.setText(area.getText()+"Quantity : "+qty.getText()+"\n\n");
            area.setText(area.getText()+"price : "+price.getText()+"\n");
            }
            else{
                JOptionPane.showMessageDialog(null,"Sorry sir! We are out of products. You can order less than or equal to our quantity number. ");
            }
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
        try{
             myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cart", "root" , "abak");
             mystmt=myconn.createStatement();
             String sql="delete from cart where customer_id="+"'"+custid+"'"+"and product_id="+"'"+newproid+"'";
             
             mystmt.executeUpdate(sql);
        }catch(Exception exc){
            exc.printStackTrace();
        }finally{
            if(myrs!=null){
                try {
                    myrs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(customer_profile.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if(mystmt!=null){
                try {
                    mystmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(customer_profile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(myconn!=null){
                try {
                    myconn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(customer_profile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        try{
            myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/billinfo", "root" , "abak");
            Date obj1 = new Date();
            String date1=obj1.toString();
            String sql="insert into billinfo"+"(Product_id,customer_id,Name,Quantity,Price,Date)"+"values('"+productid.getText()+"','"+user.getText()+"','"+name.getText()+"','"+qty.getText()+"','"+price.getText()+"','"+date1+"')";
            mystmt=myconn.createStatement();
            mystmt.executeUpdate(sql);
        }catch(Exception exc){
            exc.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new cart(custid).setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(customer_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JTextArea details;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel price;
    private javax.swing.JLabel productid;
    private javax.swing.JTextField qty;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
