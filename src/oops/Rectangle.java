package oops;

public class Rectangle {
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.length = 34;
		r.breadth = 22;
		r.area();
		
		
	}
	
	int length;
	int breadth;
	
	void area() {
		
		int area = length * breadth;
		
		System.out.println("Area: "+area);
	}

}
