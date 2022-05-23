
public class Bebida {
	
	// Criando atributos	
	private String nome;
	private boolean aquecer;
	
	public Bebida(String nome, boolean aquecer) { //Criando o Construtor de Bebida
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}
	
	public void preparar() { // Criando o método preparar e utilizando "void", pois esse método não irá retornar nenhum valor para o usuário		
		System.out.println("Pegando o copo");
	}

	// Utilizando o método get e set. O set serve para alterar o valor de um atributo e o get para pegar/acessar o valor de um atributo
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	
	
	
	
}
