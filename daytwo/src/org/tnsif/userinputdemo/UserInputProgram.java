package org.tnsif.userinputdemo;

import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float salary = s.nextFloat();
		System.out.println("Enter your salary: ");
		s.close();

	}

}
