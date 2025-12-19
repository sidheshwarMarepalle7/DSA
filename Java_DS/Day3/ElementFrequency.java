package com.Day3;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {

	public static Map<Integer, Integer> elementFrequency(int[] arr) {
		Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		for (int element : arr) {
			if (frequency.containsKey(element)) {
				Integer count = frequency.get(element);
				count++;
				frequency.put(element, count);
			} else {
				frequency.put(element, 1);
			}
		}
		return frequency;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 3 };
		Map<Integer, Integer> frquencies = elementFrequency(arr);
		for (int key : frquencies.keySet())
			System.out.println(key + " --> " + frquencies.get(key));
	}

}
