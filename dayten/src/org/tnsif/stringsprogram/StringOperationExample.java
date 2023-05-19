package org.tnsif.stringsprogram;

public class StringOperationExample {

	public static void main(String[] args) {
		String str1 = new String("John ");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf('a'));
		System.out.println(str1.hashCode());
		System.out.println(str1.concat("Charles"));
		System.out.println(str1+"Charles");

	}

}
