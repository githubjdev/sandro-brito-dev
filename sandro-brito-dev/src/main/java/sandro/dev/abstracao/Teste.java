package sandro.dev.abstracao;

public class Teste {

	public static void main(String[] args) {
		
		Pagamento pix = new PagamentoPIX(50.0);
		Pagamento cartao = new PagamentoCartao(80.0);
		Pagamento boleto = new PagamentoBoleto(80.0);
		
		SistemaBancario bancario = new SistemaBancario();
		bancario.efetuarPagamento(pix);
		bancario.efetuarPagamento(cartao);
		bancario.efetuarPagamento(boleto);

	}

}
