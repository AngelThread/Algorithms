package com.data.samples;

import com.data.structure.LinkedList;
import com.data.structure.Node;

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
	System.out.println("Length: "+linkedList.length());
	linkedList.deleteFromHead();
	System.out.println("Length after delete from head: "+linkedList.length());
	linkedList.deleteFromHead();
	linkedList.deleteFromHead();
	linkedList.deleteFromHead();
	linkedList.deleteFromHead();
	linkedList.deleteFromHead();
	System.out.println("Length after delete from head: "+linkedList.length());

	}
}
