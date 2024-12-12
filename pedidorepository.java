package repository;

import model.pedido;
import java.util.ArrayList;
import java.util.List;

public class pedidorepository {
    private List<pedido> pedidos = new ArrayList<>();

    public void adicionar(pedido pedido) {
        pedidos.add(pedido);
    }

    public List<pedido> listar() {
        return pedidos;
    }
}