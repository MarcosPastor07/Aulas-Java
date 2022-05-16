
public class main {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(); //instanciando um novo objeto
		quadrado.setY(8);//acessando o método set para poder dar um valor a um atributo privado
		quadrado.calcularArea();//chamando o método calcularArea para que ele faça o método matematico que vai resultar na area do quadrado
		
		Circunferencia circunferencia = new Circunferencia();//instanciando um novo objeto
		circunferencia.setR(3);//acessando o método set para poder dar um valor a um atributo privado
		circunferencia.getR();
		circunferencia.calcularArea();//chamando o método calcularArea para que ele faça o método matematico que vai resultar na area do quadrado
		
		Retangulo retangulo = new Retangulo();//instanciando um novo objeto
		retangulo.setB(7);//acessando o método set para poder dar um valor a um atributo privado
		retangulo.setH(12);//acessando o método set para poder dar um valor a um atributo privado
		retangulo.calcularArea();//chamando o método calcularArea para que ele faça o método matematico que vai resultar na area do quadrado
	}
}
