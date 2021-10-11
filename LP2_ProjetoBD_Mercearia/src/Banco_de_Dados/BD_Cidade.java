package Banco_de_Dados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Dao.Conexao;
import Objetos.Obj_Cidade;
import java.util.ArrayList;

/**
 * @author gabri
 */
public class BD_Cidade {

    Conexao Con;

    private Obj_Cidade Registro_Cidade;
    private ArrayList<Obj_Cidade> Lista;

    public boolean ExcluiCidade(int cd) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "DELETE FROM tb_cidade WHERE cd_cidade = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, cd);
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public boolean InserirCidade(Obj_Cidade registro) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "INSERT INTO tb_cidade (ds_cidade, abr_cidade, cd_uf) VALUES (?,?,?)";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNome());
        ps.setString(2, registro.getAbrev());
        ps.setInt(3, registro.getCod_uf());
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public boolean AlterarCidade(Obj_Cidade registro) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "UPDATE tb_cidade SET ds_cidade = ?, abr_cidade = ?, cd_uf = ? WHERE cd_cidade = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNome());
        ps.setString(2, registro.getAbrev());
        ps.setInt(3, registro.getCod_uf());
        ps.setInt(4, registro.getcod());
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public int BuscaNomeCidade(String nome) throws Exception {
        int saida = 0;
        Con = new Conexao();
        String SQL = "SELECT cd_cidade FROM tb_cidade WHERE ds_cidade = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, nome);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            saida = rs.getInt("cd_cidade");
        }
        return saida;
    }

    public ArrayList<Obj_Cidade> CarregarListaCidade() throws Exception {
        Lista = new ArrayList();
        Con = new Conexao();
        String SQL = "SELECT  t1.cd_cidade, t1.ds_cidade, t1.abr_cidade, t2.abr_uf"
                + " FROM tb_cidade AS t1"
                + " INNER JOIN tb_uf AS t2 ON t1.cd_uf = t2.cd_uf";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Registro_Cidade = new Obj_Cidade();
            Registro_Cidade.setcod(rs.getInt("cd_cidade"));
            Registro_Cidade.setNome(rs.getString("ds_cidade"));
            Registro_Cidade.setAbrev(rs.getString("abr_cidade"));
            Registro_Cidade.setFk_abrv(rs.getString("abr_uf"));
            Lista.add(Registro_Cidade);
        }
        return Lista;
    }
}
