package model;

public class garcom {
    private String nome;
    private String codigo;
    private String telefone;
    private String email;

    // Construtor, getters e setters
    public garcom(String nome, String codigo, String telefone, String email) {
        this.nome = nome;
        this.codigo = codigo;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getCodigo() { return codigo; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
}