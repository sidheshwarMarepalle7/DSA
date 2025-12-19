package com.Day1;

class Output {

	// App 1
	public static int[] reverseArray1(int[] arr) {
		if (arr.length == 0)
			return null;
		else if (arr.length == 1)
			return arr;
		else {
			for (int i = 0; i < arr.length / 2; i++) {
				int temp = arr[i];
				arr[i] = arr[arr.length - 1 - i];
				arr[arr.length - 1 - i] = temp;
			}
			return arr;
		}
	}

	// App 2
	public static int[] reverseArray2(int[] arr) {
		if (arr.length == 0)
			return null;
		else if (arr.length == 1)
			return arr;
		else {
			int[] tempArray = new int[arr.length];
			for (int i = arr.length - 1; i >= 0; i--) {
				tempArray[arr.length - 1 - i] = arr[i];
			}
			return tempArray;
		}
	}
}

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int e : Output.reverseArray2(arr))
			System.out.print(e + " ");
	}

}
