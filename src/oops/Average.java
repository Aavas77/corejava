package oops;

import java.util.Scanner;

public class Average {

	//Print the average of three numbers entered by user by creating a class named 'Average' 
	//having a method to calculate and print the average.
	
	int num1, num2, num3;
	
	public static void main(String[] args) {
		
		Average avg = new Average();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter first number: ");
		avg.num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		avg.num2 = sc.nextInt();
		System.out.println("Enter third number: ");
		avg.num3 = sc.nextInt();
		
		avg.avgCalc(avg.num1, avg.num2, avg.num3);
		
		sc.close();
	}
	
		void avgCalc(int n1, int n2, int n3) {
		float avg = (n1+n2+n3)/3f;
		System.out.println("Average: "+avg);
	}
	
	
	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1;
//		int num2;
//		int num3;
//		
//		System.out.println("Enter first number: ");
//		num1 = sc.nextInt();
//		System.out.println("Enter second number: ");
//		num2 = sc.nextInt();
//		System.out.println("Enter third number: ");
//		num3 = sc.nextInt();
//		
//		average(num1,num2,num3);
//		
//	}
//	
//	static void average(int n1, int n2, int n3) {
//		float avg = (n1+n2+n3)/3f;
//		System.out.println("The average of the entered three numbers is "+avg);
//	}
//	
	
}
