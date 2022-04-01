package org.trignometry.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.trignometry.service.Sine;

public class SineTest {

	private Sine sin = new Sine();

	@Test
	public void test_sin_of_positive_number() {
		// initialize
		double num = 1;
		double mathSin = Math.sin(num);

		// call
		double sinOfNum = sin.taylorSine(num);
		
		// assert
		assertEquals(mathSin, sinOfNum, 0.000001);
		
	}
	
	@Test
	public void test_factorial_of_number() {
		// initialize
		int num = 5;
		double expectedFact = 120;

		// call
		double actualFact = sin.factorial(num);
		
		// assert
		assertEquals(expectedFact, actualFact, 0.000001);
		
	}

}
