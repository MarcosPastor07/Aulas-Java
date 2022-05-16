
public class Quadrado implements AreaCalculavel{

	private int y; //atributo privado para definir oa lados do quadrado
	
	
	//metodos getters and setters
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void calcularArea() {
		System.out.println("A �rea do quadrado � " + Math.pow(y, 2)); //syso para mostrar a area do quadrado
	}

}
