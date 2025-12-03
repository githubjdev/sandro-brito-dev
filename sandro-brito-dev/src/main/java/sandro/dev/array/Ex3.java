package sandro.dev.array;

public class Ex3 {
	
	public static void main(String[] args) {
		
		String[] nomes = {"Ana", "José", "Lucas","Alex","Pedro"};
		
		
		for (String n : nomes) {
			System.out.println(n);
		}
		
		
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
	}

}
