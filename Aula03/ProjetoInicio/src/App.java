public class App {
    public static void main(String[] args) throws Exception {
        
        //Usando o construtor vazio.
        Pessoa p1 = new Pessoa();
        p1.setCodigo(1);
        p1.setNome("Ana");
        p1.setAltura(1.70f);
        p1.setPeso(45);
        p1.imprimir();

        //Usando o construtor setando o código.
        Pessoa p2 = new Pessoa(2);
        p2.setNome("Beatriz");
        p2.setAltura(1.60f);
        p2.setPeso(55);
        p2.imprimir();

        //Usando o construtor setando o código e o nome.
        Pessoa p3 = new Pessoa(3, "Carlos");
        p3.setAltura(1.65f);
        p3.setPeso(66);
        p3.imprimir();

        //Usando o construtor setando tudo.
        Pessoa p4 = new Pessoa(4, "Diego", 1.80f, 100);
        p4.imprimir();

        Pessoa p5 = new Pessoa(5, "Elaine", 1.72f, 58);
        p5.imprimir();
    }
}
