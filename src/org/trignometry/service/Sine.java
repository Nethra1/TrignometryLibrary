package org.trignometry.service;

import org.trignometry.util.DegreeRadianCoversionUtil;

public class Sine {

	public double taylorSineInRadian(double radian) {
		double value = 0;
		for (int n = 0; n < 19; n++) {
			value += Math.pow(-1.0, n) * Math.pow(radian, 2 * n + 1) / factorial(2 * n + 1);
		}
		return value;
	}
	
	public double taylorSineInDegree(double degree) {
		double radian = DegreeRadianCoversionUtil.calculateRadianValue(degree);
		return taylorSineInRadian(radian);
	}

	public double factorial(int num) {
		double fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

//	public static void main(String arr[]) {
//		System.out.println("Actual value" + Math.sin(2));
//		System.out.println("My value" + taylorSine(2));
//	}

}
