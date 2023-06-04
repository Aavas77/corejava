package may28abstractionpractise;

import java.util.Scanner;

public class TestSeven {
	/*
	 * We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three 
	 * abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter 
	 * each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 
	 * 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 
	 * 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object
	 *  of class 'Area' and call all the three methods.
	 
	 * Repeat the above question for 4 rectangles, 4 squares and 5 circles.
	 * Hint- Use array of objects.
	 */
	public static void main(String[] args) {
		
		Shape7[] r = new Area7[4];
		Shape7[] s = new Area7[4];
		Shape7[] c = new Area7[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<r.length;i++) {
			Shape7 shape = new Area7();
			int l,b;
			System.out.println("Enter length of rectangle "+i+" : ");
			l = sc.nextInt();
			System.out.println("Enter breadth of rectangle "+i+" : ");
			b = sc.nextInt();
			
			shape.rectangleArea(l, b);
		}
		
	}
	
}
