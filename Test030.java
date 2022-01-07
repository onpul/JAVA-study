// 연산자
// 조건 연산자 == 삼항 연산자

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
// 이 결과를 출력하는 프로그램을 구현한다.
// 단, 입력 데이터는 BufferedReader의 readLine()을 통해 넘겨받을 수 있도록 한다.
// 또한, 조건연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력 : -12
// -12 → 음수
// 계속하려면 아무 키나 누르시오 . . .

// 임의의 정수 입력 : 257
// 257 → 양수
// 계속하려면 아무 키나 누르시오 . . .

// 임의의 정수 입력 : 0
// 0 → 영
// 계속하려면 아무 키나 누르시오 . . .

// Hint : 조건연산자 중첩

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n; // 사용자로부터 입력받은 임의의 정수를 담아둘 변수
		String strResult; // 음수인지 양수인지에 대한 판별 결과를 담게 될 변수

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		strResult = (n<0) ? "음수" : (n>0) ? "양수" : "영";
		// 1. (조건식) ? 2. 참 : 3. (조건식) ? 참 : 거짓 

		// 최종 결과 출력
		System.out.println();
		System.out.printf("%d → %s\n", n, strResult);

	}
}

// 실행 결과
/*
임의의 정수 입력 : -222

-222 → 음수
계속하려면 아무 키나 누르십시오 . . .
*/