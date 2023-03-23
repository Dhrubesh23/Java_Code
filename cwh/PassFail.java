package com.cwh;
import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		
		System.out.println("Marks of math: ");
		Scanner sc = new Scanner(System.in);
		float m1 = sc.nextFloat();
		
		System.out.println("Marks of physics: ");
		float m2 = sc.nextFloat();
		
		System.out.println("Marks of Chemistry: ");
		float m3 = sc.nextFloat();
		
		float avg = (m1 + m2 + m3)/3.0f;
		System.out.println("Your overall average: " + avg);
		
		sc.close();
		
		if(avg>=40 && m1>=33 && m2>=33 && m3>=33) 
		{ 
			System.out.println("You are passed");
		}
		
		else {
			System.out.println("Your are failed");
		}
		
		
	}

}
