package org.tnsif.entities;
public class Student {
	
	//private data members
	private int rollno;
	private String name;
	
	//default constructor
	public Student() {
		
	}
	//parameterized constructor
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}	


	//getters and setters methods
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	

}