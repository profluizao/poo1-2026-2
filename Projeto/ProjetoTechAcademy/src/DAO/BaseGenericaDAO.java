package DAO;

import java.util.ArrayList;

import FakeDB.BaseGenericaFakeDB;

public abstract class BaseGenericaDAO<T> {
    protected BaseGenericaFakeDB<T> fonteDados;
    
    protected ArrayList<T> repositorio;

    public abstract T create(T novo);

    public ArrayList<T> readAll(){
        return this.repositorio;
    }
    
    public abstract T readOne(int codigo);
    
    public abstract T update(T alterado);

    public abstract T deletePorID(int codigo);

    public abstract T delete(T apagado);

}
