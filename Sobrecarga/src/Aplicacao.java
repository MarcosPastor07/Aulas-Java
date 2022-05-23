import java.util.Scanner; // Importando o Scanner

public class Aplicacao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Instanciando o Scanner	
		
		
		Matematica matematica = new Matematica(); // Instanciando o Objeto Matematica
		
		System.out.println("Somar dois números"); // Utilizando o syso para mostrar a mensagem no console
		System.out.println("Digite o primeiro número");
		int x = scanner.nextInt(); // Utilizando o Scanner para permitir que o usuário insira um valor que irá ficar armazenado na variável x
		
		System.out.println("Digite o segundo número");
		int y = scanner.nextInt();
			
		
		int soma = matematica.somar(x, y);
			System.out.println("O resultado é: " + soma); // Utilizando o syso para mostrar uma mensagem no console, e usando o + para concatenar a mensagem com o resultado
			
			soma = matematica.somar(x, y, 5);
			System.out.println("O resultado é: " + soma);
			
		double soma2 = matematica.somar(x, y);
			System.out.println("O resultado é: " + soma2);
			
	}

}
