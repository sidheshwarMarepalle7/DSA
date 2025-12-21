package com.Day6;

public class SecondSmallest {

	public static int secondSmallest(int[] arr) {
		int secondSmallestElement = Integer.MAX_VALUE;
		if (arr.length > 2) {
			int smallest = Integer.MAX_VALUE;
			for (int num : arr) {
				if (num < smallest) {
					secondSmallestElement = smallest;
					smallest = num;
				}
				else if (num > smallest && num < secondSmallestElement) 
	                secondSmallestElement = num;
			}
		}
		return secondSmallestElement;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };		
		System.out.println(secondSmallest(arr));
	}
}
