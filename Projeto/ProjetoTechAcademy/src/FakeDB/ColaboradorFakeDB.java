package FakeDB;

import java.util.ArrayList;

import Dominio.Colaborador;

public class ColaboradorFakeDB {
    private ArrayList<Colaborador> dados;

    public ArrayList<Colaborador> getDados(){
        return this.dados;
    }

    private void autoPreencher(){
        this.dados.add(new Colaborador(101, "Mateus Silva", "12301", "Estagiário"));
        this.dados.add(new Colaborador(102, "Marcos Oliveira", "12302", "Atendente"));
        this.dados.add(new Colaborador(103, "Pedro Santos", "12303", "Caixa"));
        this.dados.add(new Colaborador(104, "Paulo Gomes", "12304", "Repositor"));
        this.dados.add(new Colaborador(105, "Lucas Souza", "12305", "Motorista"));
    }

    public ColaboradorFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
