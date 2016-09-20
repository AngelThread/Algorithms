package com.algorithms.recursion;

public class Euclidean {
	
	public static int calculateGCD(int a, int b){ //Greatest Common Division
		if(a == 0 || b == 0) return 0;

		if(a > b){
		int rest = a%b;
		if( rest == 0) return b;
		
		return calculateGCD(Math.max(a/b,b ), rest);
		}else{
			int rest = b%a;
			if( rest == 0) return a;
			return calculateGCD(Math.max(b/a,a ), rest);
			}
	}
	
	
}
