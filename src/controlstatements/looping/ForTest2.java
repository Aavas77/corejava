package controlstatements.looping;

public class ForTest2 {
	
	//print 1 to 100 and sum it all
	public static void main(String[] args) {
		
//		int sum = 0;
		int es = 0;
		int os = 0;
		
		for(int i=1; i<=100; i++) {
//			sum = sum + i;
//			System.out.println(i);
			
			if(i%2==0) {
				es+=i;
			}else {
				os+=i;
			}
			
		}
		
		System.out.println("Even Sum from 1 to 100: " + es);
		System.out.println("Odd Sum from 1 to 100: " + os);
		System.out.println("=================================");
		System.out.println("Total Sum from 1 to 100: " + (es+os));

	}
	
}
