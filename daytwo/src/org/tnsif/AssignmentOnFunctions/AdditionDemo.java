package org.tnsif.AssignmentOnFunctions;

import java.util.Scanner;

public class AdditionDemo {
	static int addition(int x,int y) {
		int sum = x+y;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values x and y: ");
		int x= sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("The sum is: "+addition(x,y));
	}

}
