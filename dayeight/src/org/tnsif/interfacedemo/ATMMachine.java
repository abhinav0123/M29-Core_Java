package org.tnsif.interfacedemo;

public interface ATMMachine {
	/*all the variabbles inside an interface is by
	 * default public staic final*/
	 int amount=1250;
	 int amountWithdraw=1154;
	 int amountDeposit=1456;
	/* by default all the methods inside an interface*/
	void withdraw();
	void deposit();

}
