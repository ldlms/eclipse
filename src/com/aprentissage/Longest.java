package com.aprentissage;

public class Longest {
	public static void main(String[] args) {

		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuffer result = new StringBuffer();
		if (strs.length == 1) {
			result.append(strs[0]);
		}

		outerLoop: for (int i = 0; i < strs[0].length(); i++) {
			char character = strs[0].charAt(i);
			boolean isEqual = false;
			for (int j = 1; j < strs.length; j++) {
				if (i > strs[j].length() - 1) {
					break outerLoop;
				}
				if (character == strs[j].charAt(i)) {
					isEqual = true;
				} else {
					isEqual = false;
					break;
				}
			}
			if (isEqual == true) {
				result.append(character);
			} else {
				break outerLoop;
			}
		}
		String resultString = result.toString();
		return resultString;
	}

}
