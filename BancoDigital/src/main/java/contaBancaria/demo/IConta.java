package contaBancaria.demo;

public interface IConta {
    void transferir(IConta contaDestino, double valor);
 
    void sacar(double valor);
        
    void depositar(double valor);

    void imprimirExtrato();

}
