package com.unit.test.recursion;

import org.junit.Test;

import com.algorithms.recursion.FibonacciNumbers;

import static org.junit.Assert.*;
public class TestFibonacci {
	
	@Test
	public void testFibonacciWithZero(){
		int result = FibonacciNumbers.findFibonacciNumber(0);
		assertEquals(0, result);
	}
	
	@Test
	public void testFibonacciWithOne(){
		int result = FibonacciNumbers.findFibonacciNumber(1);
		assertEquals(1, result);
	}
	
	@Test
	public void testFibonacciWithRegularValue(){
		int result = FibonacciNumbers.findFibonacciNumber(8);
		assertEquals(36, result);
	}
}
