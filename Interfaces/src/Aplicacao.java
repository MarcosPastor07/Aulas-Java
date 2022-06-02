
public class Aplicacao {

	public static void main(String[] args) {
		
		//Instanciando um novo objeto
		Rota rota = new Rota();
		Ferrari ferrari = new Ferrari();
//		Fusca fusca = new Fusca();
//		
//		rota.ir(ferrari);
//		System.out.println();
//		rota.ir(fusca);
//		System.out.println();
//		
//		Automovel automovel = new Ferrari();
//		rota.ir(automovel);
//		System.out.println();
//		automovel = new Fusca();
//		rota.ir(automovel);
		
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		//chamando a classe vendedor juntamente do método mostrar preco e dentro de () podemos ver qual o item que tera o valor mostrado
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
		
	}

}
