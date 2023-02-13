
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MADHUSHAN THARANGA
 */
public class Withdraw extends javax.swing.JFrame {

    /**
     * Creates new form withdraw
     */
    public Withdraw() {
        initComponents();
    }
    int MyaccNum;
    public Withdraw(int accountNo) {
        initComponents();
        MyaccNum = accountNo;
        GetBalance();
    }

      Connection con = null;
        ResultSet Rs = null, Rs1 = null;
        MiniStatement St = null;
        PreparedStatement pst;
        int oldBalance;
        
        private void clear(){
            amtTxt.setText("");
        }
        
     private void GetBalance(){
          String Query = "select * from client where accountNo = ?";
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                pst = con.prepareStatement(Query);
                pst.setInt(1, MyaccNum);
                Rs1 = pst.executeQuery();
                if(Rs1.next()){
                    oldBalance = Rs1.getInt(3);
                    balLbl.setText(""   + oldBalance);
                }else{
                    //JOptionPane.showMessageDialog(this, "Wrong Account Number or Pin");
                }


            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        balLbl = new javax.swing.JLabel();
        amtTxt = new javax.swing.JTextField();
        withdrawBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ATM SYSTEM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Please Enter Withdraw Amount");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        cancelBtn.setBackground(new java.awt.Color(0, 153, 153));
        cancelBtn.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("x");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 70));

        balLbl.setBackground(new java.awt.Color(255, 255, 255));
        balLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balLbl.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(balLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 190, 30));

        amtTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amtTxt.setForeground(new java.awt.Color(0, 153, 153));
        amtTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtTxtActionPerformed(evt);
            }
        });
        getContentPane().add(amtTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 190, -1));

        withdrawBtn.setBackground(new java.awt.Color(0, 153, 153));
        withdrawBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        withdrawBtn.setForeground(new java.awt.Color(255, 255, 255));
        withdrawBtn.setText("WITHDRAW");
        withdrawBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawBtnMouseClicked(evt);
            }
        });
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });
        getContentPane().add(withdrawBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        BackBtn.setBackground(new java.awt.Color(0, 153, 153));
        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("BACK");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 140, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 480, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Your Balance :-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Enter Amount");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MADHUSHAN THARANGA\\Pictures\\atm\\g1.gif")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 350));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 590, 350));

        setSize(new java.awt.Dimension(478, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void amtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtTxtActionPerformed

    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void withdrawBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawBtnMouseClicked
        // TODO add your handling code here:
        if(amtTxt.getText().isEmpty() || amtTxt.getText().equals(0)){
            JOptionPane.showMessageDialog(this, "Enter valid Amount");
        }
        else if(oldBalance < Integer.valueOf(amtTxt.getText())){
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }
        else{
            try {
                String Query = "Update client set balance=? where accountNo=?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                pst = con.prepareStatement(Query);
                pst.setInt(1, oldBalance - Integer.valueOf(amtTxt.getText()));
                pst.setInt(2, MyaccNum);
                
                if(pst.executeUpdate()==1){
                
                     JOptionPane.showMessageDialog(this, "Balance Updated");
                     Login A1= new Login();
                    A1.setVisible(true);
                     this.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
            clear();
        }
    }//GEN-LAST:event_withdrawBtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // TODO add your handling code here:
        Login A1= new Login();
        A1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField amtTxt;
    private javax.swing.JLabel balLbl;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton withdrawBtn;
    // End of variables declaration//GEN-END:variables
}
