package collection;

import java.util.Arrays;
import java.util.List;

public class LIstTestTwo {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(23,2,44,323,54,567,23);
		
		list.forEach(s -> System.out.println(s));
		
		System.out.println("===================================");
		
		List<String> slist = List.of("Australia", "Japan", "Korea", "China", "Nepal");
		
		slist.forEach(s -> System.out.println(s));
		System.out.println("=============================");
		
		Arrays.asList("users","student","Employee","childrens").forEach(f -> System.out.println(f));
		
	}

}
