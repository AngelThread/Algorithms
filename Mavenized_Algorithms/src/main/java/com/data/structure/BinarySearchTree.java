package com.data.structure;

public class BinarySearchTree {

	private TreeNode root;

	public void insert(TreeNode data) {
		insert(data, this.root);
	}
	public void insert(Integer data) {
		insert(new TreeNode(data), this.root);
	}
	private void insert(TreeNode data, TreeNode root) {
		if (this.root == null) {
			this.root = data;
			return;
		}
		if (root.getData() > data.getData()) {
			if (root.getLeft() != null) {
				insert(data, root.getLeft());
			} else {
				root.setLeft(data);
			}
		} else {
			if (root.getRight() != null) {
				insert(data, root.getRight());
			} else {
				root.setRight(data);
			}
		}
	}
	
	public TreeNode find(Integer data){
		return find(data, this.root);
	}

	private TreeNode find(Integer data, TreeNode root) {

		if (data == root.getData())
			return root;

		if (root.getLeft() != null && root.getData() > data) {
			return find(data, root.getLeft());
		}

		if (root.getRight() != null) {
			return find(data, root.getRight());
		}

		return null;
	}

	public void delete(Integer data) {

	}

	public TreeNode getRoot() {
		return root;
	}

}
