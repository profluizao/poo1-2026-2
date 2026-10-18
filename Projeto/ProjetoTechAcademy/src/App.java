import DAO.ColaboradorDAO;
import Dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        Colaborador clbLula = new Colaborador(101, "Lula", "12301", "Presidente");

        ColaboradorDAO dao = new ColaboradorDAO();
        for(Colaborador item : dao.readAll()){
            item.exibir();
        }
        System.out.println("\n******************\n");
        dao.create(clbLula);
        for(Colaborador item : dao.readAll()){
            item.exibir();
        }
    }
}
