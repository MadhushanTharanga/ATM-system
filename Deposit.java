
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Deposit extends javax.swing.JFrame {

   
    public Deposit() {
        initComponents();
    }
     int MyaccNum;
     public Deposit(int accountNo) {
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
                    disBalTxt.setText(""   + oldBalance);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        disBalTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        depBtn = new javax.swing.JButton();
        amtTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Please Enter Deposit Amount");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ATM SYSTEM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 160, 40));

        cancelBtn.setBackground(new java.awt.Color(0, 153, 153));
        cancelBtn.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("x");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 480, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Your Balance");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        disBalTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        disBalTxt.setForeground(new java.awt.Color(0, 153, 153));
        disBalTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        disBalTxt.setBorder(null);
        disBalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disBalTxtActionPerformed(evt);
            }
        });
        jPanel2.add(disBalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 190, 20));

        backBtn.setBackground(new java.awt.Color(0, 153, 153));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 120, -1));

        depBtn.setBackground(new java.awt.Color(0, 153, 153));
        depBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        depBtn.setForeground(new java.awt.Color(255, 255, 255));
        depBtn.setText("DEPOSIT");
        depBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depBtnMouseClicked(evt);
            }
        });
        depBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depBtnActionPerformed(evt);
            }
        });
        jPanel2.add(depBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        amtTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amtTxt.setForeground(new java.awt.Color(0, 153, 153));
        amtTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtTxtActionPerformed(evt);
            }
        });
        jPanel2.add(amtTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 190, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Enter Amount");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 150, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\MADHUSHAN THARANGA\\Pictures\\atm\\g1.gif")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 300));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 320));

        setSize(new java.awt.Dimension(479, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void disBalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disBalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disBalTxtActionPerformed

    private void amtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtTxtActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    String MyDate;
    public void getDate(){
        Date d1 = new Date();
        SimpleDateFormat s = new SimpleDateFormat();
        MyDate = s.format(d1);
    }
    private void depositMoney(){
         try {
             
                getDate();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                PreparedStatement Add = con.prepareStatement("Insert Into transactiontb Value (?,?,?,?) ");
                Add.setInt(1,  MyaccNum);
                Add.setString(2, "Deposit");
                Add.setString(3, MyDate);
                Add.setString(4,amtTxt.getText());
                int row = Add.executeUpdate();
                //JOptionPane.showMessageDialog(this, "Account Saved");
                con.close();
                clear();
           
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
    }
    private void depBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depBtnMouseClicked
         // TODO add your handling code here:
        if(amtTxt.getText().isEmpty() || amtTxt.getText().equals(0)){
            JOptionPane.showMessageDialog(this, "Enter valid Amount");
        }
        else{
            try {
                String Query = "Update client set balance=? where accountNo=?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                pst = con.prepareStatement(Query);
                pst.setInt(1, oldBalance + Integer.valueOf(amtTxt.getText()));
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
    }//GEN-LAST:event_depBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // TODO add your handling code here:
       Login A1= new Login();
        A1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void depBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amtTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton depBtn;
    private javax.swing.JTextField disBalTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

   
}
