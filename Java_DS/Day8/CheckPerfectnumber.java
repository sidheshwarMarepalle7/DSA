package com.Day8;

import java.util.LinkedList;
import java.util.Queue;

//Question 3: Check If Number Is a Perfect Number
//
//Given a number, check whether it is a perfect number
//(A number whose sum of proper divisors equals the number itself).
//
//Example:
//Input: 28
//Output: True
//(1 + 2 + 4 + 7 + 14 = 28)

public class CheckPerfectnumber {
	private static boolean checkPerfectNumber(int num) {
		if (num <= 0)
			return false;

		int sum = 1;
		for (int d = 2; d <= num / 2; d++) {
			if (num % d == 0)
				sum += d;
		}
		return sum == num;
	}

	public static void main(String[] args) {
		int num = 28;
		System.out.println(checkPerfectNumber(num)); // true
	}
}
