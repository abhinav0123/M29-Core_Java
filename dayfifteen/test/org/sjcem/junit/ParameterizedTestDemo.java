package org.sjcem.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings= {"Abhinav","John","Sam"})
	void test() {
		System.out.println("Demonstration on Parameterized"+"Test");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Abhinav","James"})
	void accept(String str) {
		assertNotNull(str);
	}
	
}
