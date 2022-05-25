
public class Carro extends Veiculo{ //A subclasse Carro estende de Veiculo, que e a super classe
	
	private boolean quatroPortas; //Criando um atributo que apenas o carro pode possuir
	
	
	
	@Override
	public void imprimir() { //Override para chamar um metodo ja existente em outra classe
		super.imprimir();
		System.out.println("Tem quatro portas: " + quatroPortas); //syso para mostrar uma mensagem
	}

	public boolean isQuatroPortas() { //Se for quatro portas mesmo, ira retornar o valor verdadeiro
		return quatroPortas; //retorno
	}

	public void setQuatroPortas(boolean quatroPortas) { //metodo setters
		this.quatroPortas = quatroPortas;
	}
	
	
	
}
