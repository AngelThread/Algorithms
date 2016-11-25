package com.unit.test.sort;

import org.junit.Test;

import static org.junit.Assert.*;

import com.algorithms.sorting.QuickSort;

public class QuickSortTest {
	
	@Test
	public void testPartitionOfQuickSort(){
		int[] arrayOfInt = {3,8,2};
		int retValue = QuickSort.partiton(arrayOfInt, 1, 2);
		assertEquals(1, retValue);
	}
	
	@Test
	public void testQuickSortWithSimpleTask(){
		
		int[] arrayOfInt = {3,8,2,5};
		int[] expected = {2,3,5,8};
		QuickSort.sortQuickly(arrayOfInt, 0, 3);
		assertArrayEquals(expected, arrayOfInt);
	}
	
	@Test
	public void testQuickSortWithWorstCase(){
		
		int[] arrayOfInt = {10,9,8,7,6,5,4,3,2,1};
		int[] expected = {1,2,3,4,5,6,7,8,9,10};
		QuickSort.sortQuickly(arrayOfInt, 0, 9);
		assertArrayEquals(expected, arrayOfInt);
	}

}
