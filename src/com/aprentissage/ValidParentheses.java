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
			if (s.length() % 2 == 0) {
				char[] start = { '(', '{', '[' };
				char[] end = { ')', '}', ']' };
				ArrayList<Character> arrayChar = new ArrayList<>();
				for (char c : s.toCharArray()) {
					arrayChar.add(c);
				}
				while (!arrayChar.isEmpty()) {
					for (int i = 0; i < start.length; i++) {
						for (int j = arrayChar.size() - 1; j >= 0; j--) {
							if (arrayChar.get(j) == start[i]) {
								ArrayList<Character> subList = new ArrayList<>(arrayChar.subList(j, arrayChar.size()));
								if (!subList.contains(end[i])) {
									return false;
								}
								ArrayList<Character> subSubList = new ArrayList<>(
										subList.subList(0, subList.indexOf(end[i]) + 1));
								if (subSubList.size() == 2) {
									arrayChar.remove(arrayChar.indexOf(end[i]));
									arrayChar.remove(arrayChar.lastIndexOf(start[i]));
								}
								if (!(subSubList.size() % 2 == 0)) {
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
		return false;
	}
}
