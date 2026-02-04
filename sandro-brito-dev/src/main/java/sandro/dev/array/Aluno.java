package sandro.dev.array;

import java.util.Objects;

public class Aluno {

	String nome;
	int idade;
	private String status;

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno(String nome, int idade, String status) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.status = status;
	}

	public void mostrar() {
		System.out.println("Nome: " + nome + ", idade: " + idade);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return idade == other.idade && Objects.equals(nome, other.nome) && Objects.equals(status, other.status);
	}

}
