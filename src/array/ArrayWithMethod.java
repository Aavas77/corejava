package array;

import java.util.Arrays;

public class ArrayWithMethod {
	
	/*
	 * =============================================Array With Method=========================================
	 * 	a> array as parameter
	 * 		//50 values
	 * 		void sum(int a[]){
	 * 		
	 * 		}
	 * 
	 * 	b> array as return type
	 * 
	 * 		int[] get20IntValues(){
	 * 
	 * 		 return array;
	 * 		}
	 */
	
	public static void main(String[] args) {
		
		int[] data = {86,45,7,83,49,27,52,36,40,57};
//		addArray(data);
		addArray(new int[] {86,45,7,83,49,27,52,36,40,57});	//Anonymous array : array without name
		
		countEvenOdds(data);
		int[] oddnos = getOddNumsFrom1to100();
		System.out.println("Odd Numbers form 1 to 100");
		System.out.println(Arrays.toString(oddnos));
	
		int even[] = getSubArrayOfEvens(new int[]{86,45,7,83,49,27,52,36,40,57,8,6,583,26,58,43,56,83,9,89,6,32,4,594});
		System.out.println("Even Numbers: "+Arrays.toString(even));
		
	}
	
	//=========================array as parameter===============================
	
	static void addArray(int values[]){
		int s = 0;
		int sv = values[0];
		for(int x: values) {
			s+=x;
			if(sv > x)
				sv = x;
		}
		System.out.println("Total: " + s);
		System.out.println("Smallest value: "+sv);
	}
	
	static void countEvenOdds(int values[]) {
		int even=0;
		int odd=0;
		
		for(int i : values) {
			if(i%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("===========================================");
		System.out.println("Total Even Numbers: "+even+"\nTotal Odd Numbers: "+odd);
	}
	
	
//	 ================================array as return type==================================
	
	static int[] getOddNumsFrom1to100() {
		int[] oddnos = new int[50];
		int j = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 != 0) {
				oddnos[j] = i;
				j++;
			}
		}
		System.out.println("===========================================");
		return oddnos;
	}
	
	// pass array and return array even no's
	
	static int[] getSubArrayOfEvens(int[] values) {
		int size = 0;
		
		for(int i : values) {
			if(i%2==0)
				size++;
		}
		
		int []even = new int[size];
		int j=0;
		
		for(int x : values) {
			if(x%2==0) {
			even[j] = x;
			j++;
			}
		}
		return even;
	}
	

}
