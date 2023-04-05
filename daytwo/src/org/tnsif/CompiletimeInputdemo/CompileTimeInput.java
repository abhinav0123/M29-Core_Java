package org.tnsif.CompiletimeInputdemo;
import java.util.Scanner;
public class CompileTimeInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		float salary = s.nextFloat();
		System.out.println("Salary is: "+salary);

		System.out.println("Rnter your name: ");
		String name = s.next();

		System.out.println("Name is: "+name);
		System.out.println("Rnter your name1: ");
		String name1 = s.nextLine();
		System.out.println("Name1 is: "+name1);
		System.out.println("Enter your charater: ");
		
		char ch = s.nextLine().charAt(0);
		System.out.println("Character is: "+ch);


		



		s.close();

	}

}
