package sandro.dev.abstracao;

public class PagamentoCartao  extends Pagamento{

	public PagamentoCartao(double valor) {
		super(valor);
	}

	@Override
	void efetuarPagamento() {
		System.out.println("Processando pagamento no cartão");
	}

}
