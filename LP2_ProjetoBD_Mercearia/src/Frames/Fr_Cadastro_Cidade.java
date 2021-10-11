package Frames;

import Banco_de_Dados.BD_Cidade;
import Banco_de_Dados.BD_UF;
import Objetos.Obj_Cidade;
import Objetos.Obj_Estado;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author gabri
 */
public class Fr_Cadastro_Cidade extends javax.swing.JFrame {

    private String Operacao;
    private Obj_Cidade RegistroCidade = new Obj_Cidade();
    private BD_Cidade bd_Cidade = new BD_Cidade();
    private BD_UF bd_uf = new BD_UF();
    private ArrayList<Obj_Estado> ListaUF = new ArrayList();

    public Fr_Cadastro_Cidade() {
        initComponents();
        try {
            CargaTabela();
            CargaListaUF();
            CargaComboBox();
            Desabilita();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID UF\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
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
        lbl_Uf = new javax.swing.JLabel();
        cmb_uf = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cidade = new javax.swing.JTable();
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
        setTitle("Cadastrar Cidade");
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

        lbl_Uf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Uf.setText("UF:");

        cmb_uf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout Painel_DadosLayout = new javax.swing.GroupLayout(Painel_Dados);
        Painel_Dados.setLayout(Painel_DadosLayout);
        Painel_DadosLayout.setHorizontalGroup(
            Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_DadosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_cod)
                    .addComponent(lbl_abrev)
                    .addComponent(lbl_nome))
                .addGap(18, 18, 18)
                .addGroup(Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(Painel_DadosLayout.createSequentialGroup()
                            .addComponent(txt_abrev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_Uf)
                            .addGap(18, 18, 18)
                            .addComponent(cmb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_nome))
                    .addComponent(txt_cod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        Painel_DadosLayout.setVerticalGroup(
            Painel_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_DadosLayout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(txt_abrev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Uf)
                    .addComponent(cmb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tb_cidade.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        tb_cidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Abreviação", "UF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_cidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_cidadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_cidade);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void tb_cidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_cidadeMouseClicked
        // TODO add your handling code here:
        CarregaTabela_TextFileld();
        MontaTela();
    }//GEN-LAST:event_tb_cidadeMouseClicked

    private void btn_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incluirActionPerformed
        // TODO add your handling code here:
        int cd_uf = 0;
        if (Operacao.equals("Incluir")) {
            carregaRegCidade_Inclusao();
            if (isCamposPreenchidos()) {
                if (isCamposValidos()) {
                    try {
                        cd_uf = bd_uf.BuscaAbrvUF(RegistroCidade.getFk_abrv());
                        RegistroCidade.setCod_uf(cd_uf);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao buscar UF\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                    try {
                        if (bd_Cidade.InserirCidade(RegistroCidade)) {
                            JOptionPane.showMessageDialog(null, "Cidade incluida com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao Incluir Cidade. Erro de dados", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao Incluir Cidade\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        //limpar();
                        //habilitaConsulta();
                        try {
                            CargaTabela();
                            //CargaListaUF();
                            //CargaComboBox();
                            Desabilita();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID UF\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                        Operacao = "";
                        //operação();
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
        if (MunicipioSelecionado()) {
            resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == 0) {
                try {
                    if (bd_Cidade.ExcluiCidade(Integer.parseInt(txt_cod.getText().trim()))) {
                        JOptionPane.showMessageDialog(null, "Cidade Excluída com Sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Excluir Cidade. Erro Dados.", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Excluir Cidade\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        CargaListaUF();
                        CargaComboBox();
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    Operacao = "";
                    //operação();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o Municipio a Excluir", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        int cd_uf = 0;
        if (Operacao.equals("Alterar")) {
            carregaRegCidade_Inclusao();
            if (isCamposPreenchidos()) {
                if (isCamposValidos()) {
                    try {
                        cd_uf = bd_uf.BuscaAbrvUF(RegistroCidade.getFk_abrv());
                        RegistroCidade.setCod_uf(cd_uf);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao buscar UF\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                    try {
                        if (bd_Cidade.AlterarCidade(RegistroCidade)) {
                            JOptionPane.showMessageDialog(null, "Cidade alterada com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao Alterar Cidade. Erro de dados", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao Alterar Cidade\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        try {
                            CargaTabela();
                            //CargaListaUF();
                            //CargaComboBox();
                            Desabilita();
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID UF\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                        Operacao = "";
                        //operação();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos Corretamente!\n Abreviatura com 3 caracteres. \n Nome com até 25 caracteres", "ERRO", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Fr_Cadastro_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Cadastro_Cidade().setVisible(true);
            }
        });
    }

    private void limpar() {
        txt_cod.setText(null);
        txt_nome.setText("");
        txt_abrev.setText("");
        cmb_uf.setSelectedIndex(-1);
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
        if ((!txt_nome.getText().trim().isEmpty()) && (!txt_abrev.getText().trim().isEmpty())
                && (cmb_uf.getSelectedIndex() != -1)) {
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
    private javax.swing.JComboBox<String> cmb_uf;
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
    private javax.swing.JLabel lbl_Uf;
    private javax.swing.JLabel lbl_abrev;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JTable tb_cidade;
    private javax.swing.JTextField txt_abrev;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables

    private void carregaRegCidade_Inclusao() {
        RegistroCidade.setNome(txt_nome.getText().trim());
        RegistroCidade.setAbrev(txt_abrev.getText().trim());
        if (RegistroCidade.getAbrev().equals(null)) {
            RegistroCidade.setAbrev("---");
        }
        RegistroCidade.setFk_abrv(cmb_uf.getSelectedItem().toString());
    }

    private void Desabilita() {
        limpar();
        txt_cod.setEditable(false);
        txt_nome.setEditable(false);
        txt_abrev.setEditable(false);
        cmb_uf.setEditable(false);
    }

    /*private void habilitaConsulta() {
        limpar();
        txt_cod.setEditable(true);
        txt_nome.setEditable(false);
        txt_abrev.setEditable(false);
    }*/
    private void habilitaEdicao() {
        if (Operacao.equals("Alterar")) {
            txt_cod.setEditable(true);
        } else {
            txt_cod.setEditable(false);
        }
        txt_nome.setEditable(true);
        txt_abrev.setEditable(true);
        cmb_uf.setEditable(true);
    }

    private void MontaTela() {
        txt_nome.setText(RegistroCidade.getNome());
        txt_abrev.setText(RegistroCidade.getAbrev());
        txt_cod.setText(String.valueOf(RegistroCidade.getcod()));
        cmb_uf.setSelectedItem(RegistroCidade.getFk_abrv());
    }

    public void CargaTabela() throws Exception {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tb_cidade.getModel();
            modelo.setNumRows(0);  // zera qtde de linhas tabela 
            modelo.setRowCount(0);
            for (Obj_Cidade registro : bd_Cidade.CarregarListaCidade()) {
                modelo.addRow(new Object[]{registro.getcod(), registro.getNome(), registro.getAbrev(), registro.getFk_abrv()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Cidade\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void CarregaTabela_TextFileld() {
        RegistroCidade.setcod((int) tb_cidade.getValueAt(tb_cidade.getSelectedRow(), 0));
        RegistroCidade.setNome((String) tb_cidade.getValueAt(tb_cidade.getSelectedRow(), 1));
        RegistroCidade.setAbrev((String) tb_cidade.getValueAt(tb_cidade.getSelectedRow(), 2));
        RegistroCidade.setFk_abrv((String) tb_cidade.getValueAt(tb_cidade.getSelectedRow(), 3));
    }

    public boolean isCamposValidos() {
        boolean saida = false;
        if ((RegistroCidade.isAbrv_Cidade_Valida()) && (RegistroCidade.isNome_Cidade_Valida())) {
            saida = true;
        }
        return saida;
    }

    private void CargaListaUF() throws Exception {
        ListaUF = bd_uf.CarregarListaUF();
    }

    private void CargaComboBox() {
        Iterator<Obj_Estado> it = ListaUF.iterator();
        while (it.hasNext()) {
            Obj_Estado reg = it.next();
            String uf = reg.getAbrev();
            cmb_uf.addItem(uf);
        }
        cmb_uf.setSelectedIndex(-1); // volta indice do combo para não selecioado
    }

    private boolean MunicipioSelecionado() {
        boolean saida = false;
        if (!txt_nome.getText().trim().isEmpty()) {
            saida = true;
        }
        return saida;
    }
}
