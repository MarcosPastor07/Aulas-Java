
public class Circunferencia implements AreaCalculavel {

	private int r;
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public void calcularArea() {
		System.out.println("A �rea da Circunfer�ncia �: " + Math.PI*Math.pow(r, 2));
	}

	

}
