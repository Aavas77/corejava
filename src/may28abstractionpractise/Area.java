package may28abstractionpractise;

public class Area extends Shape{
	/*
	 * We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 
	 * 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' 
	 * and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length 
	 * and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create
	 * another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 
	 * 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an 
	 * object of class 'Area' and call all the three methods.
	 */

	@Override
	void RectangleArea(int l, int b) {
		int area = l*b;
		System.out.println("Area of rectangle : "+area);
		
	}

	@Override
	void SquareArea(int l) {
		int a = l*l;
		System.out.println("Area of square : "+a);
		
	}

	@Override
	void CircleArea(int r) {
		double a = Math.PI * r * r;
		System.out.println("Area of circle : "+a);
		
	}
}
