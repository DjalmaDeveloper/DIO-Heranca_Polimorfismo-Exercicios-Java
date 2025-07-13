package models;

public class MeiaEntrada extends Ingresso {

	private final int divisor = 2;

	public MeiaEntrada(double valor, String nomeFilme, String audio) {
		super(valor, nomeFilme, audio);
	}

	public double valorReal() {
		return valor / divisor;
	}
	
	@Override
	public String toString() {
		return "\nMeia entrada:\n" +
				"\nNome do filme: " + nomeFilme +
				"\nAudio: " + audio +
				"\nValor inteiro: R$" + valor +
				"\nValor c/desconto: R$" + this.valorReal() + "\n";
		}
}
