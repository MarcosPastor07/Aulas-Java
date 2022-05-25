
public class Sabonete {

	String cheiro;
	String cor;
	
	public String toString() { 
		return "Sabonete: Cheiro = " + cheiro  + ", Cor = " + cor + "\n"; 
	}
	
	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
	public Sabonete(String texto) {
		
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
	}
	
}
