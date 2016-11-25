package com.data.structure;

import java.lang.reflect.Array;

public class Heap<E extends Comparable<E>> {
	
	private E [] arrayLocal = null;
	private static final int Index_Of_Root=0;
	private int size = 0;
	private int elementNumb = 0;
	
	@SuppressWarnings("unchecked")
	public Heap(Class<E> c,int size) {
		arrayLocal = (E[]) Array.newInstance( c, size);
		this.size = size;
	}
	
	public void add(E e){

		if(arrayLocal[Index_Of_Root] == null){
			arrayLocal[Index_Of_Root] = e;
			elementNumb++;
			return;
		}
		if(isFull()) return;
		int  availableIndex = elementNumb; // Array was full but then on element deleted from the middle.
		if(arrayLocal[elementNumb] != null){
			for (int i = 0; i < arrayLocal.length; i++) {
				if(arrayLocal[i] == null){
					availableIndex = i;
				}
			}
		}
		arrayLocal[availableIndex] = e;
		reArrenga(availableIndex);
		elementNumb++;

	}
	
	private boolean isFull(){
		return (size- elementNumb) == 0;
	}
	
	private void reArrenga(int indexIsAdded){
		if(indexIsAdded <=0) return;
		if(indexIsAdded == 0){
			reArrenga(elementNumb);;
		}
		boolean isLeft = (indexIsAdded%2 == 1?true:false); // In the Heap Structure that's implemented by array object, Node's left child's index is 2i+1 and right one's 2i+2.
		int parentIndex = -1;
		if(isLeft){
			parentIndex = (indexIsAdded-1)/2;
		}else{
			parentIndex = (indexIsAdded-2)/2;
		}
		if(parentIndex < 0) return;
		if(arrayLocal[parentIndex]==null|| arrayLocal[parentIndex].compareTo(arrayLocal[indexIsAdded]) == -1){
			E temp = arrayLocal[parentIndex];
			arrayLocal[parentIndex] = arrayLocal[indexIsAdded];
			arrayLocal[indexIsAdded] = temp;
			reArrenga(parentIndex);
		}
	}

	public E[] getArrayLocal() {
		return arrayLocal;
	}
	public int getSize() {
		return size;
		
	}

	public void delete(E elementWhatLookingFor){
		int index = findElement(elementWhatLookingFor);
		if(index == -1 ) return ;
		arrayLocal[index]  = null;
		elementNumb --;
		if(index*2+2 < arrayLocal.length && arrayLocal[index*2+2] !=null ){
			reArrenga(index*2+2 );
		}else if(index*2+1 < arrayLocal.length && arrayLocal[index*2+1] !=null){
			reArrenga(index*2+1);

		}
		
		
	}
	
	private int findElement(E elementWhatLookingFor){
		for (int i = 0; i < arrayLocal.length; i++) {
			if(elementWhatLookingFor.equals(arrayLocal[i]))
				return i;
		}	
		
		return -1;
	}
	
}
