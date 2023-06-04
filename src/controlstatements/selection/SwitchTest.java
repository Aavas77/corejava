package controlstatements.selection;

public class SwitchTest {
	
	/*
	 * ========================switch============================
	 * 
	 * 	syntax:
	 * 	
	 * 		switch(variable/expression){
	 * 
	 * 		case 1:
	 * 			//statements
	 * 			break;
	 * 		
	 * 		case 2:
	 * 			//statements
	 * 			break;
	 * 			.................
	 * 			.................
	 * 			..................
	 * 		default:
	 * 			//statements
	 * 		}
	 * 
	 */
	
	public static void main(String[] args) {
		
		int day = 4;
		
		switch(day) {
		
		case 1:
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thursday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;
			
		default:
			System.out.println("Invalid Input");
				
		}
		
		/*
		 * Q. Calculate total salary for following post:
		 * 
		 * 		post		Basic Salary		Bonus		Total Salary
		 * 	  --------		------------		-------		-------------
		 * 		MD				359000			20.67%			?
		 * 		CEO				234000			18%				?
		 * 		Manager			187000			17.88%			?
		 * 		Helper			127809			11%				?
		 * 
		 */
		
	}

}
