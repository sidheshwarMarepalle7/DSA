package com.Day6;

import java.util.Arrays;

public class ArrayeEquality {
	public static boolean arrayEquality1(int[] arr1, int[] arr2) {

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++)
				if (arr1[i] != arr2[i])
					return false;
		} else
			return false;
		return true;
	}

	public static boolean arrayEquality2(int[] arr1, int[] arr2) {
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 3, 2 };
		if (arrayEquality1(arr1, arr2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}

}
