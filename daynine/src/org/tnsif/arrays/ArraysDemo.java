package org.tnsif.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		//compile-time
		int arr[]= {12,6,90,67};
		/* if we access 4th index, we will get an exception
		as array Array out of bounds exception*/
		//System.out.println(arr[4]);
		System.out.println("Array of second index is: "+arr[2]);
		//for printing all the array elements
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
