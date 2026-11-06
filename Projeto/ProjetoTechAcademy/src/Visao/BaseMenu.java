package Visao;

import java.util.Scanner;

public abstract class BaseMenu {
    protected Scanner scan;

    protected int exibirMenuPai(String dominio){
        System.out.println("\n\n");
        System.out.println("----- Menu Principal [" + dominio +"] -----");
        System.out.println("1 - Listar todos");
        System.out.println("2 - Pesquisar Por Código");
        System.out.println("3 - Incluir");
        System.out.println("4 - Alterar");
        System.out.println("5 - Excluir");
        System.out.println("9 - Finalizar");
        System.out.print("Escolha uma opção: ");
        int opcao = this.scan.nextInt();
        this.scan.nextLine();
        return opcao;
    }

    protected void pausar(){
        System.out.println("Clique <ENTER> para continuar...");
        this.scan.nextLine();
    }    
}
