package models;

public class IngressoFamilia extends Ingresso {
	
	private int pessoas;

	public IngressoFamilia(double valor, String nomeFilme, String audio, int pessoas) {
		super(valor, nomeFilme, audio);
		this.pessoas = pessoas;
	}

	public double valorReal() {
		double total = pessoas * valor;
		if (pessoas > 3) {
			total -= total * 0.05;
		}
		return total;
	}

	@Override
	public String toString() {
		return "\nIngresso família:" +
				"\nNome do filme: " + nomeFilme +
				"\nAudio: " + audio +
				"\nValor: R$" + valor +
				"\nNúmero de pessoas: " + pessoas +
				"\nValor total do ingresso família: R$" + valorReal() + "\n";
	}
}
