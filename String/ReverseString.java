package String;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		String s;
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		s= sc.nextLine();
		System.out.println("After a reverse the string: ");
		for(int i = s.length(); i>0; --i) {
			System.out.print(s.charAt(i-1));
		}
	}
	

}
