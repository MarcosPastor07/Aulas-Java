
public class ContaInvestimento extends ContaBancaria {

	@Override
	public void calcularSaldo() {
		System.out.println(saldo + (saldo * 0.5));
	}

	
}
