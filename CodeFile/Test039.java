// 20220110 월

// 실행 흐름의 컨트롤(제어문)
// if 문
// if ~ else문 실습

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 7
// 두 번째 정수 입력 : 70
// 세 번째 정수 입력 : 42

// >> 정렬 결과 : 7 42 70
// 계속하려면 아무 키나 누르시오 . . .

// 1. 첫 번째 정수 vs 두 번째 정수 크기 비교 및 자리 바꿈
// 2. 첫 번째 정수 vs 세 번째 정수 크기 비교 및 자리 바꿈
// 3. 두 번째 정수 vs 세 번째 정수 크기 비교 및 자리 바꿈

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------------------------------------------
		/*
		int n1, n2, n3;
		String result;

		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		n3 = Integer.parseInt(br.readLine());
		*/
		//------------------------------------------------------------------------
		/*
		if (n1<=n2 && n2<=n3)
			System.out.printf("정렬 결과 : %d, %d, %d", n1, n2, n3);
		else if (n2<=n3 && n3<=n1)
			System.out.printf("정렬 결과 : %d, %d, %d", n2, n3, n1);
		else if (n3<=n1 && n1<=n2)
			System.out.printf("정렬 결과 : %d, %d, %d", n3, n1, n2);
		else
			System.out.printf("알 수 없음");
		*/
		//------------------------------------------------------------------------
		/*
		if (n1 <= n2) //n1<n2
		{
			if (n1 <= n3) //n1<n3
			{
				if (n2 <= n3) //n2<n3
				{
					System.out.printf("정렬 결과 : %d, %d, %d", n1, n2, n3);
				}
				else if (n2 > n3) //n3<n2
				{
					System.out.printf("정렬 결과 : %d, %d, %d", n1, n3, n2);
				}
			}
			// n1 < n2
			else if (n1 > n3) // n3 < n1
			{
				if (n2 > n3) // n3 < n1 < n2
 				{
					System.out.printf("정렬 결과 : %d, %d, %d", n3, n1, n2);
				}
			}
		}
		else if (n1 > n2) // n2 < n1
		{
			if (n1 <= n3) // n1 < n3
			{
				if (n2 <= n3) // n2 < n3
				{
					System.out.printf("정렬 결과 : %d, %d, %d", n2, n1, n3);
				}
			}
			else if (n1 > n3) // n3 < n1
			{
				if (n2 > n3) // n3 n2 n1
 				{
					System.out.printf("정렬 결과 : %d, %d, %d", n3, n2, n1);
				}
			}
		}
		else if (n2 > n3 && n3 > n1)
		{
			System.out.printf("정렬 결과 : %d, %d, %d", n2, n3, n1);
		}
		else
			System.out.printf("오류");
		*/
		//------------------------------------------------------------------------
		// 수업 풀이
		// 1. 첫 번째 정수(a) vs 두 번째 정수(b) 크기비교
		//    첫 번째 정수(a)가 두 번째 정수(b)보다 클 경우 자리바꿈
		// 2. 첫 번째 정수(a) vs 세 번째 정수(c) 크기 비교
		//    첫 번째 정수(a)가 세 번째 정수(c)보다 클 경우 자리바꿈
		// 3. 두 번째 정수(b) vs 세 번째 정수(c) 크기 비교
		//    두 번째 정수(b)가  세 번째 정수(c)보다 클 경우 자리바꿈
		//------------------------------------------------------------------------
		int a, b, c;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());
		
		// ** 하나를 처리한 후에도 뒷 문장을 확인해야 하니까 묶여있으면 안 됨 - 각각 if문으로 처리

		if (a>b) // 첫 번째 정수(a)가 두 번째 정수(b)보다 클 경우
		{
			// 자리바꿈(a와 b) / Test026 참고
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (a>c) // 첫 번째 정수(a)가 세 번째 정수(c)보다 클 경우
		{
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b>c) // 두 번째 정수(b)가  세 번째 정수(c)보다 클 경우 자리바꿈
		{
			b=b^c;
			c=c^b;
			b=b^c;
		}

		// 최종 결과 출력
		System.out.printf("\n>> 정렬 결과 : %d, %d, %d\n", a, b, c);
	}
}

//실행 결과
/*
첫 번째 정수 입력 : 1
두 번째 정수 입력 : 5
세 번째 정수 입력 : 6

>> 정렬 결과 : 1, 5, 6
계속하려면 아무 키나 누르십시오 . . .

*/