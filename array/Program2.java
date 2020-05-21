package com.ds.array;

public class Program2 {

	public static  int duplicateNumber(int [] arr) {
		int count = 0;
		  for (int i = 0; i < arr.length-1; i++)
	        {
	            for (int j = i+1; j < arr.length; j++)
	            {
	                if ((arr[i] == arr[j]) && (i != j))
	                {
	                	count++;
	                	if (count > 0) {
	                		return arr[i];
						}
	                }
	            }
	        }
		return count;
	}
	
	public static void main(String[] args) {
		int[] array = {0,3,1,2,3,4};
		int result = duplicateNumber(array);
		System.out.println("duplicate number is "+result);
	}
}
