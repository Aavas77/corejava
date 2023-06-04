package may28abstractionpractise;

public class TestThree {
	
	public static void main(String[] args) {
		
		Marks sa = new StudentA(67,56,77);
		
		System.out.println("Student A Percentage : "+sa.getPercentage());
		
		Marks sb = new StudentB(67,94,78,56);
		
		System.out.println("Student B Percentage : "+sb.getPercentage());
		
		float f = sb.getPercentage();
		
	}

}
