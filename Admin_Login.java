
package project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Admin_Login extends javax.swing.JFrame {

    
    public Admin_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pw1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        bbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Sofia Pro   Cond 6", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Log IN");

        txt1.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Log IN ID");

        pw1.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        pw1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pw1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pw1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Log IN Password");

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Sofia Pro   Cond 6", 0, 18)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-login-36.png"))); // NOI18N
        btn1.setText("Log IN");
        btn1.setBorder(null);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        bbtn.setBackground(new java.awt.Color(255, 255, 255));
        bbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/baseline_keyboard_arrow_left_black_36dp.png"))); // NOI18N
        bbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(396, 396, 396)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(348, 348, 348)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(314, 314, 314)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(380, 380, 380)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(5, 5, 5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
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

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String a = null,b = null,us,pw;
        Connection myconn=null;
        Statement mystmt=null;
        ResultSet myrs=null;
        try{
           myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin", "root" , "abak");
           mystmt=myconn.createStatement();
           myrs=mystmt.executeQuery("select *from admin");
           while(myrs.next()){
               a=myrs.getString("username");
               b=myrs.getString("password");
           }
        }
        catch (Exception exc) {
			exc.printStackTrace();
		}
        finally{
            if(myrs!=null){
                try {
                    myrs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(mystmt!=null){
                try {
                    mystmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(myconn!=null){
                try {
                    myconn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            us=txt1.getText();
            pw=pw1.getText();
            if(a.equals(us)&&b.equals(pw)){
                admin_menu frame1=new admin_menu();
                dispose();
                frame1.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Wrong incredential!Please Try Again.");
                txt1.setText("");
                pw1.setText("");
            }
        }
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void bbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtnActionPerformed
        Front frame=new Front();
        dispose();
        frame.setVisible(true);
    }//GEN-LAST:event_bbtnActionPerformed

    private void pw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pw1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbtn;
    private javax.swing.JButton btn1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
