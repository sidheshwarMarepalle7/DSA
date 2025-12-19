package com.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Operation {
	public static int getMax1(int[] arr) {
		if (arr.length == 0)
			return 0;
		else if (arr.length == 1)
			return arr[0];
		else {
			int max = arr[0];
			for (int element : arr) {
				max = (element > max) ? element : max;
			}
			return max;
		}
	}

	// App 2
	public static int getMax2(int[] arr) {
		if (arr.length == 0)
			return 0;
		else if (arr.length == 1)
			return arr[0];
		else {
			List<Integer> ls = new ArrayList<>();
			for (int e : arr) {
				ls.add(e);
			}
			return Collections.max(ls);
		}
	}

	// App 3 (slower n log(n))
	public static int getMax3(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();
	}
}

public class MaxElement {

	public static void main(String[] args) {

		int[] arr = { 50, 24, 200, 1, 2, 3, 4, 6, 100 };
		System.out.println(Operation.getMax2(arr));
	}

}
