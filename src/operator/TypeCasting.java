package operator;

public class TypeCasting {
/*
 * ================================Type Casting====================================
 * syntax:
 * 		data_type variable=(data_type) val;
 * 
 * a> implicit(auto casting)
 * 
 * 		byte -> short -> int -> long -> float -> double
 * 	
 * 
 * b> explicit(by force)
 * 		double -> float -> long -> int -> short -> byte -> char
 * 
 */
	
	public static void main(String[] args) {
		
		byte k = 45;
		double c = k; //auto casting
		
		float p = 873343.3439f;
		int m = (int) p;
		
		long v = (long) p;
		
		byte z = (byte) p;
		System.out.println(z);
		
		int a = 45;
		int b = 7;
		
		float c1 = (float)a/b;
		
		System.out.println(c1);
		//System.out.printf("%.2f", c1);
		System.out.printf("%.3f", c1);
		
		
	}
	
}
