// 20221011

// ▶실행 흐름의 컨트롤(제어문)
//----------------------------------------------------------------------
// 반복문(while문) 실습

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지 아닌지를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// ※ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도 나누어 떨어지지 않는 수
//           단, 1은 소수가 아님.

// 실행 예)
// 임의의 정수 입력 : 10 
// 10 → 소수 아님
// 계속하려면 . . .

// 임의의 정수 입력 : 967 / 1~967까지 나눠보고? 마지막까지 소수 아니면 1인지 아닌지 판별
//----------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 내 코드	
		/*
		int n; // 입력받을 정수
		int a=2; // 나눌 정수? 	
		String result="어쩌구";
	
		System.out.print("임의의 정수 입력 : ");
		n=Integer.parseInt(br.readLine());

		// System.out.printf("%d", a); // 테스트
		
		// n=13 a=2
		while (n > a)
		{
			if (n % a == 0)
			{
				result = "소수 아님";
			}
			else
				System.out.print("에러"); // 에러 방지

			a++;
		}

		if (n == 1) //n==1은 밖으로 빼야 함 ㅠㅠ while문 자체에 못 들어옴!!!!!
		{
			result = "소수 아님";
		}

		System.out.printf(result); 
		*/
//----------------------------------------------------------------------
		// 수업 코드
		int num;   // 사용자 입력 값 담아낼 변수
		int n = 2; // 입력값을 대상으로 나눗셈 연산을 수행항 변수
				   // 2부터 시작해서 1씩 증가
				   // ex)입력값 27 → n: 2 3 4 5 6 7 8 ... 26

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		boolean flag = true; // num은 소수일 것이다~!!!
		                     // 임시 값 넣어 놓기

		while (n<num)
		{
			// n으로 num이 나누어 떨어지는지 확인
			if (num%n==0)
			{
				// 소수 아니다~!!!
				// result = "소수 아니다"
				flag = false; // num은 소수 아니다~!!!
				break; // 멈춘다 빠져나간다
				       // break를 감싸는 가장 가까운 반복문 --> while
					   //반복문은 한 번이라도 실행을 줄이는 게 리소스 소모가 적다 --> break 활용
			}

			n++;
		}

		// 결과 출력(출력 전에 수행해야 할 추가 확인 -> 1인지 아닌지에 대한 추가 검토)
		//while 조건을 만족하지 않으면 while문 실행되지 않음 --> while안에 들어올 수 있는지 확인하고 코드 쓰기
		//if (소수다 와 num != 1)
		if (flag && num!=1)
		{
			//최종적으로 num은 소수다
			System.out.printf("%d → 소수%n", num);
		}
		else
		{
			//최종적으로 num은 소수 아니다.
			System.out.printf("%d → 소수아님%n", num);	
		}
	}
}

//String result="" 선언할 때 값 안 채워 넣어서 오류 났음. 채워 넣기, else값 채워 넣기
//while 조건을 만족하지 않으면 while문 실행되지 않음 --> while안에 들어올 수 있는지 확인하고 코드 쓰기
//반복문은 한 번이라도 실행을 줄이는 게 리소스 소모가 적다 --> break 활용

//----------------------------------------------------------------------
//실행결과
/*
임의의 정수 입력 : 97
97 → 소수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 98
98 → 소수아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 1
1 → 소수아님
계속하려면 아무 키나 누르십시오 . . .
*/