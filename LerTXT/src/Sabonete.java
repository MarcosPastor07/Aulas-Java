public class Sabonete {
	
	//Criando atributos
	String cheiro;
	String cor;
	
	public String toString() { //Usando o metodo to string para trazer uma representação textual de uma instância de um objeto
		return "Sabonete: Cheiro = " + cheiro  + ", Cor = " + cor + "\n"; 
	}
	
	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
}	
	
