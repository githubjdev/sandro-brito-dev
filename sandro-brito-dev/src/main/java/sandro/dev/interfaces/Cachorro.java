package sandro.dev.interfaces;

public class Cachorro implements Animal {

	private String nome;

	public Cachorro(String nome) {
		this.nome = nome;
	}

	@Override
	public void respira() {
		System.out.println(getNome() + " : está respirando");
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " : au au");
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " : está correndo");
	}
	
	@Override
	public void domir() {
		System.out.println(getNome() + ": está dormindo");
	}

	public String getNome() {
		return nome;
	}

}
