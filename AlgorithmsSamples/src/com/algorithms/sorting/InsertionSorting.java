package com.algorithms.sorting;

public class InsertionSorting<T> {

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
	
	public void sort(Comparable<T>[] objects) {
		for (int i=0; i < objects.length; i++) {
			Comparable<T> current = objects[i];
			int j = i-1;
			while (j >= 0 && ((Comparable<T>)objects[j]).compareTo((T) current) > 0) {
				objects[j+1] = objects[j];
				j--;
			}
			objects[j+1] = current;
		}
	}
}
