package com.Day5;

public class ToUppercase {

	// Make all character uppercase
	public static String toAllUppercase1(String str) {
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				int num = ch - 'a';
				sb.append((char) ('A' + num));
			}
		}
		return sb.toString();
	}

	
	// Uppercase to first character of word
	public static String toFirstUppercase1(String str) {
		StringBuilder sb = new StringBuilder();
		int index = 1;
		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				int num = ch - 'a';
				sb.append((char) ('A' + num));
				break;
			}
			sb.append(ch);
			index++;
		}
		boolean go = false;
		for (char ch : str.substring(index).toCharArray()) {
			if (ch == ' ') {
				sb.append(ch);
				go = true;
				continue;
			}
			if (go) {
				int num = ch - 'a';
				sb.append((char) ('A' + num));
				go = false;
				continue;
			}
			sb.append(ch);
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println(toAllUppercase1("john"));
		System.out.println(toFirstUppercase1("     john    wick"));
	}

}
