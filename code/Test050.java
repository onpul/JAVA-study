// 20221011

// ▶실행 흐름의 컨트롤(제어문)

// 반복문(while문) 실습

// 1부터 100까지 정수의 합을 구하되
// 10의 배수가 될 때마다 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 1 ~ 10까지의 합: 
// 1 ~ 20까지의 합:
// 1 ~ 30까지의 합:
//       :
// 1 ~ 100까지의 합:
// 계속 . . .
//----------------------------------------------------------------------
public class Test050
{
	public static void main(String[] args)
	{
		// 내 풀이
		/*
		int n=1;
		int sum=0;

		while (n<=100)
		{
			if (n==10)
			{
				sum+=n;
				System.out.println("1~10 합: " + sum);
			}
			else if (n==20)
			{
				sum+=n;
				System.out.println("1~20 합: " + sum);
			}
			else if (n==30)
			{
				sum+=n;
				System.out.println("1~30 합: " + sum);
			}
			else if (n==40)
			{
				sum+=n;
				System.out.println("1~40 합: " + sum);
			}
			else if (n==50)
			{
				sum+=n;
				System.out.println("1~50 합: " + sum);
			}
			else if (n==60)
			{
				sum+=n;
				System.out.println("1~60 합: " + sum);
			}
			else if (n==70)
			{
				sum+=n;
				System.out.println("1~70 합: " + sum);
			}
			else if (n==80)
			{
				sum+=n;
				System.out.println("1~80 합: " + sum);
			}
			else if (n==90)
			{
				sum+=n;
				System.out.println("1~90 합: " + sum);
			}
			else if (n==100)
			{
				sum+=n;
				System.out.println("1~100 합: " + sum);
			}
			sum+=n;
			n++;
			*/
//----------------------------------------------------------------------
		// 수업 풀이
		int n=1, sum=0;
		while (n<=100)
		{	
			sum += n;

			if (n%10==0)
			{
				System.out.printf("1 ~ %d까지의 합: %d%n",n ,sum);
			}
			n++;
		}
	}
}