package com.Day3;

import java.util.ArrayDeque;
import java.util.Deque;

public class MoveAllZerosToEnd {
	public static Object[] moveAllZerosToEnd(int[] arr) {
		Deque<Integer> arranged = new ArrayDeque<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == 0)
				arranged.offerLast(arr[i]);
			else
				arranged.offerFirst(arr[i]);
		}
		return arranged.toArray();
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		for (Object element : moveAllZerosToEnd(arr))
			System.out.print(element+" ");
	}

}
