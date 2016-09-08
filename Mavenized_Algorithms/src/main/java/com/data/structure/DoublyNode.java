package com.data.structure;

public class DoublyNode {
	private int data;
	private DoublyNode nextNode;
	private DoublyNode preNode;
	
	public DoublyNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(DoublyNode nextNode) {
		this.nextNode = nextNode;
	}
	
	public DoublyNode getPreNode() {
		return preNode;
	}

	public void setPreNode(DoublyNode preNode) {
		this.preNode = preNode;
	}

	@Override
	public String toString() {		
		return String.valueOf(this.data);
	}
	
	
}
