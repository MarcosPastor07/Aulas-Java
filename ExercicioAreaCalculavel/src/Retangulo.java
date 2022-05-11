
public class Retangulo implements AreaCalculavel {

	private int b;
	private int h;
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	@Override
	public void calcularArea() {
		System.out.println("A area do retângulo é: " + b*h);
		
	}


	
	
}
