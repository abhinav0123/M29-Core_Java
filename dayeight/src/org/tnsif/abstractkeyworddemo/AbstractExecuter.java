package org.tnsif.abstractkeyworddemo;

public class AbstractExecuter {

	public static void main(String[] args) {
		/* If class contains abstract method we cannot instantiate it*/
		
		//Remote r= new Remote();
		
		RemoteChild r = new RemoteChild();
		r.cellName="DuroCell";
		r.display();
		r.functionRemote();
		r.create();
		
		
		Remote r1 = new RemoteChild();
		r1.cellName="Sigplex";
		r1.display();
		r1.functionRemote();
		r1.create();
	}

}