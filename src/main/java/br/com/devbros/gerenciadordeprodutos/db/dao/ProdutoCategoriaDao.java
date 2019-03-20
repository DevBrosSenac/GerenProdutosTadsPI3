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
public class ProdutoCategoriaDao extends ConnectionUtils{
    
    //consulta de produtos + categoria
    public void consultarProdCat(ProdutoCategoria prodCat){
        
       /* 
        public static ArrayList<Produto> pesquisarProdutoVendas(Produto p) throws SQLException {

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://" + "localhost:3306" + "/pihappy";
            conexao = DriverManager.getConnection(url, "root", "");
            PreparedStatement comando = conexao.prepareStatement("SELECT * FROM produtos WHERE codigoProduto = ?;");
            comando.setString(1, p.getCodigoProduto() + "%");

            ResultSet rs = comando.executeQuery();
            
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setCodigoProduto(rs.getString("codigoProduto"));
                produto.setDescricaoProduto(rs.getString("descricaoProduto"));
                produto.setCategoriaProduto(rs.getString("categoriaProduto"));
                produto.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                produto.setValorUni(rs.getDouble("valorUni"));
                listaProdutos.add(produto);
            }
            

        } catch (ClassNotFoundException | SQLException ex) {
            listaProdutos = null;
        } finally {
            try {
                conexao.close();
            } catch (SQLException ex) {
                listaProdutos = null;
            }
        }

        return listaProdutos;
    }    
        */
    
    /*PreparedStatement stmt = null;
    Connection conn = null;
    
    String sql = "SELECT P.NOME, C.NOME FROM PRODUTOBD.PRODUTO P"
            + "INNER JOIN PRODUTOBD.PRODUTO_CATEGORIA PC"
            + "ON P.ID = PC.ID_PRODUTO "
            + "INNER JOIN PRODUTOBD.CATEGORIA C"
            + "ON C.ID = PC.ID_CATEGORIA;";
            
            try {
            conn = obterConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, prodCat.getNomeProduto());
            //Dando erro pq a model Categoria ainda n está pronta
            stmt.setString(2, prodCat.getNomeCategoria());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {

            System.out.println("Não foi possível executar. Falha no MySQL!");
        } catch (ClassNotFoundException ex) {

            System.out.println("Não foi possível executar. Falha no programa!");
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
} */   
    
}
}
    

