package com.Day6;

//Question 1: Find First and Last Occurrence
//
//Given an integer array and a number x, find the first and last index of x.
//
//Example:
//Input: {5, 1, 2, 3, 2, 4, 2}, x = 2
//Output: First = 2, Last = 6

public class FindFirstLastOccurrence {

	public static int[] findFirstLastOccurrence(int[] arr, int target) {
		int[] result = new int[] { -1, -1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				if (result[0] == -1) {
					result[0] = i;
				}
				result[1] = i;
			}
		}
		return result;
	}

	// using two pointer approach
	public static int[] findFirstLastOccurrenceByTwoPointer(int[] arr, int target) {
		int[] result = new int[] { -1, -1 };
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			if (result[0] == -1 && arr[start] == target) {
				result[0] = start;
				result[1] = start;
			}
			if (arr[end] == target)
				result[1] = end;
			start++;
			end--;
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 1, 2, 3, 2, 4, 2 };
		int[] occurrence = findFirstLastOccurrenceByTwoPointer(arr, 5);
		if (occurrence[0] == occurrence[1])
			System.out.println("Occurred once only at " + occurrence[0]);
		else
			System.out.println("First occurrence: " + occurrence[0] + ", Last occurrence: " + occurrence[1]);

	}
}
