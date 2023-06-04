package controlstatements.selection;

import java.util.Scanner;

public class TotalSalaryTest {
	
	/*
	 * Q. Calculate total salary for following post:
	 * 
	 * 		post		Basic Salary		Bonus		Total Salary
	 * 	  --------		------------		-------		-------------
	 * 		MD				359000			20.67%			?
	 * 		CEO				234000			18%				?
	 * 		Manager			187000			17.88%			?
	 * 		Helper			127809			11%				?
	 * 
	 */

	public static void main(String[] args) {
		
		
		
		String post;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter POST: ");
		post = sc.next();
		post = post.toUpperCase();
		
		
		
		switch(post) {
		
		case "MD":
			double mdSalary = 359000, mdBonus = 20.67/100, mdTotal = mdSalary + (mdSalary*mdBonus);
			
			System.out.println("MD Total Salary: " + mdTotal);
			break;
			
		case "CEO":
			double CEOSalary = 234000, CEOBonus = 18/100, CEOTotal = CEOSalary + (CEOSalary*CEOBonus);
			
			System.out.println("CEO Total Salary: " + CEOTotal);
			break;
			
		case "MANAGER":
			double ManagerSalary = 187000, ManagerBonus = 17.88/100, 
			ManagerTotal = ManagerSalary + (ManagerSalary*ManagerBonus);
			
			System.out.println("MANAGER Total Salary: " + ManagerTotal);
			break;
			
		case "HELPER":
			double HelperSalary = 127809, HelperBonus = 11/100, 
			HelperTotal = HelperSalary + (HelperSalary*HelperBonus);
			
			System.out.println("HELPER Total Salary: " + HelperTotal);
			break;
			
		default: 
			System.out.println("Invalid Input");
			
		}
		
		sc.close();

	}

}
