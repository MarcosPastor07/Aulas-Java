import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		
		//Instanciando objeto
		Sabonete sabonete1 = new Sabonete("sei lá o que", " azul");
		Sabonete sabonete2 = new Sabonete("Não sei", " Verde");
		Sabonete sabonete3 = new Sabonete("alguma coisa", " Laranja");
		
		List<Sabonete> ListaDeSabonetes = new ArrayList<Sabonete>(); //Instanciando uma lista
		
		//Adicionando os itens dentro da lista
		ListaDeSabonetes.add(sabonete1);
		ListaDeSabonetes.add(sabonete2);
		ListaDeSabonetes.add(sabonete3);
			
		try(BufferedWriter escrever2 = new BufferedWriter(new FileWriter("saida.txt"))){
			for(Sabonete sabonete : ListaDeSabonetes) {
				escrever2.write(sabonete.toString());
			
		}
}
		
//		String s = "texto para ser gravado no arquivo";
//		
//		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
//				escrever.write(s);
//	}
		
	}
}

