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
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Timestamp;

/**
 * 
 * @author Ramses Souza
 */
public class ProdutoDao /*extends ConnectionUtils*/
{
    
    private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
    private static final String SERVIDOR = "localhost";
    private static final String BASEDADOS = "PRODUTOBD";
    private static final String LOGIN = "root";
    private static final String SENHA = "";
    private static String url = "";
    private static Connection conexao;
    
    
     public static void incluirProduto(Produto produto) 
    {
        
        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3306/PRODUTOBD?useTimezone=true&serverTimezone=UTC";
            conexao = DriverManager.getConnection(url,"root","");
    
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO "
                    + "PRODUTOBD.PRODUTO(NOME, DESCRICAO, PRECO_COMPRA, PRECO_VENDA, "
                    + "QUANTIDADE, DISPONIVEL, DT_CADASTRO)VALUES(?, ?, ?, ?, ?, ?, ?);");
            
            comando.setString(1, produto.getNome());
            comando.setString(2, produto.getDescricao());
            comando.setFloat(3, produto.getprecoDeCompra());
            comando.setFloat(4, produto.getprecoDeVenda());
            comando.setInt(5, produto.getQuantidade());
            comando.setBoolean(6, produto.isDisponivel());
            java.sql.Timestamp data = new java.sql.Timestamp(produto.getData_cadastro().getTime());
            comando.setTimestamp(7, data);
        
            int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }
            } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            try {
                conexao.close();
            } catch (Exception ex) {
                System.out.println("Não deu certo, e finalizou a conexão");
                retorno = false;
            }
        }
  
    }
     
    public void alterarProduto(Produto produto) {
        
        boolean retorno = false;

        try {
            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3307/PRODUTOBD?useTimezone=true&serverTimezone=UTC";
            conexao = DriverManager.getConnection(url,"root","");
    
            PreparedStatement comando = conexao.prepareStatement("UPDATE PRODUTOBD.PRODUTO SET NOME = ?, DESCRICAO = ?, PRECO_COMPRA = ?, PRECO_VENDA = ?, QUANTIDADE = ?, DISPONIVEL = ? WHERE NOME = ?;");
            
            comando.setString(1, produto.getNome());
            comando.setString(2, produto.getDescricao());
            comando.setFloat(3, produto.getprecoDeCompra());
            comando.setFloat(4, produto.getprecoDeVenda());
            comando.setInt(5, produto.getQuantidade());
            comando.setBoolean(6, true);
            comando.setString(7, produto.getNome());

           int linhasAfetadas = comando.executeUpdate();
            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }
            } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        } finally {
            try {
                conexao.close();
            } catch (Exception ex) {
                System.out.println("Não deu certo, e finalizou a conexão");
                retorno = false;
            }
        }
    } 
     
     
     
     
     

        
        /*
        //Abrir conexao e deixa ela null
        PreparedStatement stmt = null;
        Connection conn = null;
        
        //Preparar string sql
        String sql = "INSERT INTO PRODUTOBD.PRODUTO (NOME, DESCRICAO, PRECO_COMPRA, PRECO_VENDA, QUANTIDADE, DISPONIVEL, DT_CADASTRO)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?)";
        
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
        
        }*/
    

    /*public void alterarProduto(Produto produto) {
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
    */
     
    public static ArrayList<Produto> getProdutos(){
        
     ArrayList<Produto> listaProdutos = new ArrayList<>();
     
        try {

            Class.forName(DRIVER);
            url = "jdbc:mysql://localhost:3307/PRODUTOBD?useTimezone=true&serverTimezone=UTC";
            conexao = DriverManager.getConnection(url, "root", "");
            Statement comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("SELECT * FROM produtos;");
            while (rs.next()) {
                Produto p = new Produto();
                p.setNome(rs.getString("NOME"));
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setprecoDeCompra(rs.getFloat("PRECO_COMPRA"));
                p.setprecoDeVenda(rs.getFloat("PRECO_VENDA"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                p.setDisponivel(rs.getBoolean("DISPONIVEL"));
                p.setData_cadastro(rs.getDate("DT_CADASTRO"));
                listaProdutos.add(p);
            }

        } catch (ClassNotFoundException ex) {
            listaProdutos = null;
        } catch (SQLException ex) {
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
        
        
        
        
        
        
        
        
        /*
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
                p.setNome(rs.getString("NOME"));
                p.setDescricao(rs.getString("DESCRICAO"));
                p.setprecoDeCompra(rs.getFloat("PRECO_COMPRA"));
                p.setprecoDeVenda(rs.getFloat("PRECO_VENDA"));
                p.setQuantidade(rs.getInt("QUANTIDADE"));
                p.setDisponivel(rs.getBoolean("DISPONIVEL"));
                p.setData_cadastro(rs.getDate("DT_CADASTRO"));
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
    }*/

}

