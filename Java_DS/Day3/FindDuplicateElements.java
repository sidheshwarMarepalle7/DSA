package com.Day3;

import java.util.HashSet;
import java.util.Set;

class Operation1 {

	public static Object[] findDuplicateElements(int[] arr) {
		Set<Integer> duplicateElements = new HashSet<Integer>();
		Set<Integer> onceElements = new HashSet<Integer>();

		for (int element : arr) {
			if (onceElements.contains(element)) {
				if (!duplicateElements.contains(element))
					duplicateElements.add(element);
			} else
				onceElements.add(element);
		}
		return duplicateElements.toArray();
	}
}

public class FindDuplicateElements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 4, 1, 5 };
		
		for (Object e : Operation1.findDuplicateElements(arr)) {
			System.out.print(e + " ");
		}
	}
}
