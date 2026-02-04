package sandro.dev.collections;

import java.util.ArrayList;
import java.util.List;

import sandro.dev.array.Aluno;

public class ex2 {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();

		/* O add é para adicionar Alunos na lista */
		alunos.add(new Aluno("Alex", 39, "Aprovado"));
		alunos.add(new Aluno("João", 19, "Reprovado"));
		alunos.add(new Aluno("Pedro", 19, "Aprovado"));
		alunos.add(new Aluno("Paulo", 35, "Reprovado"));
		
		/*Remover todos que estão reprovador*/
		alunos.removeIf(a -> "Reprovado".equals(a.getStatus()));
		
		
		for (Aluno aluno : alunos) {
			aluno.mostrar();
		}

	}

}
