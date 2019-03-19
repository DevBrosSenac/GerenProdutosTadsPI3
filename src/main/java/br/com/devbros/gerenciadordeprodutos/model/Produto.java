package br.com.devbros.gerenciadordeprodutos.model;

/**
 * 
 * @Ramses Souza
 */
import java.sql.Date;

public class Produto 
{
    private int id;
    private String nome;
    private String descricao;
    private float precoDeCompra;
    private float precoDeVenda;
    private int quantidade;
    private boolean disponivel;
    private Date data_cadastro;

    public Produto() {
    }

    public Produto(String nome, String descricao, float precoDeVenda, 
            float precoDeCompra, int quantidade,boolean disponivel, 
            Date data_cadastro) 
    {
        this.nome = nome;
        this.descricao = descricao;
        this.precoDeVenda = precoDeVenda;
        this.precoDeCompra = precoDeCompra;
        this.quantidade = quantidade;
        this.disponivel = disponivel;
        this.data_cadastro = data_cadastro;
    }

    public Produto(String nome, String descricao, float precoDeVenda, 
            float precoDeCompra, int quantidade, boolean disponivel) {
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getprecoDeVenda() {
        return precoDeVenda;
    }

    public void setprecoDeVenda(float precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public float getprecoDeCompra() {
        return precoDeCompra;
    }

    public void setprecoDeCompra(float precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }
  
}
