package com.cwh;

import java.util.Scanner;

public class PatternPrinting {

	public static void main(String[] args) {
		System.out.println("Enter how many times want to print: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =n; i>0; i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		sc.close();

	}

}
