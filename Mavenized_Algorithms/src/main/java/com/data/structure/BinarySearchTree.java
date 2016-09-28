package com.data.structure;

import java.util.ArrayList;
import java.util.List;

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

	public TreeNode find(Integer data) {
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

	public TreeNode delete(Integer data) {
		return delete(data, this.root, null, false);
	}

	public TreeNode getRoot() {
		return root;
	}
	
	private TreeNode findSubTree(TreeNode currentNode, TreeNode parentNode, boolean isRight){
		TreeNode processorNode = currentNode.getRight();
		
		while (processorNode.getLeft() != null) {
			processorNode = processorNode.getLeft();
		}
		if (!isRight) {
			TreeNode oldRight = null;
			parentNode.setLeft(processorNode);
			processorNode.setLeft(currentNode.getLeft());
			if (processorNode.getRight() != null) {
				oldRight = processorNode.getRight();
				parentNode.setLeft(oldRight);
			}
			processorNode.setRight(currentNode.getRight());
			currentNode.setLeft(null);
			currentNode.setRight(null);
		} else {
			TreeNode oldRight = null;
			parentNode.setRight(processorNode);
			processorNode.setLeft(currentNode.getLeft());
			if (processorNode.getRight() != null) {
				oldRight = processorNode.getRight();
				parentNode.setLeft(oldRight);
			}
			if(processorNode.getData() != currentNode.getRight().getData())
			processorNode.setRight(currentNode.getRight());
			currentNode.setLeft(null);
			currentNode.setRight(null);

		}
		return currentNode;
		
	}

	public TreeNode delete(int data, TreeNode currentNode, TreeNode parentNode, boolean isRight) {

		if (this.root == null)
			return null;

		if (data == currentNode.getData()) {

			if (currentNode.getLeft() != null && currentNode.getRight() != null) {
				return findSubTree(currentNode, parentNode, isRight);
			}

			else if (currentNode.getLeft() != null) {

				if (isRight) {
					parentNode.setRight(currentNode.getLeft());
				} else {
					parentNode.setLeft(currentNode.getLeft());
				}
				currentNode.setLeft(null);
				return currentNode;
			} else if (currentNode.getRight() != null) {

				if (isRight) {
					parentNode.setRight(currentNode.getRight());
				} else {
					parentNode.setLeft(currentNode.getRight());
				}
				currentNode.setRight(null);
				return currentNode;

			} else {
				if (isRight) {
					parentNode.setRight(null);
				} else {
					parentNode.setLeft(null);
				}
				return currentNode;

			}

		} else if (data >= currentNode.getData()) {
			if (currentNode.getRight() != null) {
				return delete(data, currentNode.getRight(), currentNode, true);
			} else {
				return null;
			}
		} else {
			if (currentNode.getLeft() != null) {
				return delete(data, currentNode.getLeft(), currentNode, false);
			} else {
				return null;
			}
		}

	}


	
	public TreeNode getSmallestData(){
		return getSmallestData(this.root);
	}
	private TreeNode getSmallestData(TreeNode root){
		
		if(this.root == null) return null;
		
		if(root.getLeft() != null)
		return getSmallestData(root.getLeft());
		return root;	
	}
	
	public TreeNode getBiggestData(){
		return getBiggestData(this.root);
	}
	
	private TreeNode getBiggestData(TreeNode root){
		if(this.root == null) return null;
		if(root.getRight() !=null)
		return getBiggestData(root.getRight());
		return root;
	}
	
	public Integer[] getDatasInOrder(){
		List<Integer> intList = new ArrayList<Integer>();
		getDatasInOrder(this.root, intList);
		Integer[] intArray = intList.toArray(new Integer[0]);
		
		return intArray;
	}

	
	private List<Integer> getDatasInOrder(TreeNode rootNode, List<Integer> intList ){
		if(this.root == null) return null;
		
		if(rootNode.getLeft() == null && rootNode.getRight() == null){
			intList.add(rootNode.getData());
			return intList;
		}
		if(rootNode.getLeft() != null)
		getDatasInOrder(rootNode.getLeft(), intList);
		intList.add(rootNode.getData());
		if(rootNode.getRight() != null)
		getDatasInOrder(rootNode.getRight(), intList);

		return intList;
		
		
	}
}
