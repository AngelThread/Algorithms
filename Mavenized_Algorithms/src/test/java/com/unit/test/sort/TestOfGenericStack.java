package com.unit.test.sort;

import com.data.structure.Stack;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestOfGenericStack {

	@Test
	public void testPush() {
		Stack<Integer> stackOfInetegers = new Stack<>(Integer.class, 3);
		stackOfInetegers.push(1);
		stackOfInetegers.push(2);
		stackOfInetegers.push(3);
		Integer[] stackOfInetegersArray = stackOfInetegers.getValues();
		Integer[] expectedArray = new Integer[] { 1, 2, 3 };
		assertArrayEquals(expectedArray, stackOfInetegersArray);

	}

	@Test
	public void testPeek() {
		Stack<Integer> stackOfInetegers = new Stack<>(Integer.class, 3);
		stackOfInetegers.push(1);
		stackOfInetegers.push(2);
		stackOfInetegers.push(3);
		Integer[] stackOfInetegersArray = stackOfInetegers.getValues();
		Integer[] expectedArray = new Integer[] { 1, 2, 3 };
		stackOfInetegers.peek();
		stackOfInetegers.peek();
		stackOfInetegers.peek();
		// Check peek does not pull values from stack
		assertArrayEquals(expectedArray, stackOfInetegersArray);

	}

	@Test
	public void testPull() {
		Stack<Integer> stackOfInetegers = new Stack<>(Integer.class, 3);
		stackOfInetegers.push(1);
		stackOfInetegers.push(2);
		stackOfInetegers.push(3);
		Integer[] stackOfInetegersArray = stackOfInetegers.getValues();
		Integer[] expectedArray = new Integer[] { 1, null, null };
		stackOfInetegers.pull();
		stackOfInetegers.pull();
		// Check peek does not pull values from stack
		assertArrayEquals(expectedArray, stackOfInetegersArray);

	}
}
