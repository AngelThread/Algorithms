package com.algorithms.sorting;

public class MergeSorting {

	public static void  sortWithMerge(int[] intArray, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			sortWithMerge(intArray, start, mid);
			sortWithMerge(intArray, mid + 1, end);
			merger(intArray, start, mid, end);
		}
		
		return;
	}

	public static void merger(int[] intArray, int start, int mid, int end) {
		Integer[] arrayLeft = new Integer[(mid - start) + 1];
		Integer[] arrayRigth = new Integer[(end - mid) ];
		int index = start;
		for (int i = 0; i <(mid - start) + 1; i++) {
			arrayLeft[i] = intArray[index];
			index++;
		}
		
		for (int j = 0; j < (end - mid); j++) {
			arrayRigth[j] = intArray[index];
			index++;
		}
		
		int i = 0,j =0;
		
		for (int k = start; k < index; k++) {
			
			if(i>=arrayLeft.length){
				intArray[k] = arrayRigth[j]; j++;
			}else 
			
			if(j>=arrayRigth.length){
				intArray[k] = arrayLeft[i]; i++;
			}else
			
			if(arrayLeft[i]< arrayRigth[j]){
				intArray[k] = arrayLeft[i]; i++;

			}else{
				intArray[k] = arrayRigth[j]; 
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] intArraySample = {9,8,7,6,5,4,3,2,1};
		
	 sortWithMerge(intArraySample, 0, 8);
		
		for (int i : intArraySample) {
			System.out.println(i);
		}
	}
}
