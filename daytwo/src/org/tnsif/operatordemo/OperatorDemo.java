package org.tnsif.operatordemo;
import java.util.*;
public class OperatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First no.:  ");
		int x= sc.nextInt();
		
		System.out.println("Enter second no.: ");
		int y = sc.nextInt();
		System.out.println("Addition "+(x+y));
		System.out.println("Subtraction: "+(x-y));
		System.out.println("Multiplication: "+(x*y));
		System.out.println("Division:"+ (x/y));



	}

}
