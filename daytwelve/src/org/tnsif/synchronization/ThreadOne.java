package org.tnsif.synchronization;

public class ThreadOne extends Thread{
	Power p;
    //Parameterized constructor
	public ThreadOne(Power p) {
		super();
		this.p = p;
	}
	public void run() {
		p.printPower(5);
	}

}