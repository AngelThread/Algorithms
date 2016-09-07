package com.unit.test.sort;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.data.structure.*;

public class LinkedListTest {

	@Test
	public void testSimpleLinkedList() {
		
		LinkedList linkedList = new LinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);

		linkedList.addAtHead(node4);
		linkedList.addAtHead(node3);
		linkedList.addAtHead(node2);
		linkedList.addAtHead(node1);

		Node currentNode = linkedList.getHeadNode();

		List<Integer> nodeList = new ArrayList<Integer>();
		while (currentNode != null) {
			nodeList.add(currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
		for (int i = 0; i < nodeList.size(); i++) {
			System.out.println(nodeList.get(i));
		}
		Integer[] integerArray = new Integer[] { 1, 2, 3, 4 };
		Integer[] generatedLinkedListArray = (Integer[]) nodeList.toArray(new Integer[0]);

		assertArrayEquals(integerArray, generatedLinkedListArray);
		System.out.println("Length after delete from head: " + linkedList.length());
	}

	@Test	
	public void testDoublyLinkedList(){
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		doublyLinkedList.insertAtTail(node1.getData());
		doublyLinkedList.insertAtTail(node2.getData());
		doublyLinkedList.insertAtTail(node3.getData());
		doublyLinkedList.insertAtTail(node4.getData());
		List<Integer> nodeList = new ArrayList<Integer>();
		
		Node currentNode = doublyLinkedList.getHead();
		while (currentNode != null) {
			nodeList.add(currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
		Integer[] integerArray = new Integer[] { 1, 2, 3, 4 };
		Integer[] generatedLinkedListArray = (Integer[]) nodeList.toArray(new Integer[0]);
		
		assertArrayEquals(integerArray, generatedLinkedListArray);
		
	}
}
