package view;

import controller.ApenasNumeros;
import controller.ClientesControl;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.LoginDAO;

/**
 *
 * @author Joelyson David
 */
public class FRM_Clientes2 extends javax.swing.JFrame {

    /**
     * Creates new form FRM_Clientes
     */
    FRM_Clientes frmCli;
    private ClientesControl clientesCtrl = new ClientesControl(frmCli);
    private LoginDAO loginDao = new LoginDAO();
    FRM_Login frmLogin = new FRM_Login();

    public FRM_Clientes2() throws SQLException {
        initComponents();
        // clientesCtrl.mostrarClientes();
        if (frmLogin.chave == 'E') {
            clientesCtrl.mostraDados();
        }
        // txtCPF_CNPJ.setDocument(new ApenasNumeros());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCPF_CNPJ = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblHoje = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        panelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        txtProcurar = new javax.swing.JTextField();
        lblProcuraNome = new javax.swing.JLabel();
        btnProcurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");

        panelCliente.setBackground(new java.awt.Color(51, 51, 51));
        panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Novo Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panelCliente.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome: ");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço: ");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail: ");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone: ");

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPF/CNPJ: ");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        txtCPF_CNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPF_CNPJActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/addCadastro.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setMaximumSize(new java.awt.Dimension(90, 35));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(90, 35));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(95, 35));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconVoltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(90, 35));
        btnVoltar.setMinimumSize(new java.awt.Dimension(90, 35));
        btnVoltar.setPreferredSize(new java.awt.Dimension(95, 35));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(0, 0, 0));
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconDelete.png"))); // NOI18N
        btnDel.setText("Deletar");
        btnDel.setMaximumSize(new java.awt.Dimension(90, 35));
        btnDel.setMinimumSize(new java.awt.Dimension(90, 35));
        btnDel.setPreferredSize(new java.awt.Dimension(95, 35));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconAlterar.png"))); // NOI18N
        btnUpdate.setText("Alterar");
        btnUpdate.setMaximumSize(new java.awt.Dimension(90, 35));
        btnUpdate.setMinimumSize(new java.awt.Dimension(90, 35));
        btnUpdate.setPreferredSize(new java.awt.Dimension(95, 35));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        lblHoje.setText(" ");

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconCancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(90, 35));
        btnCancelar.setMinimumSize(new java.awt.Dimension(90, 35));
        btnCancelar.setPreferredSize(new java.awt.Dimension(95, 35));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(15, 15, 15)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(txtTelefone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                        .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtEndereco)
                            .addComponent(txtEmail)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(lblHoje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoje)
                .addGap(33, 33, 33)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        panelTabela.setBackground(new java.awt.Color(51, 51, 51));
        panelTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        tbClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbClientes.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Email", "CPF/CNPJ", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.setGridColor(new java.awt.Color(255, 255, 255));
        tbClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setResizable(false);
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(8);
            tbClientes.getColumnModel().getColumn(1).setResizable(false);
            tbClientes.getColumnModel().getColumn(2).setResizable(false);
            tbClientes.getColumnModel().getColumn(3).setResizable(false);
            tbClientes.getColumnModel().getColumn(4).setResizable(false);
            tbClientes.getColumnModel().getColumn(5).setResizable(false);
        }

        lblProcuraNome.setBackground(new java.awt.Color(255, 255, 255));
        lblProcuraNome.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblProcuraNome.setForeground(new java.awt.Color(255, 255, 255));
        lblProcuraNome.setText("Procurar pelo nome contendo:");

        btnProcurar.setBackground(new java.awt.Color(0, 0, 0));
        btnProcurar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconProcurar.png"))); // NOI18N
        btnProcurar.setText("Procurar");
        btnProcurar.setMaximumSize(new java.awt.Dimension(90, 35));
        btnProcurar.setMinimumSize(new java.awt.Dimension(90, 35));
        btnProcurar.setPreferredSize(new java.awt.Dimension(95, 35));
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTabelaLayout = new javax.swing.GroupLayout(panelTabela);
        panelTabela.setLayout(panelTabelaLayout);
        panelTabelaLayout.setHorizontalGroup(
            panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelTabelaLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProcuraNome)
                            .addGroup(panelTabelaLayout.createSequentialGroup()
                                .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTabelaLayout.setVerticalGroup(
            panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProcuraNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (campoVazio() == false) {
            try {

                if (getClientesCtrl().clienteExiste() == false) {
                    getClientesCtrl().insertCliente();
                }
            } catch (SQLException ex) {
                Logger.getLogger(FRM_Clientes2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Para cadastrar todos os campos devem estar preenchidas com as informações corretas do cliente!", "Aviso!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed
    // método deletar cliente
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed

        try {
            getClientesCtrl().deleteCliete();
        } catch (SQLException ex) {
            Logger.getLogger(FRM_Clientes2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDelActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FRM_Home frmHome = new FRM_Home();
        frmHome.setVisible(true);
        frmHome.setEnabled(true);
        this.setVisible(false);
        this.setEnabled(false);

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (campoVazio() == false) {
            try {
                getClientesCtrl().updateCliente();
            } catch (SQLException ex) {
                Logger.getLogger(FRM_Clientes2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        /*try {
            getClientesCtrl().procuraCliente();
        } catch (SQLException ex) {
            Logger.getLogger(FRM_Clientes2.class
                    .getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar o cadastramento?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (op == 0) {
            FRM_Login frmLogin = new FRM_Login();
            frmLogin.setVisible(true);
            frmLogin.setEnabled(true);
            this.setVisible(false);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCPF_CNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPF_CNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPF_CNPJActionPerformed

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
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Clientes2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    new FRM_Clientes2().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FRM_Clientes2.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoje;
    private javax.swing.JLabel lblProcuraNome;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelTabela;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtCPF_CNPJ;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProcurar;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    // método para limpar os campos
    public void limparCampos() {
        Component[] componentes = getPanelCliente().getComponents();
        for (Component comp : componentes) {
            if (comp instanceof JTextField) {
                JTextField txtLimpo = (JTextField) comp;
                txtLimpo.setText("");
            }
        }
    }

    // verifica campos vázios
    public boolean campoVazio() {
        // cria um array com os componentes da nossa janela
        Component[] componentes = getPanelCliente().getComponents();
        // loop para verificar se o componente é uma instancia de um TextField
        for (Component comp : componentes) {
            if (comp instanceof JTextField) { // caso seja 
                JTextField txtCampo = (JTextField) comp;
                if (txtCampo.getText().equals(null) || txtCampo.getText().equals("")) { // verifica se este campo está vázio ou nulo
                    return true; // e então retorna true caso esteja vazio
                }
            }
        }
        return false;
    }

    /**
     * @return the clientesCtrl
     */
    public ClientesControl getClientesCtrl() {
        return clientesCtrl;
    }

    /**
     * @param clientesCtrl the clientesCtrl to set
     */
    public void setClientesCtrl(ClientesControl clientesCtrl) {
        this.clientesCtrl = clientesCtrl;
    }

    /**
     * @return the loginDao
     */
    public LoginDAO getLoginDao() {
        return loginDao;
    }

    /**
     * @param loginDao the loginDao to set
     */
    public void setLoginDao(LoginDAO loginDao) {
        this.loginDao = loginDao;
    }

    /**
     * @return the btnCadastrar
     */
    public javax.swing.JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    /**
     * @param btnCadastrar the btnCadastrar to set
     */
    public void setBtnCadastrar(javax.swing.JButton btnCadastrar) {
        this.btnCadastrar = btnCadastrar;
    }

    /**
     * @return the btnCancelar
     */
    public javax.swing.JButton getBtnCancelar() {
        return btnCancelar;
    }

    /**
     * @param btnCancelar the btnCancelar to set
     */
    public void setBtnCancelar(javax.swing.JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    /**
     * @return the btnDel
     */
    public javax.swing.JButton getBtnDel() {
        return btnDel;
    }

    /**
     * @param btnDel the btnDel to set
     */
    public void setBtnDel(javax.swing.JButton btnDel) {
        this.btnDel = btnDel;
    }

    /**
     * @return the btnProcurar
     */
    public javax.swing.JButton getBtnProcurar() {
        return btnProcurar;
    }

    /**
     * @param btnProcurar the btnProcurar to set
     */
    public void setBtnProcurar(javax.swing.JButton btnProcurar) {
        this.btnProcurar = btnProcurar;
    }

    /**
     * @return the btnUpdate
     */
    public javax.swing.JButton getBtnUpdate() {
        return btnUpdate;
    }

    /**
     * @param btnUpdate the btnUpdate to set
     */
    public void setBtnUpdate(javax.swing.JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    /**
     * @return the btnVoltar
     */
    public javax.swing.JButton getBtnVoltar() {
        return btnVoltar;
    }

    /**
     * @param btnVoltar the btnVoltar to set
     */
    public void setBtnVoltar(javax.swing.JButton btnVoltar) {
        this.btnVoltar = btnVoltar;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the lblHoje
     */
    public javax.swing.JLabel getLblHoje() {
        return lblHoje;
    }

    /**
     * @param lblHoje the lblHoje to set
     */
    public void setLblHoje(javax.swing.JLabel lblHoje) {
        this.lblHoje = lblHoje;
    }

    /**
     * @return the lblProcuraNome
     */
    public javax.swing.JLabel getLblProcuraNome() {
        return lblProcuraNome;
    }

    /**
     * @param lblProcuraNome the lblProcuraNome to set
     */
    public void setLblProcuraNome(javax.swing.JLabel lblProcuraNome) {
        this.lblProcuraNome = lblProcuraNome;
    }

    /**
     * @return the panelCliente
     */
    public javax.swing.JPanel getPanelCliente() {
        return panelCliente;
    }

    /**
     * @param panelCliente the panelCliente to set
     */
    public void setPanelCliente(javax.swing.JPanel panelCliente) {
        this.panelCliente = panelCliente;
    }

    /**
     * @return the panelTabela
     */
    public javax.swing.JPanel getPanelTabela() {
        return panelTabela;
    }

    /**
     * @param panelTabela the panelTabela to set
     */
    public void setPanelTabela(javax.swing.JPanel panelTabela) {
        this.panelTabela = panelTabela;
    }

    /**
     * @return the tbClientes
     */
    public javax.swing.JTable getTbClientes() {
        return tbClientes;
    }

    /**
     * @param tbClientes the tbClientes to set
     */
    public void setTbClientes(javax.swing.JTable tbClientes) {
        this.tbClientes = tbClientes;
    }

    /**
     * @return the txtCPF_CNPJ
     */
    public javax.swing.JTextField getTxtCPF_CNPJ() {
        return txtCPF_CNPJ;
    }

    /**
     * @param txtCPF_CNPJ the txtCPF_CNPJ to set
     */
    public void setTxtCPF_CNPJ(javax.swing.JTextField txtCPF_CNPJ) {
        this.txtCPF_CNPJ = txtCPF_CNPJ;
    }

    /**
     * @return the txtEmail
     */
    public javax.swing.JTextField getTxtEmail() {
        return txtEmail;
    }

    /**
     * @param txtEmail the txtEmail to set
     */
    public void setTxtEmail(javax.swing.JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    /**
     * @return the txtEndereco
     */
    public javax.swing.JTextField getTxtEndereco() {
        return txtEndereco;
    }

    /**
     * @param txtEndereco the txtEndereco to set
     */
    public void setTxtEndereco(javax.swing.JTextField txtEndereco) {
        this.txtEndereco = txtEndereco;
    }

    /**
     * @return the txtNome
     */
    public javax.swing.JTextField getTxtNome() {
        return txtNome;
    }

    /**
     * @param txtNome the txtNome to set
     */
    public void setTxtNome(javax.swing.JTextField txtNome) {
        this.txtNome = txtNome;
    }

    /**
     * @return the txtProcurar
     */
    public javax.swing.JTextField getTxtProcurar() {
        return txtProcurar;
    }

    /**
     * @param txtProcurar the txtProcurar to set
     */
    public void setTxtProcurar(javax.swing.JTextField txtProcurar) {
        this.txtProcurar = txtProcurar;
    }

    /**
     * @return the txtTelefone
     */
    public javax.swing.JFormattedTextField getTxtTelefone() {
        return txtTelefone;
    }

    /**
     * @param txtTelefone the txtTelefone to set
     */
    public void setTxtTelefone(javax.swing.JFormattedTextField txtTelefone) {
        this.txtTelefone = txtTelefone;
    }

}
