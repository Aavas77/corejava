package controlstatements;

import java.util.Scanner;

public class IfElseTest {
	/*
	 * ====================================if-else===============================
	 * syntax:
	 * 	if(condition){
	 * 
	 * 		//statements
	 * 	}else{
	 * 		
	 * 			//statements
	 * 	
	 * 		}
	 * 
	 */
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+ " is even number");
		}else {
			System.out.println(n+" is odd number");
		}
	
		sc.close();
	
	}
}
