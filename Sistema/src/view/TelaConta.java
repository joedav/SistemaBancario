/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author First Place
 */
public class TelaConta extends javax.swing.JFrame {

    /**
     * Creates new form TelaConta
     */
    public TelaConta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContaCorrente = new javax.swing.JPanel();
        txtContaCorrente = new javax.swing.JLabel();
        txtValorContaCorrente = new javax.swing.JTextField();
        pnlValorSaque = new javax.swing.JPanel();
        txtValorSaque = new javax.swing.JLabel();
        txtValordeSaque = new javax.swing.JTextField();
        pnlContaPoupanca = new javax.swing.JPanel();
        txtContaPoupanca = new javax.swing.JLabel();
        txtValorContaPoupanca = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnConfirmarSaque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtContaCorrente.setText("Valor Disponível Conta Corrente:");

        javax.swing.GroupLayout pnlContaCorrenteLayout = new javax.swing.GroupLayout(pnlContaCorrente);
        pnlContaCorrente.setLayout(pnlContaCorrenteLayout);
        pnlContaCorrenteLayout.setHorizontalGroup(
            pnlContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContaCorrenteLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(pnlContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContaCorrente)
                    .addComponent(txtValorContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        pnlContaCorrenteLayout.setVerticalGroup(
            pnlContaCorrenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContaCorrenteLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(txtContaCorrente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtValorSaque.setText("Digite o Valor de Saque:");

        javax.swing.GroupLayout pnlValorSaqueLayout = new javax.swing.GroupLayout(pnlValorSaque);
        pnlValorSaque.setLayout(pnlValorSaqueLayout);
        pnlValorSaqueLayout.setHorizontalGroup(
            pnlValorSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValorSaqueLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(pnlValorSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorSaque)
                    .addComponent(txtValordeSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlValorSaqueLayout.setVerticalGroup(
            pnlValorSaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValorSaqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtValorSaque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValordeSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        txtContaPoupanca.setText("Valor Disponível Conta Poupança:");

        txtValorContaPoupanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorContaPoupancaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContaPoupancaLayout = new javax.swing.GroupLayout(pnlContaPoupanca);
        pnlContaPoupanca.setLayout(pnlContaPoupancaLayout);
        pnlContaPoupancaLayout.setHorizontalGroup(
            pnlContaPoupancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContaPoupancaLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(pnlContaPoupancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContaPoupanca)
                    .addComponent(txtValorContaPoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pnlContaPoupancaLayout.setVerticalGroup(
            pnlContaPoupancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContaPoupancaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(txtContaPoupanca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorContaPoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        btnVoltar.setText("Voltar");

        btnConfirmarSaque.setText("Confirmar Saque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmarSaque)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pnlContaPoupanca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlValorSaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(pnlContaPoupanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorContaPoupancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorContaPoupancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorContaPoupancaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarSaque;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel pnlContaCorrente;
    private javax.swing.JPanel pnlContaPoupanca;
    private javax.swing.JPanel pnlValorSaque;
    private javax.swing.JLabel txtContaCorrente;
    private javax.swing.JLabel txtContaPoupanca;
    private javax.swing.JTextField txtValorContaCorrente;
    private javax.swing.JTextField txtValorContaPoupanca;
    private javax.swing.JLabel txtValorSaque;
    private javax.swing.JTextField txtValordeSaque;
    // End of variables declaration//GEN-END:variables
}
