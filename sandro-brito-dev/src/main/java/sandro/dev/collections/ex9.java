package sandro.dev.collections;

import java.util.HashMap;
import java.util.Map;

public class ex9 {
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.merge("Alex", 500, Integer::sum);
		map.merge("Alex", 900, Integer::sum);
		map.merge("Alex", 300, Integer::sum);
		
		map.merge("Sandro", 650, Integer::sum);
		map.merge("Sandro", 350, Integer::sum);
		map.merge("Sandro", 150, Integer::sum);
		
		
		for (String key : map.keySet()) {
			System.out.println(key + " : R$ "+ map.get(key));
		}
		
	}

}
