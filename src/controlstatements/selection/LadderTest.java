package controlstatements.selection;

import java.util.Scanner;

public class LadderTest {
	
	/*
	 * =========================else if========================
	 * 	syntax:
	 * 
	 * 			if(condition-1){
	 * 			
	 * 			}
	 * 			else if(condition-2{
	 * 
	 * 			}
	 * 			.......................	
	 * 			.......................
	 * 			......................
	 * 			......................
	 * 			else{
	 * 
	 * 			}
	 * 
	 */

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		age = sc.nextInt();
		
		if(age >=70) {
			System.out.println("old age...rest");
		}
		else if(age >=45){
			System.out.println("adult...do less work");
		}
		else if(age >= 30) {
			System.out.println("Young adult...work hard");
		}
		else if(age >= 20) {
			System.out.println("Bachelor....party hard");
		}
		else if(age >= 13) {
			System.out.println("Teenager....study");
		}
		else {
			System.out.println("child........enjoy ur childhood");
		}
		
		sc.close();

	}

}
