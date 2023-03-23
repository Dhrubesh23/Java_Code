package com.cwh;

import java.util.Scanner;

public class TaxCalculate {

	public static void main(String[] args) {
		
		System.out.println("Enter your income in lakh per annum");
		Scanner sc = new Scanner(System.in);
		float tax = 0;
		float income = sc.nextFloat();
		sc.close();
		
		if(income<=2.5) {
			tax = tax + 0;
		}
		else if(income>2.5f && income<=5f) {
			tax = tax + 0.05f * (income-2.5f);
		}
		else if (income>5f && income <= 10f) {
			tax = tax + 0.05f * (5.0f - 2.5f);
			tax = tax + 0.2f * (income - 5f);
			
		}
		else if (income > 10.0f) {
			tax = tax + 0.05f * (5.0f - 2.5f);
			tax = tax + 0.2f * (10.0f - 5f);
			tax = tax + 0.3f * (income - 10.0f);
		}
		
		System.out.println("The total tax paid by the employee is: " + tax);

	}

}
