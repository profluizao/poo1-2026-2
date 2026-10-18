package FakeDB;

import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<T> {
    protected ArrayList<T> dados;

    public ArrayList<T> getDados(){
        return this.dados;
    }

    protected abstract void autoPreencher();

    public BaseGenericaFakeDB(){
        
    }
}
