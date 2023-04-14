//Program to demonstrate on super keyword
package org.tnsif.superkeyword;
public class Animal {
	public String animalType="Wild";
	public int noOfLegs=4;
	public void display() {
		System.out.println("Animal Type: "+animalType);
		System.out.println("No of legs: "+noOfLegs);
		
		
	}
	
	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	
}
