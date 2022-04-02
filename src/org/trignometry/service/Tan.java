package org.trignometry.service;

import org.trignometry.util.DegreeRadianCoversionUtil;

public class Tan {
	public double tanOfRadian(double radian) {
		Sine sin = new Sine();
		Cosine cos = new Cosine();
		return sin.taylorSineInRadian(radian) / cos.taylorCosineInRadian(radian);
	}
	
	public double tanOfDegree(double degree) {
		double radian = DegreeRadianCoversionUtil.calculateRadianValue(degree);
		return tanOfRadian(radian);
	}
}
