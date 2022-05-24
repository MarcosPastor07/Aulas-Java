
public class Carro extends Veiculo{
	
	private boolean quatroPortas; //Criando um atributo que apenas o carro pode possuir
	
	
	
	@Override
	public void imprimir() { //Override para chamar um método já existente em outra classe
		super.imprimir();
		System.out.println("Tem quatro portas: " + quatroPortas); //syso para mostrar uma mensagem
	}

	public boolean isQuatroPortas() { //Se for quatro portas mesmo, irá retornar o valor verdadeiro
		return quatroPortas; //retorno
	}

	public void setQuatroPortas(boolean quatroPortas) { //método setters
		this.quatroPortas = quatroPortas;
	}
	
	
	
}
