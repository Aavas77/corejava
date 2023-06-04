package array;

import java.util.Scanner;

public class ArrayPractise1 {
	
	/*
	 *	Q> WAP to store and print total price, average price of 10 books
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float bookPrice[] = new float[5];
		float totalPrice = 0;
		float avgPrice;
		
		for(int i=0; i<bookPrice.length; i++) {
			System.out.println("Enter book price");
			bookPrice[i] = sc.nextInt();
			
			totalPrice = totalPrice + bookPrice[i];
		}
		
		avgPrice = (float) totalPrice/bookPrice.length;
		
		System.out.println("Total price of books: " + totalPrice);
		System.out.println("Average price of books: " + avgPrice);
		
		sc.close();
		
	}
}
