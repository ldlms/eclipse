package com.aprentissage;

import java.util.ArrayList;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "(([]){}())";
		System.out.println(goodValid(s));
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
						if ((!arrayChar.contains(start[i]) && arrayChar.contains(end[i]))
								|| (arrayChar.contains(start[i]) && !arrayChar.contains(end[i]))) {
							return false;
						}
						for (int j = arrayChar.size() - 1; j >= 0; j--) {
							if (arrayChar.get(j) == start[i]) {
								ArrayList<Character> subList = new ArrayList<>(arrayChar.subList(j, arrayChar.size()));
								if (!subList.contains(end[i])) {
									return false;
								}
								ArrayList<Character> subSubList = new ArrayList<>(
										subList.subList(0, subList.indexOf(end[i]) + 1));
								if (subSubList.size() % 2 != 0) {
									return false;
								}
								if (subSubList.size() == 2) {
									arrayChar.remove(j);
									arrayChar.remove(j);
								}
								if (subSubList.size() > 2) {
									arrayChar.remove(j + (subSubList.size() - 1));
									arrayChar.remove(j);
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

	public static boolean goodValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (Character c : s.toCharArray()) {
			// check if open bracket -> push the same type of close bracket to stack
			if (c == '(')
				stack.push(')');
			else if (c == '[')
				stack.push(']');
			else if (c == '{')
				stack.push('}');
			else if (!(!stack.isEmpty() && stack.pop() == c))
				return false;

		}

		return stack.isEmpty();
	}
}
