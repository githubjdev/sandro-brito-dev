package sandro.dev.collections;

public class Produto {

	String nome;
	String categoria;

	public Produto(String nome, String categoria) {
		super();
		this.nome = nome;
		this.categoria = categoria;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public String getCategoria() {
		return categoria;
	}

}
