package Visao;

import DAO.*;
import Dominio.*;

public class TesteDAO {
    
    private Colaborador colab;

    private ColaboradorDAO dao;

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
        for(Colaborador item : dao.readAll()){
            item.exibir();
        }
    }

    private void criar(){
        System.out.println("\n\n\n\n\n");
        System.out.println("***** CRIANDO REGISTRO *****");
        this.colab = new Colaborador(101, "Lula", "12301", "Presidente");
        dao.create(this.colab);
        this.colab.exibir();
    }

    private void alterar(){
        System.out.println("\n\n\n\n\n");
        System.out.println("***** ALTERANDO REGISTRO *****");
        this.colab.setNome("Bolsonaro");
        this.colab = this.dao.update(this.colab);
        this.colab.exibir();
    }

    private void excluir(){
        System.out.println("\n\n\n\n\n");
        System.out.println("***** EXCLUINDO REGISTRO *****");
        this.colab = dao.delete(colab);
        this.colab.exibir();
    }

    public TesteDAO(){
        this.dao = new ColaboradorDAO();
    }
}
