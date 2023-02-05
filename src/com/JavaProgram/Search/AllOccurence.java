package com.JavaProgram.Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AllOccurence 
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader instream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(instream);
		System.out.println("Enter the size of the array.......");
		int n = Integer.parseInt(stdin.readLine());
		int arr[] = new int[n];
		System.out.println("Enter the elements in the array......");
		for(int i = 0;i < n;i++)
		{
			arr[i] = Integer.parseInt(stdin.readLine());
		}
		Arrays.sort(arr);
		System.out.println("Display the elements in the array....");
		for(int i = 0;i < n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the element to be searched for last occurence......");
		int x = Integer.parseInt(stdin.readLine());
		int l = 0,h = n-1;
		int res = -1;
		//Use to First and last occurence concept to find the first and last index of the searched element
		while(l <= h)
		{
			int mid = (l+h)/2;
			if(x > arr[mid])
			{
				l = mid+1;
			}
			else if(x < arr[mid])
			{
				h = mid-1;
			}
			else
			{
				res = mid;
			}
		}
	System.out.println("The element is at index "+res);
	}
}
