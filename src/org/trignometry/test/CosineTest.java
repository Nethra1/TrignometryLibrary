package org.trignometry.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.trignometry.service.Cosine;
import org.trignometry.util.DegreeRadianCoversionUtil;

public class CosineTest {

	private Cosine cos = new Cosine();

	@Test
	public void test_cos_of_positive_radian() {
		// initialize
		double num = 1;
		double mathCos = Math.cos(num);

		// call
		double cosOfNum = cos.taylorCosineInRadian(num);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_cos_of_negative_radian() {
		// initialize
		double num = -1;
		double mathCos = Math.cos(num);

		// call
		double cosOfNum = cos.taylorCosineInRadian(num);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_cos_of_zero_radian() {
		// initialize
		double num = 0;
		double mathCos = Math.cos(num);

		// call
		double cosOfNum = cos.taylorCosineInRadian(num);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_cos_of_first_quadrant() {
		// initialize
		double degree = 30;
		double mathCos = Math.cos(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = cos.taylorCosineInDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_cos_of_second_quadrant() {
		// initialize
		double degree = 120;
		double mathCos = Math.cos(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = cos.taylorCosineInDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_cos_of_third_quadrant() {
		// initialize
		double degree = 200;
		double mathCos = Math.cos(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = cos.taylorCosineInDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_cos_of_fourth_quadrant() {
		// initialize
		double degree = 300;
		double mathCos = Math.cos(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = cos.taylorCosineInDegree(degree);
		
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
