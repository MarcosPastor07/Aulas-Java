
public class pessoa {
	String nome;
	int numFig;

	void receber(int numFig) {
		this.numFig += numFig;
	}

	boolean dar(int numFig, pessoa pessoa) {

		if (this.numFig < numFig) {
			System.out.println("Voc� n�o possui a quantidade suficiente de figurinhas para doar.");

			return false;
		} else {
			this.numFig -= numFig;
			pessoa.receber(numFig);

			return true;

		}
	}

}
