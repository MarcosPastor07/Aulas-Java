
public class Pessoa {

	String nome;
	int idade;
	Sexo sexo;
	Endereco endereco;
	
	public void SexoNum(int num) {
		if(num == 1) {
			sexo = sexo.MASCULINO;
		}else {
			sexo = sexo.FEMININO;
		}
		
	}
	
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Usuário [ Nome: " + nome + ", Idade:" + idade + ", Sexo:" + sexo + ", Endereço:" + endereco + " ] ";
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	
	
}