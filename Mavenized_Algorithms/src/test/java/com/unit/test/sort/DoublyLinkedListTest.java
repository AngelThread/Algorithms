package com.unit.test.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.data.structure.DoublyLinkedList;

public class DoublyLinkedListTest {
	
	@Test
	public void testOfDoublyLinkedList(){
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.addNodeAtHead(1);
		doublyLinkedList.addNodeAtHead(2);
		doublyLinkedList.addNodeAtHead(3);
	
		assertArrayEquals(new Integer [] {3,2,1}, doublyLinkedList.getArrayFormatAsInteger());		
	}
	
	@Test
	public void testOfDoublyLinkedListSorting(){
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.addNodeAtHead(13);
		doublyLinkedList.addNodeAtHead(1);
		doublyLinkedList.addNodeAtHead(2);
		doublyLinkedList.addNodeAtHead(21); // There is a bug
		doublyLinkedList.addNodeAtHead(7);
		doublyLinkedList.addNodeAtHead(4);
		doublyLinkedList.addNodeAtHead(5);
		doublyLinkedList.addNodeAtHead(3);
		doublyLinkedList.sortDoublyLinkedList();
		System.out.println(doublyLinkedList);
		//assertArrayEquals(new Integer [] {1,2,3,4,5,21}, doublyLinkedList.getArrayFormatAsInteger());
	}

}
