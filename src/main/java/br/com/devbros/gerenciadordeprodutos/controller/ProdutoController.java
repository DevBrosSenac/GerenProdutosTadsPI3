/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devbros.gerenciadordeprodutos.controller;

import br.com.devbros.gerenciadordeprodutos.db.dao.ProdutoDao;
import br.com.devbros.gerenciadordeprodutos.model.Produto;
import java.sql.Date;

/**
 *
 * @author priscyla-poliveira
 */
public class ProdutoController {
    
    static ProdutoDao pd = new ProdutoDao();
    
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
    
    public static void Consultar(){

    }
    
    public static void Excluir(int id){

    }
}
