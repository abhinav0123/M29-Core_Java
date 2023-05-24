package org.tnsif.customexception;

//to create a custom exception we need to extend an exception class
public class LoginCredential extends Exception {
	//private data member
	private String str1;
	
	//parameterized constructor
	public LoginCredential(String str1) {
		super();
		this.str1=str1;
	}

	@Override
	public String toString() {
		return "LoginCredential [str1=" + str1 + "]";
	}
	

}
