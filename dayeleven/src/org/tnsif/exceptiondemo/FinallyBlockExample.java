package org.tnsif.exceptiondemo;

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		int arr[]= new int[]  {101,102,103};
		System.out.println("Array is: ");
		try {
			System.out.println(arr[3]);
		}
		catch(Exception e){
			System.out.println("Exception handled");
			/*1. when we call System.exit(0), it means
			 * no any further statement is executed */
			//System.exit(0);
		}
		finally {
			System.out.println(13/0);
			System.out.println("Finally block");
		}

	}

}
