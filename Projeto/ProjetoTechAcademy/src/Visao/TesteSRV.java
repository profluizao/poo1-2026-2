package Visao;

import Dominio.Colaborador;
import Servico.ColaboradorSRV;

public class TesteSRV {
    
    private Colaborador colab;

    private ColaboradorSRV srv;

    public void executar(){
        this.listar();
        this.criar();
        this.listar();
        this.alterar();
        this.listar();
        this.excluir();
        this.listar();
    }

    private void listar(){
        System.out.println("\n\n\n\n\n");
        System.out.println("***** LISTANDO TUDO *****");
        for(Colaborador item : srv.listar()){
            item.exibir();
        }
    }

    private void criar(){
        System.out.println("\n\n\n\n\n");
        System.out.println("***** CRIANDO REGISTRO *****");
        this.colab = new Colaborador(101, "Lula", "12301", "Presidente");
        srv.criar(this.colab);
        this.colab.exibir();
    }

    private void alterar(){
        System.out.println("\n\n\n\n\n");
        System.out.println("***** ALTERANDO REGISTRO *****");
        this.colab.setNome("Bolsonaro");
        this.colab = this.srv.alterar(this.colab);
        this.colab.exibir();
    }

    private void excluir(){
        System.out.println("\n\n\n\n\n");
        System.out.println("***** EXCLUINDO REGISTRO *****");
        this.colab = srv.excluirPorID(colab.getCodigo());
        this.colab.exibir();
    }

    public TesteSRV(){
        this.srv = new ColaboradorSRV();
    }
    
}
