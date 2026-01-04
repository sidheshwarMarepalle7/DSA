package com.Day8;

//Question 1: Pair Sum (Array – Brute Force Pattern)
//
//Given an integer array and a number x, check whether any pair of elements has a sum equal to x.
//
//Example:
//Input: {4, 1, 6, 2, 5}, x = 7
//Output: True
//(1 + 6 or 5 + 2)

public class PairEqualSum {
	private static boolean pairEqualSum(int[] arr, int target) {
		if (arr != null && arr.length > 1) {
			for (int i = 0; i < arr.length - 2; i++) {
				for (int j = i + 1; j < arr.length - 1; j++) {
					if (arr[i] + arr[j] == target)
						return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = { 4, 1, 6, 2, 5 };
		if (pairEqualSum(arr, 7))
			System.out.println("Pair found");
		else
			System.out.println("Pair not found");
	}

}
