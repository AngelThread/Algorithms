package com.data.structure;

public class TreeNode {
	
	private Integer data;
	private TreeNode right;
	private TreeNode left;
	
	
	public TreeNode(Integer data) {
		this.data = data;
	}
	public Integer getData() {
		return data;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}

}
