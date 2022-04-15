package com.test;

public class Test
{
	public static void main(String[] args)
	{
		//int result = d(75);
		//System.out.println(result);
		
		//int result = self(87);
		//System.out.println(result);
		
		self();
	}
	
	public static int d(int n)
	{
		/*
		int num = n;
		
		num = num + (num/10) + (num%10);
		
		return num;
		*/
		
		// 문자열 파싱으로
		int res = n;
		String strres = String.valueOf(res);
		
		int[] arr = new int[strres.length()];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(strres.substring(i, i+1));
			
			res = res + arr[i];
		}
		
		return res;
	}
	
	public static void self()
	{
		boolean[] arr = new boolean[10000];
		
		for (int i = 0; i < 10000; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if (d(i+1) == j+1) // d(1)부터 d(10000)까지 넣을 건데 j+1이면 해당 방 true
				{
					arr[j] = true;
					break;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == false)
			{
				System.out.println(i+1);
			}
		}
	}
}
