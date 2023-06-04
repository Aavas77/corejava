package methods;

import java.util.Scanner;

//import java.util.Scanner;

public class SIAndAmount {
		/*
		 * 	Q> Find SI and Amount as:
		 * 		a. input
		 * 		b. processing
		 * 		c. output
		 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int p,t,r;
		 
		System.out.println("Enter principle: ");
		p = sc.nextInt();
		System.out.println("Enter time: ");
		t = sc.nextInt();
		System.out.println("Enter rate");
		r = sc.nextInt();
		
		input(p,t,r);
		
		sc.close();
		
	}
	
	static void input(int p, int t, int r) {
		processing(p,t,r);
		
	}
	
	static void processing(int p, int t, int r){
		float SI = (float)(p*t*r)/100;
		float amount = p + SI;
		output(SI, amount);
	}
	
	static void output(float SI, float a) {
		System.out.println("Simple Interest = " + SI);
		System.out.println("Amount= " +a);
	}
}
