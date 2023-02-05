package com.JavaProgram.Search;
import java.io.*;
import java.util.Arrays;

public class BinarySearch 
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
		System.out.println("Enter the element to be searched......");
		int x = Integer.parseInt(stdin.readLine());
		int l = 0,h = n-1;
		int res = -1;
		while(l <= h)
		{
			int mid = (l+h)/2;
			if(arr[mid] == x)
			{
				res = mid;
				break;
			}
			else if(x > arr[mid])
			{
				l = mid+1;
			}
			else if(x < arr[mid])
			{
				h = mid - 1;
			}
		}
		if(res == -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at "+ res);
		}
		System.out.println("This is added for Git changes");
	}
}
