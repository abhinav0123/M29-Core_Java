package org.tnsif.methodoveriding;

public class RBI {
	
	public float getInterestRate() {
		return 8.3f;
	}
	
}

//child class
class HDFC extends RBI {
	
	public float getInterestRate() {
		
		System.out.println(super.getInterestRate());
		return 12.5f;
	}
	
}
