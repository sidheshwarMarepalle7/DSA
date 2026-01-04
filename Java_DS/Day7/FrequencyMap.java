package com.Day7;

import java.util.HashMap;
import java.util.Map;

//Question 1: Count Occurrence Using HashMap (Java)
//
//Given an integer array, count the occurrence of each element using HashMap.
//
//Example:
//Input: {2, 3, 2, 5, 3, 3}
//Output:
//2 → 2
//3 → 3
//5 → 1

public class FrequencyMap {
	public static Map<Integer, Integer> frequencyMap(int[] arr) {
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		for (int num : arr)
			frequencyMap.put(num, 0);

		for (int num : arr)
			frequencyMap.put(num, frequencyMap.get(num) + 1);

		return frequencyMap;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 5, 3, 3 };
		Map<Integer, Integer> map = frequencyMap(arr);
		for (int key : map.keySet())
			System.out.println(key + " -> " + map.get(key));
	}
}
