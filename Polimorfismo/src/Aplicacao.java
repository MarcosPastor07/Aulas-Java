
public class Aplicacao {

	public static void main(String[] args) {
		
//		Animal animal = new Animal();
//		animal.Falar();
//		
//		animal = new Gato();
//		animal.Falar();
		
		Gato gato = new Gato(); //Instanciando um objeto
		Cachorro cachorro = new Cachorro(); //Instanciando um objeto
		falar(gato); //Chamando o método falar da subclasse gato
		falar(cachorro); //Chamando o método falar da subclasse cachorro

	}
	public static void falar(Animal a) {
		a.Falar();
		
		if(a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.Morder();
		}
	}

}
