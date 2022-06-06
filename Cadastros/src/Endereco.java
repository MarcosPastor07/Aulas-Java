public class Endereco {
	
	//Criando atributos privados
	private int num;
	private String rua;
	private String bairro;

public Endereco(String[] ArrayLine) {
		
		String[] ArrayRua = ArrayLine[3].split("=");
		this.rua = ArrayRua[1].trim();
				
		String[] ArrayNumero = ArrayLine[4].split("=");
		this.numero = Integer.parseInt(ArrayNumero[1].trim());
		
		String[] ArrayBairro = ArrayLine[5].split("=");
		this.bairro = ArrayBairro[1].trim();
	}

	//Criando os metodos getters and setters para acessar e moificar valores
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	@Override
	public String toString() {
		return "N°" + num + ", Rua:" + rua + ", Bairro:" + bairro;
	}

	
	
	
}