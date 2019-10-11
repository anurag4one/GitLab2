package com.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cal.CheckNum;

public class CheckNumTest {
	CheckNum obj;

	@Before
	public void init() {
		obj = new CheckNum();
	}
	
	@Test
	public void TestNumType() {
		String a = obj.evenOdd(3);
		assertEquals("odd", a);
	}
}
