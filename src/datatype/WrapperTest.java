package datatype;

import java.math.BigInteger;

public class WrapperTest {
	/*
	 * ==========================================Wrapper Class========================================
	 * # Every primitive data type has respective class known as wrapper class
	 * 
	 * 	Primitive Class		Wrapper Class
	 * 	---------------		-------------
	 * 	byte					Byte
	 * 	short					Short
	 * 	int						Integer
	 * 	long					Long
	 * 	float					Float
	 * 	double					Double
	 * 	char					Character
	 * 	boolean					Boolean
	 * 
	 * Primitive generally for core calculations and wrapper for conversions 
	 * 
	 */
	
	public static void main(String[] args) {
		
		//'x' is int variable only // primitive type
		int x = 500;
		
		//'y' is int variable and also an object // wrapper type
		Integer y = 700;
		
		/*
		 *================================auto-boxing====================================
		 *	conversion of primitive type into wrapper type 
		 * 
		 */
		
		int p = 3456;
		Integer m = p; //auto-boxing
		
		/*
		 *================================auto-unboxing====================================
		 *	conversion of wrapper type into primitive type 
		 * 
		 */
		
		Double h = 2343432.2343432;
		double l = h; //auto-unboxing
		
		int r = 600000;
		System.out.println(Integer.toBinaryString(r));
		System.out.println(Integer.toOctalString(r));
		System.out.println(Integer.toHexString(r));
		
		
		//============================Big Numbers==================================
		/*
		 * 1. BigInteger
		 * 2. BigDecimal
		 * 
		 */
		
		Integer a1 = Integer.MAX_VALUE;
		Integer a2 = Integer.MAX_VALUE;
		
		BigInteger c = BigInteger.valueOf(a1).add(BigInteger.valueOf(a2));
		System.out.println(c);
		
	}
	
	
}
