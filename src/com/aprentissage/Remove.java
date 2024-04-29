package com.aprentissage;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {

		int val = 2;
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2, 3 };
		System.out.println(removeElement(nums, val));

	}

	public static int removeElement(int[] nums, int val) {

		ArrayList<Integer> liste = new ArrayList<>();
		for (int number : nums) {
			if (number != val) {
				liste.add(number);
			}
		}
		Integer[] tempNums = liste.toArray(new Integer[0]);
		for (int i = 0; i < tempNums.length; i++) {
			nums[i] = tempNums[i];
		}

		return liste.size();
	}

	public int goodRemoveElement(int[] nums, int val) {
		int temp, j, value = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				j = i + 1;
				while (j < nums.length && nums[j] == val)
					j++;
				if (j == nums.length)
					break;
				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				value++;
			} else
				value++;
		}
		return value;
	}
}
