package Frames;

import Banco_de_Dados.BD_Cidade;
import Banco_de_Dados.BD_Fornecedor;
import Banco_de_Dados.BD_UF;
import Objetos.Obj_Cidade;
import Objetos.Obj_Cliente;
import Objetos.Obj_Estado;
import Objetos.Obj_Fornecedor;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author gabri
 */
public class Fr_Cadastro_fornecedor extends javax.swing.JFrame {

    private String Operacao;
    Obj_Fornecedor objRegFornecedor = new Obj_Fornecedor();
    BD_Fornecedor bdfornecedor = new BD_Fornecedor();
    private ArrayList<Obj_Fornecedor> ListaFornecedor = new ArrayList();
    private Obj_Estado objRegEstado = new Obj_Estado();
    private BD_UF bdestado = new BD_UF();
    private ArrayList<Obj_Estado> ListaUF = new ArrayList();
    private Obj_Cidade RegistroCidade = new Obj_Cidade();
    private BD_Cidade bdcidade = new BD_Cidade();
    private ArrayList<Obj_Cidade> ListaCidade = new ArrayList();

    public Fr_Cadastro_fornecedor() {
        initComponents();
        try {
            CargaTabela();
            CargaListaFornecedor();
            CargaListaUF();
            CargaListaCidade();
            CargaComboBoxUF();
            CargaComboBoxCidade();
            Desabilita();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Fornecedor\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        Operacao = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_limpar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();
        painel_dados_pessoais = new javax.swing.JPanel();
        lbl_nome = new javax.swing.JLabel();
        lbl_telefone = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_ddd = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        painel_endereco = new javax.swing.JPanel();
        lbl_etado = new javax.swing.JLabel();
        lbl_cidade = new javax.swing.JLabel();
        lbl_endereco = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        cmb_cidade = new javax.swing.JComboBox<>();
        cmb_estado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_cd_fornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_fornecedor = new javax.swing.JTable();
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
        setTitle("Cadastrar Fornecedor");

        btn_limpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_cadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        painel_dados_pessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pesoais:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        lbl_nome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_nome.setText("Nome Completo: ");

        lbl_telefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_telefone.setText("Telefone:");

        lbl_email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_email.setText("E-mail:");

        txt_ddd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txt_numero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txt_email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txt_nome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout painel_dados_pessoaisLayout = new javax.swing.GroupLayout(painel_dados_pessoais);
        painel_dados_pessoais.setLayout(painel_dados_pessoaisLayout);
        painel_dados_pessoaisLayout.setHorizontalGroup(
            painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_telefone)
                            .addComponent(lbl_email)))
                    .addComponent(lbl_nome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                        .addComponent(txt_ddd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txt_numero, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addComponent(txt_email)
                    .addComponent(txt_nome))
                .addContainerGap())
        );
        painel_dados_pessoaisLayout.setVerticalGroup(
            painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefone)
                    .addComponent(txt_ddd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_endereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        lbl_etado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_etado.setText("Estado:");

        lbl_cidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_cidade.setText("Cidade:");

        lbl_endereco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_endereco.setText("Endereço: ");

        txt_endereco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        cmb_cidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cmb_estado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout painel_enderecoLayout = new javax.swing.GroupLayout(painel_endereco);
        painel_endereco.setLayout(painel_enderecoLayout);
        painel_enderecoLayout.setHorizontalGroup(
            painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_cidade)
                    .addComponent(lbl_endereco)
                    .addComponent(lbl_etado))
                .addGap(18, 18, 18)
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmb_cidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_endereco))
                .addContainerGap())
        );
        painel_enderecoLayout.setVerticalGroup(
            painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_etado)
                    .addComponent(cmb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cidade)
                    .addComponent(cmb_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_endereco)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Código do Fornecedor:");

        txt_cd_fornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cd_fornecedorFocusLost(evt);
            }
        });

        tb_fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome", "DDD", "Telefone", "E-mail", "Estado", "Cidade", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_fornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_fornecedor);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(painel_dados_pessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painel_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_cd_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cd_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painel_dados_pessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painel_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // TODO add your handling code here:
        limpar_campos();
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        // TODO add your handling code here:
        int cd_uf = 0;
        int cd_cidade = 0;
        if (Operacao.equals("Incluir")) {
            if (isCamposPreenchidos()) {
                carregaRegFornecedor();
                try {
                    cd_uf = bdestado.BuscaAbrvUF(objRegFornecedor.getEstado_Fornecedor());
                    objRegFornecedor.setCd_uf(cd_uf);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar UF\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    cd_cidade = bdcidade.BuscaNomeCidade(objRegFornecedor.getCidade_Fornecedor());
                    objRegFornecedor.setCd_cidade(cd_cidade);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar Cidade\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    if (bdfornecedor.IncluirFornecedor(objRegFornecedor)) {
                        JOptionPane.showMessageDialog(null, "Fornecedor incluida com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Incluir Fornecedor. Erro de dados", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Incluir Fornecedor\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        CargaListaFornecedor();
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar GRID UF/Cidade\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    Operacao = "";
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
                consiste_campos();
            }
        } else {
            Operacao = "Incluir";
            habilitaEdicao();
        }        
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void txt_cd_fornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cd_fornecedorFocusLost
        // TODO add your handling code here:
        /*if (txt_cd_fornecedor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha Código do Fornecedor para Consultar", "Erro Consulta", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int codigo = Integer.parseInt(txt_cd_fornecedor.getText().trim());

                objRegFornecedor = bdfornecedor.ConsultaCliente(codigo);

                if (objRegFornecedor.getCd_Fornecedor() == 0) {
                    JOptionPane.showMessageDialog(null, "Código não encontrado", "Erro Consultar", JOptionPane.ERROR_MESSAGE);
                }
                MontaTela();

            } catch (Exception ex) {

            }
            // final try 
        }*/
    }//GEN-LAST:event_txt_cd_fornecedorFocusLost

    private void tb_fornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_fornecedorMouseClicked
        // TODO add your handling code here:
        CarregaTabela_TextFileld();
        MontaTela();
    }//GEN-LAST:event_tb_fornecedorMouseClicked

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
        int resp = 0;
        if (FornecedorSelecionado()) {
            resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == 0) {
                try {
                    if (bdfornecedor.ExcluiFornecedor(Integer.parseInt(txt_cd_fornecedor.getText().trim()))) {
                        JOptionPane.showMessageDialog(null, "Fornecedor Excluída com Sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Excluir Fornecedor. Erro Dados.", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Excluir Fornecedor\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        /*
                        CargaListaUF();
                        CargaListaCidade();
                        CargaComboBoxUF();
                        CargaComboBoxCidade();
                         */
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    Operacao = "";
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o Fornecedor a Excluir", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        int cd_uf = 0;
        int cd_cidade = 0;
        if (Operacao.equals("Incluir")) {
            if (isCamposPreenchidos()) {
                carregaRegFornecedor();
                try {
                    cd_uf = bdestado.BuscaAbrvUF(objRegFornecedor.getEstado_Fornecedor());
                    objRegFornecedor.setCd_uf(cd_uf);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar UF\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    cd_cidade = bdcidade.BuscaNomeCidade(objRegFornecedor.getCidade_Fornecedor());
                    objRegFornecedor.setCd_cidade(cd_cidade);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar Cidade\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    if (bdfornecedor.AlterarFornecedor(objRegFornecedor)) {
                        JOptionPane.showMessageDialog(null, "Fornecedor alterado com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Alterar Fornecedor. Erro de dados", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Alterar Fornecedor\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        CargaListaFornecedor();
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar GRID UF/Cidade\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Fr_Cadastro_fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Cadastro_fornecedor().setVisible(true);
            }
        });
    }

    public void limpar_campos() {
        txt_cd_fornecedor.setText(null);
        txt_nome.setText(null);
        txt_email.setText(null);
        cmb_cidade.setSelectedIndex(-1);
        cmb_estado.setSelectedIndex(-1);
        txt_ddd.setText(null);
        txt_numero.setText(null);
        txt_endereco.setText(null);
    }

    private boolean isCamposPreenchidos() {
        boolean saida = false;
        if ((!txt_nome.getText().trim().isEmpty())
                && (!txt_email.getText().trim().isEmpty())
                && (cmb_cidade.getSelectedIndex() != -1)
                && (cmb_estado.getSelectedIndex() != -1)
                && (!txt_ddd.getText().trim().isEmpty())
                && (!txt_numero.getText().trim().isEmpty())
                && (!txt_endereco.getText().trim().isEmpty())) {
            saida = true;
        }
        return saida;
    }

    public void consiste_campos() {
        if (txt_nome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Nome", "Erro Nome", JOptionPane.ERROR_MESSAGE);
        }
        if (txt_email.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o E-mail", "Erro E-mail", JOptionPane.ERROR_MESSAGE);
        }
        if (cmb_cidade.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione a Cidade", "Erro Cidade", JOptionPane.ERROR_MESSAGE);
        }
        if (cmb_estado.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o Estado", "Erro Estado", JOptionPane.ERROR_MESSAGE);
        }
        if (txt_endereco.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Endereço", "Erro Endereço", JOptionPane.ERROR_MESSAGE);
        }
        if (txt_ddd.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o DDD", "Erro DDD", JOptionPane.ERROR_MESSAGE);
        }
        if (txt_numero.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Numero de telefone", "Erro Numero", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consiste_email() {
        if (!objRegFornecedor.isEmailValido_Dominio()) {
            JOptionPane.showMessageDialog(null, "Dominio do Email Inválido", "Erro Email", JOptionPane.ERROR_MESSAGE);
        }

        if (!objRegFornecedor.isEmailValido_Arroba()) {
            JOptionPane.showMessageDialog(null, "Email não possiu @", "Erro Email ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consiste_numericos() {
        try {
            objRegFornecedor.setTel_Fornecedor(Integer.parseInt(txt_numero.getText().trim()));
            objRegFornecedor.setDdd_Fornecedor(Integer.parseInt(txt_ddd.getText().trim()));
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas Números em \n Telefone.\n Erro:" + erro.getMessage(), "Erro: tratamento numéricos ", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void carregaRegFornecedor() {
        objRegFornecedor.setNome_Fornecedor(txt_nome.getText().trim());
        objRegFornecedor.setEmail_Fornecedor(txt_email.getText().trim());
        objRegFornecedor.setEstado_Fornecedor(String.valueOf(cmb_estado.getSelectedItem()));
        objRegFornecedor.setCidade_Fornecedor(String.valueOf(cmb_cidade.getSelectedItem()));
        objRegFornecedor.setEndereco_Fornecedor(txt_endereco.getText().trim());
        consiste_email();
        consiste_numericos();
    }

    private void Desabilita() {
        limpar_campos();
        txt_cd_fornecedor.setEditable(true);
        txt_nome.setEditable(false);
        txt_email.setEditable(false);
        txt_ddd.setEditable(false);
        txt_numero.setEditable(false);
        txt_endereco.setEditable(false);
    }

    private void habilitaConsulta() {
        limpar_campos();
        txt_cd_fornecedor.setEditable(true);
        txt_nome.setEditable(false);
        txt_email.setEditable(false);
        txt_ddd.setEditable(false);
        txt_numero.setEditable(false);
        txt_endereco.setEditable(false);
    }

    private void habilitaEdicao() {
        if (Operacao.equals("Alterar")) {
            txt_cd_fornecedor.setEditable(true);
        } else {
            txt_cd_fornecedor.setEditable(false);
        }
        txt_nome.setEditable(true);
        txt_email.setEditable(true);
        txt_ddd.setEditable(true);
        txt_numero.setEditable(true);
        txt_endereco.setEditable(true);
    }

    private void MontaTela() {
        txt_cd_fornecedor.setText(String.valueOf(objRegFornecedor.getCd_Fornecedor()));
        txt_nome.setText(objRegFornecedor.getNome_Fornecedor());
        txt_email.setText(objRegFornecedor.getEmail_Fornecedor());
        txt_ddd.setText(String.valueOf(objRegFornecedor.getDdd_Fornecedor()));
        txt_numero.setText(String.valueOf(objRegFornecedor.getTel_Fornecedor()));
        cmb_cidade.setSelectedItem(objRegFornecedor.getCidade_Fornecedor());
        cmb_estado.setSelectedItem(objRegFornecedor.getEstado_Fornecedor());
        txt_endereco.setText(objRegFornecedor.getEndereco_Fornecedor());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuItemCidade;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JComboBox<String> cmb_cidade;
    private javax.swing.JComboBox<String> cmb_estado;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel lbl_cidade;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_etado;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JPanel painel_dados_pessoais;
    private javax.swing.JPanel painel_endereco;
    private javax.swing.JTable tb_fornecedor;
    private javax.swing.JTextField txt_cd_fornecedor;
    private javax.swing.JTextField txt_ddd;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    // End of variables declaration//GEN-END:variables

    public void CargaTabela() throws Exception {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tb_fornecedor.getModel();
            modelo.setNumRows(0);  // zera qtde de linhas tabela 
            modelo.setRowCount(0);
            for (Obj_Fornecedor registro : bdfornecedor.CarregarListaFornecedor()) {
                modelo.addRow(new Object[]{registro.getCd_Fornecedor(), registro.getNome_Fornecedor(), registro.getDdd_Fornecedor(), registro.getTel_Fornecedor(), registro.getEmail_Fornecedor(), registro.getEstado_Fornecedor(), registro.getCidade_Fornecedor(), registro.getEndereco_Fornecedor()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Fornecedor\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void CarregaTabela_TextFileld() {
        objRegFornecedor.setCd_Fornecedor((int) tb_fornecedor.getValueAt(tb_fornecedor.getSelectedRow(), 0));
        objRegFornecedor.setNome_Fornecedor((String) tb_fornecedor.getValueAt(tb_fornecedor.getSelectedRow(), 1));
        objRegFornecedor.setDdd_Fornecedor((int) tb_fornecedor.getValueAt(tb_fornecedor.getSelectedRow(), 2));
        objRegFornecedor.setTel_Fornecedor((int) tb_fornecedor.getValueAt(tb_fornecedor.getSelectedRow(), 3));
        objRegFornecedor.setEmail_Fornecedor((String) tb_fornecedor.getValueAt(tb_fornecedor.getSelectedRow(), 4));
        objRegFornecedor.setEstado_Fornecedor((String) tb_fornecedor.getValueAt(tb_fornecedor.getSelectedRow(), 5));
        objRegFornecedor.setCidade_Fornecedor((String) tb_fornecedor.getValueAt(tb_fornecedor.getSelectedRow(), 6));
        objRegFornecedor.setEndereco_Fornecedor((String) tb_fornecedor.getValueAt(tb_fornecedor.getSelectedRow(), 7));
    }

    private void CargaListaFornecedor() throws Exception {
        ListaFornecedor = bdfornecedor.CarregarListaFornecedor();
    }

    private void CargaListaUF() throws Exception {
        ListaUF = bdestado.CarregarListaUF();
    }

    private void CargaListaCidade() throws Exception {
        ListaCidade = bdcidade.CarregarListaCidade();
    }

    private void CargaComboBoxUF() {
        Iterator<Obj_Estado> it = ListaUF.iterator();
        while (it.hasNext()) {
            Obj_Estado reg = it.next();
            String uf = reg.getNome();
            cmb_estado.addItem(uf);
        }
        cmb_estado.setSelectedIndex(-1); // volta indice do combo para não selecioado
    }

    private void CargaComboBoxCidade() {
        Iterator<Obj_Cidade> it = ListaCidade.iterator();
        while (it.hasNext()) {
            Obj_Cidade reg = it.next();
            String cidade = reg.getNome();
            cmb_cidade.addItem(cidade);
        }
        cmb_cidade.setSelectedIndex(-1); // volta indice do combo para não selecioado
    }

    private boolean FornecedorSelecionado() {
        boolean saida = false;
        if (!txt_nome.getText().trim().isEmpty()
                && !txt_cd_fornecedor.getText().trim().isEmpty()) {
            saida = true;
        }
        return saida;
    }
}
