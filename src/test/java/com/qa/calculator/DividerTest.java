package com.qa.calculator;

import org.junit.Assert;

import org.junit.Test;

public class DividerTest {
	
	private Divider divider;
	private static final double delta = 1e-15;
	//round up number to 1e-15 to prevent recurring decimal numbers

	@Test
	public void test() {
		
		divider = new Divider();
		
		double expectedValue = 1.2;
		double actualValue = divider.divide(2.4,2);
		Assert.assertEquals(expectedValue, actualValue, delta);

	}

}
