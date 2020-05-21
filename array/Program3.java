package com.ds.array;

public class Program3 {

	static void sorting(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (arr[j] < arr[i]) {
					// swap elements
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 3, 60, 35, 2, 45, 320, 5, 666, -6 };

		// sorting array elements to get largest and smallest
		sorting(arr);

		System.out.println("Largest integer in array: " + arr[arr.length - 1]);
		System.out.println("Smallest integer in array: " + arr[0]);
	}

}
