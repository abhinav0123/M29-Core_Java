package org.tnsif.interfacedemo;
/* Nested interface: Inside an interface , 
 * there will be another interface
 */
public interface OuterInterface {
	int sum();
	interface InnerInterface{
		String concanate();
	}

}
