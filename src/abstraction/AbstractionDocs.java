package abstraction;

public class AbstractionDocs {
	
	/*
	 * =================================Abstraction============================
	 * 	# is the process of hiding implementation details in the program 
	 * 
	 * 	# To achieve abstraction :
	 * 
	 * 		1> Abstract class :
	 * 		#	class which contains abstract(unimplemented) methods and 
	 * 			non-abstract(implemented) methods is known as abstraction.
	 * 
	 * 			# Abstract method :
	 * 			-> Method which does not have implementation/body.
	 * 				e.g.
	 * 					abstract void add();
	 * 					abstract void print(String msg);
	 * 					
	 * 					//non-abstract method
	 * 					void addUser(){
	 * 
	 * 					}
	 * 
	 * 			# we can't create object/instance of abstract class
	 * 			# every abstract class must have at least one child class and
	 * 			  child class must override abstract methods
	 * 
	 * 			# level of abstraction 0-100%
	 * 
	 * 			syntax :
	 * 
	 * 			abstract class class_name{
	 * 
	 * 				//abstract methods
	 * 				e.g.
	 * 					abstract void print();
	 * 
	 * 				//non-abstract methods
	 * 				e.g.
	 * 					void sum(){
	 * 
	 * 					}
	 * 
	 * 			}
	 * 			
	 * 
	 * 		2> Interface :
	 * 
	 * 		-> Same as class which contains public abstract methods and public
	 * 		   static final variables.
	 * 		-> We can't create object of interface
	 * 		-> every interface must have at least one implementation class and impl.
	 * 		   class must override  abstract methods
	 * 
	 * 		-> 100% abstraction
	 * 
	 * 			syntax : 
	 * 			interface interface_name{
	 * 		
	 * 				//public static final variables(constants)
	 * 				
	 * 				//public abstract methods
	 * 
	 * 			}
	 */

}
