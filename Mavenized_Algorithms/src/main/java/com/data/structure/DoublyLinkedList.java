package com.data.structure;

public class DoublyLinkedList {

	private DoublyNode head;

	public void addNodeAtHead(int data) {
		DoublyNode doublyNode = new DoublyNode(data);
		if(this.head != null)
		{
			this.head.setPreNode(doublyNode);			
		}
		doublyNode.setNextNode(this.head);
		this.head = doublyNode;
		
	}

	public DoublyNode getHeadNode() {
		return head;
	}

	public void setHeadNode(DoublyNode nextNode) {
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

	public void sortDoublyLinkedList() {

		DoublyNode currentDoublyNode = this.head;
		int count = 0;
		MAIN: while (currentDoublyNode != null) {

			if (currentDoublyNode == this.head) {
				currentDoublyNode = currentDoublyNode.getNextNode();
				continue MAIN;
			}

			DoublyNode doublyPreNode = currentDoublyNode;

			INNER: while (doublyPreNode != null) {

				doublyPreNode = doublyPreNode.getPreNode();

				// Old Place implementation
				if ((doublyPreNode == null) || doublyPreNode.getData() < currentDoublyNode.getData()) { // Right place for current node.

					aggregateOldPlace(currentDoublyNode.getPreNode(), currentDoublyNode.getNextNode());
					mergeNodetoTheNewPlace(currentDoublyNode, doublyPreNode);
					break INNER;
				}

			}
			if (count == this.getLengthOfDoublyList())
				break MAIN;
			currentDoublyNode = currentDoublyNode.getNextNode();
			count++;

		}

	}
	
	private void aggregateOldPlace(DoublyNode cuurrentPreNode, DoublyNode currentNextNode){
		if(currentNextNode != null)
		currentNextNode.setPreNode(cuurrentPreNode); // Current Node's next node's pre-node  is set as current node's pre-node
		cuurrentPreNode.setNextNode(currentNextNode);  // Current Node's next-node  is set as current node's pre-node
	}
	
	private void mergeNodetoTheNewPlace(DoublyNode currentNode, DoublyNode newPlacePreNode){	
		if(newPlacePreNode != null){
		DoublyNode newNextNeighbour = newPlacePreNode.getNextNode();		
		currentNode.setNextNode(newNextNeighbour);
		newPlacePreNode.setNextNode(currentNode);
		newNextNeighbour.setPreNode(currentNode);
		currentNode.setPreNode(newPlacePreNode);
		}else{
			currentNode.setNextNode(this.head);
			this.head.setPreNode(currentNode);
			this.head =currentNode;  
			currentNode.setPreNode(null);
		}
	}
}
