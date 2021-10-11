package Banco_de_Dados;

import Dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Objetos.Obj_Fornecedor;
import java.util.ArrayList;

/**
 * @author gabri
 */
public class BD_Fornecedor {

    Conexao Con;
    Obj_Fornecedor Reg_Fornecedor;
    private ArrayList<Obj_Fornecedor> Lista;
    
    public boolean ExcluiFornecedor(int cd) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "DELETE FROM tb_fornecedor WHERE cd_fornecedor = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, cd);
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }
    
    public boolean IncluirFornecedor(Obj_Fornecedor Reg) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String tipo = String.valueOf(Reg.getTel_Fornecedor());
        if (tipo.charAt(0) == '9') {
            tipo = "cel";
        } else {
            tipo = "tel";
        }
        String SQL1 = "INSERT INTO tb_fornecedor (nome, endereco, ds_email_fornecedor, tipo,ddd,numero, cd_cidade_fornecedor) \n"
                + "values(?,?,?,?,?,?,?)";
        PreparedStatement ps1 = Con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, Reg.getNome_Fornecedor());
        ps1.setString(2, Reg.getEndereco_Fornecedor());
        ps1.setString(3, Reg.getEmail_Fornecedor());
        ps1.setString(4, tipo);
        ps1.setInt(5, Reg.getDdd_Fornecedor());
        ps1.setInt(6, Reg.getTel_Fornecedor());
        ps1.setInt(7, Reg.getCd_cidade());
        if (ps1.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }
    
    public boolean AlterarFornecedor(Obj_Fornecedor Reg) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String tipo = String.valueOf(Reg.getTel_Fornecedor());
        if (tipo.charAt(0) == '9') {
            tipo = "cel";
        } else {
            tipo = "tel";
        }
        String SQL1 = "UPDATE tb_fornecedor SET nome = ?, endereco = ?, ds_email_fornecedor = ?, tipo = ?,ddd = ?,numero = ?, cd_cidade_fornecedor = ? WHERE cd_fornecedor = ?";
        PreparedStatement ps1 = Con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, Reg.getNome_Fornecedor());
        ps1.setString(2, Reg.getEndereco_Fornecedor());
        ps1.setString(3, Reg.getEmail_Fornecedor());
        ps1.setString(4, tipo);
        ps1.setInt(5, Reg.getDdd_Fornecedor());
        ps1.setInt(6, Reg.getTel_Fornecedor());
        ps1.setInt(7, Reg.getCd_cidade());
        ps1.setInt(8, Reg.getCd_Fornecedor());
        if (ps1.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }
    
    
    public ArrayList<Obj_Fornecedor> CarregarListaFornecedor() throws Exception {
        Lista = new ArrayList();
        Con = new Conexao();
        String SQL = "SELECT  t1.cd_fornecedor, t1.nome, t1.ds_email_fornecedor, t1.ddd, t1.numero, t1.endereco, t2.ds_cidade, t3.abr_uf, t3.ds_uf"
                + " FROM tb_fornecedor AS t1"
                + " INNER JOIN tb_cidade AS t2 ON t1.cd_cidade_fornecedor = t2.cd_cidade"
                + " INNER JOIN tb_uf AS t3 ON t2.cd_uf = t3.cd_uf";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Reg_Fornecedor = new Obj_Fornecedor();
            Reg_Fornecedor.setCd_Fornecedor(rs.getInt("cd_fornecedor"));
            Reg_Fornecedor.setNome_Fornecedor(rs.getString("nome"));
            Reg_Fornecedor.setEndereco_Fornecedor(rs.getString("endereco"));
            Reg_Fornecedor.setCidade_Fornecedor(rs.getString("ds_cidade"));
            Reg_Fornecedor.setEstado_Fornecedor(rs.getString("abr_uf"));
            Reg_Fornecedor.setEstado_Fornecedor(rs.getString("ds_uf"));
            Reg_Fornecedor.setEmail_Fornecedor(rs.getString("ds_email_fornecedor"));
            Reg_Fornecedor.setDdd_Fornecedor(rs.getInt("ddd"));
            Reg_Fornecedor.setTel_Fornecedor(rs.getInt("numero"));
            Lista.add(Reg_Fornecedor);
        }
        return Lista;
    }
    
    public Obj_Fornecedor ConsultaCliente(int codigo) throws Exception {
        Reg_Fornecedor = new Obj_Fornecedor();
        Con = new Conexao();
        String SQL = "SELECT  t1.cd_fornecedor, t1.nome, t1.ds_email_fornecedor, t1.ddd, t1.numero, t1.endereco, t2.ds_cidade, t3.abr_uf"
                + " FROM tb_fornecedor AS t1"
                + " INNER JOIN tb_cidade AS t2 ON t1.cd_cidade_fornecedor = t2.cd_cidade"
                + " INNER JOIN tb_uf AS t3 ON t2.cd_uf = t3.cd_uf"
                + " WHERE cd_fornecedor = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Reg_Fornecedor.setCd_Fornecedor(rs.getInt("cd_fornecedor"));
            Reg_Fornecedor.setNome_Fornecedor(rs.getString("nome"));
            Reg_Fornecedor.setEndereco_Fornecedor(rs.getString("endereco"));
            Reg_Fornecedor.setCidade_Fornecedor(String.valueOf(rs.getInt("cd_cidade")));
            Reg_Fornecedor.setDdd_Fornecedor(rs.getInt("ddd"));
            Reg_Fornecedor.setTel_Fornecedor(rs.getInt("numero"));
            Reg_Fornecedor.setEmail_Fornecedor(rs.getString("ds_email_fornecedor"));
        }
        return Reg_Fornecedor;
    }
}
