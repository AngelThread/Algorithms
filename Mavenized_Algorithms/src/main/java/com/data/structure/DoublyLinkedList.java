package com.data.structure;

public class DoublyLinkedList {

	private Node head;
	private Node tail;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public void insertAtTail(int data) {

		Node newNode = new Node(data);

		if (this.head == null)
			this.head = newNode;

		if (this.tail != null)
			this.tail.setNextNode(newNode);
			this.tail = newNode;
	}

	@Override
	public String toString() {

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("DoublyLinkedKist: { ");

		Node currentNode = this.head;

		while (currentNode != null) {
			strBuilder.append(currentNode.getData());
			currentNode = currentNode.getNextNode();
			strBuilder.append(",");
		}

		String strBuilderString = strBuilder.substring(0, strBuilder.length() - 1);
		strBuilderString = strBuilderString + " }";

		return strBuilderString;
	}

}
