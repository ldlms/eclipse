package com.aprentissage;

public class insertPos {

	public static void main(String[] args) {

		int[] nums = { 1 };
		int target = 7;

		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {

		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i]) {
				return result = i;
			}
			if (nums.length > 1) {
				if (target > nums[i] && target < nums[i + 1]) {
					return result = i + 1;
				}
			}
			if (target > nums[nums.length - 1]) {
				return result = nums.length;
			}

		}
		return result;
	}

	public int searchGoodInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (high - low) / 2 + low;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}
}
