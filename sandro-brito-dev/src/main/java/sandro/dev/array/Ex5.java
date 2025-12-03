package sandro.dev.array;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] valores = new int[3];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite um número da posição : " + i);
			valores[i] = sc.nextInt();
		}
		
		System.out.println("---------------------------------------------");
		
		int soma = 0;
		for (int val : valores) {
			soma += val;
		}
		
		
		System.out.println("Valor da soma: " + soma);
		
		
		System.out.println("-------------------MAIOR VALOR------------------");
		
		int maior = valores[0];
		
		for (int n : valores) {
			if (n > maior ) {
				maior = n;
			}
		}
		
		System.out.println("Maior número = " + maior);
		
		
	}

}
