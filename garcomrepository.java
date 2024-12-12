package repository;

import model.garcom;
import java.util.ArrayList;
import java.util.List;

public class garcomrepository {
    private List<garcom> garcons = new ArrayList<>();

    public void adicionar(garcom garcom) {
        if (buscarPorCodigo(garcom.getCodigo()) == null) {
            garcons.add(garcom);
        } else {
            System.out.println("Garçom com código já cadastrado.");
        }
    }

    public List<garcom> listar() {
        return garcons;
    }

    public garcom buscarPorCodigo(String codigo) {
        for (garcom garcom : garcons) {
            if (garcom.getCodigo().equals(codigo)) {
                return garcom;
            }
        }
        return null;
    }
}