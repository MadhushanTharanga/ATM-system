/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MADHUSHAN THARANGA
 */
public class Acc extends javax.swing.JFrame {

    /**
     * Creates new form Acc
     */
    public Acc() {
        initComponents();
    }
    int MyaccNum;
    public Acc(int accountNo) {
        initComponents();
        MyaccNum = accountNo;
        accLbl.setText(""+MyaccNum);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        withBtn = new javax.swing.JButton();
        balBtn = new javax.swing.JButton();
        changeBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        cal2Btn = new javax.swing.JButton();
        depBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        accLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ATM SYSTEM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 160, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Please Select One Here");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        cancelBtn.setBackground(new java.awt.Color(0, 153, 153));
        cancelBtn.setFont(new java.awt.Font("Californian FB", 1, 36)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("x");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Your Account Number :-");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        withBtn.setBackground(new java.awt.Color(0, 153, 153));
        withBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withBtn.setForeground(new java.awt.Color(255, 255, 255));
        withBtn.setText("WITHDRAW");
        withBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withBtnMouseClicked(evt);
            }
        });
        withBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withBtnActionPerformed(evt);
            }
        });
        jPanel2.add(withBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 130, 60));

        balBtn.setBackground(new java.awt.Color(0, 153, 153));
        balBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balBtn.setForeground(new java.awt.Color(255, 255, 255));
        balBtn.setText("BALANCE");
        balBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balBtnMouseClicked(evt);
            }
        });
        balBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balBtnActionPerformed(evt);
            }
        });
        jPanel2.add(balBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 130, 60));

        changeBtn.setBackground(new java.awt.Color(0, 153, 153));
        changeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        changeBtn.setForeground(new java.awt.Color(255, 255, 255));
        changeBtn.setText("CHANGE PIN");
        changeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeBtnMouseClicked(evt);
            }
        });
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(changeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 60));

        updateBtn.setBackground(new java.awt.Color(0, 153, 153));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("STATEMENT");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 130, 60));

        cal2Btn.setBackground(new java.awt.Color(0, 153, 153));
        cal2Btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cal2Btn.setForeground(new java.awt.Color(255, 255, 255));
        cal2Btn.setText("Cancel");
        cal2Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cal2BtnMouseClicked(evt);
            }
        });
        jPanel2.add(cal2Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 100, 40));

        depBtn.setBackground(new java.awt.Color(0, 153, 153));
        depBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        jPanel2.add(depBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 130, 60));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 590, 20));

        accLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        accLbl.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.add(accLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 150, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MADHUSHAN THARANGA\\Pictures\\atm\\istockphoto-1369748264-612x612.jpg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 380));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 590, 400));

        setSize(new java.awt.Dimension(590, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void depBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depBtnActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_depBtnActionPerformed

    private void withBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withBtnActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_withBtnActionPerformed

    private void balBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_balBtnActionPerformed

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_changeBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void depBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depBtnMouseClicked
        // TODO add your handling code here:
        Deposit d1 = new Deposit(MyaccNum);
        d1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depBtnMouseClicked

    private void withBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withBtnMouseClicked
        // TODO add your handling code here:
        Withdraw w1 = new Withdraw(MyaccNum);
        w1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_withBtnMouseClicked

    private void changeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeBtnMouseClicked
        // TODO add your handling code here:
        ChangePin cp = new ChangePin(MyaccNum);
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changeBtnMouseClicked

    private void balBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balBtnMouseClicked
        // TODO add your handling code here:
        Balance b1 = new Balance(MyaccNum);
        b1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_balBtnMouseClicked

    private void cal2BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cal2BtnMouseClicked
        // TODO add your handling code here:
        Login mp = new Login();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cal2BtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        // TODO add your handling code here:
        MiniStatement s1 = new MiniStatement(MyaccNum);
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accLbl;
    private javax.swing.JButton balBtn;
    private javax.swing.JButton cal2Btn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton changeBtn;
    private javax.swing.JButton depBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton withBtn;
    // End of variables declaration//GEN-END:variables
}
