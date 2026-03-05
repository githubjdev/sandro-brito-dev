package sandro.dev.operadoresaritmeticos;

public class CalculadoraMain {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		double num1 = 10;
		double num2 = 30;
		
		double soma = calculadora.somar(num1, num2);
		double subtracao = calculadora.subtracao(num1, num2);
		double divisao = calculadora.divisao(num1, num2);
		double multiplicao = calculadora.multiplicao(num1, num2);
		
		
		System.out.println("Soma: " + soma);
		System.out.println("subtracao: " + subtracao);
		System.out.println("divisao: " + divisao);
		System.out.println("multiplicao: " + multiplicao);
		
		
	}

}
