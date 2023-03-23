package com.cwh.method;

public class SumRecursion {

	static int sumRec(int n) {
		if(n==1) {
			return 1;
		}
		return n + sumRec(n-1);
	}
	
	
	public static void main(String[] args) {


		System.out.println("Sum of N natural numbers: " +sumRec(3));

	}

}
