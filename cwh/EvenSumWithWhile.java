package com.cwh;
import java.util.Scanner;
public class EvenSumWithWhile {

	public static void main(String[] args) {
		System.out.println("How many even numbers want to print: ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//		int sum = 0;
//		for(int i=0;i<n;i++) 
//		{
//			sum = sum + (2*i);
//			
//		}
//		System.out.println("Sum of " + n + " even numbers is: " + sum); //even sum
		
		
		
//		for (int i=1;i<=10;i++)
//		{
//			System.out.printf("%d X %d = %d\n", n, i, n*i); Multiplication Table
//		}
		
		
		
//		for (int i=10; i>0; i--) {
//			System.out.printf("%d X %d = %d\n", n, i, n*i); Multiplication Table in reverse order
//		}
		int fact = 1;
		for(int i =1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of " + n + " is " + fact);
		
		sc.close();
	}
		
		

}
