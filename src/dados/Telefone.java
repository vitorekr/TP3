package dados;

public class Telefone {
	private int ddd;
	private int numero;
	

	public Telefone(int ddd, int numero) {
		setDDD(ddd);
		setNumero(numero);
	}

	public Integer getDDD() {
		return ddd;
	}


	public void setDDD(int ddd) {
		this.ddd = ddd;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Telefone: (" + ddd + ") " + numero;
	}
}
