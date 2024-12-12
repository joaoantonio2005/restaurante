package model;

import model.cliente;
import model.garcom;
import model.prato;
import model.pedido;
import repository.clienterepository;
import repository.garcomrepository;
import repository.pratorepository;
import repository.pedidorepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        clienterepository clienteRepo = new clienterepository();
        garcomrepository garcomRepo = new garcomrepository();
        pratorepository pratoRepo = new pratorepository();
        pedidorepository pedidoRepo = new pedidorepository();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Adicionar Garçom");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    adicionarCliente(clienteRepo, scanner);
                    break;
                case 2:
                    listarClientes(clienteRepo);
                    break;
                case 3:
                    adicionarGarcom(garcomRepo, scanner);
                    break;
               
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void adicionarCliente(clienterepository clienteRepo, Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        cliente cliente = new cliente(nome, cpf, telefone, email, endereco);
        clienteRepo.adicionar(cliente);
        System.out.println("Cliente adicionado com sucesso!");
    }

    private static void listarClientes(clienterepository clienteRepo) {
        List<cliente> clientes = clienteRepo.listar();
        System.out.println("Clientes cadastrados:");
        for (cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
        }
    }

    private static void adicionarGarcom(garcomrepository garcomRepo, Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        garcom garcom = new garcom(nome, codigo, telefone, email);
        garcom.add(garcom);
        System.out.println(garcom);}}	