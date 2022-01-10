// 20220110 월

// 실행 흐름의 컨트롤(제어문)
// if 문
// if ~ else문 실습

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//    분기 방향을 정하기 위해 사용하는 제어문에는
//    if문, if~else문, 조건 연산자, 복합if문(if문 중첩),
//    switch 문이 있다.

// 2. if문은 if 다음의 조건이 참일 경우,
//    특정 문장을 수행하고자 할 때 사용되는 구문이다.

// ○ 정수를 입력받아 홀수/짝수 판별하는 프로그램을 구현한다.
//    단, 단일 if 구문을 사용한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n; // 입력 받은 정수 담을 변수

		// 1. 사용자로부터 정수을 입력받는다
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		// 2. if 문
		if(n % 2 == 0)
			System.out.printf("짝수\n");
		if(n % 2 != 0)
			System.out.printf("홀수\n");
	}
}
//실행 결과
/*
임의의 정수 입력 : 14
짝수
계속하려면 아무 키나 누르십시오 . . .
*/
