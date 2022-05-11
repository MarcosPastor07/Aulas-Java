
public abstract class Item {
		
	private int posX; // Criando uma variável privada do tipo inteiro
	private int posY; // Criando uma variável privada do tipo inteiro
	
	public abstract void pegar();  // Sempre que estende de um Item abstrato, temos que implementar os métodos da classe que está sendo estendida
		
	public int getPosX() { // utilizando o método getters and setters
		return posX;
	}

	public void setPosX(int posX) { // utilizando o método getters and setters
		this.posX = posX;
	}

	public int getPosY() { // utilizando o método getters and setters
		return posY;
	}

	public void setPosY(int posY) { // utilizando o método getters and setters
		this.posY = posY;
	}
	
}
