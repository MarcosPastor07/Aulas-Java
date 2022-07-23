
public class VRA implements AreaCalculavel{

	public double v, r, a;

	public double getV() {
		return v;
	}

	public void setV(double v) {
		this.v = v;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public void calcularArea() {
		System.out.println("O volume da respectiva figura é: " + 3.14159 * r * r * a);
		
		
	}
	
	
	
}
