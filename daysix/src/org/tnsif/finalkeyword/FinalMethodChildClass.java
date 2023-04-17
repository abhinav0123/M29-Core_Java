package org.tnsif.finalkeyword;

public class FinalMethodChildClass extends FinalMethod{
	public int num =275;
	//method overloading
	final void show(int num) {
		System.out.println("The num is: "+num);
		
	}
	
	
	/*Final method can't be override, we will get compile time error
	 
	 final void show() {
		System.out.println("Salary is: "+salary);
	}*/

}
