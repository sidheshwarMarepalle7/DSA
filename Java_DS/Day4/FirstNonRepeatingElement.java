package com.Day4;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatingElement {
	public static int firstNonRepeatingElement(int[] arr) {
		List<Integer> array = new ArrayList<Integer>();
		for (int element : arr)
			array.add(element);

		for (int element : arr) {
			if (array.indexOf(element) == array.lastIndexOf(element))
				return element;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 4, 9, 6, 7, 4 };
		System.out.print(firstNonRepeatingElement(arr));
	}

}
