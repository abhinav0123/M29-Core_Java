/* Program to demonstrate on Junit assertion methods */
package org.sjcem.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitAssertionDemo {

	@Test
	void test() {
		/* Fails if expression is not true */
		assertTrue(10>5);
	}
	
	@Test
	void display() {
		/* Fails if expression is not false */
		assertFalse(10>5);
	}
	
	@Test
	void accept() {
		/* Fails if expression is not null */
		assertNull(null);
	}

}
