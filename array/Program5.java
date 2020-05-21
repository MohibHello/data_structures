package com.ds.array;

class Program5 {

	static void maxProduct(int arr[]) {
		int a = arr[0];
		int b = arr[1];
		int productSum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				if ((arr[i] * arr[j]) > (a * b)) {
					a = arr[i];
					b = arr[j];
					productSum=a*b;
				}
			}
		}
		System.out.println("Maximum product of {" + a + ", " + b + "} is "+productSum);
	}

	public static void main(String[] args) {
		int arr[] = { 6, 4, 1, 3, 2, 8,11 };
		maxProduct(arr);
	}
}