package com.algorithms.recursion;

public class FibonacciNumbers {
	
	public static int findFibonacciNumber(int n){
		if(n<= 0) return n;
		
		return n + findFibonacciNumber(n-1);
		
	}

}
