
public class VRA implements calcularVolume{

	private double v, r, a;

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
	public void CalcularVolume() {
		System.out.println("O volume da lata de óleo é: "+ 3.14159 * r * r * a);
		
		
	}
	
	
	
}
