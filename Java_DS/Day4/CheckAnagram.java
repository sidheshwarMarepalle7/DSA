package com.Day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CheckAnagram {

	public static Map<Character, Integer> getFrequency(String str) {
		Map<Character, Integer> strCount = new TreeMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			if (strCount.containsKey(ch)) {
				Integer count = strCount.get(ch);
				count++;
				strCount.put(ch, count);
			} else
				strCount.put(ch, 1);
		}
		return strCount;
	}

	public static boolean checkAnagram(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		Map<Character, Integer> str1Count = getFrequency(str1);
		Map<Character, Integer> str2Count = getFrequency(str2);
		
		return Arrays.equals(str1Count.values().toArray(), str2Count.values().toArray()) && Arrays.equals(str1Count.keySet().toArray(), str2Count.keySet().toArray());
	}

	public static void main(String[] args) {

		System.out.println(checkAnagram("Amit", "tiAm"));

	}

}
