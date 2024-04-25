package com.aprentissage;

import java.util.ArrayList;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "[({(())}[()])]";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		if (s != null && !s.isEmpty()) {
			char[] start = { '(', '{', '[' };
			char[] end = { ')', '}', ']' };
			ArrayList<Character> arrayChar = new ArrayList<>();
			for (char c : s.toCharArray()) {
				arrayChar.add(c);
			}
			for (int i = 0; i < start.length; i++) {
				for (int j = 0; j < arrayChar.size(); j++) {
					if (arrayChar.contains(start[i])) {
						if (arrayChar.contains(end[i])) {
							if (arrayChar.indexOf(start[i]) > arrayChar.indexOf(end[i])) {
								return false;
							}

						}
					}
				}
			}
			return true;
		}
		return false;
	}
}
