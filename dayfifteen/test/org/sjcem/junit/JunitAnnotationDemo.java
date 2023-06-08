/* Program to demonstrate on different annotation which are used in Junit5 */
package org.sjcem.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationDemo {

	@Test
	void display() {
		System.out.println("First Junit Test case");
	}
	
	//@Test
	/* Below annotation denotes that annotated method should be 
	 * executed before all test methods */
	@BeforeAll
	void print() {
		System.out.println("Performing BeforeAll annotation");
	}
	
	
	@Test
	/* Below annotation denotes that annotated method should be 
	 * executed after each test method */
	@AfterEach
	@Disabled
	void accept() {
		System.out.println("AfterEach method is executing...");
	}
	
}
