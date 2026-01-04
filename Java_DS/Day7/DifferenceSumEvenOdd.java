package com.Day7;

//Question 1: Find Difference Between Sum of Even and Odd Elements
//Given an integer array, find the difference between the sum of even elements and the sum of odd elements.
//Example:
//Input: {1, 2, 3, 4, 5}
//Output: -3
//(Even sum = 6, Odd sum = 9 → 6 − 9 = -3)

public class DifferenceSumEvenOdd {

	public static int differenceSumEvenOdd(int[] arr) {
		int start = 0, end = arr.length - 1, sumEven = 0, sumOdd = 0;
		while (start < end) {
			if (arr[start] % 2 == 0)
				sumEven += arr[start];
			else
				sumOdd += arr[start];

			if (arr[end] % 2 == 0)
				sumEven += arr[end];
			else
				sumOdd += arr[end];
			start++;
			end--;
		}
		if (start == end) {
			if (arr[start] % 2 == 0)
				sumEven += arr[start];
			else
				sumOdd += arr[start];
		}
		return sumEven - sumOdd;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(differenceSumEvenOdd(arr));

	}

}
