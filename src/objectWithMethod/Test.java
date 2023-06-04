package objectWithMethod;

public class Test {

	public static void main(String[] args) {
		
		Account ac = new Account();
		 ac.setNumber(1111111111);
		 ac.setName("Aavas");
		 ac.setBalance(770000000);
		 ac.setType("Savings");
		 ac.setBankName("World Bank");
		 
		 Test t = new Test();
		 t.printAccountDetails(ac);
		 
		 Account account = new Account();
		 
		 account = t.getAccountDetails();
		 t.printAccountDetails(account);
		
	}
	
	//=============================object as parameter==========================
	void printAccountDetails(Account ac) {
		
		System.out.println("Acc.Number = "+ac.getNumber());
		System.out.println("Name = "+ac.getName());
		System.out.println("Balance = "+ac.getBalance());
		System.out.println("Type = "+ac.getType());
		System.out.println("Bank = "+ac.getBankName());
		System.out.println();
	}
	
	//===========================object as return type==========================
	
	Account getAccountDetails() {
		
		Account ac = new Account();
		
		ac.setName("Pizza");
		ac.setNumber(23433242);
		ac.setBalance(234341032);
		ac.setBankName("Local Bank");
		ac.setType("Spendings");
		
		return ac;
		
	}
	
}
