package com.Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Operations3{
	public static int secondLargestElement(int [] arr) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int element : arr) {
			list.add(element);
		}
		Integer max = Collections.max(list);
		list.remove(max);
		return Collections.max(list);
	}
}
public class SecondLargestElement {

	public static void main(String[] args) {
		int [] arr = {10, 5, 20, 8};
		System.out.println(Operations3.secondLargestElement(arr));
	}
}
