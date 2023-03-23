package com.cwh;

import java.util.Scanner;

public class ComparisonOperators {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = 5;
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		System.out.println(num1>num);

	}

}
