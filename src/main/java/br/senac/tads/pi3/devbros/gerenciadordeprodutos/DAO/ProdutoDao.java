package br.senac.tads.pi3.devbros.gerenciadordeprodutos.DAO;

import br.senac.tads.pi3.devbros.db.utils.ConnectionUtils;
import br.senac.tads.pi3.devbros.gerenciadordeprodutos.Produto.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * 
 * @author Ramses Souza
 */
public class ProdutoDao extends ConnectionUtils
{
     public void incluirProduto(Produto produto) 
    {
                
        //Abrir conexao e deixa ela null
        PreparedStatement stmt = null;
        Connection conn = null;
        
        //Preparar string sql
        String sql = "INSERT INTO PRODUTOBD.PRODUTO (NOME, DESCRICAO, "
                + "PRECO_COMPRA, PRECO_VENDA, QUANTIDADE, DISPONIVEL, DT_CADASTRO)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        //Obten conexão para SQL workbench
        try 
        {
            conn = obterConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setFloat(3, produto.getprecoDeCompra());
            stmt.setFloat(4, produto.getprecoDeVenda());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setBoolean(6, true);
            //data/hora (timestamp) atual
            java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            stmt.setDate(7, date);

            // 2) Executar SQL
            stmt.executeUpdate();
            System.out.println("Contato cadastrado com sucesso");

        } 
        catch (SQLException ex) 
        {
            System.out.println("Não foi possível executar.");
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Não foi possível executar.");
        } finally 
        {
            if (stmt != null) 
            {
                try 
                {
                    stmt.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro ao fechar stmt.");
                }
            }
            if (conn != null) 
            {
                try 
                {
                    conn.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro ao fechar conn.");
                }
            }
        }
    }
}
