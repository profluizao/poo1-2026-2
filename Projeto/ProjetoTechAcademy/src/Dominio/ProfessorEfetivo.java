package Dominio;

// ProfessorEfetivo.java
public class ProfessorEfetivo extends Professor {
    private double trienio;

    public ProfessorEfetivo(int codigo, String nome, String cpf, double salario, double trienio) {
        super(codigo, nome, cpf, salario);
        this.trienio = trienio;
    }

    // Sobrescrita do método calcularBonificacao (Polimorfismo)
    @Override
    public double calcularBonificacao() {
        // Professor Efetivo recebe o bônus padrão (10%) + o valor do triênio
        return super.calcularBonificacao() + this.trienio;
    }
}