/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devbros.gerenciadordeprodutos.controller;

import br.com.devbros.gerenciadordeprodutos.db.dao.ProdutoCategoriaDao;
import br.com.devbros.gerenciadordeprodutos.db.dao.ProdutoDao;
import br.com.devbros.gerenciadordeprodutos.model.Categoria;
import br.com.devbros.gerenciadordeprodutos.model.Produto;
import br.com.devbros.gerenciadordeprodutos.model.ProdutoCategoria;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author priscyla-poliveira
 */
public class ProdutoController  {
    
    static ProdutoDao pd = new ProdutoDao();
    static ProdutoCategoriaDao pc = new ProdutoCategoriaDao();
    
    public static void Salvar(String nome, String descricao, float precoDeVenda, 
                              float precoDeCompra, int quantidade, boolean disponivel, 
                              Date data_cadastro){

        Produto p = new Produto(nome, descricao, precoDeVenda, precoDeCompra, quantidade, disponivel,
                            data_cadastro);

        pd.incluirProduto(p);
    }
    
    public static void Alterar(String nome, String descricao, float precoDeVenda, 
                               float precoDeCompra, int quantidade, boolean disponivel){
        Produto p = new Produto(nome, descricao, precoDeVenda, precoDeCompra, quantidade, disponivel);
        pd.alterarProduto(p);
    }
    
    public static void Consultar(String nomeProd, String nomeCat){
        ProdutoCategoria pC = new ProdutoCategoria(nomeProd,nomeCat);
        pc.consultarProdCat(pC);
    }
    
    public static void Excluir(String nome){
        pd.excluirProduto(nome);
    }
    
    public static ArrayList<String[]> getProdutos(){
        ArrayList<Produto> produtos = ProdutoDao.getProdutos();
        ArrayList<String[]> listaProdutos = new ArrayList<>();
        
        for(int i=0; i < produtos.size(); i++){
            listaProdutos.add(new String[]{String.valueOf(produtos.get(i).getId())
                                  , produtos.get(i).getNome()
                                  , produtos.get(i).getDescricao()
                                  , String.valueOf(produtos.get(i).getprecoDeCompra())
                                  , String.valueOf(produtos.get(i).getprecoDeVenda())
                                  , String.valueOf(produtos.get(i).getQuantidade())
                                  , String.valueOf(produtos.get(i).getData_cadastro())});
        }
        
        return listaProdutos;   
    }
}
