package org.trignometry.service;

public class Tan {
	public double tanOfNum(double num) {
		Sine sin = new Sine();
		Cosine cos = new Cosine();
		return sin.taylorSine(num / cos.taylorCosine(num));
	}
}
