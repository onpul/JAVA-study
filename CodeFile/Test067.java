// 20220112 수
// ▶실행 흐름의 컨트롤(제어문)
//-------------------------------------------------------------------------------------------------

// break 실습

// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1 ~ 100 범위 안에서만
// 가능하도록 작성한다.

// 실행 예)

// 임의의 정수 입력 : -10

// 임의의 정수 입력 : 0

// 임의의 정수 입력 : 2022

// 임의의 정수 입력 : 10
// >> 1 ~ 10까지의 합 : 55
// 계속하시겠습니까(Y/N)? : y

// 임의의 정수 입력 : 100
// >> 1 ~ 100까지의 합 : 5050
// 계속하시겠습니까(Y/N)? : N
// 계속하려면 아무 키나 누르십시오 . . . // 프로그램 종료

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		int num;
		int sum=0;
		int c;
		
		do
		{
			System.out.print("임의의 정수 입력 :");
			num=Integer.parseInt(br.readLine());
			for (int a=1; a<=num; a++)
			{
				sum+=a;
			}
		}
		while (num<1 || num>100);

		System.out.printf(">> 1 ~ %d까지의 합 : %d%n", num, sum);
		System.out.print("계속하시겠습니까(Y/N)? : ");
		c=Integer.parseInt(br.readLine());
		*/
		
		// 초기화 check~~~!!!
		int n, s, i;
		//-- n : 사용자 입력값을 담아둘 변수
		//   s : 누적합 연산 결과를 담아낼 변수
		//   i : 1부터 1씩 사용자의 입력값까지 증가할 변수

		char ch;
		//-- 프로세스를 계속 진행할지 말지의 여부를 담아둘 변수
		
		while (true)
		{
			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			// 테스트(확인)

			s = 0; // 누적합 변수의 초기화 위치 check~!!! 새로운 값을 입력받아 왔으면 여기서 초기화해야 함
			
			for (i=1; i<=n; i++)
			{
				s += i;
			}

			System.out.printf(">> 1 ~ %d까지의 합 : %d%n", n, s);

			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read(); // y + 엔터(\r\n)

			// 그만할래 의사표현
			//if(ch=='N' || ch=='n')
			if(ch!='Y' && ch!='y') // 일반적으로는 N,n보다는 y가 아닌지를 판별함(실무에서)/대문자 Y가 아니거나 소문자y가 아닌 거 맞아????? / Y 또는 y 입력한 거 아닌 게 확실?
			{
				// 반복문을 멈추고 빠져나갈 수 있는 코드 작성 필요
				// 위와 같은 의사 표현을 했다면
				// 그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;
				// 멈춘다.(+그리고 빠져나간다.)  check~!!! / while문 빠져나감.
			}// end if	
			
			// 엔터값(\r\n) 처리
			System.in.skip(2);
				
			// 반복문을 멈추고 빠져나갈 수 있는 처리

		}//end while
		

	}//end main()
}//end class

// 실행 결과
/*

임의의 정수 입력 : 10
>> 1 ~ 10까지의 합 : 55
계속하시겠습니까(Y/N)? : Y

임의의 정수 입력 : 10
>> 1 ~ 10까지의 합 : 55
계속하시겠습니까(Y/N)? : Y

임의의 정수 입력 : 10
>> 1 ~ 10까지의 합 : 55
계속하시겠습니까(Y/N)? : Y

임의의 정수 입력 :
*/