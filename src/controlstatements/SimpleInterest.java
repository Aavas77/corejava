package controlstatements;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		int p, t, r;
		float si;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle: ");
		p = sc.nextInt();
		
		System.out.println("Enter time");
		t = sc.nextInt();
		
		System.out.println("Enter rate");
		r = sc.nextInt();
		
		if(p!=0 && t!=0 && r!=0) {
			si = (float)((p*t*r)/100);
			System.out.println("Simple Interest: " + si);
		}
		
		
		
	}
}
