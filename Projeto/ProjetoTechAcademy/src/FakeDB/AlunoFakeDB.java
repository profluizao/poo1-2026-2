package FakeDB;

import java.util.ArrayList;

import Dominio.*;

public class AlunoFakeDB 
    extends BaseGenericaFakeDB<Aluno>{
    
    @Override
    protected void autoPreencher(){
        this.dados.add(new Aluno(101, "Murilo Alves", "78901", "2026001"));
        this.dados.add(new Aluno(102, "Ricardo Ashiro", "78902", "2026002"));
        this.dados.add(new Aluno(103, "Allan da Costa", "78903", "2026003"));
        this.dados.add(new Aluno(104, "Marcos Santos", "78904", "2026004"));
        this.dados.add(new Aluno(105, "Noiza Andrade", "78905", "2026005"));
    }

    public AlunoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
