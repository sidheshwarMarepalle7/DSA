package com.Day6;

//Question 1: Count Odd Numbers
//
//Given an integer array, count how many elements are odd numbers.
//
//Example:
//Input: {1, 2, 3, 4, 5}
//Output: 3

public class CountOddNumbers {
	public static int countOddNumbers(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (num % 2 == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(countOddNumbers(arr));
	}
}
