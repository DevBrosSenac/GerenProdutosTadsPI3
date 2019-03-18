package br.com.devbros.gerenciadordeprodutos.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Ramses Souza
 */
public class ConnectionUtils 
{
    public static Connection obterConexao() throws ClassNotFoundException, 
            SQLException 
    {
        Connection conn = null;
        
        // 1) Declarar o driver JDBC de acordo com o Banco de dados usado
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection
            (
                "jdbc:mysql://localhost:3306/produtobd?useTimezone=true&serverTimezone=UTC",
                "root",
                ""
            );
        return conn;
    }
}
