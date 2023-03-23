package com.cwh;

public class GradeEncryptDecrypt {

	public static void main(String[] args) {
		char grade = 'B';
		
//		Encrypt
		grade = (char)(grade + 8);
		System.out.println(grade);
		
//		Decrypt
		
		grade = (char) (grade - 8);
		System.out.println(grade);

	}

}
