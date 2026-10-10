import FakeDB.ColaboradorFakeDB;

import java.util.ArrayList;

import Dominio.Colaborador;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorFakeDB fdb = new ColaboradorFakeDB();
        for(Colaborador item : fdb.getDados()){
            item.exibir();
        }

    }
}
