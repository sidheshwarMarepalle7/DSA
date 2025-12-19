package com.Day2;

import java.util.Arrays;

// App 1
class GetSum {
	public static int sumOfDigits1(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	// APP 2
	public static int checkPalindrome2(Integer num) {
		int sum = 0;
		char[] numArray = num.toString().toCharArray();
		for (char ch : numArray)
			sum += ch - '0';
		return sum;
	}

	// App 3
	public static boolean checkPalindrome3() {
		return false;
	}

}

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(GetSum.sumOfDigits1(12345));
	}

}
