package contaBancaria.demo;


public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente,"POUPANCA");
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("=== EXTRATO CONTA %s ===",tipoDeConta));
        super.imprimirInfosConta();
    }

       
}