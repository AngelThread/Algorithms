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
		System.out.println(doublyLinkedList.getHeadNode() + " / 3");
		System.out.println(doublyLinkedList.getHeadNode().getNextNode() + " / 2  ");
		System.out.println(doublyLinkedList.getHeadNode().getNextNode().getPreNode() + " / 3");
		System.out.println(doublyLinkedList.getHeadNode().getNextNode().getNextNode() + " / 1 ");

		assertArrayEquals(new Integer [] {3,2,1}, doublyLinkedList.getArrayFormatAsInteger());		
		
		
		
	}

}
