package org.trignometry.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.trignometry.util.DegreeRadianCoversionUtil;

public class DegreeRadianConversionUtilTest {
	
	public DegreeRadianCoversionUtil degreeRadianConversionUtil = new DegreeRadianCoversionUtil();
	
	@Test
	public void test_radian_to_degree() {
		// input
		double degree = 30;
		double expectedRadian = Math.toRadians(degree);
		
		// call
		double actualRadian = degreeRadianConversionUtil.calculateRadianValue(degree);
		
		// assert
		assertEquals(expectedRadian, actualRadian, 0.000001);
	}

}
