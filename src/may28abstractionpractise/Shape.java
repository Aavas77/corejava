package may28abstractionpractise;

public abstract class Shape {
	/*
	 * We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 
	 * 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' 
	 * and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length 
	 * and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create
	 * another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 
	 * 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an 
	 * object of class 'Area' and call all the three methods.
	 */
	
	abstract void RectangleArea(int l, int b);
	abstract void SquareArea(int l);
	abstract void CircleArea(int r);
	
}
