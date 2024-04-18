package com.aprentissage;

import java.util.Arrays;

public class TwoSums {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		Solution.twoSum(nums, 9);
	}

	public class Solution {
		public static int[] twoSum(int[] nums, int target) {
			final int[] result = new int[2];
			outerloop: for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums.length; j++) {
					if (nums[i] + nums[j] == target) {
						if (i != j) {
							result[0] = i;
							result[1] = j;
							break outerloop;
						}
					}
				}
			}
			System.out.println(Arrays.toString(result));
			return result;
		}
	}

}
