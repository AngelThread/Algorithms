package com.algorithms.sorting;

public class QuickSort {
	
	public static void sortQuickly(int[] array, int start, int end){
	int pivot = end;	
		if(start<end){
			pivot = partiton(array,start, end);
			sortQuickly(array, start, pivot-1);
			sortQuickly(array, pivot+1, end);
		}
		
	}
	
	public static int partiton(int[] array, int start, int end){
		int i = start;
		int pivot = array[end];
		for (int j = start; j < end; j++) {
			if(array[j] <pivot ){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
			}
		}
		int temp = array[end];
		array[end] = array[i];
		array[i] = temp;
	 return i;
	}

}
