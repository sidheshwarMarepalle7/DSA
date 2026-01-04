package com.Day8;

import java.util.LinkedHashMap;
import java.util.Map;

//Question 2: First Unique Character in a String
//
//Given a string, find the first character that does not repeat.
//
//Example:
//Input: "swiss"
//Output: 'w'

public class FirstUniqueCharacter {
	private static char firstUniqueCharacter(String str) {
		if (str != null) {
			Map<Character, Integer> chars = new LinkedHashMap<Character, Integer>();
			for (char ch : str.toCharArray()) {
				Integer newvalue = 1;
				if (chars.containsKey(ch)) {
					newvalue = chars.get(ch) + 1;
				}
				chars.put(ch, newvalue);

			}
			for (Character key : chars.keySet()) {
				Integer currvalue = chars.get(key);
				if (currvalue == 1 && key != ' ')
					return (char) key;
			}
		}
		return ' ';
	}

	public static void main(String[] args) {
		String str = "swiss";
		System.out.println(firstUniqueCharacter(str));
	}
}
