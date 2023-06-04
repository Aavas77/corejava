package abstraction;

import java.io.Serializable;
import java.util.List;

public interface UserService extends CommonService,Serializable{
	
	//int MAX = 700;
	
	void addUser();
	void deleteUser();
	
	default void update() {
		//self-implementation in impl. class
	}
	
	static void getUsers() {
		//common impl. for all impl. class
	}

}
