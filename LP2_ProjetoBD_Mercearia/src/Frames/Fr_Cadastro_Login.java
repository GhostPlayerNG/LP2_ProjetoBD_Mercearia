package Frames;

import Banco_de_Dados.BD_User;
import Objetos.Obj_User;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author gabri
 */
public class Fr_Cadastro_Login extends javax.swing.JFrame {

    private String Operacao;
    private Obj_User objUser = new Obj_User();
    private BD_User bdUser = new BD_User();
    
    public Fr_Cadastro_Login() {
        initComponents();
        try {
            CargaTabelaUser();
            Desabilita();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Usuario\n" + ex.getMessage(), "\nERRO", JOptionPane.ERROR_MESSAGE);
        }
        Operacao = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_dados = new javax.swing.JPanel();
        lbl_desc = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        lbl_desc1 = new javax.swing.JLabel();
        txt_cd = new javax.swing.JTextField();
        lbl_Senha = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        btn_limpar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_incluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_user = new javax.swing.JTable();
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
        setTitle("Cadastro de Usuario");

        painel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Usuario:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        painel_dados.setToolTipText("Cadatro de Marca");

        lbl_desc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_desc.setText("Usuario:");

        txt_user.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lbl_desc1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_desc1.setText("Codigo:");

        txt_cd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_cd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cdFocusLost(evt);
            }
        });

        lbl_Senha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Senha.setText("Senha:");

        javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
        painel_dados.setLayout(painel_dadosLayout);
        painel_dadosLayout.setHorizontalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_desc1)
                    .addComponent(lbl_desc)
                    .addComponent(lbl_Senha))
                .addGap(26, 26, 26)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_user)
                    .addGroup(painel_dadosLayout.createSequentialGroup()
                        .addComponent(txt_cd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_senha))
                .addGap(71, 71, 71))
        );
        painel_dadosLayout.setVerticalGroup(
            painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_desc1)
                    .addComponent(txt_cd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_desc)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Senha)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btn_limpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_incluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_incluir.setText("Incluir");
        btn_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incluirActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        tb_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tb_user.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Usuario", "Senha"
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
        tb_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_user);

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_limpar)
                        .addGap(20, 20, 20)
                        .addComponent(btn_incluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btn_excluir)
                        .addGap(18, 18, 18)
                        .addComponent(btn_alterar))
                    .addComponent(painel_dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpar)
                    .addComponent(btn_incluir)
                    .addComponent(btn_excluir)
                    .addComponent(btn_alterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cdFocusLost
        // TODO add your handling code here:
        /*if (txt_cd.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha Código da User para Consultar", "Erro Consulta", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int codigo = Integer.parseInt(txt_cd.getText().trim());

                objUser = bdmarca.BuscaNomeMarca(codigo);

                if (objUser.getCDProduto() == 0) {
                    JOptionPane.showMessageDialog(null, "Código não encontrado", "Erro Consultar", JOptionPane.ERROR_MESSAGE);
                }
                MontaTela();

            } catch (Exception ex) {

            }
            //final try
        }*/
    }//GEN-LAST:event_txt_cdFocusLost

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
        int resp = 0;
        if (UserSelecionada()) {
            resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == 0) {
                try {
                    if (bdUser.ExcluiUser(Integer.parseInt(txt_cd.getText().trim()))) {
                        JOptionPane.showMessageDialog(null, "Usuario Excluída com Sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Excluir Usuario. Erro Dados.", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Excluir Usuario\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabelaUser();
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro Carga Grid \n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    Operacao = "";
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione a Usuario a Excluir", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incluirActionPerformed
        // TODO add your handling code here:
        if (Operacao.equals("Incluir")) {
            if (isCamposPreenchidos()) {
                carregaRegUser_Inclusao();
                try {
                    if (bdUser.InserirUser(objUser)) {
                        JOptionPane.showMessageDialog(null, "Usuario incluida com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Incluir Usuario.", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Incluir Usuario\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    limpar();
                    Operacao = "";
                    habilitaConsulta();
                    try {
                        CargaTabelaUser();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Usuario\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Operacao = "Incluir";
            habilitaEdicao();
        }
    }//GEN-LAST:event_btn_incluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        if (Operacao.equals("Alterar")) {
            if (isCamposPreenchidos()) {
                carregaRegUser_Inclusao();
                try {
                    if (bdUser.AlterarUser(objUser)) {
                        JOptionPane.showMessageDialog(null, "Usuario alterada com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Alterar Usuario.", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Alterar Usuario\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    limpar();
                    Operacao = "";
                    habilitaConsulta();
                    try {
                        CargaTabelaUser();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Usuario\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Operacao = "Alterar";
            habilitaEdicao();
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void tb_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_userMouseClicked
        // TODO add your handling code here:
        CarregaTabela_TextFileld();
        MontaTela();
    }//GEN-LAST:event_tb_userMouseClicked

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
            java.util.logging.Logger.getLogger(Fr_Cadastro_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Cadastro_Login().setVisible(true);
            }
        });
    }

    private void Desabilita() {
        limpar();
        txt_cd.setEditable(false);
        txt_user.setEditable(false);
        txt_senha.setEditable(false);
    }

    private void habilitaConsulta() {
        limpar();
        txt_user.setEditable(false);
        txt_senha.setEditable(false);
    }

    private void habilitaEdicao() {
        limpar();
        txt_cd.setEditable(false);
        txt_user.setEditable(true);
        txt_senha.setEditable(true);
    }

     private void limpar() {
        txt_cd.setText("");
        txt_user.setText("");
        txt_senha.setText("");
    }
     
    private void MontaTela() {
        txt_user.setText(objUser.getUser());
        txt_cd.setText(String.valueOf(objUser.getCd()));
        txt_senha.setText(objUser.getSenha());        
    }
    
    private boolean isCamposPreenchidos() {
        boolean saida = false;
        if ((!txt_user.getText().trim().isEmpty())
                && (!txt_senha.getText().trim().isEmpty())) {
            saida = true;
        }
        return saida;
    }
    private void consiste_senha() {        
        if (!objUser.isSenhaValida()) {
            JOptionPane.showMessageDialog(null, "A senha deve conter: \n Mais de 4 caracteres \n Menos do que 15 caracters \n Conter no min. 1 número", "Senha Inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void carregaRegUser_Inclusao() {
        if (Operacao.equals("Alterar")) {
            objUser.setCd(Integer.parseInt((txt_cd.getText().trim())));
        }
        objUser.setUser(txt_user.getText().trim());
        objUser.setSenha(txt_senha.getText().trim());
        consiste_senha();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuItemCidade;
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
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_desc;
    private javax.swing.JLabel lbl_desc1;
    private javax.swing.JPanel painel_dados;
    private javax.swing.JTable tb_user;
    private javax.swing.JTextField txt_cd;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    public void CargaTabelaUser() throws Exception {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tb_user.getModel();
            modelo.setNumRows(0);  // zera qtde de linhas tabela 
            modelo.setRowCount(0);
            for (Obj_User registro : bdUser.CarregarListaUser()) {
                modelo.addRow(new Object[]{registro.getCd(), registro.getUser(), registro.getSenha()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Usuario\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void CarregaTabela_TextFileld() {
        objUser.setCd((int) tb_user.getValueAt(tb_user.getSelectedRow(), 0));
        objUser.setUser((String) tb_user.getValueAt(tb_user.getSelectedRow(), 1));
        objUser.setSenha((String) tb_user.getValueAt(tb_user.getSelectedRow(), 2));
    }

    private boolean UserSelecionada() {
        boolean saida = false;
        if (!txt_user.getText().trim().isEmpty()) {
            saida = true;
        }
        return saida;
    }
}
