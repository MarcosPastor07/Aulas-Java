
public class ContaCorrente extends ContaBancaria { 

	//Criando o método de como o saldo sera calculado dentro de uma conta corrente
	@Override
	public void calcularSaldo() {
		System.out.println(saldo - (saldo * 0.1));
	}
		
	
}
