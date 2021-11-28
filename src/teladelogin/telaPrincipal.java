package teladelogin;

import Cadastro.Conexao;

/**
 *
 * @author cauec
 */
public class telaPrincipal extends javax.swing.JFrame {

    Conexao conexao = new Conexao();
    public telaPrincipal() {
        initComponents();
        conexao.Conecta();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        txt_email = new javax.swing.JFormattedTextField();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/b9376f662190a9e43827ed3e3c013149.png"))); // NOI18N

        setTitle("login funcionário");
        setMinimumSize(new java.awt.Dimension(650, 450));
        setPreferredSize(new java.awt.Dimension(300, 300));
        setResizable(false);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                formAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelEmail.setText("Email");
        getContentPane().add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 90, -1));

        labelSenha.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelSenha.setText("Senha");
        getContentPane().add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 70, -1));

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 90, -1));

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 100, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/b9376f662190a9e43827ed3e3c013149.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 530, 450));

        txt_senha.setText("123");
        txt_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 220, -1));

        txt_email.setText("viniciuscampanholi@hotmail.com");
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 220, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        String email = this.txt_email.getText();
        String senha = this.txt_senha.getText();
        conexao.InserirDados(email, senha);
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void formAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorMoved


    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        
        String email = this.txt_email.getText();
        String senha = this.txt_senha.getText();
        conexao.consultarCadastrar(email, senha);      
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void txt_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

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
                if ("Windowns".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JFormattedTextField txt_email;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables

    // strings - permição para Acessar adm  

// string 
}



