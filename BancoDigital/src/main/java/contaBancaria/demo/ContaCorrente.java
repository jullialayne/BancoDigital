package contaBancaria.demo;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente,"CORRENTE");
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("=== EXTRATO CONTA %s ===",tipoDeConta));
        super.imprimirInfosConta();
    }

}
