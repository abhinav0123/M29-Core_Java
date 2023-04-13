package org.tnsif.AssignmentOnFunctions;

import java.util.Scanner;

public class FactorialUsingRecursion {
	static int factorial(int num) {
		if(num!=0)
			return num * factorial(num-1);
		return 1;
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number: ");
	int num = sc.nextInt();
	
	System.out.println("Factorial of a given number is: "+factorial(num));
	sc.close();

	}

}
