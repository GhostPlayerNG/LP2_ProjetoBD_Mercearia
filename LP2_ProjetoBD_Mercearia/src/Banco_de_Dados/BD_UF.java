package Banco_de_Dados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Dao.Conexao;
import Objetos.Obj_Estado;
import java.util.ArrayList;

/**
 * @author gabri
 */
public class BD_UF {
    Conexao Con;

    private Obj_Estado Registro_UF;
    private ArrayList<Obj_Estado> Lista;

     public boolean ExcluiUF (int cd_uf) throws Exception {
        boolean saida=false;
        Con = new Conexao();
        String SQL = "DELETE FROM tb_uf WHERE cd_uf =  ?";        
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);        
        ps.setInt(1, cd_uf);        
        if(ps.executeUpdate() > 0) {
           saida=true; 
        }        
        return saida;
     }
     
    
    public int BuscaAbrvUF (String abr) throws Exception {
        int saida=0;
        Con = new Conexao();
        String SQL = "SELECT cd_uf FROM tb_uf WHERE abr_UF = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, abr);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            saida=rs.getInt("cd_uf");
        }
        return saida;
    }
    
    public boolean InserirUF(Obj_Estado registro) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "INSERT INTO tb_uf (ds_uf, abr_uf) VALUES (?,?)";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNome());
        ps.setString(2, registro.getAbrev());
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }
    
    public boolean AlterarUF(Obj_Estado registro) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "UPDATE tb_uf SET ds_uf = ?, abr_uf = ?  WHERE cd_uf = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, registro.getNome());
        ps.setString(2, registro.getAbrev());
        ps.setInt(3, registro.getcod());
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    public ArrayList<Obj_Estado> CarregarListaUF() throws Exception {
        Lista = new ArrayList();
        Con = new Conexao();
        String SQL = "SELECT  cd_uf,ds_uf,abr_uf FROM tb_uf";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Registro_UF = new Obj_Estado();
            Registro_UF.setcod(rs.getInt("cd_uf"));
            Registro_UF.setNome(rs.getString("ds_uf"));
            Registro_UF.setAbrev(rs.getString("abr_uf"));
            Lista.add(Registro_UF);
        }
        return Lista;
    }
}
