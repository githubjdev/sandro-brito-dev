package sandro.dev.interfaces;

public class MainAnimal {

	public static void main(String[] args) {

		Animal gato = new Gato("miau");
		Animal cachorro = new Cachorro("Zeus");

		Zoologico zoologico = new Zoologico();
		zoologico.interagirComAnimal(gato);
		zoologico.interagirComAnimal(cachorro);

	}

}
