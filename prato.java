package model;

public class prato {
    private String nome;
    private String descricao;
    private double preco;

    // Construtor, getters e setters
    public prato(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }
}