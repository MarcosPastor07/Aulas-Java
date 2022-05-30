import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		
//		String sab1 = "Sabonete: Cheiro = Doce, Cor = Rosa";
//		String sab2 = "Sabonete: Cheiro = Azedo, Cor = Verde";
//		String sab3 = "Sabonete: Cheiro = Algum, Cor = Sei lá";
		
	
		//Instanciando um objeto
		Sabonete sabonete1 = new Sabonete("Sabonete: Cheiro = Doce, Cor = Rosa");
		Sabonete sabonete2 = new Sabonete("Sabonete: Cheiro = Azedo, Cor = Verde");
		Sabonete sabonete3 = new Sabonete("Sabonete: Cheiro = Algum, Cor = Sei lá");
		
		//Instanciando uma lista
		List<Sabonete> ListaDeSabonetes = new ArrayList<Sabonete>();
		
		//Adicionando itens a essa lista
		ListaDeSabonetes.add(sabonete1);
		ListaDeSabonetes.add(sabonete2);
		ListaDeSabonetes.add(sabonete3);
		
		//Gravando as informações de cima no TXT
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("sabonete.txt"))){
			for(Sabonete sabonete : ListaDeSabonetes) {
				escrever.write(sabonete.toString());
			}	
				
		//Instanciando uma lista nova
		List<Sabonete> ListaDeSabonetes2 = new ArrayList<>();
		
		//Lendo o arquivo TXT
		try(BufferedReader reader = new BufferedReader(new FileReader("sabonete.txt"))){
			String line;
			
			while((line = reader.readLine())!= null) {
				ListaDeSabonetes2 += line + "\n";
			}
			
			//Utilizando o for para repetição e o syso para escrever a nova lista no console
			for(Sabonete sabonete : ListaDeSabonetes2) {
				System.out.println(ListaDeSabonetes2);
			}
		
	}
	

}
