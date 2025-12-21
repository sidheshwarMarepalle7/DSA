package com.Day6;

//Question 3: Sum of Positive integers of an Array 
//
//Given an integer array, find the sum of all positive integers .
//
//Example:
//Input: {-9 ,1, 2, -3, 3, -5, 4, 5}
//Output: 12

public class AddPostiveElementsOfArray {

	public static int addPostiveElementsOfArray(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			if (num > 0)
				sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -9, 1, 2, -3, 3, -5, 4, 5 };
		System.out.println(addPostiveElementsOfArray(arr));   // 15
	}

}
