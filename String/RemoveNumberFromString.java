package String;

import java.util.Scanner;

public class RemoveNumberFromString {
	
	public static void main(String[] args) {
		
		String str;
		System.out.println("Enter a String with number: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		str= str.replaceAll("\\d", "");
		System.out.println("After replacing the number: " + str);
		
		
	}

}
