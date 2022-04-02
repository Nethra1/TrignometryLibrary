package org.trignometry.service;

import org.trignometry.util.DegreeRadianCoversionUtil;

public class Cosine {
	
	public double taylorCosineInRadian(double radian) {
		double value = 0;

		for (int n = 0; n < 20; n++) {

			value += Math.pow(-1.0, n) * Math.pow(radian, 2 * n) / factorial(2 * n);

		}

		return value;

	}
	
	public double taylorCosineInDegree(double degree) {
		double radian = DegreeRadianCoversionUtil.calculateRadianValue(degree);
		return taylorCosineInRadian(radian);
	}

	public double factorial(int num) {

		double fact = 1;

		for (int i = 1; i <= num; i++) {

			fact *= i;
		}

		return fact;

	}
	
//	public static void main(String arr[]) {
//		System.out.println("Actual value"+ Math.cos(1));
//		System.out.println("My value"+ taylorCosine(1));
//	}

}
