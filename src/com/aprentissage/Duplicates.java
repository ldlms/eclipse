package com.aprentissage;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		removeDuplicates(nums);

	}

	public static int removeDuplicates(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					nums[i] = 101;
				}
			}
		}
		Arrays.sort(nums);
		for (int k = 0; k < nums.length; k++) {
			if (nums[k] != 101) {
				result = k + 1;
			}
		}
		return result;
	}

}
