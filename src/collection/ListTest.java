package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("nepal");
		list.add("korea");
		list.add("japan");
		list.add("canada");
		
		//list.remove
		list.remove("korea");
		System.out.println("Contains Korea ? "+list.contains("korea"));
		System.out.println("Contains Japan ? "+list.contains("japan"));
		
//		for(String s : list) {
//			System.out.println(s);
//		}
		
		list.forEach(s -> System.out.println(s));	//lambda
		
	}

}
