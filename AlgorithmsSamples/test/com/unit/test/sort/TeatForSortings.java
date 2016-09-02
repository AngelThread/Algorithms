package com.unit.test.sort;

import org.junit.Test;

import com.algorithms.sorting.BubbleSorting;
import static org.junit.Assert.*;

public class TeatForSortings {

	@Test
	public void checkBubbleIsWorking() {

		int[] actualArray = new int[] { 12, 7, 6, 3, 1 };
		int[] expectedArray = new int[] { 1, 3, 6, 7, 12 };

		BubbleSorting bubbleSorting = new BubbleSorting();
		bubbleSorting.sortLikeABubble(actualArray);
		for (int i = 0; i < actualArray.length; i++) {
			System.out.println(actualArray[i]);
		}
		
		assertArrayEquals(expectedArray, actualArray);
		
	}

}
