
public class main {

	public static void main(String[] args) {
		
		
		ContaBancaria cliente1 = new ContaCorrente(); //Instanciando um objeto 
		cliente1.depositar(500); //Chamando o metodo depositar e colocando dentro de () o valor que deve ser depositado
		cliente1.sacar(100); //Chamando o metodo sacar e colocando dentro de () o valor que deve ser depositado
		cliente1.calcularSaldo(); //Apos ser feito o deposito e o saque, esse metodo deve calcular o saldo restante dentro da Conta Corrente
		
		ContaBancaria cliente2 = new ContaInvestimento(); 
		cliente2.depositar(760); 
		cliente2.sacar(150);
		cliente2.calcularSaldo(); //Apos ser feito o deposito e o saque, esse metodo deve calcular o saldo restante dentro da Conta Investimento

	}

}
