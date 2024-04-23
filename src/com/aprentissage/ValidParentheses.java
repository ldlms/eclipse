package com.aprentissage;

import java.util.ArrayList;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "()[]{}";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		if (s != null && !s.isEmpty()) {
			if (s.length() % 2 == 0) {
				ArrayList<Character> arrayChar = new ArrayList<>();
				for (char c : s.toCharArray()) {
					arrayChar.add(c);
				}
				for (int i = 0; i < arrayChar.size(); i++) {
					if (arrayChar.get(i) == '(') {
						if (!arrayChar.contains(')')) {
							return false;
						}
						if (arrayChar.contains('[')) {
							if (arrayChar.indexOf(')') < arrayChar.indexOf(']')) {
								return false;
							}
						}
						if (arrayChar.contains('{')) {
							if (arrayChar.indexOf(')') < arrayChar.indexOf('}')) {
								return false;
							}
						}
					}
					if (arrayChar.get(i) == '[') {
						if (!arrayChar.contains(']')) {
							return false;
						}
						if (arrayChar.contains('(')) {
							if (arrayChar.indexOf(']') < arrayChar.indexOf(')')) {
								return false;
							}
						}
						if (arrayChar.contains('{')) {
							if (arrayChar.indexOf(']') < arrayChar.indexOf('}')) {
								return false;
							}
						}
					}
					if (arrayChar.get(i) == '{') {
						if (!arrayChar.contains('}')) {
							return false;
						}
						if (arrayChar.contains('(')) {
							if (arrayChar.indexOf('}') < arrayChar.indexOf(')')) {
								return false;
							}
						}
						if (arrayChar.contains('[')) {
							if (arrayChar.indexOf('}') < arrayChar.indexOf(']')) {
								return false;
							}
						}
					}

				}
				return true;
			}
			return false;
		}
		return false;

	}
}
