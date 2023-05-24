package org.tnsif.exceptiondemo;

import java.io.IOException;

public class ThrowKeywordException {
	/*throws keyword is used to declare an exception*/
	public static void donate(int age, int weight) throws IOException {
		if(age>18 && weight>50)
			System.out.println("Person is eligible");
		else
			/*throw keyword is used to throw an exception explicitly*/
			throw new IOException("Not Eligible");
	}

	public static void main(String[] args) {
		try {
			ThrowKeywordException.donate(19,45);
		}
		catch(IOException e) {
			System.out.println("Exception handled "+e);
			
		}

	}

}
