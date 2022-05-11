
public abstract class Item {
		
	private int posX; // Criando uma vari�vel privada do tipo inteiro
	private int posY; // Criando uma vari�vel privada do tipo inteiro
	
	public abstract void pegar();  // Sempre que estende de um Item abstrato, temos que implementar os m�todos da classe que est� sendo estendida
		
	public int getPosX() { // utilizando o m�todo getters and setters
		return posX;
	}

	public void setPosX(int posX) { // utilizando o m�todo getters and setters
		this.posX = posX;
	}

	public int getPosY() { // utilizando o m�todo getters and setters
		return posY;
	}

	public void setPosY(int posY) { // utilizando o m�todo getters and setters
		this.posY = posY;
	}
	
}
