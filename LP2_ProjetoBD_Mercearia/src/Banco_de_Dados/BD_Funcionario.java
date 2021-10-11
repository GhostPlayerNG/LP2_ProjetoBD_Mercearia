package Banco_de_Dados;

import Dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Objetos.Obj_Funcionario;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author gabri
 */
public class BD_Funcionario {

    private Conexao Con;
    private Obj_Funcionario Reg_Funcionario;
    private ArrayList<Obj_Funcionario> Lista;

    public boolean ExcluiFunc(int cd) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "DELETE FROM tb_funcionario WHERE cd_func = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, cd);
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public boolean IncluirFuncionario(Obj_Funcionario Reg) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String tipo = String.valueOf(Reg.getTel_Func());
        if (tipo.charAt(0) == '9') {
            tipo = "cel";
        } else {
            tipo = "tel";
        }
        String SQL1 = "INSERT INTO tb_funcionario (nome,dt_nascimento,dt_adm,endereco,tipo,ddd,numero,ds_email_func,sexo,cd_cidade_func) \n"
                + "values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps1 = Con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, Reg.getNome_Usuario());
        ps1.setString(2, Reg.getData_Nasc());
        ps1.setString(3, Reg.getData_adm());
        ps1.setString(4, Reg.getEndereco_Func());
        ps1.setString(5, tipo);
        ps1.setInt(6, Reg.getDdd_Func());
        ps1.setInt(7, Reg.getTel_Func());
        ps1.setString(8, Reg.getEmail_Func());
        ps1.setString(9, Reg.getSexo_Func());
        ps1.setInt(10, Reg.getCd_cidade());
        if (ps1.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }
    
    public boolean AlterarFuncionario(Obj_Funcionario Reg) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String tipo = String.valueOf(Reg.getTel_Func());
        if (tipo.charAt(0) == '9') {
            tipo = "cel";
        } else {
            tipo = "tel";
        }
        String SQL1 = "UPDATE tb_funcionario SET nome = ?,dt_nascimento = ?,dt_adm = ?,endereco = ?,tipo = ?,ddd = ?,numero = ?,ds_email_func = ?,sexo = ?,cd_cidade_func = ? WHERE cd_func = ?";
        PreparedStatement ps1 = Con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, Reg.getNome_Usuario());
        ps1.setString(2, Reg.getData_Nasc());
        ps1.setString(3, Reg.getData_adm());
        ps1.setString(4, Reg.getEndereco_Func());
        ps1.setString(5, tipo);
        ps1.setInt(6, Reg.getDdd_Func());
        ps1.setInt(7, Reg.getTel_Func());
        ps1.setString(8, Reg.getEmail_Func());
        ps1.setString(9, Reg.getSexo_Func());
        ps1.setInt(10, Reg.getCd_cidade());
        ps1.setInt(11, Reg.getCd_Usuario());
        if (ps1.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public ArrayList<Obj_Funcionario> CarregarListaFuncionario() throws Exception {
        Lista = new ArrayList();
        Con = new Conexao();
        Date data;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        String SQL = "SELECT  t1.cd_func, t1.nome,t1.sexo, t1.endereco, t1.ds_email_func, t1.ddd, t1.numero, t1.dt_nascimento, t1.dt_adm, t2.ds_cidade, t3.abr_uf"
                + " FROM tb_funcionario AS t1"
                + " INNER JOIN tb_cidade AS t2 ON t1.cd_cidade_func = t2.cd_cidade"
                + " INNER JOIN tb_uf AS t3 ON t2.cd_uf = t3.cd_uf";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Reg_Funcionario = new Obj_Funcionario();
            Reg_Funcionario.setCd_Usuario(rs.getInt("cd_func"));
            Reg_Funcionario.setNome_Usuario(rs.getString("nome"));
            Reg_Funcionario.setSexo_Func(rs.getString("sexo"));
            Reg_Funcionario.setEndereco_Func(rs.getString("endereco"));
            Reg_Funcionario.setCidade_Func(rs.getString("ds_cidade"));
            Reg_Funcionario.setEstado_Func(rs.getString("abr_uf"));
            Reg_Funcionario.setEmail_Func(rs.getString("ds_email_func"));
            Reg_Funcionario.setDdd_Func(rs.getInt("ddd"));            
            Reg_Funcionario.setTel_Func(rs.getInt("numero"));
            //Reg_Funcionario.setData_Nasc(rs.getString("dt_nascimento"));
            //Reg_Funcionario.setData_adm(rs.getString("dt_adm"));
            data = rs.getDate("dt_nascimento");
            Reg_Funcionario.setData_Nasc(formato.format(data));
            data = rs.getDate("dt_adm");
            Reg_Funcionario.setData_adm(formato.format(data));
            Lista.add(Reg_Funcionario);
        }
        return Lista;
    }

    public Obj_Funcionario ConsultaFuncionario(int codigo) throws Exception {
        Reg_Funcionario = new Obj_Funcionario();
        Con = new Conexao();
        Date data;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        String SQL = "SELECT  t1.cd_func, t1.nome,t1.sexo, t1.endereco, t1.ds_email_func, t1.ddd, t1.numero, t1.dt_nascimento, t1.dt_adm, t2.ds_cidade, t3.abr_uf"
                + " FROM tb_funcionario AS t1"
                + " INNER JOIN tb_cidade AS t2 ON t1.cd_cidade_func = t2.cd_cidade"
                + " INNER JOIN tb_uf AS t3 ON t2.cd_uf = t3.cd_uf"
                + " WHERE cd_func = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Reg_Funcionario.setCd_Usuario(rs.getInt("cd_func"));
            Reg_Funcionario.setNome_Usuario(rs.getString("nome"));
            Reg_Funcionario.setSexo_Func(rs.getString("sexo"));
            Reg_Funcionario.setEndereco_Func(rs.getString("endereco"));
            Reg_Funcionario.setCd_cidade(rs.getInt("cd_cidade"));
            Reg_Funcionario.setCidade_Func(rs.getString("ds_cidade"));
            Reg_Funcionario.setEstado_Func(rs.getString("abr_uf"));
            Reg_Funcionario.setDdd_Func(rs.getInt("ddd"));
            Reg_Funcionario.setTel_Func(rs.getInt("numero"));
            Reg_Funcionario.setEmail_Func(rs.getString("ds_email_func"));
            data = rs.getDate("dt_nascimento");
            Reg_Funcionario.setData_Nasc(formato.format(data));
            data = rs.getDate("dt_adm");
            Reg_Funcionario.setData_adm(formato.format(data));
        }
        return Reg_Funcionario;
    }
}
