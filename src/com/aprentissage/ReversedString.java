package com.aprentissage;

public class ReversedString {

	public static void main(String[] args) {

		int x = -121;
		System.out.println(isPalindrome(x));
	}

	private static boolean isPalindrome(int x) {
		String str = String.valueOf(x);
		String reversedString = new StringBuilder(str).reverse().toString();
		System.out.println(str);
		System.out.println(reversedString);
		return str.equals(reversedString);

	}

	private static boolean isPalindromeBonneReponse(int x) {
		int r, sum = 0, temp;
		temp = x;
		while (x > 0) {
			r = x % 10;
			sum = (sum * 10) + r;
			x = x / 10;
		}
		if (temp == sum) {
			return true;
		}

		return false;
	}
}
