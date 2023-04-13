package org.tnsif.AssignmentOnFunctions;

import java.util.Scanner;

public class FactorialUsingFunctions {
	
	static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=i*fact;
		}
		return fact;
	}
	public static void main(String argd[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("The factorial is: "+factorial(num));
	}

}
