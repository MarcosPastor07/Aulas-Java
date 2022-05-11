
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item = new Item(); 
		
		Item item = new Cogumelo(); // Criando a variável 'item' e instanciando Cogumelo
		item.pegar(); // Chamando o método 'pegar'
		
		item = new Moeda(); // instanciando Moeda, a partir da variável 'item' que foi criada acima
		item.pegar();
		
		item = new Diamante(); // instanciando Diamante, a partir da variável 'item' que foi criada acima
		item.pegar();
		
		
	}

}
