
public class Quadrado implements AreaCalculavel{

	private int y;
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void calcularArea() {
		System.out.println("A �rea do quadrado � " + Math.pow(y, 2));
	}

}
