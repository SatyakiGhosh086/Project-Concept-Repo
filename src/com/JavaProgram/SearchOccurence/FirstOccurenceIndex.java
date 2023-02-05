package com.JavaProgram.SearchOccurence;

public class FirstOccurenceIndex 
{
	public static int firstOccurenceIndex(int arr[], int x) 
	{
		int res = -1;
		int h = arr.length - 1;
		int l = 0;
		int flag = 0;
		while(l <= h)
		{
			int mid = (l+h)/2;
			if(x > arr[mid])
			{
				l = mid+1;
			}
			if(x < arr[mid])
			{
				h = mid-1;
			}
			if(x == arr[mid])
			{
				if(mid == 0 || arr[mid] != arr[mid-1])
				{
					res = mid;
					flag++;
				}
				else
				{
					h = mid-1;
				}
			}
			if(flag == 1) 
			{
				break;
			}
				
		}
		return res;
	}

}
