package org.tnsif.interfacedemo;

public class ATMMachineChild implements ATMMachine{
	
	public void withdraw() {
		System.out.println("Withdraw amount: "+amountWithdraw);
	}
	
	public void deposit() {
		System.out.println("Deposited amount: "+amountDeposit);
	}
	

}
