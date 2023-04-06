package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchCaseProgram {
    
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter you choice: ");
		int song= sc.nextInt();
		switch(song) {
		case 1:
			System.out.println("Calm Down");
			break;
		case 2:
			System.out.println("Baller");
			break;
		case 3:
			System.out.println("Desires");
			break;
		case 4:
			System.out.println("Mallem song");
			break;
		default:
			System.out.println("Invalid input");
			
		}
		

	}

}
