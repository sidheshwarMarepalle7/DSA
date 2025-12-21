package com.Day5;

//Question 1: Count Positive Numbers
//
//Given an integer array, count how many numbers are greater than 0.
//
//Example:
//Input: {-1, 2, 0, 5, -3}
//Output: 2


import java.util.ArrayList;
import java.util.List;

public class CountPositiveNumbers {

	public static List<Integer> countPositiveNumbers(int[] arr) {
		List<Integer> ls = new ArrayList<Integer>();
		for (int element : arr) {
			if (element >= 0)
				ls.add(element);
		}
		return ls;
	}

	public static void main(String[] args) {

		int[] arr = { -10, 12, 3, -4, 5, -6, 7, 8, -9 };
		for (int element : countPositiveNumbers(arr))
			System.out.print(element + " ");
		;
	}

}
