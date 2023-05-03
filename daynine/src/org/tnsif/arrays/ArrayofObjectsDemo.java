package org.tnsif.arrays;

public class ArrayofObjectsDemo {

	public static void main(String[] args) {
		Customer[] arr = new Customer[2];
		arr[0]= new Customer(23456,"Rohan");
		arr[1] = new Customer(78566,"Abhinav");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getId()+" "+arr[i].getName());
		}
		

	}

}
