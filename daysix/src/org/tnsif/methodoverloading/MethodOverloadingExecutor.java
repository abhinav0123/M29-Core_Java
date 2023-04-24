package org.tnsif.methodoverloading;

public class MethodOverloadingExecutor {
	public static void main(String args[]) {
		MethodOverloadingExample m1= new MethodOverloadingExample();
		System.out.println(m1.multiplication(12.5f, 3.0f));
		System.out.println(m1.multiplication(102.5f, 3));
		System.out.println(m1.multiplication(36, 3.5f));
		System.out.println(m1.multiplication(12,3));
		System.out.println(m1.print("Welome to C2TC"));
		System.out.println(m1.print("Abhinav","Rawat"));


	}

}
