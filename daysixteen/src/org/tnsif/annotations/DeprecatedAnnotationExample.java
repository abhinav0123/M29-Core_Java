package org.tnsif.annotations;

public class DeprecatedAnnotationExample {
	//It allows any elements  no longer to be used
	@Deprecated
	public void print() {
		System.out.println("Welcome to java annotations");
		
	}

	public static void main(String[] args) {
		DeprecatedAnnotationExample d = new DeprecatedAnnotationExample();
		d.print();
		

	}

}
