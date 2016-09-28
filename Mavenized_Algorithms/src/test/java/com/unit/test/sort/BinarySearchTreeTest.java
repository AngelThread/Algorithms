package com.unit.test.sort;

import org.junit.Test;
import static org.junit.Assert.*;

import com.data.structure.BinarySearchTree;

public class BinarySearchTreeTest {

	@Test
	public void testRootInsert(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		assertEquals(new Integer(30), binarySearchT.getRoot().getData());
	}
	
	@Test
	public void testLeftChildOfRootInsert(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		binarySearchT.insert(20);
		assertEquals(new Integer(20), binarySearchT.getRoot().getLeft().getData());
	}
	
	@Test
	public void testRightChildOfRootInsert(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		binarySearchT.insert(40);
		assertEquals(new Integer(40), binarySearchT.getRoot().getRight().getData());
	}
	
	
	@Test
	public void testFindRoot(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		assertEquals(new Integer(30),binarySearchT.find(30).getData());
		
	}
	
	@Test
	public void testFindLeftChildOfRoot(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		binarySearchT.insert(20);
		assertEquals(new Integer(20),binarySearchT.find(20).getData());
		
	}
	
	@Test
	public void testFindRightChildOfRoot(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		binarySearchT.insert(40);
		assertEquals(new Integer(40),binarySearchT.find(40).getData());
		
	}
	@Test
	public void testAttemptToDeleteEmptyTree(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		assertEquals(null, binarySearchT.delete(0));
	}
	@Test
	public void deleteLeaf(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		binarySearchT.insert(20);
		binarySearchT.insert(45);
		binarySearchT.insert(38);
		assertEquals(new Integer(38).intValue(), binarySearchT.delete(38).getData().intValue());
	}
	@Test
	public void deleteSubNode(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		binarySearchT.insert(20);
		binarySearchT.insert(45);
		binarySearchT.insert(38);
		binarySearchT.insert(47);
		binarySearchT.delete(38);
		assertEquals(new Integer(45), binarySearchT.getRoot().getRight().getData());
	}
	@Test
	public void deleteSubNodeWithRightLeaf(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		binarySearchT.insert(20);
		binarySearchT.insert(45);
		binarySearchT.insert(38);
		binarySearchT.insert(47);
		binarySearchT.insert(54);

		assertEquals(new Integer(47), binarySearchT.getRoot().getRight().getRight().getData());
	}
	
	@Test
	public void testBinarySearchTreeSmallestRoot(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		assertEquals(new Integer(30), binarySearchT.getSmallestData().getData());
	}
	
	@Test
	public void testBinarySearchTreeSmallest(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		binarySearchT.insert(45);

		assertEquals(new Integer(30), binarySearchT.getSmallestData().getData());
	}
	
	@Test
	public void testBinarySearchTreeSmallestData(){
		BinarySearchTree binarySearchT = new BinarySearchTree();
		binarySearchT.insert(30);
		binarySearchT.insert(45);
		binarySearchT.insert(20);

		assertEquals(new Integer(20), binarySearchT.getSmallestData().getData());
	}
}
