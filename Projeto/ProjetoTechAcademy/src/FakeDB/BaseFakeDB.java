package FakeDB;

import java.util.ArrayList;

import Dominio.BasePessoa;

public abstract class BaseFakeDB {
    protected ArrayList<BasePessoa> dados;

    public ArrayList<BasePessoa> getDados(){
        return this.dados;
    }

    protected abstract void autoPreencher();

    public BaseFakeDB(){
        
    }
}
