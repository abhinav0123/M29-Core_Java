//Arithmetic Exception code
package org.tnsif.exceptiondemo;
import java.util.Scanner;
public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		int x= sc.nextInt();
		int y= sc.nextInt();
		//try block contains an exception code
		try {
		System.out.println(x/y);
		}
		
		//catch block handles an exception
		catch(Exception e){
			System.out.println("Exception handled "+e);
			
		}
		//finally block is always executed whether exception occurred or not
		finally {
			System.out.println("Finally block is always executed");
		}
		}

}
