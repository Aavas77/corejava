package controlstatements.looping;

public class EnhancedForTest {
	/*
	 * ====================================Enhanced For Loop/forEach==================================
	 * 
	 * 	# use to read data from collection
	 * 
	 * syntax:
	 * 
	 * 		for(data_type var : collection){
	 * 
	 * 				//statements
	 * 		}
	 * 
	 */
	
	public static void main(String[] args) {
		
		int values[] = {23,43,25,4058,65567,8976,54,3567,89};
		int s = 0;
		
		for(int x : values) {
			System.out.println(x);
			s = s + x;
		}
		System.out.println("_______");
		System.out.println(s);
		
	}

}
