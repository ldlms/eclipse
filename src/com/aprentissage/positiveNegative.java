package com.aprentissage;

import java.util.Arrays;

public class positiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -10, 8, 6, 7, -2, -3 };
		System.out.println(findMaxK(nums));

	}

	public static int findMaxK(int[] nums) {

		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == (nums[j] * -1)) {
					return nums[j];
				}
			}
		}
		return -1;
	}

}
