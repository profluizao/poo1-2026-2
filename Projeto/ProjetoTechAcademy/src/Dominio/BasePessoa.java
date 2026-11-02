package Dominio;

public abstract class BasePessoa extends BaseIdentificador {
    protected String nome;
    protected String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public abstract void exibir();

    public BasePessoa(){}

    public BasePessoa(int codigo, String nome, String cpf) {
        super(codigo);
        this.nome = nome;
        this.cpf = cpf;
    }

}