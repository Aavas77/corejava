package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		
		//StudentName, age
//		Map<String, Integer> map = new HashMap<>();
//		Map<String, Integer> map = new TreeMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Hari",30);
		map.put("Rama", 22);
		map.put("Arun", 25);
		map.put("Sabin", 29);
		map.put("Roman", 39);
		
		for(String key : map.keySet()) {
			System.out.println(key+" = "+map.get(key));
		}
		
	}

}
