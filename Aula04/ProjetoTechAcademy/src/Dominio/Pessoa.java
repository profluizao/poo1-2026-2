package Dominio;

public abstract class Pessoa extends Identificador{

    protected String nome;

    protected String cpf;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String apelido){
        this.nome = apelido;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String documento){
        this.cpf = documento;
    }

    public abstract void exibir();

    public Pessoa(){

    }

    public Pessoa(int id, String apelido, String documento){
        super(id);
        this.nome = apelido;
        this.cpf = documento;
    }
}