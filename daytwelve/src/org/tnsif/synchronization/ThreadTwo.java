package org.tnsif.synchronization;

public class ThreadTwo extends Thread{
 Power p;

public ThreadTwo(Power p) {
	super();
	this.p = p;
}
 public void run() {
	 p.printPower(3);
 }
}