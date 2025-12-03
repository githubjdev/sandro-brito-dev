package sandro.dev.array;

public class Ex9 {
	
	public static void main(String[] args) {
		
		
		double[] notas = new double[5];
		
		notas[0] = 80.7;
		notas[1] = 60.6;
		notas[2] = 60.2;
		notas[3] = 40.3;
		notas[4] = 70.3;
		
		double total = 0;
		
		
		for (double n : notas) {
			total += n;
		}
		
		
		double media = total / notas.length;
		
		System.out.println("Média = " + media);
		
	}

}
