package com.ds.array;

public class Program6 {

		public static  void duplicateNumber(int [] arr) {
			  for (int i = 0; i < arr.length-1; i++)
		        {
		            for (int j = i+1; j < arr.length; j++)
		            {
		                if ((arr[i] == arr[j]) && (i != j))
		                {
		                    System.out.println(arr[j]);
		                }
		            }
		        }
		}
		
		public static void main(String[] args) 
	    {
	        int[] array = {1, 2, 5, 5, 6, 6, 7, 2,};
	        duplicateNumber(array);
	    }
}
