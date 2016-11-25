package com.unit.test.sort;

import org.junit.Test;

import com.algorithms.sorting.BubbleSorting;
import com.algorithms.sorting.InsertionSorting;
import com.algorithms.sorting.SelectionSorting;
import static org.junit.Assert.*;

public class TestForSortings {

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

	@Test
	public void checkSelectionSortIsWorking() {

		int[] actualArray = new int[] { 12, 7, 6, 3, 1 };
		int[] expectedArray = new int[] { 1, 3, 6, 7, 12 };

		SelectionSorting selectionSort = new SelectionSorting();
		selectionSort.sortBySelection(actualArray);
		for (int i = 0; i < actualArray.length; i++) {
			System.out.println(actualArray[i]);
		}

		assertArrayEquals(expectedArray, actualArray);

	}
	
	
	
	@Test
	public void checkSortByInsertion(){
		Integer[] actualArray = new Integer[] { 12, 7, 6, 3, 1 };
		Integer[] expectedArray = new Integer[] { 1, 3, 6, 7, 12 };

		InsertionSorting<Integer> insertionSort = new InsertionSorting<Integer>();
		insertionSort.sort(actualArray);
		for (int i = 0; i < actualArray.length; i++) {
			System.out.println(actualArray[i]);
		}

		assertArrayEquals(expectedArray, actualArray);
		
	}
	@Test
	public void checkWithGenericsInsertionSort(){
		Double[] actualArray = new Double[] { 12.00,1.00 ,7.00};
		Double[] expectedArray = new Double[] { 1.00,7.00,12.00 };

		InsertionSorting<Double> insertionSort = new InsertionSorting<Double>();
		insertionSort.sort(actualArray);
		for (int i = 0; i < actualArray.length; i++) {
			System.out.println(actualArray[i]);
		}

		assertArrayEquals(expectedArray, actualArray);
		
	}

	

}
