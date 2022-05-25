import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		Scanner scanner = new Scanner(System.in);
		String string = "";
		
		System.out.println("Digite um texto");
		string = scanner.nextLine();
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))){
			escrever.write(string);
			
		}
		
		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))){
			String line;
			String string1 = "";
			
			while((line = reader.readLine())!= null) {
				string1 += line + "\n";
			}
			System.out.println(string);
		}
//		Sabonete sabonete1 = new Sabonete("Azedo", "Verde");
//		String s = sabonete1.toString();
		
		String teste = "Sabonete: Cheiro = Azedo, Cor = Verde";
		
		Sabonete sabonete2 = new Sabonete(teste);
		
		System.out.println(sabonete2);
		
		
	}
}
		
		




