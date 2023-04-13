package org.tnsif.singleinheritance;
//Every inheritance is IS-A relationship
//Child class
public class Student extends Citizen {
	//private data members
	private String college;
	private int rollNo;
	
	//default constructor
	public Student() {
		super();
	}
	
	//parameterized constructor
	public Student(String name, String aadharNo, String city, long contactNo, String college, int rollNo) {
		super(name, aadharNo, city, contactNo);
		this.college = college;
		this.rollNo = rollNo;
	}
	
	//getters and setters
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	//toString() method
	@Override
	public String toString() {
		return "Student [college=" + college + ", rollNo=" + rollNo + ", getCollege()=" + getCollege()
				+ ", getRollNo()=" + getRollNo() + ", getName()=" + getName() + ", getAadharNo()=" + getAdharNo()
				+ ", getCity()=" + getCity() + ", getContactNo()=" + getContactNo() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}