package may28abstractionpractise;

public class StudentA extends Marks{
	int total;
	
	StudentA (int a, int b, int c){
		total = a+b+c;
	}
	
	@Override
	float getPercentage() {
		float per = total/3f;
		return  per;
	}

}
