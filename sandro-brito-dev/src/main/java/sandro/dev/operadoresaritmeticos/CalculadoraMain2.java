package sandro.dev.operadoresaritmeticos;

public class CalculadoraMain2 {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora(10, 30);
		
		double soma = calculadora.somar();
		double subtracao = calculadora.subtracao();
		double divisao = calculadora.divisao();
		double multiplicao = calculadora.multiplicao();
		
		System.out.println("Soma: " + soma);
		System.out.println("subtracao: " + subtracao);
		System.out.println("divisao: " + divisao);
		System.out.println("multiplicao: " + multiplicao);
		
	}

}
