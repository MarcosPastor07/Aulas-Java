import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List lista = new ArrayList(); //Instanciando uma lista
	
//		lista.add("abc");
//		lista.add(12);
//		lista.add(true);
//		for(int x=0; x< lista.size(); x++) {
//			System.out.println(lista.get(x));
//	}
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println();
//		lista.remove(0);
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println();
//		lista.add(0, "def");
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println();
//		lista.set(0, "ghi");
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		
//		System.out.println();
//		lista.clear();
//		if(lista.isEmpty()) {
//			System.out.println("Sua lista está vazia");
//		}	
		
		//Instanciando Objetos
		Conta conta1 = new Conta("Agua", 60.00);
		Conta conta2 = new Conta("Luz", 120.00);
		
		List<Conta> listaDeContas = new ArrayList<Conta>(); //Criando uma lista para a classe Conta
		
		//Adicionando itens na lista
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for(Conta conta : listaDeContas) { //Utilizando o for que busca uma correspondência pré-determinada para funcionar
			System.out.println(conta);
		}
		

	}

}
