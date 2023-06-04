package abstraction;

// functional interface : contains only one abstract method
@FunctionalInterface // this makes an interface functional therefore not 
					 // allowing any other methods to be added
public interface TestService {
	
	void email();

}
