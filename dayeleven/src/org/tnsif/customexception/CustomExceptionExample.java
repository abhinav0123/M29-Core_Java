package org.tnsif.customexception;
import java.util.Scanner;

public class CustomExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String password =sc.nextLine();
		try {
		if(id.equals("xyz@gmail.com")&& 
				password.equals("pass@123")) {
			System.out.println("Credentials matched");
			
		}
		else {
			throw new LoginCredential("Invalid credentials");
		}

	}
		//handling using UD exceptions
		catch(LoginCredential e) {
			System.out.println("Exception handled "+e);
			
			
		}
	}

}
