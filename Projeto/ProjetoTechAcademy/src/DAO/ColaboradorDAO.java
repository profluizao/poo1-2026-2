package DAO;

import Dominio.Colaborador;
import FakeDB.ColaboradorFakeDB;

public class ColaboradorDAO 
    extends BaseGenericaDAO<Colaborador> {

    @Override
    public Colaborador create(Colaborador novo) {
        int codigoAtual = this.repositorio.getLast().getCodigo();
        int codigoNovo = codigoAtual + 1;
        novo.setCodigo(codigoNovo);
        this.repositorio.add(novo);
        return novo;
    }

    @Override
    public Colaborador readOne(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Colaborador update(Colaborador alterado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Colaborador delete(Colaborador apagado) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Colaborador deletePorID(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    public ColaboradorDAO(){
        this.fonteDados = new ColaboradorFakeDB();
        this.repositorio = this.fonteDados.getDados();
    }
}
