package com.JavaProgram.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReverseSubArray {

	public static void main(String[] args) throws IOException
	{
		InputStreamReader instream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(instream);
		System.out.println("Enter the size of the arraylist.....");
		int n = Integer.parseInt(stdin.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the values in the ArrayList.......");
		for(int i = 0;i < n;i++)
		{
			int x = Integer.parseInt(stdin.readLine());
			arr.add(x);
		}
		System.out.println("Enter the size of the subarray we want to reverse");
		int k = Integer.parseInt(stdin.readLine());
		
		ReverseSubArray ob = new ReverseSubArray();
		ob.reverseSubarray(arr, n, k);
	}
	
	public void reverseSubarray(ArrayList<Integer> ar, int n, int k)
	{
		int arr[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			arr[i] = ar.get(i);
		}
		for(int i = 0;i < n;i = i+k)
		{
			
			int x = i,y = Math.min(i+k-1,n-1);
			while(x < y)
			{
				int tmp = arr[x];
				arr[x] = arr[y];
				arr[y] = tmp;
				x++;y--;
			}
		}
		
		for(int i = 0;i < n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
