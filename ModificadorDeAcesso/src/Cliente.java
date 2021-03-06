import java.util.Objects;

public class Cliente {
	
	//Criando atributos privados
	private String nome;
	private int cpf;
	private  int numConta;
	
	
	public Cliente() {
		
	}
	
	//Utilizando metodos getters and setters para acessar e modificar valores
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	//Utilizando o Override para subscrever um metodo ja existente 
	@Override
	public String toString() {
		return "Cliente:\nNome= " + nome + ",\nCPF= " + cpf + ",\nN?mero da Conta= " + numConta ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
	

}

