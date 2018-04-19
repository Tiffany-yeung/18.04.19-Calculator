package com.qa.calculator;

import org.junit.Assert;

import org.junit.Test;

public class AdderTest {

	private Adder adder;
	
	@Test
	public void addTest() {
		adder = new Adder();
		int expectedValue = 4;
		int actualValue = adder.add(2, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
