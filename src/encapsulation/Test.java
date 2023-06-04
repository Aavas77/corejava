package encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		c.setId(23);
		c.setName("Aroka");
		c.setAge(32);
		c.setCity("Rinoka");
		c.setPhone("9833848493");
		
		System.out.println(c);
		
	}
	
}
