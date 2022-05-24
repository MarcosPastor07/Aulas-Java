	
public class Veiculo {
	
	//Criando atributos
	private String nome;
	protected String marca;
	protected String modelo;
	protected int ano;
	
	public void buzinar() { //Criando o método Buzinar
		System.out.println("BI BI"); //Mensagem que deve ser exibida após o método buzinar ser executado
	}
	
	public void imprimir() { //Criando o método imprimir
		//Mensagens que devem ser exibidas após a execução do método. Utilização do "+" para concatenar a mensagem com o atributo
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
	
	//Utilizando getters and setters para pegar e alterar valores dentro da classe main
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
