package datatype;

public class DataType {
	
	/*
	 * ==============================Data Type==================================
	 * # proper data representation
	 * # proper memory allocation
	 * # proper operation to be performed
	 * 
	 * # Types:
	 * 1. Primitive :
	 * 	a. byte 
	 * 	b. short 
	 * 	c. int - by default java whole number
	 * 	d. long 
	 * 	e. float
	 * 	f. double - by default decimal number
	 * 	g. char
	 * 	h. boolean
	 * 2. Non - primitive
	 *	a. String
	 *	b. Array 
	 *	c. Classes
	 *	d. Collection
	 *	e. Enum
	 *	f. Date
	 * 
	 */

	public static void main(String[] args) {
		
		long a = 200000000000L;		
		float k = 5.6f;
		
		System.out.println("byte= "+Byte.SIZE+ " " + Byte.MIN_VALUE+" "+ Byte.MAX_VALUE);
		System.out.println("short= "+ Short.SIZE + " " +Short.MIN_VALUE + " "+ Short.MAX_VALUE);
		System.out.println("int= "+ Integer.SIZE+" "+ Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
		System.out.println("long= "+ Long.SIZE + " " +Long.MIN_VALUE + " "+ Long.MAX_VALUE);
		System.out.println("float= "+ Float.SIZE + " " +Float.MIN_VALUE + " "+ Float.MAX_VALUE);
		System.out.println("double= "+ Double.SIZE + " " +Double.MIN_VALUE + " "+ Double.MAX_VALUE);
		System.out.println("char= "+ Character.SIZE);
		
		
	}
}




