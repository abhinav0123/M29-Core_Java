package org.tnsif.firstpackage;

public class AccessSpecifierExecutor {
	public static void main(String args[]) {
		Base b = new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		/*Private members cannot be accessed by another class*/
		System.out.println(b instanceof Base );
	}

}
