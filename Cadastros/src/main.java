import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner cadastro = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		
		System.out.println("Fa�a seu cadastro!");
		System.out.println("Digite seu nome");
		pessoa.nome = cadastro.next();
		System.out.println("Digite sua idade");
		pessoa.idade = cadastro.nextInt();
		System.out.println("Preencha o seu Endere�o!");
		System.out.println("Digite a Rua que voc� mora");
		endereco.rua = cadastro.next();
		System.out.println("Digite o n�mero da sua casa");
		endereco.n�mero = cadastro.nextInt();
		System.out.println("Digite o Bairro em que voc� mora");
		endereco.bairro = cadastro.next();
		

	}

}
