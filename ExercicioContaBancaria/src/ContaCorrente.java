
public class ContaCorrente extends ContaBancaria { 

	//Criando o método de como o saldo sera calculado
	@Override
	public void calcularSaldo() {
		System.out.println(saldo - (saldo * 0.1));
	}
		
	
}
