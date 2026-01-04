package com.Day7;

//Question 2: Check If String Is Pangram
//Given a string, check whether it contains all 26 English alphabets at least once.
//Example:
//Input: "The quick brown fox jumps over the lazy dog"
//Output: True

public class CheckPangram {

	public static boolean checkPangram(String str) {
		str = str.toLowerCase();
		int[] arr = new int[26];
		for (char ch : str.toLowerCase().toCharArray()) {
			if (ch >= 'a' && ch <= 'z')
				arr[ch - 'a'] += 1;
		}
		for (int i : arr)
			if (i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPangram("The quick brown fox jumps over the lazy dog"));
	}

}
