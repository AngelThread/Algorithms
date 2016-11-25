package com.unit.test.sort;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithms.sorting.QuickSort;
import com.algorithms.sorting.ShellSort;

public class ShellSortTest {
	
	@Test
	public void testShellSort(){
		
		int[] arrayOfInt = {3,8,2,5};
		int[] expected = {2,3,5,8};
		ShellSort.sortShell(arrayOfInt);
		
		
		assertArrayEquals(expected, arrayOfInt);
		
	}
	
	@Test
	public void testShellSortDescending(){
		
		int[] arrayOfInt = {8,5,3,2};
		int[] expected = {2,3,5,8};
		ShellSort.sortShell(arrayOfInt);
		
		
		assertArrayEquals(expected, arrayOfInt);
		
	}
	
	@Test
	public void testShellSortWorstCase(){
		int[] actuals = new int[100];
		int[] expecteds = new int[100];
		
		for (int i = 0; i < 100; i++) {
			expecteds[i]= i;
			actuals[i]= 99-i;
		}
		ShellSort.sortShell(actuals);
		
		assertArrayEquals(expecteds, actuals);
	}

}
