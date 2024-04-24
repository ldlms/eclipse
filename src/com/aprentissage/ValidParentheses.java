package com.aprentissage;

import java.util.ArrayList;
import java.util.Collections;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "({{{{}}}))";
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
			ArrayList<Character> reverseArrayChar = new ArrayList<>(arrayChar);
			Collections.reverse(reverseArrayChar);
			for (int i = 0; i < start.length; i++) {
				for (int j = 0; j < arrayChar.size(); j++) {
					if (!(arrayChar.size() % 2 == 0)) {
						return false;
					}
					if (arrayChar.contains(start[i])) {
						if (arrayChar.contains(end[i])) {
							if (arrayChar.indexOf(start[i]) > arrayChar.indexOf(end[i])) {
								return false;
							}
							int indiceFin = arrayChar.size() - reverseArrayChar.indexOf(end[i]);
							int indiceDebut = arrayChar.indexOf(start[i]);
							if (arrayChar.size() > 2) {
								ArrayList<Character> checkList = new ArrayList<>(
										arrayChar.subList(indiceDebut + 1, indiceFin - 1));
								if (!(checkList.size() % 2 == 0)) {
									return false;
								}
							}
							if (arrayChar.size() > 2) {
								arrayChar.remove(indiceFin - 1);
								arrayChar.remove(indiceDebut);

							} else {
								return false;
							}
						}
					}
				}
				return true;
			}
			return false;
		}
	}
}
