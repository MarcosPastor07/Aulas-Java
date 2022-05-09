
public class main {

	public static void main(String[] args) {

		Preparador preparador = new Preparador();
		
		LeiteQuente leitequente = new LeiteQuente();
		preparador.prepararBebida(leitequente);
		
		System.out.println();
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
		
		
	}

}
