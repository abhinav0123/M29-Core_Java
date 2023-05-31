/*Program to demonstrate to create a Thread by
 * implementing runnable interface*/
package org.tnsif.multithreading;

public class MyRunnableThread implements Runnable {
	public void run() {
		System.out.println("Thread is in running state");
		
	}

	public static void main(String[] args) {
		MyRunnableThread t=new MyRunnableThread();
		t.run();
		

	}

}