/*Program to demonstrate on creating Thread by
 * extending a Thread class*/
package org.tnsif.multithreading;

public class ThreadProgram extends Thread{
	public void run() {
		System.out.println("Thread is in running state");
		
	}

	public static void main(String[] args) {
		// ThreadProgram.run();
		ThreadProgram t=new ThreadProgram();
		t.start();
		/*if the Thread is in starting state or in running 
		 * state,we can't start again
		 * t.start();*/
		

	}

}