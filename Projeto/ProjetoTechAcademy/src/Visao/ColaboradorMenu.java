package Visao;

import java.util.Scanner;

import Dominio.Colaborador;
import Servico.ColaboradorSRV;

public class ColaboradorMenu {
    private ColaboradorSRV servico;
    private Scanner scan;
    private Colaborador colabSelecionado;

    public void iniciar(){
        this.exibirMenuPrincipal();
    }

    private void exibirMenuPrincipal(){
        this.scan = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 9){
            System.out.println("\n\n");
            System.out.println("----- Menu Principal [COLABORADOR] -----");
            System.out.println("1 - Listar todos");
            System.out.println("2 - Pesquisar Por Código");
            System.out.println("3 - Incluir");
            System.out.println("4 - Alterar");
            System.out.println("5 - Excluir");
            System.out.println("9 - Finalizar");
            System.out.print("Escolha uma opção: ");
            opcao = this.scan.nextInt();
            this.scan.nextLine();
            switch (opcao) {
                case 1:
                    this.listarTodos();
                    break;
                case 2:
                    this.pesquisarPorCodigo();
                    break;
                case 3:
                    this.incluir();
                    break;
                case 4:
                    this.alterar();
                    break;
                case 5:
                    this.excluir();
                    break;
                case 9:
                    System.out.println("TCHAU");
                    break;
                default:
                    break;
            }
        }        
    }

    private void listarTodos(){
        System.out.println("\n\n");
        System.out.println("***** LISTAR TODOS *****");
        for (Colaborador item : this.servico.listar()) {
            item.exibir();
        }        
    }

    private void pesquisarPorCodigo(){
        System.out.println("\n\n");
        System.out.println("***** PESQUISAR POR CÓDIGO *****");
        System.out.print("Informe o código: ");
        int codigo = this.scan.nextInt();
        this.scan.nextLine();
        this.colabSelecionado = this.servico.buscar(codigo);
        this.colabSelecionado.exibir();
    }

    private void incluir(){
        System.out.println("\n\n");
        System.out.println("***** INCLUIR *****");
        System.out.print("Informe o nome: ");
        String nome = this.scan.nextLine();
        System.out.print("Informe o CPF: ");
        String cpf = this.scan.nextLine();
        System.out.print("Informe o cargo: ");
        String cargo = this.scan.nextLine();
        Colaborador novo = new Colaborador(0, nome, cpf, cargo);
        novo = this.servico.criar(novo);
        novo.exibir();
    }

    private void alterar(){
        System.out.println("\n\n");
        System.out.println("***** ALTERAR *****");
        this.pesquisarPorCodigo();
        int escolha = 0;
        while(escolha != 9){
            System.out.println("##### CAMPOS DISPONÍVEIS #####");
            System.out.println("1 - Nome");
            System.out.println("2 - CPF");
            System.out.println("3 - Cargo");
            System.out.println("9 - Salvar");
            System.out.print("Escolha uma opção para alterar:");
            escolha = this.scan.nextInt();
            this.scan.nextLine();
            String nome, cpf, cargo;
            switch (escolha) {
                case 1:
                    System.out.print("Nome: ");
                    nome = this.scan.nextLine();
                    this.colabSelecionado.setNome(nome);
                    break;
                case 2:
                    System.out.print("CPF: ");
                    cpf = this.scan.nextLine();
                    this.colabSelecionado.setCpf(cpf);
                    break;
                case 3:
                    System.out.print("Cargo: ");
                    cargo = this.scan.nextLine();
                    this.colabSelecionado.setCargo(cargo);
                    break;
                case 9:
                    this.colabSelecionado = 
                        this.servico.alterar(this.colabSelecionado);
                    this.colabSelecionado.exibir();
                    break;
                default:
                    break;
            }
        }
    }

    private void excluir(){
        System.out.println("\n\n");
        System.out.println("***** EXCLUIR *****");
        this.pesquisarPorCodigo();
        int codigo = this.colabSelecionado.getCodigo();
        this.colabSelecionado = this.servico.excluirPorID(codigo);
        this.colabSelecionado.exibir();
    }

    public ColaboradorMenu(){
        this.servico = new ColaboradorSRV();
    }
}
