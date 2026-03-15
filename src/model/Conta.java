package model;

public class Conta{

    // atributos 
    private int numero ;
    private double saldo ;
    private Cliente cliente ;

    // construtor 
    public Conta(int numero , double saldo , Cliente cliente){
        this.numero = numero ;
        this.saldo = saldo ;
        this.cliente = cliente ;
        
    }

    // metodos 

    public double getSaldo(){
         return saldo;
       }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente(){
        return cliente ;
    }
    

    public void depositar(double valor){
        if( valor > 0){
        saldo = saldo + valor ;
        System.out.println("Voce depositou R$ " + valor);
        System.out.println("Saldo atual R$ " + saldo);
        }
        else{
            System.out.println("Impossivel depositar!");
        }
    
    }

    public void sacar(double valor){
        if(saldo >= valor)
        {
            saldo = saldo - valor ;
            System.out.println("Voce sacou R$ " + valor);
            System.out.println("Saldo atual R$ " + saldo);
        }
        else{
            System.out.println("Impossivel sacar!");
        }
    }
       
        public void transferir(Conta destino, double valor) {
        // Verificar se há saldo suficiente
        if (this.saldo >= valor) {
        // Sacar da conta de origem
        this.sacar(valor);
        
        // Depositar na conta de destino
        destino.depositar(valor);
        
        //  Mensagem de confirmação
        System.out.println("Transferência de R$ " + valor + " realizada para a conta " + destino.getNumero());
        } else {
        System.out.println("Saldo insuficiente para transferência!");
        }
}
       

       
    }

