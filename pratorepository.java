package repository;

import model.prato;
import java.util.ArrayList;
import java.util.List;

public class pratorepository {
    private List<prato> pratos = new ArrayList<>();

    public void adicionar(prato prato) {
        pratos.add(prato);
    }

    public List<prato> listar() {
        return pratos;
    }
}