package org.tnsif.stringsprogram;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("John");
		//the capacity of an empty string is 16
		System.out.println(str1.capacity());
		System.out.println(str1.charAt(2));

	}

}
