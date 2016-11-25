package com.algorithms.sorting;

public class ShellSort {
	
	public static void sortShell( int[] array) {
		
		int range = 1;
		
		while(range*3+1 <array.length){
			range = range*3+1;
		}
		
		sortShell(range,array);
	}

		

	private static void sortShell(int range, int[] array) {

		if (range < 1)
			return;
		
				
		for (int i = 0; i < array.length; i=i+range) {
			int currentValue = array[i];
			int j = i - 1;
			while (j >= 0 && currentValue < array[j] ) {
				array[j + 1] = array[j];
				j -= 1;
			}
			array[j + 1] = currentValue;

		}
		
		sortShell(((range- 1)/3), array);

	}
	
public static void main(String[] args) {
	
}
}
