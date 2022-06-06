public class ContaBancaria {
	 
	//Criando atributos privadaos de vários tipos
	private	int numConta;
	private	boolean ativo;
	private	double saldo;
	
	//Criando o método contabancaria que recebe os valores de ativo e saldo
	public ContaBancaria() {
		ativo = true;
		saldo = 1.0;
		
	}
	
	public ContaBancaria(boolean ativo, double saldo) {
		this.ativo = ativo;
		this.saldo = saldo;
	}

	public void receber(double valor) {
		saldo += valor;
	}
	public double saldo() {
		return saldo;
	}
	public void dar (double valor) {
		if(saldo>=valor) {
			saldo -= valor;
	}
	}
		
	}



