package sandro.dev.abstracao;

public abstract class Pagamento {

	protected double valor;

	abstract void efetuarPagamento();

	public Pagamento(double valor) {
		this.valor = valor;
	}

	public void confirmarPagamento() {
		System.out.println("Pagamento confiramdo no valor de: " + valor);
	}

}
