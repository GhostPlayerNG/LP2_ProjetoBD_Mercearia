package Banco_de_Dados;
import Dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Objetos.Obj_Produto;
import java.util.ArrayList;
/**
 * @author gabri
 */
public class BD_Produto {
    Conexao Con;
    Obj_Produto Reg_Produto;
    private ArrayList<Obj_Produto> Lista;
    
    public boolean IncluirProduto (Obj_Produto Reg) throws Exception{
        boolean saida = false; 
        Con = new Conexao();
        String SQL1 = "INSERT INTO tb_produto (nome_produto, tipo_produto, valor_desconto, valor_unitario, cd_marca) \n" 
                +"values(?,?,?,?,?)";
        PreparedStatement ps1 = Con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, Reg.getDescricao());
        ps1.setString(2, Reg.getTipo());
        ps1.setDouble(3, Reg.getValDesconto());
        ps1.setDouble(4, Reg.getValUnitario());
        ps1.setInt(5, Reg.getCdMarca());
        if (ps1.executeUpdate() > 0) {
            saida=true;
        }
        return saida;
    }
    public boolean AlteraProduto(Obj_Produto Reg) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "UPDATE tb_produto SET nome_produto = ?, tipo_produto = ?, valor_desconto = ?, valor_unitario = ?, cd_marca = ?  WHERE cd_produto = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setString(1, Reg.getDescricao());
        ps.setString(2, Reg.getTipo());
        ps.setDouble(3, Reg.getValDesconto());
        ps.setDouble(4, Reg.getValUnitario());
        ps.setInt(5, Reg.getCdMarca());
        ps.setInt(6, Reg.getCDProduto());
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }

    
    public boolean ExcluiProduto(int cd) throws Exception {
        boolean saida = false;
        Con = new Conexao();
        String SQL = "DELETE FROM tb_produto WHERE cd_produto = ?";
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, cd);
        if (ps.executeUpdate() > 0) {
            saida = true;
        }
        return saida;
    }
    
    public Obj_Produto ConsultaProduto (int codigo) throws Exception{
        Reg_Produto = new Obj_Produto ();
        Con = new Conexao();
        String SQL = "SELECT  t1.cd_produto, t1.nome_produto, t1.tipo_produto, t1.valor_unitario, t1.valor_desconto, t2.nome_marca"
                + " FROM tb_produto AS t1"
                + " INNER JOIN tb_marca AS t2 ON t1.cd_marca = t2.cd_marca" ;
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ps.setInt(1, codigo);
        ResultSet rs =  ps.executeQuery();
        while (rs.next()) {
            Reg_Produto.setCDProduto(rs.getInt("cd_produto"));
            Reg_Produto.setDescricao(rs.getString("nome_produto"));
            Reg_Produto.setTipo(rs.getString("tipo_produto"));
            Reg_Produto.setValDesconto(rs.getFloat("valor_desconto"));
            Reg_Produto.setValUnitario(rs.getFloat("valor_unitario"));
            Reg_Produto.setMarca(rs.getString("nome_marca"));
            Reg_Produto.setMarca(String.valueOf(rs.getInt("cd_marca")));
        }  
        return Reg_Produto;
    }
    
    public ArrayList<Obj_Produto> CarregarListaProduto() throws Exception {
        Lista = new ArrayList();
        Con = new Conexao();
        String SQL = "SELECT  t1.cd_produto, t1.nome_produto, t1.tipo_produto, t1.valor_unitario, t1.valor_desconto, t2.nome_marca"
                + " FROM tb_produto AS t1"
                + " INNER JOIN tb_marca AS t2 ON t1.cd_marca = t2.cd_marca" ;
        PreparedStatement ps = Con.getConexao().prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Reg_Produto = new Obj_Produto();
            Reg_Produto.setCDProduto(rs.getInt("cd_produto"));
            Reg_Produto.setDescricao(rs.getString("nome_produto"));
            Reg_Produto.setMarca(rs.getString("nome_marca"));
            Reg_Produto.setTipo(rs.getString("tipo_produto"));
            Reg_Produto.setValDesconto(rs.getFloat("valor_desconto"));
            Reg_Produto.setValUnitario(rs.getFloat("valor_unitario"));
            Lista.add(Reg_Produto);
        }
        return Lista;
    }
}
