package methodoverriding;

public class Test {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		CentralBank nmb = new NMB();
		t.printBankInfo(nmb);
		
		//static or early binding of object	: only for one
		NabilBank nb = new NabilBank();
		
		t.printBankInfo(nb);
		
		//up-casting : child ko object and parent ko reference || child's object can be accessed through parent
		CentralBank lb = new LaxmiBank();
		
		lb.getBankName();
		lb.getInterestRate();	
		
	}

	//late or dynamic binding of object : fits for all
	//run-time polymorphism
	void printBankInfo(CentralBank b) {
		
		b.getBankName();
		b.getInterestRate();
	}
	
}
