package Frames;

import Banco_de_Dados.BD_Marca;
import Banco_de_Dados.BD_Produto;
import Objetos.Obj_Marca;
import Objetos.Obj_Produto;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author gabri
 */
public class Fr_Cadastro_produto extends javax.swing.JFrame {

    private String Operacao;
    private Obj_Produto objRegProduto = new Obj_Produto();
    private BD_Produto bdproduto = new BD_Produto();
    private Obj_Marca objMarca = new Obj_Marca();
    private BD_Marca bdmarca = new BD_Marca();
    private ArrayList<Obj_Marca> ListaMarca = new ArrayList();

    public Fr_Cadastro_produto() {
        initComponents();
        try {
            CargaTabela();
            CargaListaMarca();
            CargaComboBox();
            Desabilita();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Marca\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        Operacao = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_dados_pessoais = new javax.swing.JPanel();
        lbl_desc = new javax.swing.JLabel();
        lbl_marca = new javax.swing.JLabel();
        lbl_tipo = new javax.swing.JLabel();
        txt_val_unit = new javax.swing.JTextField();
        txt_desc = new javax.swing.JTextField();
        lbl_val_desc = new javax.swing.JLabel();
        lbl_val_unit = new javax.swing.JLabel();
        cmb_tipo = new javax.swing.JComboBox<>();
        txt_val_desc = new javax.swing.JTextField();
        lbl_desc1 = new javax.swing.JLabel();
        txt_cd_prod = new javax.swing.JTextField();
        cmb_marca = new javax.swing.JComboBox<>();
        btn_Limpar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_produto = new javax.swing.JTable();
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
        setTitle("Cadastro de produto");

        painel_dados_pessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        lbl_desc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_desc.setText("Descrição: ");

        lbl_marca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_marca.setText("Marca:");

        lbl_tipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_tipo.setText("Tipo:");

        txt_val_unit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txt_desc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lbl_val_desc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_val_desc.setText("Valor de Desconto:");

        lbl_val_unit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_val_unit.setText("Valor Unitário:");

        cmb_tipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Utensilios", "Diversos", "Hortifruti", "Açougue", "Padaria", "Limpeza&Higiene", "Bebidas" }));
        cmb_tipo.setSelectedIndex(-1);

        txt_val_desc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lbl_desc1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_desc1.setText("Codigo do produto:");

        txt_cd_prod.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_cd_prod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cd_prodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cd_prodFocusLost(evt);
            }
        });

        cmb_marca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout painel_dados_pessoaisLayout = new javax.swing.GroupLayout(painel_dados_pessoais);
        painel_dados_pessoais.setLayout(painel_dados_pessoaisLayout);
        painel_dados_pessoaisLayout.setHorizontalGroup(
            painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_desc1)
                    .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_marca)
                                .addComponent(lbl_tipo)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dados_pessoaisLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(lbl_desc)))
                    .addComponent(lbl_val_desc)
                    .addComponent(lbl_val_unit))
                .addGap(18, 18, 18)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_desc)
                    .addComponent(cmb_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_val_unit)
                    .addComponent(txt_val_desc)
                    .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                        .addComponent(txt_cd_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmb_marca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        painel_dados_pessoaisLayout.setVerticalGroup(
            painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_desc1)
                    .addComponent(txt_cd_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_desc)
                    .addComponent(txt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_marca)
                    .addComponent(cmb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_tipo)
                    .addComponent(cmb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_val_unit)
                    .addComponent(txt_val_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_val_desc)
                    .addComponent(txt_val_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Limpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        btn_cadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cadastrar.setText("Incluir");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
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

        tb_produto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tb_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "Marca", "Tipo", "Preço", "Desconto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_produtoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_produto);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painel_dados_pessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Limpar)
                        .addGap(30, 30, 30)
                        .addComponent(btn_cadastrar)
                        .addGap(30, 30, 30)
                        .addComponent(btn_excluir)
                        .addGap(30, 30, 30)
                        .addComponent(btn_alterar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_dados_pessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        // TODO add your handling code here:
        limpar_campos();
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        // TODO add your handling code here:
        int cd_marca = 0;
        if (Operacao.equals("Incluir")) {
            consiste_campos();
            if (isCamposPreenchidos()) {
                carregaRegProduto();
                try {
                    cd_marca = bdmarca.BuscaNomeMarca(objRegProduto.getMarca());
                    objRegProduto.setCdMarca(cd_marca);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar Marca\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    if (bdproduto.IncluirProduto(objRegProduto)) {
                        JOptionPane.showMessageDialog(null, "Produto incluida com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Incluir Produto. Erro de dados", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Incluir Produto\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        CargaListaMarca();
                        CargaComboBox();
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Marca\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    Operacao = "";
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            Operacao = "Incluir";
            habilitaEdicao();
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void txt_cd_prodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cd_prodFocusLost
        // TODO add your handling code here:
        /*if (txt_cd_prod.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha Código do Produto para Consultar", "Erro Consulta", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int codigo = Integer.parseInt(txt_cd_prod.getText().trim());
                objRegProduto = bdproduto.ConsultaProduto(codigo);
                if (objRegProduto.getCDProduto() == 0) {
                    JOptionPane.showMessageDialog(null, "Código não encontrado", "Erro Consultar", JOptionPane.ERROR_MESSAGE);
                }
                MontaTela();
            } catch (Exception ex) {

            }
            // final try 
        }*/
    }//GEN-LAST:event_txt_cd_prodFocusLost

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
        int resp = 0;
        if (ProdutoSelecionado()) {
            resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == 0) {
                try {
                    if (bdproduto.ExcluiProduto(Integer.parseInt(txt_cd_prod.getText().trim()))) {
                        JOptionPane.showMessageDialog(null, "Produto Excluído com Sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Excluir Produto. Erro Dados.", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Excluir Produto\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        //CargaListaMarca();
                        //CargaComboBox();
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    Operacao = "";
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o Produto a Excluir", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void tb_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_produtoMouseClicked
        // TODO add your handling code here:
        CarregaTabela_TextFileld();
        MontaTela();
    }//GEN-LAST:event_tb_produtoMouseClicked

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        int cd_marca = 0;
        if (Operacao.equals("Alterar")) {
            if (isCamposPreenchidos()) {
                carregaRegProduto();
                try {
                    cd_marca = bdmarca.BuscaNomeMarca(objRegProduto.getMarca());
                    objRegProduto.setCdMarca(cd_marca);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar Marca\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    if (bdproduto.AlteraProduto(objRegProduto)) {
                        JOptionPane.showMessageDialog(null, "Produto alterado com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Alterar Produto. Erro de dados", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Alterar Produto\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        //CargaListaMarca();
                        //CargaComboBox();
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Marca\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    Operacao = "";
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
                consiste_campos();
            }
        } else {
            Operacao = "Alterar";
            habilitaEdicao();
        }
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void txt_cd_prodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cd_prodFocusGained
        // TODO add your handling code here:
        //habilitaConsulta();
    }//GEN-LAST:event_txt_cd_prodFocusGained

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
            java.util.logging.Logger.getLogger(Fr_Cadastro_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Cadastro_produto().setVisible(true);
            }
        });
    }

    public void limpar_campos() {
        cmb_tipo.setSelectedIndex(-1);
        cmb_marca.setSelectedIndex(-1);
        txt_desc.setText(null);
        txt_val_desc.setText(null);
        txt_val_unit.setText(null);
    }

    private boolean isCamposPreenchidos() {
        boolean saida = false;
        if ((!txt_desc.getText().trim().isEmpty())
                && (cmb_marca.getSelectedIndex() != -1)
                && (!txt_val_desc.getText().trim().isEmpty())
                && (!txt_val_unit.getText().trim().isEmpty())
                && (cmb_tipo.getSelectedIndex() != -1)) {
            saida = true;
        }
        return saida;
    }

    public void consiste_campos() {
        if (txt_desc.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha a descrição do produto", "Erro Descrição", JOptionPane.ERROR_MESSAGE);
        }
        if (cmb_marca.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Preencha a marca do produto", "Erro Marca", JOptionPane.ERROR_MESSAGE);
        }
        if (txt_val_desc.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Valor de Desconto", "Erro Valor de Desconto", JOptionPane.ERROR_MESSAGE);
        }
        if (txt_val_unit.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Valor de Unitario", "Erro Valor de Unitario", JOptionPane.ERROR_MESSAGE);
        }
        if (cmb_tipo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o tipo do produto", "Erro Tipo", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consiste_numericos() {
        try {
            objRegProduto.setValDesconto(Float.parseFloat(txt_val_desc.getText().trim()));
            objRegProduto.setValUnitario(Float.parseFloat(txt_val_unit.getText().trim()));
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas Números em: \n Valor de Desconto \n Valor Unitario \nErro:" + erro.getMessage(), "Erro: tratamento numéricos ", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void carregaRegProduto() {
        objRegProduto.setMarca(String.valueOf(cmb_marca.getSelectedItem()));
        objRegProduto.setDescricao(txt_desc.getText().trim());
        objRegProduto.setTipo(String.valueOf(cmb_tipo.getSelectedItem()));
        consiste_numericos();
    }

    private void Desabilita() {
        limpar_campos();
        txt_cd_prod.setEditable(false);
        txt_desc.setEditable(false);
        txt_val_desc.setEditable(false);
        txt_val_unit.setEditable(false);
    }

    private void habilitaConsulta() {
        limpar_campos();
        txt_cd_prod.setEditable(true);
        txt_desc.setEditable(false);
        txt_val_desc.setEditable(false);
        txt_val_unit.setEditable(false);
    }

    private void habilitaEdicao() {
        if(Operacao.equals("Alterar"))
            txt_cd_prod.setEditable(true);
        else
            txt_cd_prod.setEditable(false);
        txt_desc.setEditable(true);
        txt_val_desc.setEditable(true);
        txt_val_unit.setEditable(true);
    }

    private boolean ProdutoSelecionado() {
        boolean saida = false;
        if (!txt_desc.getText().trim().isEmpty()) {
            saida = true;
        }
        return saida;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuItemCidade;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JComboBox<String> cmb_marca;
    private javax.swing.JComboBox<String> cmb_tipo;
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
    private javax.swing.JLabel lbl_desc;
    private javax.swing.JLabel lbl_desc1;
    private javax.swing.JLabel lbl_marca;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_val_desc;
    private javax.swing.JLabel lbl_val_unit;
    private javax.swing.JPanel painel_dados_pessoais;
    private javax.swing.JTable tb_produto;
    private javax.swing.JTextField txt_cd_prod;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_val_desc;
    private javax.swing.JTextField txt_val_unit;
    // End of variables declaration//GEN-END:variables

    private void CargaListaMarca() throws Exception {
        ListaMarca = bdmarca.CarregarListaMarca();
    }
    
    private void MontaTela() {
        txt_cd_prod.setText(String.valueOf(objRegProduto.getCDProduto()));
        txt_desc.setText(objRegProduto.getDescricao());
        txt_val_desc.setText(String.valueOf(objRegProduto.getValDesconto()));
        txt_val_unit.setText(String.valueOf(objRegProduto.getValUnitario()));
        cmb_marca.setSelectedItem(objRegProduto.getMarca());
        int i = 0;
        while (i <= 6) {
            if (objRegProduto.getTipo().equals(cmb_tipo.getItemAt(i))) {
                cmb_tipo.setSelectedIndex(i);
                break;
            }
            i++;
        }
    }
    
    private void CarregaTabela_TextFileld() {
        objRegProduto.setCDProduto((int) tb_produto.getValueAt(tb_produto.getSelectedRow(), 0));
        objRegProduto.setDescricao((String) tb_produto.getValueAt(tb_produto.getSelectedRow(), 1));
        objRegProduto.setMarca((String) tb_produto.getValueAt(tb_produto.getSelectedRow(), 2));
        objRegProduto.setTipo((String) tb_produto.getValueAt(tb_produto.getSelectedRow(), 3));
        objRegProduto.setValUnitario((float) tb_produto.getValueAt(tb_produto.getSelectedRow(), 4));
        objRegProduto.setValDesconto((float) tb_produto.getValueAt(tb_produto.getSelectedRow(), 5));
    }

    private void CargaComboBox() {
        Iterator<Obj_Marca> it = ListaMarca.iterator();
        while (it.hasNext()) {
            Obj_Marca reg = it.next();
            String marca = reg.getNome();
            cmb_marca.addItem(marca);
        }
        cmb_marca.setSelectedIndex(-1); // volta indice do combo para não selecioado
    }

    public void CargaTabela() throws Exception {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tb_produto.getModel();
            modelo.setNumRows(0);  // zera qtde de linhas tabela 
            modelo.setRowCount(0);
            for (Obj_Produto registro : bdproduto.CarregarListaProduto()) {
                modelo.addRow(new Object[]{registro.getCDProduto(), registro.getDescricao(), registro.getMarca(), registro.getTipo(), registro.getValUnitario(), registro.getValDesconto()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Produto\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

}
