package Dominio;

// Aluno.java
public class Aluno extends BasePessoa {
    private String matricula;
    private double nota;

    // Construtor chamando o construtor da superclasse (super)
    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
        this.nota = 0.0; // Nota inicial padrão
    }

    // Getters e Setters com validação (Encapsulamento)
    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            this.nota = nota;
        } else {
            System.out.println("ERRO: Nota inválida! A nota deve estar entre 0.0 e 10.0.");
        }
    }

    // Implementação do método abstrato herdado
    @Override
    public void exibir() {
        System.out.println("[ALUNO] Nome: " + nome);
        System.out.println(" | CPF: " + cpf);
        System.out.println(" | Matrícula: " + matricula);
        System.out.println(" | Nota: " + nota);
    }
}