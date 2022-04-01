package org.trignometry.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.trignometry.service.Tan;

public class TanTest {
	
	private Tan tan = new Tan();
	
	@Test
	public void test_tan_of_positive_number() {
		// initialize
		double num = 5;
		double mathTan = Math.tan(num);
		
		// call
		double actualTan = tan.tanOfNum(Math.PI/2);
		
		//assert
		assertEquals(mathTan, actualTan, 0.000001);
	}
	

}
