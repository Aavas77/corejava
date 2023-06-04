package controlstatements.selection;

import java.util.Scanner;

public class IfTest {
	
	/*
	 * ===========================if==============================
	 * syntax:
	 * 		
	 * 		if(condition){
	 * 
	 * 			//statements
	 * 
	 * 		}
	 * 
	 */
	
	public static void main(String[] args) {
		
		int salary;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary ");
		salary = sc.nextInt();
		
		if(salary < 20000) {
			salary = salary + 6000;
		}
		
		System.out.println("Total salary = " + salary);
		
		sc.close();
	}
	
	
}
