package objectWithArray;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		Test3 t = new Test3();
		
		Product[] p = new Product[2];
		
		p = t.getProductDetails();
		
		t.printProductDetails(p);
		
	}
	
	//array of object as parameter
	void printProductDetails(Product[] p) {
		
		for(Product a : p) {
			System.out.println("Product ID : "+a.getId());
			System.out.println("Product Name : "+a.getName());
			System.out.println("Product Price : "+a.getPrice());
			System.out.println("Company Name : "+a.getCompany());
			System.out.println();
		}
		
	}
	
	//array of object as return type
	Product[] getProductDetails() {
		Product[] products = new Product[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			Product p = new Product();
			System.out.println("Enter Product ID : ");
			p.setId(sc.nextInt());
			System.out.println("Enter Product Name : ");
			p.setName(sc.next());
			System.out.println("Enter Product Price : ");
			p.setPrice(sc.nextInt());
			System.out.println("Enter Company Name : ");
			p.setCompany(sc.next());
			System.out.println();
			
			products[i] = p;
		
		}
		sc.close();
		return products;
	}
	
}
