package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,6,7,3,5,34,67,32);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.fill(list, 777);
		System.out.println(list);
		
	}

}
