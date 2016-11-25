package com.unit.test.recursion;

import org.junit.Test;

import com.algorithms.sorting.MergeSorting;

import static org.junit.Assert.*;

public class MergeSortTest {

	@Test
	public void testMergerSort(){
		
	int[] intArraySample = {9,8,7,6,5,4,3,2,1};
	int[] expecteds = {1,2,3,4,5,6,7,8,9};	
	MergeSorting.sortWithMerge(intArraySample, 0, 8);
	assertArrayEquals(expecteds, intArraySample);
	}
}
