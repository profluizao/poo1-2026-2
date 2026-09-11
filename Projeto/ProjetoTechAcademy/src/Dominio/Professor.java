package Dominio;

// Professor.java
public class Professor extends BasePessoa {
    private double salario;

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    // Método próprio da classe Professor
    public double calcularBonificacao() {
        return this.salario * 0.10; // 10% de bônus padrão
    }

    // Implementação do método abstrato herdado
    @Override
    public void exibir() {
        System.out.println("[PROFESSOR] Nome: " + this.nome);
        System.out.println("| CPF: " + cpf);
        System.out.println("| Salário: R$ " + salario);
        System.out.println("| Bonificação: " + this.calcularBonificacao());
    }
}