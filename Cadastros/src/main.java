import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner cadastro = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		
		System.out.println("Faça seu cadastro!");
		System.out.println("Digite seu nome");
		pessoa.nome = cadastro.next();
		System.out.println("Digite sua idade");
		pessoa.idade = cadastro.nextInt();
		System.out.println("Preencha o seu Endereço!");
		System.out.println("Digite a Rua que você mora");
		endereco.rua = cadastro.next();
		System.out.println("Digite o número da sua casa");
		endereco.número = cadastro.nextInt();
		System.out.println("Digite o Bairro em que você mora");
		endereco.bairro = cadastro.next();
		

	}

}
