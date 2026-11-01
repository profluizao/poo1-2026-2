package Servico;

import java.util.ArrayList;

import DAO.ColaboradorDAO;
import Dominio.Colaborador;

public class ColaboradorSRV extends BaseGenericaSRV<Colaborador> {

    @Override
    public ArrayList<Colaborador> listar(){
        return this.dao.readAll();
    }

    @Override
    public Colaborador criar(Colaborador novo){
        return this.dao.create(novo);
    }

    @Override
    public Colaborador buscar(int codigo){
        return this.dao.readOne(codigo);
    }

    @Override
    public Colaborador alterar(Colaborador alterado){
        return this.dao.update(alterado);
    }

    @Override
    public Colaborador excluirPorID(int codigo){
        return this.dao.deletePorID(codigo);
    }

    public ColaboradorSRV(){
        this.dao = new ColaboradorDAO();
    }
    
}
