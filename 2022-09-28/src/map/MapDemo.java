package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, Integer> map12 = new LinkedHashMap<>();
		map12.put(2, 3);
		System.out.println(map12.get(2));;

		Map<String, String> map2 = new TreeMap<>();
		map2.put("table", "a furniture with 4 legs");
		map2.put("apple", "a sweet fruite");
		
		System.out.println(map2);
		System.out.println("table" + map2.get("table"));
		
		System.out.println(map2.containsKey("aaa"));
		System.out.println(map2.containsKey("java"));

	Set<String> words = map2.keySet();
	System.out.println(words);
	
	Collection<String> definitions = map2.values();
	List<String> definitionsList = new ArrayList<>(map2.values());
	System.out.println(definitions);
	}

}
