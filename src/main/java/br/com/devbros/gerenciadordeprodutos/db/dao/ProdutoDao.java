package br.com.devbros.gerenciadordeprodutos.db.dao;

import br.com.devbros.gerenciadordeprodutos.db.utils.ConnectionUtils;
import br.com.devbros.gerenciadordeprodutos.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 
 * @author Ramses Souza
 */
public class ProdutoDao extends ConnectionUtils
{
     public static void incluirProduto(Produto produto) 
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
    public void excluirProduto(String nome) {
        Produto produto = new Produto();
        PreparedStatement stmt = null;
        Connection conn = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o ID do produto a ser excluido");
        //JOptionPane.
        int id = input.nextInt();
        String sql = "DELETE FROM PRODUTOBD.PRODUTO WHERE ID ="+id+"";
        
        //Obtem conexão para SQL workbench
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
    
    public static ArrayList<Produto> getProdutos(){
        //Cria uma list para inserir os produtos cadastrados no banco de dados
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        
        //Abrir conexao e deixa ela null
        PreparedStatement stmt = null;
        Connection conn = null;
        
        String sql = "SELECT * FROM PRODUTOBD.PRODUTO";
        
        try 
        {
            conn = obterConexao();
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            
             while(rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("ID"));
                p.setNome(rs.getString("NOME"));
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setprecoDeCompra(rs.getFloat("PRECO_COMPRA"));
                p.setprecoDeVenda(rs.getFloat("PRECO_VENDA"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                //p.setDisponivel(rs.getBoolean("DISPONIVEL"));
                //p.setData_cadastro(rs.getDate("DT_CADASTRO"));
                listaProdutos.add(p);
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println("Não foi possível executar, por conta do MySQL");
            listaProdutos = null;
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
                    listaProdutos = null;
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
        
        return listaProdutos;
    }
}

