package com.Day3;

public class PalindromeNumber {

	// App 1
	public static boolean palindromeNumber(Integer num) {
		StringBuilder sb = new StringBuilder(num.toString()).reverse();
		return Integer.parseInt(sb.toString()) == num ? true : false;
	}

	public static void main(String[] args) {
		int num = 1234554321;
		int num2 = 123454321;

		if (palindromeNumber(num))
			System.out.println("Yes it is palindrome");

		if (palindromeNumber(num2))
			System.out.println("Yes it is palindrome");

	}

}
