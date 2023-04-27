//program to demonstrate on abstract class and abstract method
package org.tnsif.abstractkeyworddemo;

/* if any class contain at least one abstract method then
 * that class must be declared as abstract class  */

public abstract class Remote {
	
	public String cellName1;
	public String cellName;
	
	//abstract class can contain abstract as well as concrete method/
	
	//abstract method
	abstract void functionRemote();
	abstract void create();
	
	//non-abstract or concrete method
	void display() {
		System.out.println("Cell name is: "+cellName1);
	}
}

//Implementable class/
class RemoteChild extends Remote {

	@Override
	void functionRemote() {
		System.out.println("Abstract method is implemented");	
	}
	
	
	//Implement all abstract method in implementable class/
	@Override
	void create() {
		System.out.println("Abstarct method-2");
	}
	
}