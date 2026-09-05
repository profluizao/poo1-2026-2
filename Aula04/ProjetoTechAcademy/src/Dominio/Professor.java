package Dominio;

public class Professor extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double salario) {
        if (salario > 0){
            this.salario = salario;
            return true;
        }
        else
            return false;
    }

    public double calcularBonificacao(){
        return this.salario * 0.10;
    }

    @Override
    public void exibir(){
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Bonificação: " + this.calcularBonificacao());
    }

    public Professor(){}

    public Professor(int id, String nome, String cpf, double salario){
        super(id, nome, cpf);
        this.salario = salario;
    }
    
}
