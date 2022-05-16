
public class main {

	public static void main(String[] args) {
		
		ContaBancaria cliente1 = new ContaCorrente();
		cliente1.depositar(500);
		cliente1.sacar(100);
		cliente1.calcularSaldo();
		
		ContaBancaria cliente2 = new ContaInvestimento();
		cliente2.depositar(760);
		cliente2.sacar(150);
		cliente2.calcularSaldo();

	}

}
