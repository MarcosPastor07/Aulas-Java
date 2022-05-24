
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo(); //Instanciando um objeto do tipo Veiculo
		
		//Aplicando valores/nomes nos atributos: Marca, Modelo e Ano. O método Setter permite que façamos isso
		veiculo.setMarca("Kawazaki");
		veiculo.setModelo("Z 300");
		veiculo.setAno(2019);
		
		veiculo.imprimir(); //Chamando o método imprimir
		veiculo.buzinar(); //Chamando o método buzinar
		
		Carro carro = new Carro(); //Instanciando um objeto do tipo Carro
		
		carro.setMarca("Suzuki");
		carro.setModelo("Grand Vittara");
		carro.setAno(2012);
		carro.setQuatroPortas(true);
		
		System.out.println();
		
		carro.imprimir();
		carro.buzinar();
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.setMarca("Mercedes Benz");
		caminhao.setModelo("Cegonha");
		caminhao.setAno(2020);
		
		System.out.println();
		
		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto();
		
		moto.setMarca("Honda");
		moto.setModelo("CB 500f");
		moto.setAno(2022);
		
		System.out.println();
		
		moto.imprimir();
		moto.empinar();
		moto.buzinar();
		
		
	}

}
