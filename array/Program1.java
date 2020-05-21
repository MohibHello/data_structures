package com.ds.array;

public class Program1 {
	
	static int getMissingNo(int a[], int n) {
		int total;
		total = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < n; i++)
			total -= a[i];
		return total;
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 5, 6 };
		int miss = getMissingNo(a, 5);
		System.out.println(miss);
	}

}
