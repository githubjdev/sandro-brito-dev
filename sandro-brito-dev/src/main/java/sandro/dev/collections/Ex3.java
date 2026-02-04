package sandro.dev.collections;

import java.util.HashSet;
import java.util.Set;

import sandro.dev.array.Aluno;

public class Ex3 {

	public static void main(String[] args) {

		/* O SET (HahSet) Evitar dados duplicado */
		Set<String> emails = new HashSet<String>();
		emails.add("alex@gmail.com");
		emails.add("alex@gmail.com");
		emails.add("joao@gmail.com");
		emails.add("alex@gmail.com");

		System.out.println(emails);
		
		/*Precisa do Equals e HasCode implementado na classe Aluno para diferenciar os objetos*/
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno("Alex", 39, "Aprovado")); 
		alunos.add(new Aluno("João", 19, "Reprovado"));
		alunos.add(new Aluno("Alex", 39, "Aprovado")); /*Objeto repetido*/
		alunos.add(new Aluno("Paulo", 35, "Reprovado"));
		
		
		for (Aluno aluno : alunos) {
			aluno.mostrar();
		}

	}

}
