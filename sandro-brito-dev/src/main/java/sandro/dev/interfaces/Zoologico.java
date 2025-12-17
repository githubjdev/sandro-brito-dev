package sandro.dev.interfaces;

public class Zoologico {
	
	
	public void interagirComAnimal(Animal animal) {
		
		System.out.println("=====================================");
		animal.respira();
		animal.correr();
		animal.emitirSom();
		animal.domir();
	}

}
