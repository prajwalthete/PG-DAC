package com.cdac.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cdac.Calculator;

public class CalculatorTest {

	@Test
	public void test_add_is_working_or_not() {
		Calculator c = new Calculator();
		int actual = c.add(10, 20);
		int expected = 30;
		assertEquals(expected, actual);
		//NO NO NO NO NO NO NO
		//System.out.println(actual);
	}

	@Test
	public void test_sub_is_working_or_not() {
		Calculator c = new Calculator();
		int actual = c.sub(10, 20);
		int expected = -10;
		assertEquals(expected, actual);
	}

}
