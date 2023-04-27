package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		ATMMachine a1 = new ATMMachineChild();
		a1.deposit();
		a1.withdraw();
		ReciepeImplementable r = new ReciepeImplementable();
		r.setName("C2TC Program");
		System.out.println(r.displayName());
		
		NestedInterfaceExample n = new NestedInterfaceExample();
		n.setStr1("John");
		n.setStr2("Smith");
		System.out.println(n.concatenate());

	}
	
}
