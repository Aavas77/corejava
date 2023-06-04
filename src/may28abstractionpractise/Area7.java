package may28abstractionpractise;

public class Area7 extends Shape7{

	@Override
	int rectangleArea(int l, int b) {
		return l*b;
	}

	@Override
	int squareArea(int l) {
		return l*l;
	}

	@Override
	double circleArea(int r) {
		return Math.PI*r*r;
	}

}
