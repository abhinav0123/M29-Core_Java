package org.tnsif.AssignmentOnFunctions;
import java.util.Scanner;
public class SumOfDigitsProgram {
	 public static int sumOfDigits(int num) {
	        if (num == 0) {
	            return 0;
	        }
	        else {
	            return num % 10 + sumOfDigits(num / 10);
	        }
	    }

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        int sum = sumOfDigits(num);
	        System.out.println("The sum of digits in " + num + " is " + sum);
	    }
		
		 
		 

	

}

