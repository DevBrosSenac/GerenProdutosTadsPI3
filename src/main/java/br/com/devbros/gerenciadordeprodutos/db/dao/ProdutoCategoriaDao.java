package br.com.devbros.gerenciadordeprodutos.db.dao;

import br.com.devbros.gerenciadordeprodutos.db.utils.ConnectionUtils;
import br.com.devbros.gerenciadordeprodutos.model.ProdutoCategoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author pedro.arsouza1
 */
public class ProdutoCategoriaDao {
    
    //consulta de produtos + categoria
    public void consultarProdCat{
    
    PreparedStatement = null;
    Connection conn = null;
    
    String sql = "SELECT P.NOME, C.NOME FROM PRODUTOBD.PRODUTO P"
            + "INNER JOIN PRODUTOBD.PRODUTO_CATEGORIA PC"
            + "ON P.ID = PC.ID_PRODUTO "
            + "INNER JOIN PRODUTOBD.CATEGORIA C"
            + "ON C.ID = PC.ID_CATEGORIA;"
            
            try {
            conn = obterConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, categoria.getNome());
            
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
    
}
    
