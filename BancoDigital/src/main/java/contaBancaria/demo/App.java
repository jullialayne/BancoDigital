package contaBancaria.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Jullia");
		Cliente c2 = new Cliente("Layne");

		IConta cc=new ContaCorrente(c1);
		IConta cp=new ContaPoupanca(c2);
		
		cc.depositar(100);
		cp.depositar(100);
		cc.transferir(cp, 20);

		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
