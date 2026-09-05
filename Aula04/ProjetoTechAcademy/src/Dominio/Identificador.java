package Dominio;

public abstract class Identificador {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Identificador(){}

    public Identificador(int id){
        this.codigo = id;
    }
}
