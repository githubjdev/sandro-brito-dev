package sandro.dev.array;

public class Ex10 {

	public static void main(String[] args) {
		
		
		Aluno[] alunos = new Aluno[3];
		
		
		alunos[0] = new Aluno("Alex", 38);
		alunos[1] = new Aluno("Marcos", 16);
		alunos[2] = new Aluno("Maria", 27);
		
		
		for (Aluno aluno : alunos) {
			aluno.mostrar();
		}
		

	}

}
