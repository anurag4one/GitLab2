package com.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cal.Calculations;

public class TestCalculations {
	Calculations obj;

	@Before
	public void init() {
		obj = new Calculations();
	}

	@Test
	public void testHere() {
		assertEquals(3, obj.add(1, 2));
		assertEquals(4, obj.mul(2, 2));;
	}
}
