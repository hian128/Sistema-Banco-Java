package model;

public class ContaCorrente extends Conta {

    // atributos 

   private double taxaOperacao ;

    public ContaCorrente(int numero , double saldo , Cliente cliente , double taxaOperacao){
        super(numero, saldo , cliente);
        this.taxaOperacao = taxaOperacao;
    }


        // metodos

        public double getTaxaOperacao(){
            return taxaOperacao ;

        }

        public void setTaxaOperacao(double taxaOperacao){
            this.taxaOperacao = taxaOperacao ;
        }

         @Override
    public void sacar(double valor) {
        double valorTotal = valor + taxaOperacao; 
        super.sacar(valorTotal); 
        System.out.println("Taxa de operação: R$ " + taxaOperacao);
    }

        


    
}
