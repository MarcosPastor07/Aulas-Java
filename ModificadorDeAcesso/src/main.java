public class main {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(true, 3.0);
		
//		conta1.ativo = true;
//		conta1.saldo = 100.50;
//		conta1.numConta = 1234;
		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.saldo);
//		System.out.println(conta1.numConta);
//		conta1.receber(100.8);
//		conta1.dar(40);
//		System.out.println(conta1.saldo());
//		
//		ContaBancaria conta2 = new ContaBancaria();
//		System.out.println(conta2.saldo());
		
		//instanciando um novo objeto de Cliente
		Cliente cliente1 = new Cliente(); 
		
		//Utilizando o metodo set para modificar valores
		cliente1.setNome("Marcos");
		cliente1.setCpf(123456);
		cliente1.setNumConta(654321);
		
		
		System.out.println(cliente1.toString());
	
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Marcos");
		cliente2.setCpf(12345);
		cliente2.setNumConta(654321);
		
		System.out.println(cliente2);
		
		// if(cliente1.getNome()==cliente2.getNome()) { verifica se o nome do cliente é igual 
//			System.out.println("os objetos são iguais");
//		}
//		else {
//			System.out.println("os objetos são diferentes");
//		}
		if(cliente1.equals(cliente2)) {
			System.out.println("os objetos são iguais");
		}
		else {
			System.out.println("os objetos são diferentes");
		}
			
		}
	}



