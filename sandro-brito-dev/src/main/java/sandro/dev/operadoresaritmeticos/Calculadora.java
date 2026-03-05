package sandro.dev.operadoresaritmeticos;

public class Calculadora {

	double num1;
	double num2;

	public Calculadora() {
	}

	public Calculadora(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double somar(double num1, double num2) {
		return num1 + num2;
	}

	public double somar() {
		return num1 + num2;
	}

	public double subtracao(double num1, double num2) {
		return num1 - num2;
	}

	public double subtracao() {
		return num1 - num2;
	}

	public double divisao(double num1, double num2) {
		return num1 / num2;
	}

	public double divisao() {
		return num1 / num2;
	}

	public double multiplicao(double num1, double num2) {
		return num1 * num2;
	}

	public double multiplicao() {
		return num1 * num2;
	}

}
