package com.data.structure;

import java.lang.reflect.Array;


public class Stack<E> {
	
	private int size = 0;
	private int top = -1;
	private E[] arrayImp;
	
	@SuppressWarnings("unchecked")
	public Stack(Class<E> c,int size) {
		this.size = size;
		arrayImp = (E[]) Array.newInstance(c,size);
	}
	
	public void push(E e){
		if(top+1 > size-1){
			throw new RuntimeException("Stack is already full!");
		}
		top++;
		this.arrayImp[top] = e;
	}
	
	public E peek(){
		return this.arrayImp[this.top];
	}
	
	public E pull(){
		if(top -1 < 0) {
			throw new RuntimeException("Stack is already empty!");
		}	
		E currentValue = this.arrayImp[top];
		this.arrayImp[top] = null;
		top--;
		return currentValue;
	}
	
	public E[] getValues(){
		return arrayImp;
		
	}
}
