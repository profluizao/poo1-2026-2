import Dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("--- 1. TESTANDO ENCAPSULAMENTO ---");
        Aluno aluno1 = new Aluno("Carlos Silva", "123.456.789-00", "2026001");
        
        // Tentativa de atribuir nota inválida
        aluno1.setNota(11.5); // Deve disparar mensagem de erro
        
        // Atribuindo nota válida
        aluno1.setNota(8.5);
        System.out.println("Nota confirmada do aluno: " + aluno1.getNota());
        aluno1.exibir();

        System.out.println("\n--- 2. TESTANDO HERANÇA E POLIMORFISMO ---");
        Professor prof1 = new Professor("Dra. Ana Costa", "987.654.321-11", 5000.0);
        prof1.exibir();

        ProfessorEfetivo profEfetivo1 = new ProfessorEfetivo("Dr. João Peregrino", "555.444.333-22", 5000.0, 800.0);
        System.out.println("Bonificação Prof. Comum: R$ " + prof1.calcularBonificacao()); // 500.0
        System.out.println("Bonificação Prof. Efetivo: R$ " + profEfetivo1.calcularBonificacao()); // 500.0 + 800.0 = 1300.0

        // System.out.println("\n--- 3. POLIMORFISMO COM COLEÇÃO DE PESSOAS ---");
        // // Uma lista do tipo genérico Pessoa armazena tanto Alunos quanto Professores
        // List<Pessoa> equipeTechAcademy = new ArrayList<>();
        // equipeTechAcademy.add(aluno1);
        // equipeTechAcademy.add(prof1);
        // equipeTechAcademy.add(profEfetivo1);

        // // O mesmo método exibirDados() se comporta de maneira diferente para cada objeto
        // for (Pessoa p : equipeTechAcademy) {
        //     p.exibir();
        // }
    }
}
