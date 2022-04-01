package org.trignometry.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.trignometry.service.Cosine;

public class CosineTest {

	private Cosine cos = new Cosine();

	@Test
	public void test_cos_of_positive_number() {
		// initialize
		double num = 1;
		double mathCos = Math.cos(num);

		// call
		double cosOfNum = cos.taylorCosine(num);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_factorial_of_number() {
		// initialize
		int num = 5;
		double expectedFact = 120;

		// call
		double actualFact = cos.factorial(num);
		
		// assert
		assertEquals(expectedFact, actualFact, 0.000001);
		
	}

}
