import java.util.Scanner; //Importando o Scanner

public class CalcularArea {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Instanciando o Scanner para que assim, ele possa ser utilizado	
		
		
		AreaPoligonos soma = new AreaPoligonos(); // Instanciando o objeto AreaPoligonos
		
		System.out.println("Some a �rea dos pol�gonos");{ // Utilizando syso para mostrar uma mensagem no console. A mensagem que ira aparecer, é o que está dentro de aspas
		System.out.println("1 - Quadrado");
		System.out.println("Digite o valor da altura da forma");
		int x = scanner.nextInt(); // Definindo que o valor x irá receber um novo valor que o usuário irá digitar. Isso é possível graças ao Scanner 
		
		System.out.println("Digite o valor da base da forma ");
		int y = scanner.nextInt(); // Definindo que o valor y irá receber um novo valor que o usuário irá digitar. Isso é possível graças ao Scanner 
			
		
		 int soma = AreaPoligonos.somar(x, y);
			System.out.println("O resultado é: " + soma); // Utilizando o syso para mostrar o resultado da soma, e usando o + para concatenar a escrita com o valor que deve ser mostrado
			
		 int retângulo = AreaPoligonos.somar(x, y);
			System.out.println("O resultado é: " + retângulo);
		}
		
		System.out.println("2 - Triângulo");
		System.out.println("Digite o valor da altura da forma");
		int x = scanner.nextInt();
		
		System.out.println("Digite o valor da base da forma ");
		int y = scanner.nextInt();
		
		double triângulo = AreaPoligonos.somar(x, y, 5);
		System.out.println("O resultado é: " + triângulo);
		
		
		
		
		
		
		System.out.println("3 - Retângulo");
		
		
		
	}

}
