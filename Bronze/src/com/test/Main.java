// 겁먹지 말고
// 문제 파악 후 주석으로 차근차근
// 할 수 있다 할 수 있다
package com.test;

public class Main 
{
	public static void main(String[] args)
	{
		int a = 0, sum = 0;
		while (a < 10)
		{
			a++;
			System.out.println("a = " + a);
			if (a % 2 ==1)
			{
				continue;
			}
			sum += a;
		}
		System.out.println(sum);
	}
}