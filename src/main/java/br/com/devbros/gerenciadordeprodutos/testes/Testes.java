package br.com.devbros.gerenciadordeprodutos.testes;

import br.com.devbros.gerenciadordeprodutos.db.dao.ProdutoDao;
import br.com.devbros.gerenciadordeprodutos.model.Produto;
import java.util.Calendar;

/**
 * 
 * @Ramses Souza
 */
public class Testes 
{
     public static void main(String[] args) 
    {
        //Pegando horário atual
        java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        
        //Criando um novo produto, instanciando um produto da classe Produto
        Produto produto1 = new Produto("xbox one", "descricao", 150.5f, 150.3f, 1, true, date);

        //Instanciando um ProdutoDao para realizar um teste de inserção
        ProdutoDao produtoDao = new  ProdutoDao();
        
        //Teste de inserção
        produtoDao.incluirProduto(produto1);
        
        System.out.println("Hello World!");
    }
}
