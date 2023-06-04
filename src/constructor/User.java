package constructor;

public class User {
	
	//instance variable or object ko variable
	String userName;
	String password;
	
	void print() {
		System.out.println("Username = "+userName);
		System.out.println("Password = "+password);
	}
	
	User(){
		userName = "test";
		password = "1234";
	}
	
	//=============================Parameterized Constructor========================
	
	User(String userName, String password){
		
		//this(); //calling default constructor
		//this("ram","2345");//calling parameterized constructor
		
		this.userName = userName;
		this.password = password; //instance variable calling
		
		//this.print(); instance method calling
		
		/*
		 * # 'this' keyword represents current object
		 * # we can call instance variables, methods and constructors
		 * 	 using 'this' keyword
		 */
	}
	
	User(String userName){
		
		this.userName = userName; //instance variable calling
		
		//this.print(); instance method calling
	}
	
	public static void main(String[] args) {
		
		User u = new User("ram","9343");
		//new User("ram","9343").print();
		u.print();
		
		/**
		 * Class {@code Object} is the root of the class hierarchy.
		 * Every class has {@code Object} as a superclass. All objects,
		 * including arrays, implement the methods of this class.
		 */
		
	}

}
