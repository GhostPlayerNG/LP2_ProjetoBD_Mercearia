package Banco_de_Dados;

import Dao.Conexao;
import Objetos.Obj_Marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author gabri
 */
public class BD_Marca {

    Conexao Con;

    private Obj_Marca Registro_Marca;
    private ArrayList<Obj_Marca> Lista;

    public boolean ExcluiMarca(int cd_marca) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "DELETE FROM tb_marca WHERE cd_marca =  ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, cd_marca);
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public boolean AlteraMarca(Obj_Marca Reg) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "UPDATE tb_marca SET nome_marca = ? WHERE cd_marca = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, Reg.getNome());
        ps.setInt(2, Reg.getCd());
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public int BuscaNomeMarca(String nome) throws Exception {
        int saida = 0;
        Con = new Conexao();
        String SQL = "SELECT cd_marca FROM tb_marca WHERE nome_marca = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, nome);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            saida = rs.getInt("cd_marca");
        }
        return saida;
    }

    public boolean InserirMarca(Obj_Marca registro) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "INSERT INTO tb_marca (nome_marca) VALUES (?)";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNome());
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public ArrayList<Obj_Marca> CarregarListaMarca() throws Exception {
        Lista = new ArrayList();
        Con = new Conexao();
        String SQL = "SELECT cd_marca,nome_marca FROM tb_marca";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Registro_Marca = new Obj_Marca();
            Registro_Marca.setCd(rs.getInt("cd_marca"));
            Registro_Marca.setNome(rs.getString("nome_marca"));
            Lista.add(Registro_Marca);
        }
        return Lista;
    }
}
