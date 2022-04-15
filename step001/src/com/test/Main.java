package com.test;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[10];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i] % 42;
		}
		
		for (int i = 0; i < arr2.length; i++)
		{
			if (arr2[i] == arr2[i+1])
			{
				
			}
		}
	}
}