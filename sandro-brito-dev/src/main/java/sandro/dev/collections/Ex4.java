package sandro.dev.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import sandro.dev.array.Aluno;

public class Ex4 {
	
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(new Aluno("Pedro", 19, "Aprovado"));
		alunos.add(new Aluno("Alex", 39, "Aprovado"));
		alunos.add(new Aluno("Paulo", 35, "Reprovado"));
		alunos.add(new Aluno("João", 19, "Reprovado"));
		
		/*Sort (ordenação) -  compara do nome para ordenação alfabética*/
		alunos.sort(Comparator.comparing(Aluno::getNome));
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
		
	}

}
