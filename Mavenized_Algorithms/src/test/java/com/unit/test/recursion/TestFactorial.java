package com.unit.test.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.algorithms.recursion.Factorial;

public class TestFactorial {
	
	@Test
	public void testFactorialBasic(){
		Factorial factorial = new Factorial ();
		int cal = factorial.calculateFactorialWithRecursion(1);
		assertEquals(1, cal);
	}
	
	@Test
	public void testFactorialBasicWithZero(){
		Factorial factorial = new Factorial ();
		int cal = factorial.calculateFactorialWithRecursion(0);
		assertEquals(1, cal);
	}
	
	
	@Test
	public void testFactorial(){
		Factorial factorial = new Factorial ();
		int cal = factorial.calculateFactorialWithRecursion(5);
		assertEquals(120, cal);
	}
}
