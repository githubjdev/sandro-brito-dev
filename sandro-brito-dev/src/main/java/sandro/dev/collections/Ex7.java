package sandro.dev.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex7 {

	public static void main(String[] args) {

		Map<String, List<Pedido>> pedidos = new HashMap<String, List<Pedido>>();

		pedidos.put("Alex Fernando",
				List.of(new Pedido("Fazendo", "Mc Bacon"), 
						new Pedido("Preparando", "Batata frita")));

		pedidos.put("Sandro Brito", List.of(new Pedido("Fazendo", "Sorvete"), 
				new Pedido("Preparando", "Salada"),
				new Pedido("Preparando", "Mc Feliz")));

		for (String key : pedidos.keySet()) {/*HasMap que é uma lista com key e value*/

			List<Pedido> pedido = pedidos.get(key);/*Para cada chave vc tem a lista de pedido*/

			for (Pedido p : pedido) { /*Percorrer cada pedido*/
				 String descricao = "***" + key + "*** \n"; 
                 descricao += p.getStatus() + " - " + p.getProduto() + "\n";
                 System.out.println(descricao);
			}
			

		}

	}

}
