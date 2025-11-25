package sandro.dev.abstracao;

public class PagamentoBoleto extends Pagamento {

	public PagamentoBoleto(double valor) {
		super(valor);
	}

	@Override
	void efetuarPagamento() {
		System.out.println("Processando pagamento no boleto");
	}
	
	
	@Override
	public void confirmarPagamento() {
		System.out.println("Processando pagamento no boleto forma 2");
	}

}
