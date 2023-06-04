package objectWithArray;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		//WAP to store and print data of 5 products
		
		Product[] products = new Product[5];
		Scanner sc = new Scanner(System.in);
		
		//write product in array
		
		for(int i=0; i<5; i++) {
		Product p = new Product();
		
		System.out.println("Enter ID : ");
		p.setId(sc.nextInt());
		
		System.out.println("Enter Name : ");
		p.setName(sc.next());
		
		System.out.println("Enter Price : ");
		p.setPrice(sc.nextInt());
		
		System.out.println("Enter Company : ");
		p.setCompany(sc.next());
		
		products[i] = p;
		
		}
		
		// print product data
		for(Product p : products) {
			System.out.println(p);
		}
		
		sc.close();
	}

}

//Product p2 = new Product();
//
//p2.setId(444);
//p2.setName("Laptop");
//p2.setPrice(50000);
//p2.setCompany("MSI");
//

//
//products[0] = p1;
//products[1] = p2;
