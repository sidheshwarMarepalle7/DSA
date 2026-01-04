package com.Day8;

//Question 3: Count Trailing Zeros (Math Pattern)
//
//Given a number n, find the number of trailing zeros in n! (factorial).
//
//Example:
//Input: 10
//Output: 2
//(10! = 3628800)

public class TrailingZeros {
	private static long getFactorial(int num) {
		long factorial = 1;
		while (num > 0) {
			factorial *= num;
			num--;
		}
		return factorial;
	}

	public static int findTrailingZeroes(int num) {
		int count = 0;
		if (num == 0 || num == 1) {
			return 0;
		} else if (num > 1) {
			long factorial = getFactorial(num);
			char[] digits = Long.toString(factorial).toCharArray();
			for (int i = digits.length - 1; i >= 0; i--) {
				if (digits[i] == '0')
					count++;
				else
					return count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int zerosCount = findTrailingZeroes(10);
		if (zerosCount != 0)
			System.out.println("Number of trailing zeros: " + zerosCount); // 2
		else
			System.out.println("Invalid number");
	}

}
