package com.algorithms.sorting;

public class QuickSort {
	
	public void sortQuickly(int[] array, int start, int end){
	int pivot = end;	
		if(start<end){
			
			
			pivot = partiton(array,start, end);
			sortQuickly(array, start, pivot-1);
			sortQuickly(array, pivot, end);

		}
		
	}
	
	public int partiton(int[] array, int start, int end){
		
		int i = start;
		int pivot = array[end];
		for (int j = 0; j < end-1; j++) {
			
			if(array[j] <pivot ){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
			}
		}
	 return pivot =i;
	
	}

}
