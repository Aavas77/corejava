package may28abstractionpractise;

public class StudentB extends Marks{
	int total = 0;
	
	StudentB(int a, int b, int c, int d){
		total = a+b+c+d;
	}

	@Override
	float getPercentage() {
		float avg = total/4f;
		return avg;
	}
	
	

}
