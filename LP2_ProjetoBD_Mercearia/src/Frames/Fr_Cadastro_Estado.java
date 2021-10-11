package Frames;

import Banco_de_Dados.BD_UF;
import Objetos.Obj_Estado;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author gabri
 */
public class Fr_Cadastro_Estado extends javax.swing.JFrame {

    private String Operacao;
    private Obj_Estado RegistroUF = new Obj_Estado();
    private BD_UF bd_uf = new BD_UF();

    public Fr_Cadastro_Estado() {
        initComponents();
        try {
            CargaTabela();
            Desabilita();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID UF\n" + ex.getMessage(), "\nERRO", JOptionPane.ERROR_MESSAGE);
        }
        Operacao = "";
        //operação();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel_Dados = new javax.swing.JPanel();
        lbl_nome = new javax.swing.JLabel();
        lbl_abrev = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_abrev = new javax.swing.JTextField();
        lbl_cod = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_uf = new javax.swing.JTable();
        btn_limpar = new javax.swing.JButton();
        btn_incluir = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMenu = new javax.swing.JMenu();
        jMenuItemMenu = new javax.swing.JMenuItem();
        jMenu_cadastrar = new javax.swing.JMenu();
        JMenuItemCidade = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemEstado = new javax.swing.JMenuItem();
        jMenuItemFornecedor = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemMarca = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuLogin = new javax.swing.JMenu();
        jMenuItemCadLogin = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Estado");
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        Painel_Dados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lbl_nome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_nome.setText("Nome:");

        lbl_abrev.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_abrev.setText("Abreviação:");

        txt_nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txt_abrev.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbl_cod.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_cod.setText("Codigo:");

        txt_cod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout Painel_DadosLayout = new javax.swing.GroupLayout(Painel_Dados);
        Painel_Dados.setLayout(Painel_DadosLayout);
        Painel_DadosLayout.setHorizontalGroup(
            Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_DadosLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_cod)
                    .addComponent(lbl_abrev)
                    .addComponent(lbl_nome))
                .addGap(18, 18, 18)
                .addGroup(Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_abrev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        Painel_DadosLayout.setVerticalGroup(
            Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_DadosLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cod)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome))
                .addGap(18, 18, 18)
                .addGroup(Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_abrev)
                    .addComponent(txt_abrev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tb_uf.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        tb_uf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Abreviação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_uf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ufMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_uf);

        btn_limpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_incluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_incluir.setText("Incluir");
        btn_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incluirActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        jMenuMenu.setText("Menu");
        jMenuMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItemMenu.setText("Inicio");
        jMenuItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMenuActionPerformed(evt);
            }
        });
        jMenuMenu.add(jMenuItemMenu);

        jMenuBar1.add(jMenuMenu);

        jMenu_cadastrar.setText("Cadastrar");
        jMenu_cadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        JMenuItemCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JMenuItemCidade.setText("Cidade");
        JMenuItemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemCidadeActionPerformed(evt);
            }
        });
        jMenu_cadastrar.add(JMenuItemCidade);

        jMenuItemCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenu_cadastrar.add(jMenuItemCliente);

        jMenuItemEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemEstado.setText("Estado");
        jMenuItemEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstadoActionPerformed(evt);
            }
        });
        jMenu_cadastrar.add(jMenuItemEstado);

        jMenuItemFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemFornecedor.setText("Fornecedor");
        jMenuItemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedorActionPerformed(evt);
            }
        });
        jMenu_cadastrar.add(jMenuItemFornecedor);

        jMenuItemFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemFuncionario.setText("Funcionário");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenu_cadastrar.add(jMenuItemFuncionario);

        jMenuItemMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemMarca.setText("Marca");
        jMenuItemMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMarcaActionPerformed(evt);
            }
        });
        jMenu_cadastrar.add(jMenuItemMarca);

        jMenuItemProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenu_cadastrar.add(jMenuItemProduto);

        jMenuBar1.add(jMenu_cadastrar);

        jMenuLogin.setText("Login");

        jMenuItemCadLogin.setText("Cadastrar Login");
        jMenuItemCadLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadLoginActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuItemCadLogin);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuItemSair);

        jMenuBar1.add(jMenuLogin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Painel_Dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_limpar)
                        .addGap(28, 28, 28)
                        .addComponent(btn_incluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btn_excluir)
                        .addGap(28, 28, 28)
                        .addComponent(btn_alterar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_Dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpar)
                    .addComponent(btn_incluir)
                    .addComponent(btn_excluir)
                    .addComponent(btn_alterar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void tb_ufMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ufMouseClicked
        // TODO add your handling code here:
        CarregaTabela_TextFileld();
        MontaTela();
    }//GEN-LAST:event_tb_ufMouseClicked

    private void btn_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incluirActionPerformed
        // TODO add your handling code here:
        if (Operacao.equals("Incluir")) {
            if (isCamposPreenchidos()) {
                carregaRegUF_Inclusao();
                if (isCamposValidos()) {
                    try {
                        if (bd_uf.InserirUF(RegistroUF)) {
                            JOptionPane.showMessageDialog(null, "UF incluida com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao Incluir UF.", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao Incluir UF\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        limpar();
                        Operacao = "";
                        //operação();
                        habilitaConsulta();
                        try {
                            CargaTabela();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID UF\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos Corretamente!\n Abreviatura com 2 caracteres. \n Nome com até 25 caracteres", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Operacao = "Incluir";
            //operação();
            habilitaEdicao();
        }
    }//GEN-LAST:event_btn_incluirActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
        int resp = 0;
        if (UFSelecionado()) {
            resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == 0) {
                try {
                    if (bd_uf.ExcluiUF(Integer.parseInt(txt_cod.getText().trim()))) {
                        JOptionPane.showMessageDialog(null, "UF Excluída com Sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Excluir UF. Erro Dados.", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Excluir UF\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro Carga Grid \n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    Operacao = "";
                    //operação();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o UF a Excluir", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        if (Operacao.equals("Alterar")) {
            if (isCamposPreenchidos()) {
                carregaRegUF_Inclusao();
                if (isCamposValidos()) {
                    try {
                        if (bd_uf.AlterarUF(RegistroUF)) {
                            JOptionPane.showMessageDialog(null, "UF alterada com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao Alterar UF.", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao Alterar UF\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        limpar();
                        Operacao = "";
                        //operação();
                        habilitaConsulta();
                        try {
                            CargaTabela();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID UF\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos Corretamente!\n Abreviatura com 2 caracteres. \n Nome com até 25 caracteres", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Operacao = "Alterar";
            //operação();
            habilitaEdicao();
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void jMenuItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMenuActionPerformed
        // TODO add your handling code here:
        Fr_Menu menu = new Fr_Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jMenuItemMenuActionPerformed

    private void JMenuItemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemCidadeActionPerformed
        // TODO add your handling code here:
        Fr_Cadastro_Cidade cidade = new Fr_Cadastro_Cidade();
        cidade.setVisible(true);
    }//GEN-LAST:event_JMenuItemCidadeActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // TODO add your handling code here:
        Fr_Cadastro_cliente cadastro = new Fr_Cadastro_cliente();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstadoActionPerformed
        // TODO add your handling code here:
        Fr_Cadastro_Estado estado = new Fr_Cadastro_Estado();
        estado.setVisible(true);
    }//GEN-LAST:event_jMenuItemEstadoActionPerformed

    private void jMenuItemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedorActionPerformed
        // TODO add your handling code here:
        Fr_Cadastro_fornecedor cadastro = new Fr_Cadastro_fornecedor();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItemFornecedorActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        // TODO add your handling code here:
        Fr_Cadastro_funcionario cadastro = new Fr_Cadastro_funcionario();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMarcaActionPerformed
        // TODO add your handling code here:
        Fr_Cadastro_Marca marca = new Fr_Cadastro_Marca();
        marca.setVisible(true);
    }//GEN-LAST:event_jMenuItemMarcaActionPerformed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        // TODO add your handling code here:
        Fr_Cadastro_produto cadastro = new Fr_Cadastro_produto();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void jMenuItemCadLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadLoginActionPerformed
        // TODO add your handling code here:
        Fr_Cadastro_Login login = new Fr_Cadastro_Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadLoginActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

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
            java.util.logging.Logger.getLogger(Fr_Cadastro_Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Cadastro_Estado().setVisible(true);
            }
        });
    }

    private void limpar() {
        txt_cod.setText(null);
        txt_nome.setText("");
        txt_abrev.setText("");
    }
    
    /*private void operação() {
        if (Operacao.equals("Incluir")) {
            lbl_op.setText("Operação: " + Operacao);
            lbl_op.setForeground(Color.green);            
            lbl_op.setVisible(true);
        } else if (Operacao.equals("Alterar")) {
            lbl_op.setText("Operação: " + Operacao);
            lbl_op.setForeground(Color.yellow);
            lbl_op.setVisible(true);
        } else {
            lbl_op.setText("Operação: " + Operacao);
            lbl_op.setForeground(Color.black);
            lbl_op.setVisible(false);
        }
    }*/

    private boolean isCamposPreenchidos() {
        boolean saida = false;
        if ((!txt_nome.getText().trim().isEmpty())
                && (!txt_abrev.getText().trim().isEmpty())) {
            saida = true;
        }
        return saida;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuItemCidade;
    private javax.swing.JPanel Painel_Dados;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_incluir;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCadLogin;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemEstado;
    private javax.swing.JMenuItem jMenuItemFornecedor;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemMarca;
    private javax.swing.JMenuItem jMenuItemMenu;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuLogin;
    private javax.swing.JMenu jMenuMenu;
    private javax.swing.JMenu jMenu_cadastrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_abrev;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JTable tb_uf;
    private javax.swing.JTextField txt_abrev;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables

    private void carregaRegUF_Inclusao() {
        RegistroUF.setNome(txt_nome.getText().trim());
        RegistroUF.setAbrev(txt_abrev.getText().trim());
    }

    private void Desabilita() {
        limpar();
        txt_cod.setEditable(false);
        txt_nome.setEditable(false);
    }

    private void habilitaConsulta() {
        limpar();
        txt_cod.setEditable(true);
        txt_nome.setEditable(false);
        txt_abrev.setEditable(false);
    }

    private void habilitaEdicao() {
        if (Operacao.equals("Alterar")) {
            txt_cod.setEditable(true);
        } else {
            txt_cod.setEditable(false);
        }
        txt_nome.setEditable(true);
        txt_abrev.setEditable(true);
    }

    private void MontaTela() {
        txt_nome.setText(RegistroUF.getNome());
        txt_abrev.setText(RegistroUF.getAbrev());
        txt_cod.setText(String.valueOf(RegistroUF.getcod()));
    }

    public void CargaTabela() throws Exception {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tb_uf.getModel();
            modelo.setNumRows(0);  // zera qtde de linhas tabela 
            modelo.setRowCount(0);

            for (Obj_Estado registro : bd_uf.CarregarListaUF()) {
                modelo.addRow(new Object[]{registro.getcod(), registro.getNome(), registro.getAbrev()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID UF\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void CarregaTabela_TextFileld() {
        RegistroUF.setcod((int) tb_uf.getValueAt(tb_uf.getSelectedRow(), 0));
        RegistroUF.setNome((String) tb_uf.getValueAt(tb_uf.getSelectedRow(), 1));
        RegistroUF.setAbrev((String) tb_uf.getValueAt(tb_uf.getSelectedRow(), 2));
    }

    public boolean isCamposValidos() {
        boolean saida = false;
        if ((RegistroUF.isAbrv_UF_Valida()) && (RegistroUF.isNome_UF_Valida())) {
            saida = true;
        }
        return saida;
    }

    private boolean UFSelecionado() {
        boolean saida = false;
        if (!txt_nome.getText().trim().isEmpty()) {
            saida = true;
        }
        return saida;
    }
}
