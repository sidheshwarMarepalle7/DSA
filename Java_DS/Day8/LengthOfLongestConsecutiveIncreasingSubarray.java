package com.Day8;

import java.util.ArrayList;
import java.util.List;

//Question 1: Longest Consecutive Increasing Subarray
//
//Given an integer array, find the length of the longest subarray where elements are strictly increasing consecutively.
//
//Example:
//Input: {1, 2, 2, 3, 4, 1, 2, 3}
//Output: 3
//(Subarray: {2, 3, 4})

public class LengthOfLongestConsecutiveIncreasingSubarray {
	private static int lengthOfLongestConsecutiveIncreasingSubarray(int[] arr) {
		int longestSubarray = 1;

		if (arr != null) {
			if (arr.length == 1)
				return 1;
			int subarray = 1;
			int start = 0, end = start + 1;
			while (end < arr.length) {
				if (arr[start] < arr[end]) {
					subarray++;
					start++;
					end++;
				} else {
					start = end;
					end = start + 1;
					longestSubarray = subarray;
					subarray = 1;
				}
			}
		}
		return longestSubarray;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 6, 1, 2, 3 };
		System.out.println(lengthOfLongestConsecutiveIncreasingSubarray(arr));
	}
}
