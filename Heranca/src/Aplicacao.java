
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Kawazaki");
		veiculo.setModelo("Z 300");
		veiculo.setAno(2019);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
		Carro carro = new Carro();
		
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
