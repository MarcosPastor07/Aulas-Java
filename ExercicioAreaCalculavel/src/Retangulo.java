
public class Retangulo implements AreaCalculavel {

	private int b; //atributo privado para definir a base do retangulo
	private int h; //atributo privado para definir a altura do retangulo
	
	
	//metodos getters and setters
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
		System.out.println("A area do ret�ngulo �: " + b*h); //syso para mostrar a Area 
		
	}


	
	
}
