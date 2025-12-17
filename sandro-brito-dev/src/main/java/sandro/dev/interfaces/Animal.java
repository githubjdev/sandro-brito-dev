package sandro.dev.interfaces;

public interface Animal extends Servivo {

	void emitirSom();

	void correr();
	
	/*Não é obrigatório sobreescrever*/
	default void domir() {
		System.out.println("Animal está dormindo");
	}

}
