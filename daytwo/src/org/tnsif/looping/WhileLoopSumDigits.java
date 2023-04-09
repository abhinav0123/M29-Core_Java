package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopSumDigits { 
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	       
	        int num = scanner.nextInt();
	        int sum=0;
	       while(num>0) {
	    	   sum = sum+ num % 10;
	            num =num/ 10;
	        }
	       
	        System.out.println("The sum of digits is " +sum);
	    }
		
		 
		 

}
