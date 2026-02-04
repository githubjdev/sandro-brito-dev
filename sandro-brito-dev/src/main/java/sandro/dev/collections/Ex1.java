package sandro.dev.collections;

import java.util.ArrayList;
import java.util.List;

import sandro.dev.array.Aluno;

public class Ex1 {

	public static void main(String[] args) {
		
		/*Lista generica*/
		List listaGenerica = new ArrayList(); 
		
		listaGenerica.add("Alex");
		listaGenerica.add(new Aluno("Alex", 39));
		
		for (Object object : listaGenerica) {
			if (object instanceof Aluno) {
				Aluno aluno = (Aluno) object;
				aluno.mostrar();
			}else {
				System.out.println(object);
			}
		}

	}

}
