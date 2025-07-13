package models;

public class Ingresso {

	protected double valor;
	protected String nomeFilme;
	protected String audio;

	public Ingresso(double valor, String nomeFilme, String audio) {
		super();
		this.valor = valor;
		this.nomeFilme = nomeFilme;
		this.audio = audio;
	}

	public double valorReal() {
		return valor;
	}

	@Override
	public String toString() {
		return "\nIngresso Comum:" +
				"\nNome do filme: " + nomeFilme +
				"\nAudio: " + audio +
				"\nValor: R$" + valor + "\n";
	}
}
