package com.algorithms.recursion;

public class TowerOfHanoi {

	public void moveThemAll(int n, String from, String dest, String temp) {

		if (n == 1) { // breakpoint of recursion
			System.out.println(n + " moved From " + from + " To " + dest);
			return;
		}
		moveThemAll(n - 1, from, temp, dest); // The biggest piece make smaller ones move.
		System.out.println(n + " moved From " + from + " To " + dest);
		moveThemAll(n - 1, temp, dest, from); // The biggest piece then recall  smaller ones.
	}
}
