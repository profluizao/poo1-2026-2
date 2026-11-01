package Servico;

import java.util.ArrayList;

import DAO.BaseGenericaDAO;

public abstract class BaseGenericaSRV<T> {
    protected BaseGenericaDAO<T> dao;
    
    public abstract ArrayList<T> listar();
    public abstract T buscar(int codigo);
    public abstract T criar(T novo);
    public abstract T alterar(T alterado);
    public abstract T excluirPorID(int codigo);
}
