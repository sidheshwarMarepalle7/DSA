package com.Day6;

public class CountVowels {

//	Question 2: Count number of  Vowel
//
//	Example:
//	Input: 'a' → True
//	Input: 'b' → False
	
	public static int countVowels(String str) {
		int count = 0;
		for (int ch : str.toCharArray()) {
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'U' || ch == 'u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countVowels("John Wick"));
	}

}
