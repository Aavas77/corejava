package controlstatements.selection;

import java.util.Scanner;

public class CalcTest {
	
	/*
	 *  Calculate add/sub/mul/div(+,-,*,/) of two integer values given by user using switch.
	 */
	
	public static void main(String[] args) {
		
		int firstNumber;
		int secondNumber;
		char c;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number");
		secondNumber = sc.nextInt();
		
		System.out.println("Enter your operation choice");
		c = sc.next().charAt(0);
		
		switch(c) {
		
		case '+':
			System.out.println(firstNumber+secondNumber);
			break;
			
		case '-':
			System.out.println(firstNumber-secondNumber);
			break;
			
		case '*':
			System.out.println(firstNumber*secondNumber);
			break;
			
		case '/':
			System.out.println((double)firstNumber/secondNumber);
			break;
			
		default: 
			System.out.println("Invalid Input");
		}
		
		sc.close();
	}

}
