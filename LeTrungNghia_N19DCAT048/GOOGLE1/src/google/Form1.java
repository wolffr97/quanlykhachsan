/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package google;

/**
 *
 * @author hocvien
 */

public class Form1 extends javax.swing.JFrame {
    public CSDL csdl = new CSDL();

    /**
     * Creates new form Form1
     */
    public Form1() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    public CSDL getCsdl() {
        return csdl;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_ho = new javax.swing.JTextField();
        jTextField_ten = new javax.swing.JTextField();
        jTextField_tenNgDung = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField_matKhau = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel_matKhauTB = new javax.swing.JLabel();
        jLabel_HoTB = new javax.swing.JLabel();
        jLabel_TenTB = new javax.swing.JLabel();
        jLabel_tenNDTB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tạo Tài Khoản Google");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tiếp Tục Với Gmail");

        jTextField_ho.setText("Họ");
        jTextField_ho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_hoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_hoFocusLost(evt);
            }
        });

        jTextField_ten.setText("Tên");
        jTextField_ten.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_tenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_tenFocusLost(evt);
            }
        });

        jTextField_tenNgDung.setText("Tên Người Dùng");
        jTextField_tenNgDung.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_tenNgDungFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_tenNgDungFocusLost(evt);
            }
        });
        jTextField_tenNgDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tenNgDungActionPerformed(evt);
            }
        });
        jTextField_tenNgDung.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_tenNgDungKeyReleased(evt);
            }
        });

        jButton1.setText("Tiếp Theo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Mật Khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_tenNgDung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel_HoTB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_ho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_ten, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jLabel_TenTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel_tenNDTB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_matKhauTB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField_matKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_HoTB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TenTB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jTextField_tenNgDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_tenNDTB, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_matKhauTB, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_hoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_hoFocusGained
        if(jTextField_ho.getText().equals("Họ")){
            jTextField_ho.setText("");
        }
        
    }//GEN-LAST:event_jTextField_hoFocusGained

    private void jTextField_hoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_hoFocusLost
        if(jTextField_ho.getText().equals("")){
            jTextField_ho.setText("Họ");
        }
    }//GEN-LAST:event_jTextField_hoFocusLost

    private void jTextField_tenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_tenFocusGained
        if(jTextField_ten.getText().equals("Tên")){
            jTextField_ten.setText("");
        }
    }//GEN-LAST:event_jTextField_tenFocusGained

    private void jTextField_tenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_tenFocusLost
        if(jTextField_ten.getText().equals("")){
            jTextField_ten.setText("Tên");
        }
    }//GEN-LAST:event_jTextField_tenFocusLost

    private void jTextField_tenNgDungFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_tenNgDungFocusGained
        if(jTextField_tenNgDung.getText().equals("Tên Người Dùng")){
            jTextField_tenNgDung.setText("");
        }
    }//GEN-LAST:event_jTextField_tenNgDungFocusGained

    private void jTextField_tenNgDungFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_tenNgDungFocusLost
         if(jTextField_tenNgDung.getText().equals("")){
            jTextField_tenNgDung.setText("Tên Người Dùng");
        }
    }//GEN-LAST:event_jTextField_tenNgDungFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int ten = 0, ho =0, tengdung =0, matkhau = 0;
       if(jTextField_ho.getText().equals("Họ")){
           jLabel_HoTB.setText("Họ Không Trống");
       }
       else{
           ho =1;
           jLabel_HoTB.setText("");
       }
       if(jTextField_ten.getText().equals("Tên")){
           jLabel_TenTB.setText("Tên Không Trống");
       }
       else{
           ten = 1;
           jLabel_TenTB.setText("");
       }
       if(jTextField_tenNgDung.getText().equals("Tên Người Dùng")){
           jLabel_tenNDTB.setText("Tên Người Dùng Không Trống");
       }
       else if(!csdl.TimTenNgDung(jTextField_tenNgDung.getText()).equals("Khong Co Nguoi Dung") ){
           jLabel_tenNDTB.setText("Ngời Dùng Đã Tồn Tại");
       }
       else{
           tengdung =1;
           jLabel_tenNDTB.setText("");
       }
       if(String.valueOf(jPasswordField_matKhau.getPassword()).equals("")){
           jLabel_matKhauTB.setText("Tên Không Trống");
       }
       else{
           matkhau = 1;
           jLabel_TenTB.setText("");
       }
       if(ten == 1 && ho == 1 && tengdung == 1 && matkhau == 1){

           new Form2(String.valueOf(jPasswordField_matKhau.getPassword()),jTextField_tenNgDung.getText(),jTextField_ho.getText() + " " + jTextField_ten.getText()).setVisible(true);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_tenNgDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tenNgDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tenNgDungActionPerformed

    private void jTextField_tenNgDungKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_tenNgDungKeyReleased
        if(!jTextField_tenNgDung.getText().matches(".+@.")){
            jLabel_tenNDTB.setText("không đúng dịnh dạng");
        }
        else{
            jLabel_tenNDTB.setText("");
        }
    }//GEN-LAST:event_jTextField_tenNgDungKeyReleased

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_HoTB;
    private javax.swing.JLabel jLabel_TenTB;
    private javax.swing.JLabel jLabel_matKhauTB;
    private javax.swing.JLabel jLabel_tenNDTB;
    private javax.swing.JPasswordField jPasswordField_matKhau;
    private javax.swing.JTextField jTextField_ho;
    private javax.swing.JTextField jTextField_ten;
    private javax.swing.JTextField jTextField_tenNgDung;
    // End of variables declaration//GEN-END:variables
}
