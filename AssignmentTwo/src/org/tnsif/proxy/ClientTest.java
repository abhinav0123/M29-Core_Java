package org.tnsif.proxy;

public class ClientTest {

	public static void main(String[] args) {
		VeryExpensiveProcess veryExpensiveProcess = new VeryExpensiveProcessProxy();
		veryExpensiveProcess.process();
		veryExpensiveProcess.process();
	}

}
