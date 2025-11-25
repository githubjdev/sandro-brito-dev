package sandro.dev.abstracao;

public class SistemaBancario {
	
	public void efetuarPagamento(Pagamento pagamento) {
		System.out.println("----------------------------------");
		pagamento.efetuarPagamento();
		pagamento.confirmarPagamento();
	}

}
