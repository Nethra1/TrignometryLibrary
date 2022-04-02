package org.trignometry.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.trignometry.service.Sine;
import org.trignometry.util.DegreeRadianCoversionUtil;

public class SineTest {

	private Sine sin = new Sine();

	@Test
	public void test_sin_of_positive_number() {
		// initialize
		double num = 1;
		double mathSin = Math.sin(num);

		// call
		double sinOfNum = sin.taylorSineInRadian(num);
		
		// assert
		assertEquals(mathSin, sinOfNum, 0.000001);
		
	}
	@Test
	public void test_sin_of_negative_radian() {
		// initialize
		double num = -1;
		double mathCos = Math.sin(num);

		// call
		double cosOfNum = sin.taylorSineInRadian(num);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_sin_of_zero_radian() {
		// initialize
		double num = 0;
		double mathCos = Math.sin(num);

		// call
		double cosOfNum = sin.taylorSineInRadian(num);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_sin_of_first_quadrant() {
		// initialize
		double degree = 30;
		double mathCos = Math.sin(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = sin.taylorSineInDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_sin_of_second_quadrant() {
		// initialize
		double degree = 120;
		double mathCos = Math.sin(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = sin.taylorSineInDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_sin_of_third_quadrant() {
		// initialize
		double degree = 200;
		double mathCos = Math.sin(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = sin.taylorSineInDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_sin_of_fourth_quadrant() {
		// initialize
		double degree = 300;
		double mathCos = Math.sin(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = sin.taylorSineInDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
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
