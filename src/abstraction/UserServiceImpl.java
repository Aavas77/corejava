package abstraction;

public class UserServiceImpl extends CentralBank implements UserService{

	@Override
	public void addUser() {
		System.out.println("Add Success");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("Delete Success");
		
	}

	@Override
	public void print() {
		System.out.println("...................printing");
		
	}

	@Override
	protected void getBankName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void getInterestRate() {
		// TODO Auto-generated method stub
		
	}

}
