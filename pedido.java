package model;

import java.util.List;

public class pedido {
    private cliente cliente;
    private garcom garcom;
    private List<prato> pratos;
    private String data;
    private String status;

    // Construtor, getters e setters
    public pedido(cliente cliente, garcom garcom, List<prato> pratos, String data, String status) {
        this.cliente = cliente;
        this.garcom = garcom;
        this.pratos = pratos;
        this.data = data;
        this.status = status;
    }

    // Getters e Setters
    public cliente getCliente() { return cliente; }
    public garcom getGarcom() { return garcom; }
    public List<prato> getPratos() { return pratos; }
    public String getData() { return data; }
    public String getStatus() { return status; }
}