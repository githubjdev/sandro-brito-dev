package sandro.dev.abstracao;

public class PagamentoPIX extends Pagamento {

	public PagamentoPIX(double valor) {
		super(valor);
	}

	@Override
	void efetuarPagamento() {
		System.out.println("Processando pagamento no PIX");
	}

}
