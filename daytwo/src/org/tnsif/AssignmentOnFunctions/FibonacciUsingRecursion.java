package org.tnsif.AssignmentOnFunctions;

import java.util.Scanner;

public class FibonacciUsingRecursion {
	
	static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String args[]) {
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = fibo(n);
		
		 for (int i = 0; i <= n; i++) {
             System.out.print(fibo(i)+" ");
         }
	}

}