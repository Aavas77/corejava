package may28abstractionpractise;

public class Cats extends Animals{

	@Override
	void cats() {
		System.out.println("Cats meow");
	}

	@Override
	void dogs() {
	}
	/*
	 * Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a 
	 * class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 
	 * 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object for
	 *  each of the subclasses and call their respective methods.
	 */
	
	
}
