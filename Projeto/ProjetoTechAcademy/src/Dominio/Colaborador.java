package Dominio;

public class Colaborador extends BasePessoa{
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibir(){
        System.out.println("[COLABORADOR] Codigo: " + this.codigo);
        System.out.print("Nome: " + this.nome);
        System.out.print(" | CPF: " + this.cpf);
        System.out.print(" | Cargo: " + this.cargo);
    }

    public Colaborador(){}

    public Colaborador(int codigo,
        String nome,
        String cpf,
        String cargo){
        super(codigo, nome, cpf);
        this.cargo = cargo;
    }

}
