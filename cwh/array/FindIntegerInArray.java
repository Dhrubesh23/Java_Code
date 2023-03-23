package com.cwh.array;

public class FindIntegerInArray {

	public static void main(String[] args) {
		int a = 6;
		int [] value = {6, 7, 8, 9, 11};
		
		boolean isInArray = false;
		
		for(int element:value) {
			if(a==element) {
				isInArray= true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("The value is present in the array.");
		}
		else {
			System.out.println("The value is not present in the array");
		}

	}

}
