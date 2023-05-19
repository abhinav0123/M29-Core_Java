package org.tnsif.stringsprogram;

public class StringSimpleProgram {

	public static void main(String[] args) {
		//using string literal
		String str1 = "John";
		System.out.println("Using string literal: "+str1);
		
		//using new keyword
		String str2= new String("John");
		System.out.println("Using new keyword: "+str2);
		String str3 = new String("John");
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str1.equals(str2));

	}

}
