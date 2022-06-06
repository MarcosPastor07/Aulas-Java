
public abstract class ContaBancaria {

	protected double saldo; //Criando um atributo protected para que somente as classes herdeiras tenham acesso a ele.

	public void depositar(double valor) { //Criando metodo para depositar
		 saldo += valor;
		
	}
		
	public void sacar(double valor) { //Criando metodo para sacar
		 saldo -= valor;
		
	}
	
	public void transferir(double valor) { //Criando metodo para transferir
		 saldo -= valor;
	}
	
	public void calcularSaldo() { //Chamando o metodo de calcular o saldo
		
	}
}
