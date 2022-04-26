package contaBancaria.demo;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO =1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected String tipoDeConta;
    protected double saldo;
    protected Cliente cliente;
   
    public Conta(Cliente cliente,String tipoDeConta){
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;
        this.tipoDeConta = tipoDeConta;
    }

    public int getAgencia(){
        return this.agencia;
    }
    public void setAgencia(int agencia){
        this.agencia= agencia;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero= numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo= saldo;
    }

    
    @Override
    public void transferir(IConta contaDestino, double valor){
        double valorSacar=valor;
        if(this.tipoDeConta.equals("CORRENTE")){
            valorSacar+=2;
         }    
        if (saldo >= valorSacar){ 
            sacar(valorSacar);    
            contaDestino.depositar(valor);
         }else{
             System.out.println( "Não consegue transferir");
     }}
     
     @Override
     public void sacar(double valor){
         if(valor<=this.saldo){
             this.saldo -=valor;
         }else{
             System.out.println("Não foi possível fazer o saque");
         }
          
     }
        
     @Override
     public void depositar(double valor){
         this.saldo += valor;
     }

     protected void imprimirInfosConta(){
        System.out.println(String.format("TITULAR: %s", this.cliente.getNome()));

        System.out.println(String.format("AGENCIA: %d", this.agencia));
        
        System.out.println(String.format("NUMERO CONTA: %d", this.numero));
        
        System.out.println(String.format("SALDO: R$ %.2f", this.saldo));

     }



}
