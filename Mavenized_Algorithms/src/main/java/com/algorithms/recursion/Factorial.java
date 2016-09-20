package com.algorithms.recursion;

public class Factorial {

	public int calculateFactorialWithRecursion(int n){
		
		if(n == 0) return 1;
		
		return calculateFactorialWithRecursion(n-1)*n;
	}
}
