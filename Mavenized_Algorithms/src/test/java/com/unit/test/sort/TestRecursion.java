package com.unit.test.sort;

import org.junit.Test;

import com.algorithms.recursion.Euclidean;
import com.algorithms.recursion.Factorial;

import static org.junit.Assert.*;

public class TestRecursion {
	
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
	
	@Test 
	public void testEuclideanZeroValue(){
		int calculated = Euclidean.calculateGCD(100, 0);
		assertEquals(0, calculated);
	}
	
	@Test 
	public void testEuclideanOneValue(){
		int calculated = Euclidean.calculateGCD(1, 100);
		assertEquals(1, calculated);
	}
	
	@Test 
	public void testEuclideanForSameValues(){
		int calculated = Euclidean.calculateGCD(123, 123);
		assertEquals(123, calculated);
	}
	
	@Test 
	public void testEuclideanForDiffValues(){
		int calculated = Euclidean.calculateGCD(125, 35);
		assertEquals(5, calculated);
	}
}
