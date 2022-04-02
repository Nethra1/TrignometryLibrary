package org.trignometry.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.trignometry.service.Tan;
import org.trignometry.util.DegreeRadianCoversionUtil;

public class TanTest {
	
	private Tan tan = new Tan();
	
	@Test
	public void test_tan_of_positive_radian() {
		// initialize
		double num = 5;
		double mathTan = Math.tan(num);
		
		// call
		double actualTan = tan.tanOfRadian(num);
		
		//assert
		assertEquals(mathTan, actualTan, 0.000001);
	}
	@Test
	public void test_tan_of_negative_radian() {
		// initialize
		double num = -1;
		double mathTan = Math.tan(num);
		
		// call
		double actualTan = tan.tanOfRadian(num);
		
		//assert
		assertEquals(mathTan, actualTan, 0.000001);
	}
	@Test
	public void test_tan_of_zero_radian() {
		// initialize
		double num = 0;
		double mathTan = Math.tan(num);
		
		// call
		double actualTan = tan.tanOfRadian(num);
		
		//assert
		assertEquals(mathTan, actualTan, 0.000001);
	}
	
	@Test
	public void test_tan_of_first_quadrant() {
		// initialize
		double degree = 30;
		double mathCos = Math.tan(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = tan.tanOfDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_tan_of_second_quadrant() {
		// initialize
		double degree = 120;
		double mathCos = Math.tan(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = tan.tanOfDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_tan_of_third_quadrant() {
		// initialize
		double degree = 200;
		double mathCos = Math.tan(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = tan.tanOfDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	@Test
	public void test_tan_of_fourth_quadrant() {
		// initialize
		double degree = 300;
		double mathCos = Math.tan(DegreeRadianCoversionUtil.calculateRadianValue(degree));

		// call
		double cosOfNum = tan.tanOfDegree(degree);
		
		// assert
		assertEquals(mathCos, cosOfNum, 0.000001);
		
	}
	
	

}
