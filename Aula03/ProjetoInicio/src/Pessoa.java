public class Pessoa {
    private int codigo;
    private String nome;
    private float altura;
    private float peso;

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int valor){
        this.codigo = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Pessoa(){

    }

    public Pessoa(int valor){
        this.codigo = valor;
    }

    public Pessoa(int valor, String alcunha){
        this.codigo = valor;
        this.nome = alcunha;
    }

    public Pessoa(int codigo, String nome, float altura, float peso){
        this.codigo = codigo;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }
    
    public void imprimir(){
        System.out.println("Codigo =" + this.codigo);
        System.out.println("Nome = " + this.nome);
        System.out.println("Altura = " + this.altura);
        System.out.println("Peso = " + this.peso);
    }
}
