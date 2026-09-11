package Dominio;

public abstract class BasePessoa {
    protected String nome;
    protected String cpf;

    public abstract void exibir();

    public BasePessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}