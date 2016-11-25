package com.unit.test.sort;

import org.junit.Test;

import com.data.structure.GenericCircularQueueImplementation;

import static org.junit.Assert.*;

public class GenericCircularQueueSampleTest {

	@Test
	public void testIsEmpty() {

		GenericCircularQueueImplementation<Integer> genericQueue = new GenericCircularQueueImplementation<Integer>(
				Integer.class, 5);
		assertTrue(genericQueue.isEmpty());
	}

	@Test
	public void testIsFull() {

		GenericCircularQueueImplementation<Integer> genericQueue = new GenericCircularQueueImplementation<Integer>(
				Integer.class, 5);
		try {
			genericQueue.emqueue(0);
			genericQueue.emqueue(1);
			genericQueue.emqueue(2);
			genericQueue.emqueue(3);
			genericQueue.emqueue(4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(genericQueue.isFull());
	}

	

	@Test
	public void testCircularSpecification() {
		GenericCircularQueueImplementation<Integer> genericQueue = new GenericCircularQueueImplementation<Integer>(
				Integer.class, 5);
		try {
			genericQueue.emqueue(0);
			genericQueue.emqueue(1);
			genericQueue.emqueue(2);
			genericQueue.emqueue(3);
			genericQueue.emqueue(4);
			genericQueue.dequeue();
			genericQueue.dequeue();
			genericQueue.emqueue(5);
			genericQueue.emqueue(6);

			Integer[] intGenericQueue = genericQueue.getImpArray();
			Integer[] expecteds = new Integer[] {5,6,2,3,4};
			
			assertArrayEquals(expecteds, intGenericQueue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(expected = Exception.class)
	public void testIsAlreadyEmptyException() throws Exception {
		GenericCircularQueueImplementation<Integer> genericQueue = new GenericCircularQueueImplementation<Integer>(
				Integer.class, 5);
			genericQueue.dequeue();
	}
	
	@Test(expected = Exception.class)
	public void testIsAlreadyFullException() throws Exception {
		GenericCircularQueueImplementation<Integer> genericQueue = new GenericCircularQueueImplementation<Integer>(
				Integer.class, 5);
		genericQueue.emqueue(0);
		genericQueue.emqueue(1);
		genericQueue.emqueue(2);
		genericQueue.emqueue(3);
		genericQueue.emqueue(4);
		genericQueue.emqueue(5);

	}
}
