
public class Pessoa {
	
	//Criando atributos
	String nome;
	int idade;
	Sexo sexo;
	Endereco endereco;
	
	//Criando Vetores do tipo String
	public Pessoa(String line) {
	String[] ArrayLine = line.split(","); //Utilizando split para separar as strings sempre que aparecer uma virgula 

	String[] ArrayNome = ArrayLine[0].split("=");
	this.nome = ArrayNome[1].trim(); //Utilizando o trim para remover os espaços da esquerda e da direita dentro das strings
	
	String[] ArrayIdade = ArrayLine[1].split("=");
	this.idade = Integer.parseInt(ArrayIdade[1].trim());
		
	String[] ArraySexo = ArrayLine[2].split("=");
	this.sexo = Sexo.valueOf(ArraySexo[1].trim());
		
	Endereco endereco = new Endereco(ArrayLine);
		
	this.endereco = endereco;
}
		
public Pessoa() {
			
}

//Utilizando getters and setters para acessar e modificar valores
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
		
		
public Sexo getSexo() {
	return sexo;
		}

public void setSexo(Sexo sexo) {
	this.sexo = sexo;
		}
		
public Endereco getEndereco() {
	return endereco;
		}
		
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
		}

	//Usando Override para subscrever um metodo ja existente
		@Override
		public String toString() {
			return "Pessoa nome = " + nome + ", Idade = " + idade + " ,sexo = " + sexo + endereco +"\n";
		}
		

	}
