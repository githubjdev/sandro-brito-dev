package sandro.dev.switcase;

public class Ex2 {

	public static void main(String[] args) {

		StatusPedido statusPedido = StatusPedido.ENVIADO;
		String mensagem;

		switch (statusPedido) {
		case NOVO:
			mensagem = "Seu pedido doi recebido e está em analise";
			break;

		case PAGO:
			mensagem = "Pagamento confirmado, em breve se enviado";
			break;

		case ENVIADO:
			mensagem = "Seu pedido foi enviado, acompanhe o rastreio";
			break;

		case ENTREGUE:
			mensagem = "Seu pedido foi entregue.";
			break;
			
		 default:
			 mensagem = "Status desconhecido";
		}
		
		System.out.println("Mensagem para o cliente: " + mensagem);

	}

}
