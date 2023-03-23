package com.cwh.array;

public class AverageOfAnArray {

	public static void main(String[] args) {
		float [] marks = {45f, 55.5f, 60f, 75f, 80f};
		float sum = 0;
		
		for(float element:marks) {
			sum = sum + element;
		}
		System.out.println("The value of average is " + sum/marks.length);

	}

}
