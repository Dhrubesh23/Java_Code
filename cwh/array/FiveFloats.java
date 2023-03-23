package com.cwh.array;

public class FiveFloats {

	public static void main(String[] args) {
		float [] marks = {45.6f, 55.5f, 65f, 90f};
		float sum = 0;
		for(float element:marks) {
			sum = sum + element;
		}
		System.out.println(sum);
		
		

	}

}
