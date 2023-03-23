package com.cwh.array;

public class CheckAnArraySortedOrNot {

	public static void main(String[] args) {
		
		boolean isSorted = true;
//		int [] arr = {3, 5, 1, 11, 15};
		int [] arr = {1, 3, 7, 11, 16};
		for(int i = 0; i <arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				isSorted = false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("The array is sorted");
		}
		else {
			System.out.println("The array is not sorted");
		}

	}

}
