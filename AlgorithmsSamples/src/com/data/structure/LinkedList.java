package com.data.structure;

public class LinkedList {
	private Node headNode;

	public Node addAtHead(int newData) {
		Node newNode = new Node(newData);
		newNode.setNextNode(this.headNode);
		this.headNode = newNode;
		return newNode;
	}
	
	public int length() {
	int length = 0;
	Node currentNode = this.headNode;
	while(currentNode != null){
		length++;
		currentNode = currentNode.getNextNode();
	}
		
	return length;	
	}

	public Node addAtHead(Node newNode) {
		newNode.setNextNode(this.headNode);
		this.headNode = newNode;
		return newNode;
	}
	
	public void deleteFromHead(){
		if(this.headNode != null)
		this.headNode = this.headNode.getNextNode();		
	}

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	@Override
	public String toString() {
		Node currentData = this.headNode;
		StringBuilder returnValue = new StringBuilder();
		returnValue.append("Values : { ");
		while (currentData != null) {
			returnValue.append(currentData);
			returnValue.append(",");
			currentData = currentData.getNextNode(); // this line has duty that process iteration within the linkedList
		}

		returnValue.append(" }");

		return returnValue.toString();
	}

}
