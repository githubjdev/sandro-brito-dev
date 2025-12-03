package sandro.dev.array;

public class Ex4 {
	
	public static void main(String[] args) {
		
		
		int[] notas = new int[5];
		
		notas[0] = 10;
		notas[1] = 60;
		notas[2] = 30;
		notas[3] = 40;
		notas[4] = 98;
		
		
		System.out.println("Posição inicial :" + notas[3]);
		
		
		notas[3] = 55;
		
		
		System.out.println("Valor alterado: " + notas[3]);
		
		
	}

}
