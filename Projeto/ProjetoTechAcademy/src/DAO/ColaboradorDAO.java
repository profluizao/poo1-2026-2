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
        for (Colaborador item : this.repositorio) {
            if (item.getCodigo() == codigo){
                return item;
            }
        }
        return null;
    }

    @Override
    public Colaborador update(Colaborador alterado) {
        int codigoProcurado = alterado.getCodigo();
        if (this.readOne(codigoProcurado) != null){
            int index = this.repositorio.indexOf(alterado);
            this.repositorio.set(index, alterado);
            return alterado;
        }
        return null;
    }

    @Override
    public Colaborador delete(Colaborador apagado) {
        int codigoProcurado = apagado.getCodigo();
        if (this.readOne(codigoProcurado) != null){
            this.repositorio.remove(apagado);
            return apagado;
        }
        return null;
    }

    @Override
    public Colaborador deletePorID(int codigo) {
        Colaborador apagado = this.readOne(codigo);
        if (apagado != null){
            this.repositorio.remove(apagado);
            return apagado;
        }
        return null;
    }

    public ColaboradorDAO(){
        this.fonteDados = new ColaboradorFakeDB();
        this.repositorio = this.fonteDados.getDados();
    }
}
