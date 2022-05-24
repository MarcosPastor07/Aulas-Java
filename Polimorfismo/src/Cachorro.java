
public class Cachorro extends Animal{ //Classe Cachorro que estende de Animal

	@Override
	public void Falar() { //Fazendo um Override para chamar o método Falar que está na classe Animal
		System.out.println("AU-AU"); //Mensagem que deve ser exibida após esse método ser executado
	}
	
	public void Morder() { //Criando o método Morder
		System.out.println("NHAC!!"); //Mensagem que deve ser exibida após esse método ser executado
	}
	
	
}
