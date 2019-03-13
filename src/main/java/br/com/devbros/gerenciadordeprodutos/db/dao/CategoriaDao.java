package br.com.devbros.gerenciadordeprodutos.db.dao;

import br.com.devbros.gerenciadordeprodutos.db.utils.ConnectionUtils;
import br.com.devbros.gerenciadordeprodutos.model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pedro.arsouza1
 */
public class CategoriaDao {

    
        public void exibirCategoria{
    
    PreparedStatement stmt = null;
        Connection conn = null;

        String sql = "SELECT * FROM PRODUTOBD.CATEGORIA"
                + "ORDER BY CATEGORIA.ID";

        try {
            conn = obterConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getId());

            stmt.executeUpdate();
        } catch (SQLException ex) {

            System.out.println("Não foi possível executar.");
        } catch (ClassNotFoundException ex) {

            System.out.println("Não foi possível executar.");
        } finally {

            if (stmt != null) {

                try {

                    stmt.close();
                } catch (SQLException ex) {

                    System.out.println("Erro ao fechar stmt.");
                }
            }
            if (conn != null) {

                try {

                    conn.close();
                } catch (SQLException ex) {

                    System.out.println("Erro ao fechar conn.");
                }
            }

        }
}    
