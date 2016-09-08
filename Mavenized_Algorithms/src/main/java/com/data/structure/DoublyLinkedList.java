package com.data.structure;

public class DoublyLinkedList {

	private DoublyNode head;

	public void addNodeAtHead(int data) {
		DoublyNode doublyNode = new DoublyNode(data);
		doublyNode.setNextNode(this.head);
		this.head = doublyNode;
	}

	public DoublyNode getNextNode() {
		return head;
	}

	public void setNextNode(DoublyNode nextNode) {
		this.head = nextNode;
	}

	public DoublyNode[] getArrayFormat() {

		DoublyNode[] doublyNodeArray = new DoublyNode[this.getLengthOfDoublyList()];
		DoublyNode currentDoublyNode = this.head;
		int index = 0;
		while (currentDoublyNode != null) {
			doublyNodeArray[index] = currentDoublyNode;
			currentDoublyNode = currentDoublyNode.getNextNode();
			index++;

		}
		return doublyNodeArray;
	}

	public Integer[] getArrayFormatAsInteger() {

		Integer[] doublyNodeArray = new Integer[this.getLengthOfDoublyList()];
		DoublyNode currentDoublyNode = this.head;
		int index = 0;
		while (currentDoublyNode != null) {
			doublyNodeArray[index] = currentDoublyNode.getData();
			currentDoublyNode = currentDoublyNode.getNextNode();
			index++;
		}
		return doublyNodeArray;
	}

	@Override
	public String toString() {

		StringBuilder strBuilder = new StringBuilder("DoublyLinkedList :{ ");
		DoublyNode currentDoublyNode = this.head;

		while (currentDoublyNode != null) {
			strBuilder.append(currentDoublyNode);
			currentDoublyNode = currentDoublyNode.getNextNode();
			if (currentDoublyNode != null)
				strBuilder.append(",");
		}
		strBuilder.append(" }");
		return strBuilder.toString();
	}

	public int getLengthOfDoublyList() {
		int length = 0;
		DoublyNode currentDoublyNode = this.head;

		while (currentDoublyNode != null) {
			length++;
			currentDoublyNode = currentDoublyNode.getNextNode();
		}
		return length;

	}

}
