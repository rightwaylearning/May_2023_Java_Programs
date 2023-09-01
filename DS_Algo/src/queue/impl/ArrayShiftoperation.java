package queue.impl;

import java.util.Iterator;

public class ArrayShiftoperation {

	public static void main(String[] args) {
		
		
		Integer[] arr = {10,20,30,40,50};  // {null,10,20,30,40}
		printArray(arr);
		
		Integer storage = null;
		for (int i = 0; i < arr.length; i++) {
			 Integer temp = arr[i]; 
			 arr[i] = storage;     
			 storage = temp;      
		}
		
		printArray(arr);
	}
	
	public static void printArray(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
