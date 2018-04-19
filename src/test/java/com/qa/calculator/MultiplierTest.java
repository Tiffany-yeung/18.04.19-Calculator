package com.qa.calculator;

import org.junit.Assert;

import org.junit.Test;

public class MultiplierTest {

	private Multiplier multiplier;
	
	@Test
	public void test() {
		
		multiplier = new Multiplier();
		int expectedValue = 6;
		int actualValue = multiplier.multiply(2,3);
		Assert.assertEquals(expectedValue, actualValue);

	}

}
