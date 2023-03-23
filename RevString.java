import java.util.Scanner;

public class RevString {
	public static void main (String args[]) {
	
	String str;
	System.out.println("Enter a string : ");
	Scanner sc = new Scanner(System.in);
	str = sc.nextLine();
	
	System.out.println("After reversing :");
	
	for(int i = str.length(); i>0; --i) 
	{
		System.out.print(str.charAt(i-1));
	}
}

}