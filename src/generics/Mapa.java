package generics;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Object> mapUngeneric = new HashMap<>();
		mapUngeneric.put(0, 12);
		mapUngeneric.put(1, "Nome");
		
		for(Map.Entry<Integer, Object> entry: mapUngeneric.entrySet())
			System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
		
		System.out.println();
		Map<String, Integer> mapGeneric = new HashMap<>();
		mapGeneric.put("Chave: 1", 20);   
		mapGeneric.put("Chave: 2", 21);
		
		for(Map.Entry<String, Integer> entry: mapGeneric.entrySet())
			System.out.println(entry.getKey() + ", Valor: " + entry.getValue());
	}
}