package com.cwh;

import java.util.Scanner;

public class WebsiteurlCheck {

	public static void main(String[] args) {
		System.out.println("Enter a website: ");
		Scanner sc = new Scanner(System.in);
		String url = sc.nextLine();
		
		if(url.endsWith(".com")) {
			System.out.println("Its a commercial website");
		}
		else if(url.endsWith(".org")){
			System.out.println("Its a organisation website");
		}
		else if(url.endsWith(".in")) {
			System.out.println("Its a Indian website");
		}
		
		sc.close();
		
	}

}
