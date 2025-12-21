package com.Day5;

//Question 3: Find Length of String
//
//Given a string, find its length without using built-in length functions.
//
//Example:
//Input: "coding"
//Output: 6

public class LengthOfString {
	// Using String method
	public int lengthByString(String str) {
		return str.length();
	}

	// Counting
	public static int lengthOfString(String str) {
		int count = 0;
		if (str != null) {
			for (char ch : str.toCharArray())
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println(lengthOfString("coding"));
		System.out.println(lengthOfString("coding"));
	}

}
