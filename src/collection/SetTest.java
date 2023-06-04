package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		
//		Set<String> hset = new HashSet<>();
//		
//		hset.add("java");
//		hset.add("phyton");
//		hset.add("php");
//		hset.add("java");
//		hset.add("sql");
//		hset.add("android");
//		
//		hset.forEach(hs -> System.out.println(hs));
		
//Set<String> hset = new TreeSet<>();
//		
//		hset.add("java");
//		hset.add("phyton");
//		hset.add("php");
//		hset.add("java");
//		hset.add("sql");
//		hset.add("android");
//		
//		hset.forEach(hs -> System.out.println(hs));
		
Set<String> hset = new LinkedHashSet<>();
		
		hset.add("java");
		hset.add("phyton");
		hset.add("php");
		hset.add("java");
		hset.add("sql");
		hset.add("android");
		
		hset.forEach(hs -> System.out.println(hs));
		
	}

}
