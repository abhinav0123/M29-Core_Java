package org.tnsif.decisionmaking;
import java.util.Scanner;
public class CascadedIfElseProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the three values: ");
		float percentage1=s.nextFloat();
		float percentage2=s.nextFloat();
		float percentage3= s.nextFloat();
		if(percentage1>percentage2 && percentage1>percentage3) {
			System.out.println("Person1 has highest percentage");

		}
		else if(percentage2>percentage1 && percentage2>percentage3) {
			System.out.println("Person2 has highest percentage");

			
		}
		else {
			System.out.println("Person3 has highest percentage");

		}


	}

}
