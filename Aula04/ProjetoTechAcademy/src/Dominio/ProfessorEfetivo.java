package Dominio;

public class ProfessorEfetivo extends Professor {
    private double trienio;

    public double getTrienio() {
        return trienio;
    }

    public void setTrienio(double trienio) {
        this.trienio = trienio;
    }

    @Override
    public double calcularBonificacao(){
        return super.calcularBonificacao() + this.trienio;
    }

    public ProfessorEfetivo(){}

    public ProfessorEfetivo(int id, String nome, String cpf, double salario, double trienio){
        super(id, nome, cpf, salario);
        this.trienio = trienio;
    }
}
