package model;

public class ContaPoupanca extends Conta{

    // atributos

    private double taxaRendimento ;

    public ContaPoupanca(int numero , double saldo , Cliente cliente , double taxaRendimento){
        super(numero, saldo, cliente);
        this.taxaRendimento = taxaRendimento ;
    }

    //metodos 

    public double getTaxaRendimento(){
        return taxaRendimento ;
    }

    public void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento ;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.println("Rendimento aplicado: R$ " + rendimento);
    }
    
}
