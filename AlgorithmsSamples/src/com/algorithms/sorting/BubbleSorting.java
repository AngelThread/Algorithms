package com.algorithms.sorting;

public class BubbleSorting {
	
	
	public void sortLikeABubble(int[] integerArray){
		
		int tempTap = -1; /* Even if local variables does not have default value it is good to give a integer negative value 
		
		for making easy to solve future bugs. */
				
		for (int i = 0; i < integerArray.length; i++) {
			
			for (int j = 0; j < integerArray.length-1; j++) {
				
				if(integerArray[j]> integerArray[j+1]){
					
					tempTap =  integerArray[j+1];
					integerArray[j+1] = integerArray[j];
					integerArray[j] = tempTap;
					
				}
				
			}
		}
		
		
		
	}

}
