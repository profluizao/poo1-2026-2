package Dominio;

public abstract class BasePessoa extends BaseIdentificador {
    protected String nome;
    protected String cpf;

    public abstract void exibir();

    public BasePessoa(){}

    public BasePessoa(int codigo, String nome, String cpf) {
        super(codigo);
        this.nome = nome;
        this.cpf = cpf;
    }
}