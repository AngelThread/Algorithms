package com.data.structure;

public class LinkedListSample {
	
	public static void main(String[] args) {
	LinkedList linkedList  =new LinkedList();
	Node node1 = new Node(1);
	Node node2 = new Node (2);
	Node node3 = new Node (3);
	Node node4 = new Node (4);
	
	linkedList.addAtHead(node2);
	linkedList.addAtHead(node3);
	linkedList.addAtHead(node4);
	linkedList.addAtHead(node1);

	System.out.println(linkedList.toString());

	}
}
