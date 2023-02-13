
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ChangePin extends javax.swing.JFrame {

    public ChangePin() {
        initComponents();
    }
     int MyaccNum;
     public ChangePin(int accountNo) {
        initComponents();
        MyaccNum = accountNo;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        conPinTxt = new javax.swing.JPasswordField();
        newPinTxt = new javax.swing.JPasswordField();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        clrBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ATM SYSTEM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Change Your Pin Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        cancelBtn.setBackground(new java.awt.Color(0, 153, 153));
        cancelBtn.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("x");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Confirm Pin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Enter New Pin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        conPinTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        conPinTxt.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(conPinTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 170, 30));

        newPinTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newPinTxt.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(newPinTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 170, -1));

        saveBtn.setBackground(new java.awt.Color(0, 153, 153));
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 90, -1));

        backBtn.setBackground(new java.awt.Color(0, 153, 153));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 90, -1));

        clrBtn.setBackground(new java.awt.Color(0, 153, 153));
        clrBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clrBtn.setForeground(new java.awt.Color(255, 255, 255));
        clrBtn.setText("Clear");
        clrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrBtnMouseClicked(evt);
            }
        });
        getContentPane().add(clrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 80, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 570, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 570, 280));

        setSize(new java.awt.Dimension(566, 367));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

        Connection con = null;
        ResultSet Rs = null, Rs1 = null;
        MiniStatement St = null;
        PreparedStatement pst;
        
        
    private void clear(){
        newPinTxt.setText("");
        conPinTxt.setText("");
    }
    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        // TODO add your handling code here:
        if(newPinTxt.getText().isEmpty() || conPinTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter and Confirm the PIN");
        }else if(!newPinTxt.getText().equals(conPinTxt.getText())){
            JOptionPane.showMessageDialog(this, "Please Enter Same PIN");
        }else{
            try {
                String Query = "Update client set pin=? where accountNo=?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                pst = con.prepareStatement(Query);
                pst.setInt(1,Integer.valueOf(newPinTxt.getText()) );
                pst.setInt(2, MyaccNum);
                
                if(pst.executeUpdate()==1){
                
                     JOptionPane.showMessageDialog(this, "PIN Updated");
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
    }//GEN-LAST:event_saveBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        // TODO add your handling code here:
        Login A1= new Login();
        A1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void clrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrBtnMouseClicked
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clrBtnMouseClicked

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
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton clrBtn;
    private javax.swing.JPasswordField conPinTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField newPinTxt;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
