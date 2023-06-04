package controlstatements.looping;

public class JumpTest {
	
	/*=====================Jumping Statements========================
	 *	1> break;		: exit from loop
	 *	2> continue;	: skip values
	 *	3> return;		: exit from method
	 */
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i==6 || i==9) {
				//break;
				//continue;
				return;
			}
			System.out.println(i);
		}
		
		System.out.println("End for loop");
	}
	
	/*
	 * Q> WAP to check prime number
	 * Q> WAP to print prime number from given range
	 * Q> WAP to count prime numbers in given range
	 */

}
