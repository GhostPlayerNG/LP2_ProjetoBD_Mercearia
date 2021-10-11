package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author gabri
 */
public class Conexao {

    private Connection conexao;

    public Conexao() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=BD_ProjetoLP2";
        conexao = DriverManager.getConnection(url, "Sa", "senha");
    }

    public Connection getConexao() {
        return conexao;
    }
}
