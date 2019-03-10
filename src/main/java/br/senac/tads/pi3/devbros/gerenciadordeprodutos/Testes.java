/*
* Classe principal do projeto.
*/

package br.senac.tads.pi3.devbros.gerenciadordeprodutos;

import br.senac.tads.pi3.devbros.gerenciadordeprodutos.DAO.ProdutoDao;
import br.senac.tads.pi3.devbros.gerenciadordeprodutos.Produto.Produto;
import java.util.Calendar;

/**
 * 
 * @author Ramses Souza
 */
public class Testes 
{
    public static void main(String[] args) 
    {
        java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        Produto produto1 = new Produto("xbox one", "descricao", 150.5f, 150.3f, 1, true, date);

        ProdutoDao produtoDao = new  ProdutoDao();
        
        produtoDao.incluirProduto(produto1);
    }
}
