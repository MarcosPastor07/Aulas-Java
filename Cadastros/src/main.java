import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {

		Scanner cadastro = new Scanner(System.in); //Instanciando o Scanner
		List<Pessoa> ListaDeUsuarios = new ArrayList<Pessoa>(); //Instanciando uma lista
		
		for(int x=0; x < 4; x++) { //Criando o For para que seja possivel cadastrar 4 usu�rios 
			
		Pessoa pessoa = new Pessoa(); //Instanciando o objeto pessoa
		pessoa.setEndereco(new Endereco()); //Chamando o metodo setEndereco para utilizar ele dentro de cadastro
		
		//Comecando a cadastrar os usuarios utilizando o scanner e syso
		System.out.println("Preencha seus dados");
		System.out.println("Digite seu nome: ");
		pessoa.setNome(cadastro.nextLine());
		System.out.println("Digite sua idade: ");
		pessoa.setIdade(cadastro.nextInt());
		System.out.println("Qual o seu sexo? 1 - Masculino; 2 - Feminino");
		int opcao=0;
		while(opcao!=1 && opcao!=2) { //Criando um While para que o usuario possa selecionar o seu sexo digitando apenas um numero
			opcao = cadastro.nextInt();
			//Criando um if else para determinar o funcionamento do while
			if(opcao==1)
			pessoa.setSexo(Sexo.MASCULINO);
			else if(opcao==2)
			pessoa.setSexo(Sexo.FEMININO);
			else {
				//mensagem que deve ser exibida caso o usuario digite um numero que nao seja 1 ou 2
				System.out.println("Errado! Esse sexo n�o existe");
				System.out.println("Digite o n�mero correto");
			}
		}
		System.out.println("Preencha o seu Endere�o");
		System.out.println("Digite a Rua que voc� mora: ");
		pessoa.getEndereco().setRua(cadastro.next());
		System.out.println("Digite o n�mero da sua casa: ");
		pessoa.getEndereco().setNum(cadastro.nextInt());
		System.out.println("Digite o Bairro em que voc� mora: ");
		pessoa.getEndereco().setBairro(cadastro.next());
		
		ListaDeUsuarios.add(pessoa); //Adicionando os usuarios dentro de uma lista 

		
				
		for(Object valor : ListaDeUsuarios) {
		System.out.println(valor);
		
		//gravando as informa��es da lista dentro do TXT
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){ 
			for(Pessoa Pessoa : ListaDeUsuarios) {
				escrever.write(Pessoa.toString());

				//Lendo o arquivo TXT
				try(BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))){
					String line;
		
					}
				}
			}
		}
	}
}
}

