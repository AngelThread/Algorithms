package com.algorithms.sorting;

public class InsertionSorting {

	public void sortByInsertion(int... sortMePlease) {

		for (int i = 0; i < sortMePlease.length; i++) {

			int currentValue = sortMePlease[i];

			int j = i - 1;
			while (j >= 0 && currentValue < sortMePlease[j] ) {
				sortMePlease[j + 1] = sortMePlease[j];
				j -= 1;
			}
			sortMePlease[j + 1] = currentValue;

		}

	}
}
