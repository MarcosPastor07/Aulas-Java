
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item = new Item(); 
		
		Item item = new Cogumelo(); // Criando a vari�vel 'item' e instanciando Cogumelo
		item.pegar(); // Chamando o m�todo 'pegar'
		
		item = new Moeda(); // instanciando Moeda, a partir da vari�vel 'item' que foi criada acima
		item.pegar();
		
		item = new Diamante(); // instanciando Diamante, a partir da vari�vel 'item' que foi criada acima
		item.pegar();
		
		
	}

}
