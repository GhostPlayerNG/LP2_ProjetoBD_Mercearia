package Banco_de_Dados;

import Dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Objetos.Obj_Cliente;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author gabri
 */
public class BD_Cliente {

    Conexao Con;
    Obj_Cliente Reg_Cliente;
    private ArrayList<Obj_Cliente> Lista;

    public boolean ExcluiCliente(int cd) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "DELETE FROM tb_cliente WHERE cd_cliente = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, cd);
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public boolean IncluirCliente(Obj_Cliente Reg) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String tipo = "";
        if (String.valueOf(Reg.getTel_Cliente()).charAt(0) == 9) {
            tipo = "cel";
        } else {
            tipo = "tel";
        }
        String SQL1 = "INSERT INTO tb_cliente (nome,dt_nascimento,sexo,endereco,ds_email_cliente, tipo, ddd, numero, cd_cidade_cliente) \n"
                + "values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps1 = Con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, Reg.getNome_Cliente());
        ps1.setString(2, Reg.getData_Nasc());
        ps1.setString(3, Reg.getSexo_Cliente());
        ps1.setString(4, Reg.getEndereco_Cliente());
        ps1.setString(5, Reg.getEmail_Cliente());
        ps1.setString(6, tipo);
        ps1.setInt(7, Reg.getDdd_Cliente());
        ps1.setInt(8, Reg.getTel_Cliente());
        ps1.setInt(9, Reg.get_cd_cidade());
        if (ps1.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }
    
    public boolean AlterarCliente(Obj_Cliente Reg) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String tipo = "";
        if (String.valueOf(Reg.getTel_Cliente()).charAt(0) == 9) {
            tipo = "cel";
        } else {
            tipo = "tel";
        }
        String SQL1 = "UPDATE tb_cliente SET nome = ?,dt_nascimento = ?,sexo = ?,endereco = ?,ds_email_cliente = ?, tipo = ?, ddd = ?, numero = ?, cd_cidade_cliente = ? WHERE cd_cliente = ?";
        PreparedStatement ps1 = Con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, Reg.getNome_Cliente());
        ps1.setString(2, Reg.getData_Nasc());
        ps1.setString(3, Reg.getSexo_Cliente());
        ps1.setString(4, Reg.getEndereco_Cliente());
        ps1.setString(5, Reg.getEmail_Cliente());
        ps1.setString(6, tipo);
        ps1.setInt(7, Reg.getDdd_Cliente());
        ps1.setInt(8, Reg.getTel_Cliente());
        ps1.setInt(9, Reg.get_cd_cidade());
        ps1.setInt(10, Reg.getCd_Cliente());
        if (ps1.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public ArrayList<Obj_Cliente> CarregarListaCliente() throws Exception {
        Lista = new ArrayList();
        Con = new Conexao();
        Date data;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        String SQL = "SELECT  t1.cd_cliente, t1.nome, t1.sexo, t1.dt_nascimento, t1.dt_nascimento, t1.ds_email_cliente, t1.ddd, t1.numero, t1.endereco, t2.ds_cidade, t3.abr_uf"
                + " FROM tb_cliente AS t1"
                + " INNER JOIN tb_cidade AS t2 ON t1.cd_cidade_cliente = t2.cd_cidade"
                + " INNER JOIN tb_uf AS t3 ON t2.cd_uf = t3.cd_uf";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Reg_Cliente = new Obj_Cliente();
            Reg_Cliente.setCd_Cliente(rs.getInt("cd_cliente"));
            Reg_Cliente.setNome_Cliente(rs.getString("nome"));
            data = rs.getDate("dt_nascimento");
            Reg_Cliente.setData_Nasc(formato.format(data));
            Reg_Cliente.setSexo_Cliente(rs.getString("sexo"));
            Reg_Cliente.setEndereco_Cliente(rs.getString("endereco"));
            Reg_Cliente.setCidade_Cliente(rs.getString("ds_cidade"));
            Reg_Cliente.setEstado_Cliente(rs.getString("abr_uf"));
            Reg_Cliente.setEmail_Cliente(rs.getString("ds_email_cliente"));
            Reg_Cliente.setDdd_Cliente(rs.getInt("ddd"));
            Reg_Cliente.setTel_Cliente(rs.getInt("numero"));
            System.out.println("Fim CarregarListaCliente()\n");
            Lista.add(Reg_Cliente);
        }
        return Lista;
    }

    public Obj_Cliente ConsultaCliente(int codigo) throws Exception {
        Reg_Cliente = new Obj_Cliente();
        Con = new Conexao();
        String SQL = "SELECT  t1.cd_cliente, t1.nome, t1.sexo, t1.dt_nascimento, t1.dt_nascimento, t1.ds_email_cliente, t1.ddd, t1.numero, t1.endereco, t2.ds_cidade, t3.abr_uf"
                + " FROM tb_cliente AS t1"
                + " INNER JOIN tb_cidade AS t2 ON t1.cd_cidade_cliente = t2.cd_cidade"
                + " INNER JOIN tb_uf AS t3 ON t2.cd_uf = t3.cd_uf"
                + "WHERE cd_cliente = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Reg_Cliente.setCd_Cliente(rs.getInt("cd_cliente"));
            Reg_Cliente.setNome_Cliente(rs.getString("nome"));
            Reg_Cliente.setData_Nasc(String.valueOf(rs.getDate("dt_nascimento")));
            Reg_Cliente.setEndereco_Cliente(rs.getString("endereco"));
            Reg_Cliente.setCd_Cliente(rs.getInt("cd_cidade_cliente"));
            Reg_Cliente.setCidade_Cliente(String.valueOf(rs.getInt("ds_cidade")));
            Reg_Cliente.setSexo_Cliente(rs.getString("sexo"));
            Reg_Cliente.setDdd_Cliente(rs.getInt("ddd"));
            Reg_Cliente.setTel_Cliente(rs.getInt("numero"));
            Reg_Cliente.setEmail_Cliente(rs.getString("ds_email_cliente"));
        }
        return Reg_Cliente;
    }
}
