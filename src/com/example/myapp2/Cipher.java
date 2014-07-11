package com.example.myapp2;

public class Cipher {
	

	public static String decryptionAlgorithm1(String s) {
		// TODO Auto-generated method stub

		char[] chars = s.toCharArray();
		
		for (int i = 0; i < chars.length/2; i++) {
			int right = (chars.length - 1) - i;
			
			char temp = chars[i];
			chars[i] = chars[right];
			chars[right] = temp;
		}
		
		return new String(chars);
		
	}

	public static String decryptionAlgorithm2(String text) {
		// TODO Auto-generated method stub

		return text.toString();
	}

	public static String decryptionAlgorithm3(String text) {
		// TODO Auto-generated method stub
		
		return text.toString();
	}
	
}