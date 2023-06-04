package objectWithMethod;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		
		t2.printAccountDetails(t2.getAccountDetails());
		
	}
	
	//=======================object as parameter===============================
	void printAccountDetails(Account[] account) {
		for(Account a : account) {
			System.out.println("Customer Name : " + a.getName());
			System.out.println("Account Number : " + a.getNumber());
			System.out.println("Account Type : " +a.getType());
			System.out.println("Account Balance : "+a.getBalance());
			System.out.println("Bank Name : "+a.getBankName());
			System.out.println();
		}
		
	}
	
	//========================object as return type============================
	Account[] getAccountDetails() {
		
		Account[] accounts = new Account[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			Account ac = new Account();
			
			System.out.println("Enter account number : ");
			ac.setNumber(sc.nextInt());
			
			System.out.println("Enter account name : ");
			ac.setName(sc.next());
			
			System.out.println("Enter account type : ");
			ac.setType(sc.next());
			
			System.out.println("Enter account balance : ");
			ac.setBalance(sc.nextInt());
			
			System.out.println("Enter bank name : ");
			ac.setBankName(sc.next());
			
			System.out.println();
			
			accounts[i] = ac;
		}
		
		sc.close();
		
		return accounts;
		
	}
	

}
