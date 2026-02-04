package sandro.dev.collections;

import java.util.ArrayList;
import java.util.List;

import sandro.dev.array.Aluno;

public class Ex5 {
	
	public static void main(String[] args) {
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(new Aluno("Pedro", 19, "Aprovado"));
		alunos.add(new Aluno("Alex", 39, "Aprovado"));
		alunos.add(new Aluno("Paulo", 35, "Reprovado"));
		alunos.add(new Aluno("João", 19, "Reprovado"));
		
		
		//alunos.isEmpty(); /*verifica se uma lista está vazia*/
		//alunos.size(); /*Saber o tamanho da lista*/
        //alunos.add(null)	; /*Adiconar objetos dentro da lista*/	
        //alunos.addAll(alunos); /*Adicona uma lista dentro da lista*/
        //alunos.remove(alunos); /*Remover obejtos de da lista*/
	    //alunos.indexOf(alunos); /*Saber a posição que o obejto está na lista*/
		
		
		/*Percorrer a lista com foreach*/
		for (Aluno aluno : alunos) {
			aluno.mostrar();
		}
		
		/*Apenas se precisar indicar o index do objeto*/
		/*Percorrer a lista com index*/
		for (int i = 0; i < alunos.size(); i++) {
			alunos.get(i).mostrar();
		}
		
	}

}
