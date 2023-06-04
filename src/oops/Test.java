package oops;

public class Test {
	
	public static void main(String[] args) {
		
		Book b = new Book();
		
		b.id = 456;
		b.name = "Math";
		b.author = "SK Sharma";
		b.price = 5000;
		
		b.printBook();
		
		System.out.println("__________________________________\n");
		
		Book c = new Book();
		
		c.id = 239;
		c.name = "The Alchemist";
		c.author = "Paulo Cohelo";
		c.price = 3500;
		
		c.printBook();
		
	}

}
