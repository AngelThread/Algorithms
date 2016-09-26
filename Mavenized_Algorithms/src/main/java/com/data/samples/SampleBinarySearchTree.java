package com.data.samples;

import com.data.structure.BinarySearchTree;
import com.data.structure.TreeNode;

public class SampleBinarySearchTree {

	
	public static void main(String[] args) {
		BinarySearchTree binaryST = new BinarySearchTree();

		binaryST.insert(new TreeNode(30));
		binaryST.insert(new TreeNode(40));
		binaryST.insert(new TreeNode(20));
		binaryST.insert(new TreeNode(18));
		binaryST.insert(new TreeNode(22));
		binaryST.insert(new TreeNode(38));
		binaryST.insert(new TreeNode(45));
		
		System.out.println(binaryST.getRoot().getRight().getData());
		System.out.println(binaryST.getRoot().getRight().getRight().getData());
		System.out.println(binaryST.getRoot().getRight().getLeft().getData());
		System.out.println(binaryST.getRoot().getLeft().getData());
		System.out.println(binaryST.getRoot().getLeft().getRight().getData());
		System.out.println(binaryST.getRoot().getLeft().getLeft().getData());
		
		TreeNode treeNode = binaryST.find(20);
		
		System.out.println(treeNode.getData());

	}
}
