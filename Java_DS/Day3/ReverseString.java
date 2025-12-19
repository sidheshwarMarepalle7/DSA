package com.Day3;

public class ReverseString {

	public static String reverseString(String str) {
		StringBuffer sb = new StringBuffer();
		char[] charArray = str.toCharArray();
		for (int i = charArray.length-1; i >=0; i-- )
			sb.append(charArray[i]);
		return sb.toString();
	}

	public static void main(String[] args) {

		String str = "JAVA PROGRAMMING";
System.out.println(reverseString(str));
	}

}
