package sandro.dev.switcase;

public class Ex1 {

	public static void main(String[] args) {

		int dia = 3; // banco de dados, da tela, de qualquer lugar
		String nomeDia = null;

		switch (dia) {
		case 1:
			nomeDia = "Domingo";
			break;
		case 2:
			nomeDia = "Segunda";
			break;
		case 3:
			nomeDia = "terça";
			break;
		}
		
		System.out.println("Dia da semana: " + nomeDia);
		
		
		String nomeDoDia = switch (dia) {
		    case 1 -> "Domingo";
		    case 2 -> "Segunda";
		    case 3 -> {
		    	      dispararPromocao();  /*Vamos executar um método*/
		    	      yield "Terça feira";
		    }
		    default -> "Não encontrado";
		};
		
		
		System.out.println("Nome do dia: " + nomeDoDia);

	}
	
	
	public static void dispararPromocao() {
		System.out.println("Promoção disparada");
	}

}
