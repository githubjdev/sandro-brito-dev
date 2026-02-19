package sandro.dev.collections;

import java.util.HashMap;
import java.util.Map;

public class Ex6 {
	
	
	public static void main(String[] args) {
		
		/*Key = nome da pessoa, valeu = pedido da pessoa*/
		Map<String, Pedido> pedidos = new HashMap<String, Pedido>();
		
		pedidos.put("Alex Fernando", new Pedido("Fazendo", "Mc Feliz"));
		pedidos.put("Sandro Brito", new Pedido("Fazendo", "Mc Bacon"));
		
		
		
		/*Mostra na tela, monitor, aplicativo, sistema, relatório*/
		for (String key : pedidos.keySet()) {
			
			Pedido pedido = pedidos.get(key);
			
			String descricao = key + " - " + pedido.getStatus() + " - " + pedido.getProduto();
			System.out.println(descricao);
			
		}
		
		
	}

}
