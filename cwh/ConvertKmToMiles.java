package com.cwh;

import java.util.Scanner;

public class ConvertKmToMiles {

	public static void main(String[] args) {
		
		System.out.println("How many Kilometers: ");
		Scanner sc = new Scanner(System.in);
		double value = sc.nextDouble();
		double value1 = value * 0.62137;
		sc.close();
		System.out.println(value + " Kilometers = " + value1 + " Miles.");

	}

}
