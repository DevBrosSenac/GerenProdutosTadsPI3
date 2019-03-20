/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devbros.gerenciadordeprodutos.controller;

import br.com.devbros.gerenciadordeprodutos.model.ProdutoCategoria;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.devbros.gerenciadordeprodutos.db.dao.ProdutoCategoriaDao;

/**
 *
 * @author gabriela.vsmarques
 */
public class ProdutoCategoriaController {
    
   /* public static ArrayList<String[]> consultarProdCat(String Nome, String Categoria) throws SQLException{
        
            ProdutoCategoria ProdutoC = new ProdutoCategoria();
            ProdutoC.setNomeProduto(Nome);
            ProdutoC.setNomeCategoria(Nome);
            
        
            ArrayList<ProdutoCategoria> retorno = ProdutoCategoriaDao.consultarProdCat(ProdutoC);
            ArrayList<String[]> linhasProdutosCategoria = new ArrayList<>();
        
            for (int i = 0; i < retorno.size(); i++) {
                linhasProdutosCategoria.add(new String[]{retorno.get(i).getNomeProduto(),
                    retorno.get(i).getNomeCategoria(),
            }
            return linhasProdutosCategoria; 

    }
    */
    
    
}
