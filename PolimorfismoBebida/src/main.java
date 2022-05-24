
public class main {

	public static void main(String[] args) {

		Preparador preparador = new Preparador(); //Instanciando um objeto 
		
		LeiteQuente leitequente = new LeiteQuente();
		preparador.prepararBebida(leitequente); //Chamando o método preparar bebida da subclasse leitequente
		
		System.out.println(); //syso vazio para pular linha
		
		Refrigerante refrigerante = new Refrigerante(); //Instanciando um novo objeto
		preparador.prepararBebida(refrigerante); //Chamando o método preparar bebida da subclasse refrigerante
		
		
	}

}
