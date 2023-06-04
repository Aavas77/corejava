package array;

import java.util.Arrays;

public class SortTest {
	
	public static void main(String[] args) {
		
		int data[] = {23,4,2,5,6343,234,65,4342,44,4,22,5,77,54,33};
		Arrays.sort(data);
		
		System.out.println(Arrays.toString(data));
		
		System.out.println("================================reverse order===================================");
		for(int i=data.length-1;i>=0; i--) {
			
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
		System.out.println("==============================Array Fill================================");
		Arrays.fill(data, 55);
		System.out.println(Arrays.toString(data));
		Arrays.fill(data, 4, 9, 77);
		System.out.println(Arrays.toString(data));
		
		System.out.println("=============================Array copyOf======================================");
		System.out.println(Arrays.toString(Arrays.copyOf(data, 5)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(data, 3,7)));
		
		
	}

}
