
public class ContaInvestimento extends ContaBancaria {

	//Criando o metodo de como o Saldo sera calculado dentro de uma conta Investimento
	@Override
	public void calcularSaldo() {
		System.out.println(saldo + (saldo * 0.5));
	}

	
}
