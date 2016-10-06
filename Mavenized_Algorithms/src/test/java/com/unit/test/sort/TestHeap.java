package com.unit.test.sort;
import static org.junit.Assert.*;

import org.junit.Test;

import com.data.structure.Heap;

public class TestHeap {

	@Test
	public void testAdd(){
		Heap<Integer> heap = new Heap<Integer>(Integer.class,7);
		heap.add(20);
		heap.add(10);
		heap.add(15);
		heap.add(8);
		heap.add(9);
		heap.add(12);
		heap.add(13);

		Integer [] localArray = heap.getArrayLocal();
		Integer[] expecteds = {20,10,15,8,9,12,13};
		assertArrayEquals(expecteds, localArray);
	}
	
	@Test
	public void testAddReArrange(){
		Heap<Integer> heap = new Heap<Integer>(Integer.class,3);
		heap.add(10);
		heap.add(15);
		heap.add(20);

		Integer [] localArray = heap.getArrayLocal();
		Integer[] expecteds = {20,10,15};
		assertArrayEquals(expecteds, localArray);
	}
	
	@Test
	public void testAddReArrangement(){
		Heap<Integer> heap = new Heap<Integer>(Integer.class,7);
		heap.add(10);
		heap.add(15);
		heap.add(8);
		heap.add(9);
		heap.add(12);
		heap.add(13);
		heap.add(20);

		Integer [] localArray = heap.getArrayLocal();
		Integer[] expecteds = {20,12,15,9,10,8,13};
		assertArrayEquals(expecteds, localArray);
	}
	
	
	@Test
	public void testDelete(){
		Heap<Integer> heap = new Heap<Integer>(Integer.class,7);
		heap.add(10);
		heap.add(15);
		heap.add(8);
		heap.add(9);
		heap.add(12);
		heap.add(13);
		heap.add(20);
		heap.delete(12);
		Integer [] localArray = heap.getArrayLocal();
		Integer[] expecteds = {20,10,15,9,null,8,13};
		assertArrayEquals(expecteds, localArray);

	}
	
	@Test
	public void testAddAfterDelete(){
		Heap<Integer> heap = new Heap<Integer>(Integer.class,7);
		heap.add(10);
		heap.add(15);
		heap.add(8);
		heap.add(9);
		heap.add(12);
		heap.add(13);
		heap.add(20);
		heap.delete(12);
		heap.add(12);
		Integer [] localArray = heap.getArrayLocal();
		Integer[] expecteds = {20,12,15,9,10,8,13};
		assertArrayEquals(expecteds, localArray);

	}
	
}
