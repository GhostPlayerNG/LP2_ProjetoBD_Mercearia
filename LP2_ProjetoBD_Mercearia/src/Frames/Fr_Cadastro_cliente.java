package Frames;

import Banco_de_Dados.BD_Cidade;
import Banco_de_Dados.BD_Cliente;
import Banco_de_Dados.BD_UF;
import Objetos.Obj_Cidade;
import Objetos.Obj_Cliente;
import Objetos.Obj_Estado;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author gabri
 */
public class Fr_Cadastro_cliente extends javax.swing.JFrame {

    private String Operacao;
    private Obj_Cliente objRegCliente = new Obj_Cliente();
    private BD_Cliente bdcliente = new BD_Cliente();
    private ArrayList<Obj_Cliente> ListaCliente = new ArrayList();
    //private Obj_Estado objRegEstado = new Obj_Estado();
    private BD_UF bdestado = new BD_UF();
    private ArrayList<Obj_Estado> ListaUF = new ArrayList();
    //private Obj_Cidade RegistroCidade = new Obj_Cidade();
    private BD_Cidade bdcidade = new BD_Cidade();
    private ArrayList<Obj_Cidade> ListaCidade = new ArrayList();

    public Fr_Cadastro_cliente() {
        initComponents();
        try {
            CargaTabela();
            CargaListaCliente();
            CargaListaUF();
            CargaListaCidade();
            CargaComboBoxUF();
            CargaComboBoxCidade();
            Desabilita();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Cliente\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        Operacao = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_endereco = new javax.swing.JPanel();
        lbl_etado = new javax.swing.JLabel();
        lbl_cidade = new javax.swing.JLabel();
        lbl_endereco = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        cmb_cidade = new javax.swing.JComboBox<>();
        cmb_estado = new javax.swing.JComboBox<>();
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
        lbl_sexo = new javax.swing.JLabel();
        rbtn_M = new javax.swing.JRadioButton();
        rbtn_F = new javax.swing.JRadioButton();
        lbl_dt_nasc = new javax.swing.JLabel();
        txt_data_nasc = new javax.swing.JTextField();
        lbl_cd_cliente = new javax.swing.JLabel();
        txt_cd_cliente = new javax.swing.JTextField();
        btn_excluir = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cliente = new javax.swing.JTable();
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
        setTitle("Cadastrar Cliente");
        setResizable(false);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_endereco)
                    .addComponent(cmb_cidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmb_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painel_enderecoLayout.setVerticalGroup(
            painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_enderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_etado)
                    .addComponent(cmb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cidade)
                    .addComponent(cmb_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_enderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_endereco)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        painel_dados_pessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

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

        lbl_sexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_sexo.setText("Sexo:");

        rbtn_M.setText("Masculino");
        rbtn_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_MActionPerformed(evt);
            }
        });

        rbtn_F.setText("Feminino");
        rbtn_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_FActionPerformed(evt);
            }
        });

        lbl_dt_nasc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_dt_nasc.setText("Data Nascimento:");

        txt_data_nasc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout painel_dados_pessoaisLayout = new javax.swing.GroupLayout(painel_dados_pessoais);
        painel_dados_pessoais.setLayout(painel_dados_pessoaisLayout);
        painel_dados_pessoaisLayout.setHorizontalGroup(
            painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_dt_nasc)
                    .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_telefone)
                            .addComponent(lbl_nome))
                        .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_email)
                                .addComponent(lbl_sexo)))))
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(rbtn_M)
                        .addGap(43, 43, 43)
                        .addComponent(rbtn_F))
                    .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_dados_pessoaisLayout.createSequentialGroup()
                                .addComponent(txt_ddd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dados_pessoaisLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_data_nasc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(txt_email, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        painel_dados_pessoaisLayout.setVerticalGroup(
            painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ddd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_M)
                    .addComponent(rbtn_F)
                    .addComponent(lbl_sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dt_nasc)
                    .addComponent(txt_data_nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbl_cd_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_cd_cliente.setText("Código do Cliente: ");

        txt_cd_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_cd_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cd_clienteFocusLost(evt);
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

        tb_cliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tb_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Nome Completo", "DDD", "Telefone", "Sexo", "E-mail", "Data Nasc", "Estado", "Cidade", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_clienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_cliente);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(painel_endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_cd_cliente)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cd_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addComponent(painel_dados_pessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painel_dados_pessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cd_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cd_cliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painel_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void rbtn_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_MActionPerformed
        // TODO add your handling code here:
        rbtn_F.setSelected(false);
    }//GEN-LAST:event_rbtn_MActionPerformed

    private void rbtn_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_FActionPerformed
        // TODO add your handling code here:
        rbtn_M.setSelected(false);
    }//GEN-LAST:event_rbtn_FActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        // TODO add your handling code here:
        int cd_uf = 0;
        int cd_cidade = 0;
        if (Operacao.equals("Incluir")) {
            if (isCamposPreenchidos() == true) {
                carregaRegCliente();
                try {
                    cd_uf = bdestado.BuscaAbrvUF(objRegCliente.getEstado_Cliente());
                    objRegCliente.set_cd_uf(cd_uf);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar UF\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    cd_cidade = bdcidade.BuscaNomeCidade(objRegCliente.getCidade_Cliente());
                    objRegCliente.set_cd_cidade(cd_cidade);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar Cidade\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    if (bdcliente.IncluirCliente(objRegCliente)) {
                        CargaListaCliente();
                        JOptionPane.showMessageDialog(null, "Cliente incluida com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Incluir Cliente. Erro de dados", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Incluir Cliente\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        CargaListaCliente();
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar GRID \n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
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

    private void txt_cd_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cd_clienteFocusLost
        // TODO add your handling code here:
        if (txt_cd_cliente.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha Código do Cliente para Consultar", "Erro Consulta", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int codigo = Integer.parseInt(txt_cd_cliente.getText().trim());
                objRegCliente = bdcliente.ConsultaCliente(codigo);
                if (objRegCliente.getCd_Cliente() == 0) {
                    JOptionPane.showMessageDialog(null, "Código não encontrado", "Erro Consultar", JOptionPane.ERROR_MESSAGE);
                }
                MontaTela();
            } catch (Exception ex) {
            }
            // final try 
        }
    }//GEN-LAST:event_txt_cd_clienteFocusLost

    private void tb_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clienteMouseClicked
        // TODO add your handling code here:
        CarregaTabela_TextFileld();
        MontaTela();
    }//GEN-LAST:event_tb_clienteMouseClicked

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
        int resp = 0;
        if (ClienteSelecionado()) {
            resp = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == 0) {
                try {
                    if (bdcliente.ExcluiCliente(Integer.parseInt(txt_cd_cliente.getText().trim()))) {
                        JOptionPane.showMessageDialog(null, "Cliente Excluída com Sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Excluir Cliente. Erro Dados.", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Excluir Cliente\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        /*CargaListaUF();
                        CargaListaCidade();
                        CargaComboBoxUF();
                        CargaComboBoxCidade();*/
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro Carga Grid/Combobox \n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    Operacao = "";
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o Cliente a Excluir", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        // TODO add your handling code here:
        int cd_uf = 0;
        int cd_cidade = 0;
        if (Operacao.equals("Alterar")) {
            if (isCamposPreenchidos() == true) {
                carregaRegCliente();
                try {
                    cd_uf = bdestado.BuscaAbrvUF(objRegCliente.getEstado_Cliente());
                    objRegCliente.set_cd_uf(cd_uf);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar UF\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    cd_cidade = bdcidade.BuscaNomeCidade(objRegCliente.getCidade_Cliente());
                    objRegCliente.set_cd_cidade(cd_cidade);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar Cidade\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    if (bdcliente.AlterarCliente(objRegCliente)) {
                        CargaListaCliente();
                        JOptionPane.showMessageDialog(null, "Cliente alterada com sucesso.", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Alterar Cliente. Erro de dados", "ERRO BD", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao Alterar Cliente\n" + ex.getMessage(), "ERRO BD", JOptionPane.ERROR_MESSAGE);
                } finally {
                    try {
                        CargaTabela();
                        CargaListaCliente();
                        Desabilita();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar GRID \n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Fr_Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Cadastro_cliente().setVisible(true);
            }
        });
    }

    private void limpar_campos() {
        txt_cd_cliente.setText(null);
        txt_nome.setText(null);
        txt_email.setText(null);
        cmb_cidade.setSelectedIndex(-1);
        cmb_estado.setSelectedIndex(-1);
        txt_ddd.setText(null);
        txt_numero.setText(null);
        txt_endereco.setText(null);
        rbtn_M.setSelected(false);
        rbtn_F.setSelected(false);
        txt_data_nasc.setText(null);
    }

    private boolean isCamposPreenchidos() {
        boolean saida = false;
        if ((!txt_nome.getText().trim().isEmpty())
                && (!txt_email.getText().trim().isEmpty())
                && (cmb_cidade.getSelectedIndex() != -1)
                && (cmb_estado.getSelectedIndex() != -1)
                && (!txt_ddd.getText().trim().isEmpty())
                && (!txt_numero.getText().trim().isEmpty())
                && (!txt_endereco.getText().trim().isEmpty())
                && (!txt_data_nasc.getText().trim().isEmpty())) {
            if ((rbtn_M.isSelected()) | (rbtn_F.isSelected())) {
                saida = true;
            }
        }
        return saida;
    }

    private void consiste_campos() {
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
        if (txt_data_nasc.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha a Data de Nascimento", "Erro Data de Nascimento", JOptionPane.ERROR_MESSAGE);
        }
        if (txt_ddd.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o DDD", "Erro DDD", JOptionPane.ERROR_MESSAGE);
        }
        if (txt_numero.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o Numero de telefone", "Erro Numero", JOptionPane.ERROR_MESSAGE);
        }
        if ((!rbtn_M.isSelected()) && (!rbtn_F.isSelected())) {
            JOptionPane.showMessageDialog(null, "Selecione o Sexo", "Erro Sexo", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void consiste_email() {        
        if (!objRegCliente.isEmailValido_Dominio()) {
            JOptionPane.showMessageDialog(null, "Dominio do Email Inválido", "Erro Email", JOptionPane.ERROR_MESSAGE);
        }
        if (!objRegCliente.isEmailValido_Arroba()) {
            JOptionPane.showMessageDialog(null, "Email não possiu @", "Erro Email ", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void consiste_numericos() {
        try {
            objRegCliente.setTel_Cliente(Integer.parseInt(txt_numero.getText()));
            objRegCliente.setDdd_Cliente(Integer.parseInt(txt_ddd.getText()));
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite apenas Números em \n Telefone.\n Erro:" + erro.getMessage(), "Erro: tratamento numéricos ", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void carregaRegCliente() {
        objRegCliente.setNome_Cliente(txt_nome.getText().trim());
        objRegCliente.setEmail_Cliente(txt_email.getText().trim());
        objRegCliente.setData_Nasc(txt_data_nasc.getText().trim());
        if (rbtn_M.isSelected()) {
            objRegCliente.setSexo_Cliente("Masculino");
        } else if (rbtn_F.isSelected()) {
            objRegCliente.setSexo_Cliente("Feminino");
        }
        objRegCliente.setEstado_Cliente(String.valueOf(cmb_estado.getSelectedItem()));
        objRegCliente.setCidade_Cliente(String.valueOf(cmb_cidade.getSelectedItem()));
        objRegCliente.setEndereco_Cliente(txt_endereco.getText().trim());
        consiste_email();
        consiste_numericos();
        System.out.println("Fim CarregaRegCliente \n");
        
    }

    private void Desabilita() {
        limpar_campos();
        txt_cd_cliente.setEditable(false);
        txt_nome.setEditable(false);
        txt_email.setEditable(false);
        txt_ddd.setEditable(false);
        txt_numero.setEditable(false);
        txt_endereco.setEditable(false);
        txt_data_nasc.setEditable(false);
    }

    private void habilitaConsulta() {
        limpar_campos();
        txt_cd_cliente.setEditable(true);
        txt_nome.setEditable(false);
        txt_email.setEditable(false);
        txt_ddd.setEditable(false);
        txt_numero.setEditable(false);
        txt_endereco.setEditable(false);
        txt_data_nasc.setEditable(false);
        rbtn_M.setEnabled(false);
        rbtn_F.setEnabled(false);
    }

    private void habilitaEdicao() {
        if (Operacao.equals("Alterar")) {
            txt_cd_cliente.setEditable(true);
        } else {
            txt_cd_cliente.setEditable(false);
        }
        txt_nome.setEditable(true);
        txt_email.setEditable(true);
        txt_ddd.setEditable(true);
        txt_numero.setEditable(true);
        txt_endereco.setEditable(true);
        txt_data_nasc.setEditable(true);
        rbtn_M.setEnabled(true);
        rbtn_F.setEnabled(true);
    }

    private void MontaTela() {
        txt_cd_cliente.setText(String.valueOf(objRegCliente.getCd_Cliente()));
        txt_nome.setText(objRegCliente.getNome_Cliente());
        txt_email.setText(objRegCliente.getEmail_Cliente());
        txt_data_nasc.setText(objRegCliente.getData_Nasc());
        txt_ddd.setText(String.valueOf(objRegCliente.getDdd_Cliente()));
        txt_numero.setText(String.valueOf(objRegCliente.getTel_Cliente()));
        cmb_cidade.setSelectedItem(objRegCliente.getCidade_Cliente());
        cmb_estado.setSelectedItem(objRegCliente.getEstado_Cliente());
        txt_endereco.setText(objRegCliente.getEndereco_Cliente());
        if (objRegCliente.getSexo_Cliente().equals("Masculino")) {
            rbtn_M.setSelected(true);
            rbtn_F.setSelected(false);
        } else {
            rbtn_M.setSelected(false);
            rbtn_F.setSelected(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuItemCidade;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JComboBox<String> cmb_cidade;
    private javax.swing.JComboBox<String> cmb_estado;
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
    private javax.swing.JLabel lbl_cd_cliente;
    private javax.swing.JLabel lbl_cidade;
    private javax.swing.JLabel lbl_dt_nasc;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_etado;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JPanel painel_dados_pessoais;
    private javax.swing.JPanel painel_endereco;
    private javax.swing.JRadioButton rbtn_F;
    private javax.swing.JRadioButton rbtn_M;
    private javax.swing.JTable tb_cliente;
    private javax.swing.JTextField txt_cd_cliente;
    private javax.swing.JTextField txt_data_nasc;
    private javax.swing.JTextField txt_ddd;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    // End of variables declaration//GEN-END:variables

    private void CargaTabela() throws Exception {
        try {
            DefaultTableModel modelo = (DefaultTableModel) tb_cliente.getModel();
            modelo.setNumRows(0);  // zera qtde de linhas tabela 
            modelo.setRowCount(0);
            for (Obj_Cliente registro : bdcliente.CarregarListaCliente()) {
                modelo.addRow(new Object[]{registro.getCd_Cliente(), registro.getNome_Cliente(), registro.getDdd_Cliente(), registro.getTel_Cliente(), registro.getSexo_Cliente(), registro.getEmail_Cliente(), registro.getData_Nasc(), registro.getEstado_Cliente(), registro.getCidade_Cliente(), registro.getEndereco_Cliente()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar GRID Cliente\n" + ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void CarregaTabela_TextFileld() {
        objRegCliente.setCd_Cliente((int) tb_cliente.getValueAt(tb_cliente.getSelectedRow(), 0));
        objRegCliente.setNome_Cliente((String) tb_cliente.getValueAt(tb_cliente.getSelectedRow(), 1));
        objRegCliente.setDdd_Cliente((int) tb_cliente.getValueAt(tb_cliente.getSelectedRow(), 2));
        objRegCliente.setTel_Cliente((int) tb_cliente.getValueAt(tb_cliente.getSelectedRow(), 3));
        objRegCliente.setSexo_Cliente((String) tb_cliente.getValueAt(tb_cliente.getSelectedRow(), 4));
        objRegCliente.setEmail_Cliente((String) tb_cliente.getValueAt(tb_cliente.getSelectedRow(), 5));
        objRegCliente.setData_Nasc((String) tb_cliente.getValueAt(tb_cliente.getSelectedRow(), 6));
        objRegCliente.setEstado_Cliente((String) tb_cliente.getValueAt(tb_cliente.getSelectedRow(), 7));
        objRegCliente.setCidade_Cliente((String) tb_cliente.getValueAt(tb_cliente.getSelectedRow(), 8));
        objRegCliente.setEndereco_Cliente((String) tb_cliente.getValueAt(tb_cliente.getSelectedRow(), 9));
    }

    private void CargaListaCliente() throws Exception {
        ListaCliente = bdcliente.CarregarListaCliente();
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
            String uf = reg.getAbrev();
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

    private boolean ClienteSelecionado() {
        boolean saida = false;
        if (!txt_nome.getText().trim().isEmpty()) {
            saida = true;
        }
        return saida;
    }
}
