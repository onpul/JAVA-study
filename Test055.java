// 20220112 수
// ▶실행 흐름의 컨트롤(제어문)
//----------------------------------------------------------------------
// 반복문(while문) 실습

// ● 과제
//    사용자로부터 임의의 정수를 입력받아
//    1부터 입력받은 그 정수까지의
//    전체 합과, 짝수의 합과, 홀수의 합을
//    각각 결과값으로 출력하는 프로그램을 구현한다.

//    실행 예)
//    임의의 정수 입력 : 280
//    >> 1 ~ 280까지 정수의 합 : XXXX
//    >> 1 ~ 280까지 짝수의 합 : XXXX
//    >> 1 ~ 280까지 홀수의 합 : XXXX

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test055
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n; // 사용자에게 입력받은 정수 담을 변수 n 
		int a=1; // 1부터 n까지 더해질 값
		int tot,odd,even; // 전체합, 홀수합, 짝수합
		tot=odd=even=0; // 0으로 초기화

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine()); // 입력받은 n을 정수형으로 저장

		while (a<=n)
		{	
			tot+=a;
			
			if (a%2==0) //짝수합
			{
				even+=a;
			}
			else if (a%2!=0) //홀수합
			{
				odd+=a;
			}
			else
			{
				System.out.println("판별 불가 데이터");
				return;
			}

			a++;//위치 고민해봐야 해
		}
		System.out.printf("1 ~ %d까지 정수의 합 : %d%n", n, tot); // 문정아 실행문을 반복문 안에 두면 얘가 반복하잖아?		
		System.out.printf("1 ~ %d까지 짝수의 합 : %d%n", n, even); // 실행문을 반복문 안에 두면 실행문도 반복한다!!!
		System.out.printf("1 ~ %d까지 홀수의 합 : %d%n", n, odd);
	}
}
// 실행결과
/*
임의의 정수 입력 : 3
1 ~ 3까지 정수의 합 : 6
1 ~ 3까지 짝수의 합 : 2
1 ~ 3까지 홀수의 합 : 4
계속하려면 아무 키나 누르십시오 . . .
*/