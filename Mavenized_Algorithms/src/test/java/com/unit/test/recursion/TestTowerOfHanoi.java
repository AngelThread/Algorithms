package com.unit.test.recursion;

import org.junit.Test;

import com.algorithms.recursion.TowerOfHanoi;

public class TestTowerOfHanoi {

	@Test
	public void testOneDisc(){
		TowerOfHanoi hanoi = new TowerOfHanoi();
		hanoi.moveThemAll(1, "A", "C", "B");		
	}
	@Test
	public void testTwoDisc(){
		TowerOfHanoi hanoi = new TowerOfHanoi();
		hanoi.moveThemAll(2, "A", "C", "B");		
	}
	
	@Test
	public void testThreeDisc(){
		TowerOfHanoi hanoi = new TowerOfHanoi();
		hanoi.moveThemAll(3, "A", "C", "B");		
	}
}
