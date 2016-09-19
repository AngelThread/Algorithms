package com.data.samples;

import com.data.structure.Stack;

public class GenericStackSample {
	
	public static void main(String[] args) {
		
		Stack<String> stackOfStrings = new Stack<>(String.class, 10);
		stackOfStrings.push("String 0");
		stackOfStrings.push("String 1");
		stackOfStrings.push("String 2");
		stackOfStrings.push("String 3");
		stackOfStrings.push("String 4");
		stackOfStrings.push("String 5");
		stackOfStrings.push("String 6");
		stackOfStrings.push("String 7");
		stackOfStrings.push("String 8");
		stackOfStrings.push("String 9");

		 String[] values= stackOfStrings.getValues();
		 
		 for (int i= 0;   i <values.length; i++) {
			System.out.println(i+".value is "+values[i]);
		}
		 
			Stack<Integer> stackOfInetegers = new Stack<>(Integer.class, 10);
			stackOfInetegers.push(0);
			stackOfInetegers.push(1);
			stackOfInetegers.push(2);
			stackOfInetegers.push(3);
			stackOfInetegers.push(4);
			stackOfInetegers.push(5);
			stackOfInetegers.push(6);
			stackOfInetegers.push(7);
			stackOfInetegers.push(8);
			stackOfInetegers.push(9);
	
		Integer[] valuesOfIntegers= stackOfInetegers.getValues();
		
			 for (int i= 0;   i <valuesOfIntegers.length; i++) {
					System.out.println(i+".value is "+valuesOfIntegers[i]);
				}

	}
}
