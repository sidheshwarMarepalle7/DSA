package com.Day4;

import java.util.Deque;
import java.util.LinkedList;

public class RotateLeftByOne {

	public static Object[] rotateLeftByOne(int[] arr) {
		Deque<Integer> rotArray = new LinkedList<Integer>();
		for (int i = 1; i < arr.length; i++) {
			rotArray.offer(arr[i]);
		}
		rotArray.offerLast(arr[0]);
		return rotArray.toArray();
	}

	
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for(Object e  : rotateLeftByOne(arr)) System.out.print(e+" ");
	}
}
