package org.tnsif.classandobject;

import java.util.Scanner;

public class ConstructerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id ;
		String city,name;
		System.out.println("Enter the customer id: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Customer Name: ");
		name = sc.nextLine();
		System.out.println("Enter the Customer City: ");
		city = sc.nextLine();
		Customer c = new Customer() ;
		
			c.setCustomerId(id);
			c.setCustomerName(name);
			c.setCity(city);
			
			System.out.println(c);
			
			
			System.out.println("Enter the customer id: ");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Customer Name: ");
			name = sc.nextLine();
			System.out.println("Enter the Customer City: ");
			city = sc.nextLine();
			Customer c1 = new Customer(id,name,city) ;
			System.out.println(c1);
		

	}

}
