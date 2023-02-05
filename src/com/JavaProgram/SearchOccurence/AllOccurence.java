package com.JavaProgram.SearchOccurence;

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
		int fres = FirstOccurenceIndex.firstOccurenceIndex(arr, x);
		int lres = LastOccurenceIndex.lastOccurenceIndex(arr, x);
		if(fres == -1 || lres == -1)
		{
			System.out.println("The searched element is not there!!!");
		}
		else
		{
			int res = lres - fres + 1;
			System.out.println("Occurence count of element "+x+" is "+res);
		}
	}
}
