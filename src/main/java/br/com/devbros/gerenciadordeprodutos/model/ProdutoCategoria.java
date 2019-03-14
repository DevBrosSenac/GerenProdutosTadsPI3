/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devbros.gerenciadordeprodutos.model;

/**
 *
 * @author pedro.arsouza1
 */
public class ProdutoCategoria {

    private String nomeProd;
    private String nomeCat;
    
    
    
    public ProdutoCategoria(String nomeProd, String nomeCat) {
        this.nomeProd = nomeProd;
        this.nomeCat = nomeCat;
    }

    public String getNomeProduto() {
        return nomeProd;
    }

    public void setNomeProduto(String nomeProd) {

        this.nomeProd = nomeProd;
    }
    
    public String getNomeCategoria() {
        return nomeCat;
    }
    
    public void setNomeCategoria(String nomeCat) {

        this.nomeCat = nomeCat;
    }
    
}
