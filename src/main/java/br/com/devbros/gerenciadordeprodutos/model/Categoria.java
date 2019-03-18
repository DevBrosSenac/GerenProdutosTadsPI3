package br.com.devbros.gerenciadordeprodutos.model;

/**
 * 
 * Ramses Souza
 */
public class Categoria 
{
    private String nomeCategoria; 
    private int id;
    
    
    public int getIdCategoria() {
        return id;
    }

    public void setIdCategoria(int id) {

        this.id = id;
    }
    
    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {

        this.nomeCategoria = nomeCategoria;
    }
}
