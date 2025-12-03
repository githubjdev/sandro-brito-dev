package sandro.dev.array;

public class Aluno {
	
	
	String nome;
	int idade;
	
	
	
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	
	public void mostrar() {
		System.out.println("Nome: " + nome + ", idade: " + idade);
	}

}
