package controlstatements.selection;

public class NestedIfElse {
	
	/*
	 * Syntax
	 * if(condition 1(){
	 * 		if(condition 2(){
	 * 
	 * 			if(condition 3(){
	 * ................
	 * ....................
	 * }else{
	 * 		}
	 * }else{
	 * 		}
	 * }
	 * 
	 */

	public static void main(String[] args) {
		
		String citizen = "nepali";
		int age = 40;
		boolean haveVoterId = false;
		
			if(citizen.equals("nepali")) {
				
				if(age>=18) {
					
					if(haveVoterId) {
						System.out.println("You can vote");
					}else {
						System.out.println("You don't have voter id");
					}

				}else {
					System.out.println("You are under age");
				}
				
			}else{
				System.out.println("Invalid citizenship !!");
			}
	}
}
