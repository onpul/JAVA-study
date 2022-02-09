// 20221011

// ▶실행 흐름의 컨트롤(제어문)

// 반복문(while문) 실습

// 실행 예)
// 1부터 100까지 정수의 합 : 5050
// 1부터 100까지 짝수의 합 : 2550
// 1부터 100까지 홀수의 합 : 2500
// 계속하려면 . . .

public class Test049
{
	public static void main(String[] args)
	{
		// 내 풀이
		/*
		int n=1;
		int sum=0, oddsum=0, evensum=0; // 정수합, 홀수합, 짝수합

		while (n<=100)
		{
			if (n%2==0)
			{
				evensum+=n;
			}
			else if (n%2!=0)
			{
				oddsum+=n;
			}
			else
			{
				System.out.println("판별 불가 데이터");
				return; // 메소드 종료 --> main()메소드 종료 --> 프로그램 종료 
			}
			sum+=n;
			n++;
		}
		System.out.println("정수의 합: " + sum);
		System.out.println("짝수의 합: " + evensum);
		System.out.println("홀수의 합: " + oddsum);
		*/

		// 수업 풀이
		// 주요 변수 선언 및 초기화
		int n=1, sum, even, odd;
		sum=even=odd=0;

		// 연산 및 처리
		while (n<=100)
		{
			sum += n;

			if (n%2==0)
			{
				even += n;
			}
			else if (n%2!=0)
			{
				odd += n;
			}
			else
			{
				System.out.println("판별 불가 데이터");
				return;
			}
			n++;
		}
		System.out.println("정수의 합: " + sum);
		System.out.println("짝수의 합: " + even);
		System.out.println("홀수의 합: " + odd);
	}
}