package Fundamento;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner cadastros = new Scanner(System.in);
		
		
		System.out.println("Para realizar o cadastro de funcionarios na nossa empresa, preencha os dados abaixo.");
		
		for(int x=0; x < 2; x++) {
			
		System.out.println("Cadastre o novo funcionario");
		System.out.println("Nome: ");
		ProgramaRevisao.Nome(cadastros.next());
		System.out.println("Idade: ");
		ProgramaRevisao.Idade(cadastros.nextInt());
		System.out.println("CPF: ");
		ProgramaRevisao.Cpf(cadastros.nextInt());
		
		System.out.println("Funcionario cadastrado com sucesso!");	
		System.out.println("Para que haja um controle de gastos na empresa, digite o valor do salario do respectivo funcionario.");
		System.out.println("Salario: ");
		ProgramaRevisao.Salario(cadastros.nextDouble());
		
		}
		
		System.out.println("Após os 2 funcionarios serem cadastrados, calcule se há alguma diferença entre o salario deles e de quanto é essa diferença");
		
		

	}

}
