
public class main {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		quadrado.setY(8);
		quadrado.calcularArea();
		
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.setR(3);
		circunferencia.getR();
		circunferencia.calcularArea();
		
		Retangulo retangulo = new Retangulo();
		retangulo.setB(7);
		retangulo.setH(12);
		retangulo.calcularArea();
	}
}
