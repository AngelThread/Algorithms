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
		System.out.println("BinarySearchTree's the smallest data "+binaryST.getSmallestData().getData());
	
		System.out.println(binaryST.getRoot().getRight().getData()); //40
		System.out.println(binaryST.getRoot().getRight().getRight().getData()); //45
		System.out.println(binaryST.getRoot().getRight().getLeft().getData()); // 38
		System.out.println(binaryST.getRoot().getLeft().getData()); //20
		System.out.println(binaryST.getRoot().getLeft().getRight().getData()); //32
		System.out.println(binaryST.getRoot().getLeft().getLeft().getData()); //18
		
		TreeNode treeNode = binaryST.find(20);
		
		System.out.println(treeNode.getData());
		
		TreeNode treeNode1 = binaryST.find(45);
		if(treeNode1  == null) {
			System.out.println("TreeNode is null");
		}else{
			System.out.println("TreeNode is "+ treeNode1.getData());

		}
		
		System.out.println("BinarySearchTree's the smallest data "+binaryST.getSmallestData().getData());
		
		System.out.println(binaryST.getRoot().getRight().getData()); //40
		System.out.println(binaryST.getRoot().getRight().getRight().getData()); //45
		System.out.println(binaryST.getRoot().getRight().getLeft().getData()); // 38
		System.out.println(binaryST.getRoot().getLeft().getData()); //20
		System.out.println(binaryST.getRoot().getLeft().getRight().getData()); //32
		System.out.println(binaryST.getRoot().getLeft().getLeft().getData()); //18
		
		binaryST.delete(40);
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println(binaryST.getRoot().getRight().getData()); //45
		//System.out.println(binaryST.getRoot().getRight().getRight().getData()); //45
		System.out.println(binaryST.getRoot().getRight().getLeft().getData()); // 38
		System.out.println(binaryST.getRoot().getLeft().getData()); //20
		System.out.println(binaryST.getRoot().getLeft().getRight().getData()); //22
		System.out.println(binaryST.getRoot().getLeft().getLeft().getData()); //18

		System.out.println("BinarySearchTree's the smallest data "+binaryST.getSmallestData().getData());

	}
}
