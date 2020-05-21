package com.ds.array;

public class Program4 {

	public static void checkSumOfArray(int[] array, int number) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		if (sum == number) {
			System.out.println("sum of array elements " + sum + " is equal to the given number " + number);

		} else {
			System.out.println("sum of array elements " + sum + " is not equal to the given number " + number);
		}

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		checkSumOfArray(array, 15);

	}
}
