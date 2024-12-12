package repository;

import model.cliente;
import java.util.ArrayList;
import java.util.List;

public class clienterepository {
    private List<cliente> clientes = new ArrayList<>();

    public void adicionar(cliente cliente) {
        if (buscarPorCpf(cliente.getCpf()) == null) {
            clientes.add(cliente);
        } else {
            System.out.println("Cliente com CPF já cadastrado.");
        }
    }

    public List<cliente> listar() {
        return clientes;
    }

    public cliente buscarPorCpf(String cpf) {
        for (cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public void atualizar(cliente clienteAtualizado) {
        cliente cliente = buscarPorCpf(clienteAtualizado.getCpf());
        if (cliente != null) {
            // Atualizar os dados do cliente
            // Exemplo: cliente.setNome(clienteAtualizado.getNome());
        }
    
    }
    }