package com.cwh.array;

public class MaximumInArray {

	public static void main(String[] args) {
		int [] arr = {10, 14, 9, 7, 5};
		int max = 0;
		for (int element: arr) {
			if(element>max) {
				max = element;
			}
		}
		System.out.println("The maximum element in the array is: " + max);
		

	}

}
