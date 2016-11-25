package com.unit.test.recursion;

import org.junit.Test;

import com.algorithms.recursion.Euclidean;
import com.algorithms.recursion.Factorial;

import static org.junit.Assert.*;

public class TestEuclidean {

	
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

