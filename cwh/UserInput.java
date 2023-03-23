package com.cwh;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		System.out.println("What is your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();
		
		System.out.println("Hello " + name + " have a good day.");

	}

}
