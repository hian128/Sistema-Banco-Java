package service;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Cliente;

import java.util.ArrayList;

public class BancoService {

    // Lista que armazena todas as contas
    private ArrayList<Conta> contas;

    // Construtor
    public BancoService() {
        contas = new ArrayList<>();
    }

    
    public void criarConta(String tipoConta, int numero, double saldo, String nomeCliente, String cpfCliente, double taxa) {

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);
        Conta conta;

        if (tipoConta.equalsIgnoreCase("corrente")) {
            conta = new ContaCorrente(numero, saldo, cliente, taxa);
        } else if (tipoConta.equalsIgnoreCase("poupanca")) {
            conta = new ContaPoupanca(numero, saldo, cliente, taxa);
        } else {
            System.out.println("Tipo de conta inválido!");
            return;
        }

        contas.add(conta);
        System.out.println("Conta criada com sucesso! Número da conta: " + numero);
    }

    public Conta buscarConta(int numero) {
        for (Conta c : contas) {
            if (c.getNumero() == numero) {
                return c;
            }
        }
        System.out.println("Conta não encontrada!");
        return null;
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }

        for (Conta c : contas) {
            String tipo = c instanceof ContaCorrente ? "Corrente" : "Poupança";
            System.out.println("Conta: " + c.getNumero() + " | Cliente: " + c.getCliente().getNome() +
                    " | Tipo: " + tipo + " | Saldo: R$ " + c.getSaldo());
        }
    }
}