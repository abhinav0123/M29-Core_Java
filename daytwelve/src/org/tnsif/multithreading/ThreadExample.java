//program to demonstrate on MultiThreading
package org.tnsif.multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		//returns a reference to the currently executing thread object
		Thread t = Thread.currentThread();
		System.out.println("Current thread: "+t);

	}

}
