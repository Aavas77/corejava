package oops;

public class Employee {
	/*
	   Write a program that would print the information (name, year of joining, salary, address) of three 
	   employees by creating a class named 'Employee'. The output should be as follows:
				Name  	Year of joining 		Address
				Robert 		1994			 64C- WallsStreat
				Sam 		2000 			 68D- WallsStreat
				John 		1999 			 26B- WallsStreat
	 */
	
	String name,address; int year_of_joining ;
	
	public static void main(String[] args) {
		
		System.out.println("Name \t   Year Of Joining\t\tAddress");
		
		Employee e1 = new Employee();
		
		e1.name = "Robert";
		e1.year_of_joining = 1994;
		e1.address = "64C- WallsStreat";
		
		Employee e2 = new Employee();
		
		e2.name = "Sam";
		e2.year_of_joining = 2000;
		e2.address = "68D- WallsStreat";
		
		Employee e3 = new Employee();
		
		e3.name = "John";
		e3.year_of_joining = 1999;
		e3.address = "26B- WallsStreat";
		
		System.out.println(e1.name + " \t\t "+e1.year_of_joining+" \t\t   "+e1.address);
		System.out.println(e2.name + " \t\t "+e2.year_of_joining+" \t\t   "+e2.address);
		System.out.println(e3.name + " \t\t "+e3.year_of_joining+" \t\t   "+e3.address);
		
	}
	
}
