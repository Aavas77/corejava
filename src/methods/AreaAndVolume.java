package methods;


public class AreaAndVolume {
	/*
	 * 
	 * Q> Find area and volume as:
	 * 
	 * 		a. getArea:
	 * 			-> pass l and b as parameter
	 * 			-> calculate area
	 * 			-> return area
	 * 			-> call getArea in main method
	 * 
	 * 		b. volume: 
	 * 			-> pass area and height as parameter
	 * 			-> calculate volume
	 * 			-> print area
	 * 			-> print volume
	 * 			-> call this method in main
	 */ 
	 
	
	public static void main(String[] args) {
		 int area = getArea(23, 12);
		 getVolume(area, 34);
		 
		 
		 
	}
	
	
	
	static int getArea(int l, int b) {
		int area = l * b;
		return area;
	}
	
	static void getVolume(int a, int h) {
		int volume = a * h;
		System.out.println("Area: " + a);
		System.out.println("Volume: " + volume);
	}

}
