package com.aprentissage;

public class ReversedString {

	public static void main(String[] args) {

		int x = 121;
		isPalindrome(x);
	}

	private static void isPalindrome(int x) {
		String str = String.valueOf(x);
		String reversedString = new StringBuilder(str).reverse().toString();

	}
}
