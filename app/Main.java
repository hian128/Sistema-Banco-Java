package app;

import model.Conta;
import service.BancoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BancoService banco = new BancoService();
        Scanner sc = new Scanner(System.in);

        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== MENU DO BANCO ===");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Listar Contas");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    // Criar conta
                    System.out.print("Tipo de conta (corrente/poupanca): ");
                    String tipo = sc.nextLine();

                    System.out.print("Número da conta: ");
                    int numero = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine(); 

                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF do cliente: ");
                    String cpf = sc.nextLine();

                    System.out.print("Taxa (ex: 2.5 para Corrente ou 0.05 para Poupança): ");
                    double taxa = sc.nextDouble();
                    sc.nextLine(); 

                    banco.criarConta(tipo, numero, saldo, nome, cpf, taxa);
                    break;

                case 2:
                    // Listar contas
                    banco.listarContas();
                    break;

                case 3:
                    // Depositar
                    System.out.print("Número da conta: ");
                    int numDeposito = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Valor a depositar: ");
                    double valDeposito = sc.nextDouble();
                    sc.nextLine(); 

                    Conta contaDeposito = banco.buscarConta(numDeposito);
                    if (contaDeposito != null) {
                        contaDeposito.depositar(valDeposito);
                    }
                    break;

                case 4:
                    // Sacar
                    System.out.print("Número da conta: ");
                    int numSaque = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Valor a sacar: ");
                    double valSaque = sc.nextDouble();
                    sc.nextLine(); 

                    Conta contaSaque = banco.buscarConta(numSaque);
                    if (contaSaque != null) {
                        contaSaque.sacar(valSaque);
                    }
                    break;

                case 5:
                    // Transferir
                    System.out.print("Número da conta de origem: ");
                    int numOrigem = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Número da conta de destino: ");
                    int numDestino = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Valor a transferir: ");
                    double valTransfer = sc.nextDouble();
                    sc.nextLine();

                    Conta contaOrigem = banco.buscarConta(numOrigem);
                    Conta contaDestino = banco.buscarConta(numDestino);

                    if (contaOrigem != null && contaDestino != null) {
                        contaOrigem.transferir(contaDestino, valTransfer);
                    }
                    break;

                case 6:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}