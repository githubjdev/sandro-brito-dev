package sandro.dev.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex8 {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = List.of(new Produto("Arroz", "Alimentos"),
										new Produto("Feijão", "Alimentos"),
										new Produto("Sabão", "Limpeza"));
		
		
		Map<String, List<Produto>> map = new HashMap<String, List<Produto>>();
		
		/*Criando o agrupamento de produtos pela categoria*/
		for (Produto produto : produtos) {
			map.computeIfAbsent(produto.categoria, k -> new ArrayList<Produto>()).add(produto); /*Faz o agrupamento*/
		}
		
		
		for (String key : map.keySet()) {
			List<Produto>  prod = map.get(key);
			
			System.out.println("Categoria: " + key);
			for (Produto p : prod) {
				System.out.println("Produto: " + p.getNome());
			}
			
			System.out.println("--------------------------------------------------");
		}
		
		
	}

}
