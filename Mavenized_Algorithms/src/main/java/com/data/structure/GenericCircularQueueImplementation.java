package com.data.structure;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericCircularQueueImplementation<E> implements Iterable<E> {
	private E[] impArray = null;
	private int elementCount = 0;
	private int size = 0;
	private int tailIndex;
	private int headIndex;

	@SuppressWarnings("unchecked")
	public GenericCircularQueueImplementation(Class<E> c, int size) {
		this.size = size;
		impArray = (E[]) Array.newInstance(c, size);
	}

	public void emqueue(E e) throws Exception {
		if (isFull()) {
			throw new Exception("There is no spare place in Queue");
		} else if (isEmpty()) {
			impArray[headIndex] = e; // Head and Tail are same for the first
										// element
		} else if (tailIndex == (size - 1)) {
			tailIndex = 0;
			impArray[tailIndex] = e;

		} else  { // tailIndex+1 == headIndex control is not necessary already checked  by isFull(). YEU
			tailIndex++;
			impArray[tailIndex] = e;
		}
		elementCount++;
	}

	public E dequeue() throws Exception {
		E currentElement = null;
		if (isEmpty()) {
			throw new Exception("There is no element in Queue");
		} else if (headIndex == size - 1) {
			currentElement = impArray[headIndex];
			headIndex = 0;
		} else {
			currentElement = impArray[headIndex];
			headIndex++;
		}
		elementCount--;

		return currentElement;
	}

	public E peekQueue() throws Exception {
		if (isEmpty()) {
			throw new Exception("There is no element in Queue");
		}
		return impArray[headIndex];
	}

	public boolean isFull() {
		return size == elementCount;
	}

	public boolean isEmpty() {
		return 0 == elementCount;
	}

	public E[] getImpArray() {
		return impArray;
	}

	public void setImpArray(E[] impArray) {
		this.impArray = impArray;
	}

	public int getElementCount() {
		return elementCount;
	}

	public void setElementCount(int elementCount) {
		this.elementCount = elementCount;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTailIndex() {
		return tailIndex;
	}

	public void setTailIndex(int tailIndex) {
		this.tailIndex = tailIndex;
	}

	public int getHeadIndex() {
		return headIndex;
	}

	public void setHeadIndex(int headIndex) {
		this.headIndex = headIndex;
	}

	@Override
	public Iterator<E> iterator() {
		return new  MyIterator();

	}

	private class MyIterator  implements Iterator<E> {
		private int cursor;

		public boolean hasNext() {
			return cursor < size;
		}
		

		public void remove() {
			throw new UnsupportedOperationException();
		}

		@Override
		public E next() {
			if(this.hasNext()) {
	            E current = impArray[cursor];
	            cursor ++;
	            return current;
	        }
	        throw new NoSuchElementException();
		}
	}
}
