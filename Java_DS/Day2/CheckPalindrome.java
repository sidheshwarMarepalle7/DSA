package com.Day2;

import java.util.Arrays;

// App 1
class Check {
	public static boolean checkPalindrome1() {
		String str = "MADAM";
		str = str.toLowerCase();

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	// APP 2
	public static boolean checkPalindrome2() {
		String str = "MADAM";
		str = str.toLowerCase();
		int first = 0, last = str.length() - 1;
		while (first < last) {
			if (str.charAt(first) != str.charAt(last))
				return false;
			first++;
			last--;
		}
		return true;
	}
	
	// App 3
	public static boolean checkPalindrome3() {
		String str = "MADAM";
		str = str.toLowerCase();
		String revStr = new StringBuilder(str).reverse().toString();
		if(revStr.equals(str)) return true;
		return false;
	}

}

public class CheckPalindrome {
	public static void main(String[] args) {

		if (Check.checkPalindrome3()) {
			System.out.println("Yes It is a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		
		

	}

}
