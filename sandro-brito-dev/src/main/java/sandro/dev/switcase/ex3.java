package sandro.dev.switcase;

public class ex3 {

	public static void main(String[] args) {

		int statusCode = 404;
		String mensagem;

		switch (statusCode) {
		case 200:
			mensagem = "OK - Requisição bem sucedida.";
			break;
		case 201:
			mensagem = "CREATED - Recurso criado com sucesso.";
			break;
		case 404:
			mensagem = "NOT FOUND - Recurso não encontrado.";
			break;
		}

	}

}
