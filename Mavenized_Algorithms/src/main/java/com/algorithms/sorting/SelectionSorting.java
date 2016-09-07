package com.algorithms.sorting;

public class SelectionSorting {

	public void sortBySelection(int... badSorted) {

		for (int i = 0; i < badSorted.length - 1; i++) {
			int minIndex = i;
			int temp = -1;
			for (int j = i; j < badSorted.length; j++) {
				if (badSorted[j] < badSorted[minIndex])
					minIndex = j;
			}
			temp = badSorted[i];
			badSorted[i] = badSorted[minIndex];
			badSorted[minIndex] = temp;
		}

	}

}
