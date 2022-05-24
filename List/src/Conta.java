
public class Conta {
	
	//Criando Atributos
	String nome;
	double valor;
	
	public Conta(String nome, double valor) { //Criando o método Conta
		this.nome = nome;
		this.valor = valor;
	}

	@Override
	public String toString() { //Fazendo Override para chamar um método já existente de uma outra classe
		return "Conta [nome = " + nome + ", valor = " + valor + "]"; //Retorno que esse método irá trazer após ser executado
	}
	
	
	
}
