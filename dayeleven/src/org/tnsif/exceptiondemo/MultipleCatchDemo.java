package org.tnsif.exceptiondemo;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		int arr[]= new int[] {101,102,103};
		System.out.println("Array is: ");
		try {
		System.out.println(arr[3]);
		}
		//we can use multiple catch blocks
		//we can pass multiple exception name inside the same catch block
		catch(ArrayIndexOutOfBoundsException |ArithmeticException e) {
			System.out.println("Exception handled"+e);
		}
//		catch(ArithmeticException e) {
//			System.out.println("Exception handled"+e);
//		}
	}

}
