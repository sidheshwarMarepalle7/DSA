package com.Day1;

import java.util.Arrays;

class Operations {

	// App 1
	public static int countEvenNumbers1(int[] arr) {
		if (arr.length == 0)
			return 0;
		else {
			int count = 0;
			for (int element : arr) {
				if (element % 2 == 0)
					count++;
			}
			return count;
		}
	}

	// App 2
	public static int countEvenNumbers2(int[] arr) {
		return (int) Arrays.stream(arr).filter(num -> num % 2 == 0).count();
	}
}

public class CountEvenNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 8 };
		System.out.println(Operations.countEvenNumbers2(arr));
	}

}
