
public class LeiteQuente extends Bebida { // A classe LeiteQuente é uma subclasse que estende de Bebida

	public LeiteQuente() { // criando o construtor
		super("Leite Quente", true);
	}

	@Override
	public void preparar() { //
		super.preparar();
		System.out.println("Colocando o leite no copo");
	}
	
	

}
