package oops;

import java.util.Scanner;

public class Area {

	/*
	 * Write a program to print the area of a rectangle by creating a class named 'Area' having 
	 * two methods. First method named as 'setDim' takes length and breadth of rectangle as 
	 * parameters and the second method named as 'getArea' returns the area of the rectangle. 
	 * Length and breadth of rectangle are entered through keyboard.
	 */
	
	int length;
	int breadth;
	
	 void setDim(int l, int b) {
		length = l;
		breadth = b;
	}
	
	int getArea() {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		
		Area a = new Area();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of rectangle");
		a.length = sc.nextInt();
		System.out.println("Enter breadth of rectangle");
		a.breadth = sc.nextInt();
		
		a.setDim(a.length,a.breadth);
		System.out.println(a.getArea());
		
		sc.close();
		
	}
	
	
//	public static void main(String[] args) {
//		
//		setDim(55,44);
//		System.out.println(getArea());
//		
//	}
//	
//	static int length;
//	static int breadth;
//	
//	static void setDim(int l, int b) {
//			length = l;
//			breadth = b;
//	}
//	
//	static int getArea() {
//		int area = length * breadth;
//		return area;
//	}
	
}
