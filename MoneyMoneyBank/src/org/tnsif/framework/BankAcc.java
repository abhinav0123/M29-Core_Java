package org.tnsif.framework;

public abstract class BankAcc {
	
	//private data members
	private int accNo;
	private String accNm;
	private float accBal;
	
	//parameterized constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	//methods
	abstract public void withdraw(float amount);
	public void deposit(float amount) {
		System.out.println("Account No: "+this.getAccNo()+"Account Name: "+this.getAccNm()+"Account Balance"+this.getAccBal());
	}
	
	//toString Method
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	//getters and setters
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

}