package com.Day7;


//Question 3: Find Product of Digits of a Number
//Given a number, find the product of its digits.
//Example:
//Input: 234
//Output: 24

public class ProductOfDigits {
	public static int productOfDigits(int number) {
		int product = 1;
		if (number != 0) {
			while (number > 0) {
				int digit = number % 10;
				if (digit != 0) {
					product *= digit;
					number /= 10;
				}
			}
		} else
			return 0;

		return product;
	}

	public static void main(String[] args) {
		System.out.println(productOfDigits(123));
	}
}
