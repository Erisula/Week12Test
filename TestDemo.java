package com.promineotech;

public class TestDemo {
	int addPositive (int a, int b)
	{
		if(a<=0 || b<=0)
			throw new IllegalArgumentException("Both parameters must be positive.");
		return a+b;
	}
	

}
