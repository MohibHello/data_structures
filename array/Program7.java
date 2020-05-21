package com.ds.array;

public class Program7 {
	public static void maxLengthSubArray(int[] arr, int givenSum) {
		int len = 0;

		int endingIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = i; j < arr.length; j++) {
				sum += arr[j];

				if (sum == givenSum) {
					if (len < j - i + 1) {
						len = j - i + 1;
						endingIndex = j;
					}
				}
			}
		}
		System.out.println("[" + (endingIndex - len + 1) + ", " + endingIndex + "]");
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int sum = 8;

		maxLengthSubArray(arr, sum);
	}
}
