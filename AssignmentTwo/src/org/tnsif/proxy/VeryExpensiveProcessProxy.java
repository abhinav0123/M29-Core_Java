package org.tnsif.proxy;

public class VeryExpensiveProcessProxy implements VeryExpensiveProcess {
    
	private static VeryExpensiveProcess veryExpensiveObject;
 

    @Override
    public void process() {
        if (veryExpensiveObject == null) {
            veryExpensiveObject = new VeryExpensiveProcessImpl();
        }
        veryExpensiveObject.process();
    }
}