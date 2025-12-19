package com.Day2;

import java.util.Arrays;

class Output2 {
	// App 1
	public static boolean isSorted1(int[] arr) {
		if (arr.length != 0) {
			for (int i = 0; i < arr.length - 2; i++)
				if (arr[i] >= arr[i + 1])
					return false;

			return true;
		}
		return false;

	}

	// App 2
	public static boolean isSorted2(int[] arr) {
		int[] temp = arr.clone();
		if (arr.length != 0) {
			Arrays.sort(arr);
		}
		return Arrays.equals(temp, arr);
	}
}

public class CheckArraySorted {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 6, 4, 5 };
		System.out.println(Output2.isSorted2(arr) ? "Sorted" : "Unsorted");
	}

}
