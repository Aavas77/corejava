package oops;

import java.util.Scanner;

public class Complex {
/*
 * Print the sum, difference and product of two complex numbers by creating a class named 
 * 'Complex' with separate methods for each operation whose real and imaginary parts are entered 
 * by user.
 */
	int num1, num2;
	
	void sum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum: "+sum);
	}
	
	void differece(int a, int b) {
		int diff = a-b;
		System.out.println("Difference: "+diff);
	}
	
	void product(int a, int b) {
		int mul = a * b;
		System.out.println("Product: "+mul);
	}
	
	public static void main(String[] args) {
		
		Complex c = new Complex();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		c.num1 = sc.nextInt();
		c.num2 = sc.nextInt();
		
		c.sum(c.num1, c.num2);
		c.differece(c.num1, c.num2);
		c.product(c.num1, c.num2);
		
		sc.close();
		
	}
	
}
