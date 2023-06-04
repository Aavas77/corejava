package array;

import java.util.Scanner;

public class ArrayPractise2 {

	//Write a program to find out whether a given integer is present in an array or not.
	
	public static void main(String[] args) {
		
		int[] a = {234,632,6678,134,2343,765,2345,567};
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		n = sc.nextInt();
		
		for(int i : a) {
			if(i==n) {
				System.out.println("The integer you entered is present in the array");
				return;
			}
		}
		
		System.out.println("The integer you entered is not in the array");
		sc.close();
	}
	
}
