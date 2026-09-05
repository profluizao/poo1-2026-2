package Dominio;

public class Aluno extends Pessoa{
    private String matricula;
    private double nota;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getNota() {
        return nota;
    }
    public boolean setNota(double nota) {
        if ((nota >= 0) && (nota <= 10)){
            this.nota = nota;
            return true;
        }
        else
            return false;
    }

    @Override
    public void exibir(){
        System.out.println("CPF: " + this.cpf);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota: " + this.nota);
    }

    public Aluno(){}

    public Aluno(int id, String nome, 
        String cpf,
        String matricula){
            super(id, nome, cpf);
            this.matricula = matricula;
            this.nota = 0.0;
        }
}
