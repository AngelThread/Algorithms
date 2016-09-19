package com.data.samples;

import com.data.structure.GenericCircularQueueImplementation;

public class GenericQueueSample {

	public static void main(String[] args) {
		GenericCircularQueueImplementation<Integer> intQueue = 
				new  GenericCircularQueueImplementation<>(Integer.class, 10);
		
		try {
			intQueue.emqueue(0);
			intQueue.emqueue(1);
			intQueue.emqueue(2);
			intQueue.emqueue(3);
			intQueue.emqueue(4);
			intQueue.emqueue(5);
			intQueue.emqueue(6);
			intQueue.emqueue(7);
			intQueue.emqueue(8);
			intQueue.emqueue(9);

			Integer[] intQueueArray = intQueue.getImpArray();
		
			int index = 0;
			for (Integer integer : intQueue) {
				System.out.println(index+". index = "+integer);
				index++;
			}

			intQueue.dequeue();
			intQueue.dequeue();
			System.out.println("-----------After the 2 dequeue----------");
			
			System.out.println("Head Index moved to "+intQueue.getHeadIndex()+". index"); 
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
