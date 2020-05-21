package com.ds.array;

import java.util.HashMap;
import java.util.Map;

public class Program9 {

	public static void maxLenSubarray(int[] arr) {
	
		Map<Integer, Integer> map = new HashMap<>();

		map.put(0, -1);

		int len = 0;

		int endingIndex = -1;

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i] == 0) ? -1 : 1;

			if (map.containsKey(sum)) {
				if (len < i - map.get(sum)) {
					len = i - map.get(sum);
					endingIndex = i;
				}
			}
			else {
				map.put(sum, i);
			}
		}

		if (endingIndex != -1) {
			System.out.println("[" + (endingIndex - len + 1) + ", " + endingIndex + "]");
		} else {
			System.out.println("No sub-array exists");
		}
	}

	public static void main (String[] args)
    {
        int[] arr = { 0, 0, 1, 0, 1, 0, 0 };
 
        maxLenSubarray(arr);
    }
}
