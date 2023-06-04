package controlstatements.looping;

import java.util.Scanner;

public class ForTest3 {
	
	public static void main(String[] args) {
		int srt;
		int end;
		int es=0;
		int os=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start number: ");
		srt = sc.nextInt();
		
		System.out.println("Enter end number:");
		end = sc.nextInt();
		
		for(int i=srt; i<=end; i++) {
			
			if(i%2==0) {
				es = es+i;
			}else {
				os = os+i;
			}
		}
		
		System.out.println("Even Sum: " + es);
		System.out.println("Odd Sum: " + os);
		System.out.println("=====================");
		System.out.println("Total Sum: " + (es+os));
		
		sc.close();
	}

}
