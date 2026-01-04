package com.Day8;

// Question 2: Toggle Case (String – Traversal Pattern)

//Given a string, toggle the case of each character
//(lowercase → uppercase, uppercase → lowercase).
//
//Example:
//Input: "JaVa"
//Output: "jAvA"

public class ToogleStringChars {

	private static String toogleString(String str) {
		if (str != null) {
			StringBuilder sb = new StringBuilder();
			for (char ch : str.toCharArray()) {
				if (ch >= 'A' && ch <= 'Z')
					sb.append(Character.toString(ch).toLowerCase());
				else if (ch >= 'a' && ch <= 'z')
					sb.append(Character.toString(ch).toUpperCase());
				else
					sb.append(ch);
			}
			return sb.toString();
		}
		return null;
	}

	public static void main(String[] args) {
		String str = "jAvA*%";
		System.out.println(toogleString(str));  // JaVa*%
	}

}
