import java.util.Scanner;
public class main {

	public static void main(String[] args) {

		// int x = 100;
		// double y = 200;
		// int a = 0;
		// double b = 0;
		// short z = (short) 10000;

		// a = (int)y;
		// b = x;

		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(x);
		// System.out.println(y);
		// System.out.println(z);

//		int idadepessoa = 18;
//
//		if (idadepessoa < 18) {
//			System.out.println("Você não pode beber");
//		} else if (idadepessoa < 60) {
//			System.out.println("Bora tomar uma");
//		} else {
//			System.out.println("Volta para o Asilo");
//		}
//		System.out.println("Você tem " + idadepessoa + " anos");

//		int num = 7;
//
//		switch (num) {
//			case 1:
//				System.out.println("Domingo");
//				break;//Serve para "pausar" o código, ou seja, o código só será executado até onde ele estiver.
//			case 2:
//				System.out.println("Segunda");
//				break;
//			case 3:
//				System.out.println("Terça");
//				break;
//			case 4:
//				System.out.println("Quarta");
//				break;
//			case 5:
//				System.out.println("Quinta");
//				break; 
//			case 6:
//				System.out.println("Sexta");
//				break;
//			case 7:
//				System.out.println("Sábado");
//				break;
//			default:
//				System.out.println("Esse número não representa um dia da semana");
		
//		char caractere = 'a';
//		
//		switch (caractere) {
//			case 'a':
//				System.out.println("Seu caractere é a");
//				break;
//			case 'b':
//				System.out.println("Seu caractere é b");
//				break;
//			default:
//				System.out.println("Valor inválido");
//				
//		}
		
		//funciona igual ao enquanto do visualg
//		int x = 0;
//		while(x<10) {
//			x=x+1;
//			System.out.println(x);
//		}
//		
//		//funciona igual ao faça enquanto do visualg
//		x=0;
//		do {
//			System.out.println(x);
//			x=x+1;
//		}while(x<10);
		
//		System.out.println("Taboada do 2");
//		for(int x=0; x<11; x++) {
//			System.out.println("2 x " + x + " = " + x * 2);
//		
//		int x1 = 3;
//		int y1 = 5;
//		int z1 = 7;
//		
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(z1);
//
//		double x [] = {3, 5, 3, 5};
//		
//		for (int aux = 0; aux < x.length; aux++) {
//			System.out.println("Valor do índice " + aux + " = " + x[aux]);
//		}
//		String nome[] = { "Rafael", "Lara", "Gislene"};
//		
//		for (int aux1 = 0; aux1 < nome.length; aux1++) {
//			System.out.println(nome[aux1]);
//			if (nome[aux1] == "Gislene") {
//				System.out.println("O índice de Gislene é = " + aux1);
//			}
//		}
//		
//		int [] arrayInt = new int[5];
//		String [] ArrayString = new String[4];
//		double[] ArrayDouble = new double[3];
//		
//		arrayInt[3] = 4;
		
		int[] numero = new int [6];
		Scanner teclado = new Scanner(System.in);
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Digite um número qualquer");
			numero[aux2] = teclado.nextInt();
		}
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("Índice " +aux2+ " = " + numero[aux2]);
	}
//		interar é a forma de ver cada posiçao/valor da matriz
//		int[] arrayQualquer = new int[3];
//		Object[] arrayObject = new Object[5];
//		
//		arrayObject[0] = 12;
//		arrayObject[1] = "Marcos";
//		arrayObject[2] = 13.8;
//		arrayObject[3] = true;
//		arrayObject[4] = arrayQualquer;
//		
//		for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
//			System.out.println("Índice " +aux2+ " = " + arrayObject[aux2]);
//		}
//		System.out.println();
		
		int [][] arrayBidirecional = new int[4][3];
		
		arrayBidirecional[0][0]=8;
		
		arrayBidirecional[2][1]=7;
		
		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
		for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
			System.out.print("Índice [" +linha+ "][" +coluna +"] = " + arrayBidirecional[linha][coluna]+ " ");
		}
		System.out.println();
		}
	}
	}

