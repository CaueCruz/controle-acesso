package Cadastro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cauec
 */
public class Cadastro extends javax.swing.JFrame {
Conexao conexao = new Conexao();

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        conexao.Conecta();     
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtextNome = new javax.swing.JFormattedTextField();
        jtextEmail = new javax.swing.JFormattedTextField();
        jtextSenha = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        permissaoAdministrador = new javax.swing.JCheckBox();
        permissaoFuncionario = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/b9376f662190a9e43827ed3e3c013149.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de funcionário");
        setMinimumSize(new java.awt.Dimension(680, 550));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/b9376f662190a9e43827ed3e3c013149.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-110, -50, 460, 570);

        jtextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtextNome);
        jtextNome.setBounds(390, 120, 210, 20);

        jtextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jtextEmail);
        jtextEmail.setBounds(390, 190, 210, 20);

        jtextSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jtextSenha);
        jtextSenha.setBounds(390, 260, 210, 20);

        jLabel3.setText("Nome ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 90, 41, 14);

        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(390, 160, 41, 14);

        jLabel6.setText("Senha");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 230, 30, 14);

        jLabel7.setText("Permissão");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(390, 300, 70, 14);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 380, 100, 23);

        permissaoAdministrador.setText("Administrador");
        permissaoAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissaoAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(permissaoAdministrador);
        permissaoAdministrador.setBounds(380, 330, 110, 23);

        permissaoFuncionario.setText("Funcionário");
        permissaoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissaoFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(permissaoFuncionario);
        permissaoFuncionario.setBounds(520, 330, 100, 23);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 410, 100, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextNomeActionPerformed

    private void jtextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextEmailActionPerformed

    private void jtextSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void permissaoAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permissaoAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_permissaoAdministradorActionPerformed

    private void permissaoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permissaoFuncionarioActionPerformed
        
    }//GEN-LAST:event_permissaoFuncionarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Workspace.telaWorkspace workspace = new Workspace.telaWorkspace();
        workspace.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JFormattedTextField jtextEmail;
    private javax.swing.JFormattedTextField jtextNome;
    private javax.swing.JFormattedTextField jtextSenha;
    private javax.swing.JCheckBox permissaoAdministrador;
    private javax.swing.JCheckBox permissaoFuncionario;
    // End of variables declaration//GEN-END:variables
}
