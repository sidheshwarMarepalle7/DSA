package com.Day6;

public class SecondLargest {

	public static int secondLargest(int[] arr) {
		if (arr.length > 2) {
			int largest = Integer.MIN_VALUE;
			int secondLargestElement = Integer.MIN_VALUE;

			for (int num : arr) {
				if (num > largest) {
					secondLargestElement = largest;
					largest = num;
				}
			}
			return secondLargestElement;
		}
		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(secondLargest(arr));
	}
}
