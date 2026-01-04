package com.Day7;

//Question 2: Check Palindrome String Using Java
//
//Given a string, check whether it is a palindrome without using reverse().
//
//Example:
//Input: "level" → true
//Input: "java" → false

public class CheckPalindrome {

	public static boolean checkPalindrome(String str) {
		if (str != null) {
			int start = 0, end = str.length() - 1;
			str = str.toLowerCase();
			while (start <= end) {
				if (str.charAt(start) != str.charAt(end))
					return false;
				start++;
				end--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPalindrome("level"));
	}

}
