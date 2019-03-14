package br.com.devbros.gerenciadordeprodutos.db.dao;

import br.com.devbros.gerenciadordeprodutos.db.utils.ConnectionUtils;
import br.com.devbros.gerenciadordeprodutos.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
            stmt.setDate(7, produto.getData_cadastro());

            // 2) Executar SQL
            stmt.executeUpdate();
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

    public void alterarProduto(Produto produto) {
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
            stmt.setDate(7, produto.getData_cadastro());

            // 2) Executar SQL
            stmt.executeUpdate();
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
    public void excluirProduto(Produto produto) {
        
        PreparedStatement stmt = null;
        Connection conn = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o ID do produto a ser excluido");
        //JOptionPane.
        int id = input.nextInt();
        String sql = "DELETE FROM PRODUTOBD.PRODUTO WHERE ID ="+id+"";
        
        //Obten conexão para SQL workbench
        try 
        {
            conn = obterConexao();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, produto.getId());
            // 2) Executar SQL
            stmt.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            System.out.println("Não foi possível executar, por conta do MySQL");
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Não foi possível executar, por conta de erro no programa.");
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

