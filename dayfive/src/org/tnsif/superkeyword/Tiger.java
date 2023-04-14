package org.tnsif.superkeyword;
//child class
public class Tiger extends Animal {
	public String animalType="Tiger-Wild";
	public int noOfLegs=4;
	public void display() {
		super.display();
		System.out.println(super.animalType);
		System.out.println(super.noOfLegs);
		System.out.println("Animal Type: "+animalType);
		System.out.println("No of legs: "+noOfLegs);
	}
	
	public Tiger() {
		super();
		System.out.println("Tiger class Constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}

}
