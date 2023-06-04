package oops;

public class Student {
	
//	Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value 
//	of roll_no as '2' and that of name as "John" by creating an object of the class Student
	
//	Assign and print the roll number, phone number and address of two students having names "Sam" and 
//	"John" respectively by creating two objects of class 'Student'.

	String name;
	int roll_no;
	int phone_no;
	String address;
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name = "Sam";
		s1.roll_no = 1;
		s1.phone_no = 4439282;
		s1.address = "Gaudira";
		
		Student s2 = new Student();
		
		s2.name = "John";
		s2.roll_no = 2;
		s2.phone_no = 4543209;
		s2.address = "Chauaar";
		
		System.out.println("Name: "+s1.name);
		System.out.println("Roll No: "+s1.roll_no);
		System.out.println("Phone No: "+s1.phone_no);
		System.out.println("Address: "+s1.address);
		System.out.println();
		
		System.out.println("Name: "+s2.name);
		System.out.println("Roll No: "+s2.roll_no);
		System.out.println("Phone No: "+s2.phone_no);
		System.out.println("Address: "+s2.address);
		
	}
	
	
}
