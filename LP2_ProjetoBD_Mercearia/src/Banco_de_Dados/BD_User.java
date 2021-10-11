package Banco_de_Dados;

import Dao.Conexao;
import Objetos.Obj_User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author gabri
 */
public class BD_User {

    Conexao Con;
    private Obj_User objUser = new Obj_User();
    private ArrayList<Obj_User> Lista;

    public boolean ExcluiUser(int cd_user) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "DELETE FROM tb_user WHERE cd_user = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, cd_user);
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public boolean InserirUser(Obj_User registro) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "INSERT INTO tb_user (nome_user, senha_user) VALUES (?,?)";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getUser());
        ps.setString(2, registro.getSenha());
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public boolean AlterarUser(Obj_User registro) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "UPDATE tb_user SET nome_user = ?, senha_user = ?  WHERE cd_user = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getUser());
        ps.setString(2, registro.getSenha());
        ps.setInt(3, registro.getCd());
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }
    
    public String BuscaUsuarioSenha(String user) throws Exception {
        String saida = "";
        Con = new Conexao();
        String SQL = "SELECT senha_user FROM tb_user WHERE nome_user = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, user);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            saida=rs.getString("senha_user");
        }
        return saida;
    }

    public ArrayList<Obj_User> CarregarListaUser() throws Exception {
        Lista = new ArrayList();
        Con = new Conexao();
        String SQL = "SELECT cd_user,nome_user,senha_user FROM tb_user";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            objUser = new Obj_User();
            objUser.setCd(rs.getInt("cd_user"));
            objUser.setUser(rs.getString("nome_user"));
            objUser.setSenha(rs.getString("senha_user"));
            Lista.add(objUser);
        }
        return Lista;
    }

}
