// 20221011

// ▶실행 흐름의 컨트롤(제어문)

// 사용자로부터 임의의 정수 5개를 입력받아
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단, Scanner을 활용하여 데이터를 입력받을 수 있도록 한다.

// 실행 예)
// 임의의 정수 5개 입력(공백 구분): 1 2 3 4 5

// >> 짝수의 합은 6이고, 홀수의 합은 9입니다.

import java.util.Scanner;

public class Test040
{
	public static void main(String[] args)
	{
		//변수 선언
		Scanner sc = new Scanner(System.in);

		int evenSum = 0; // 짝수 합
		int oddSum = 0; // 홀수 합
        int num1, num2, num3, num4, num5; // 입력받은 다섯 개 정수 합

		//연산 및 처리
		System.out.print("임의의 정수 5개 입력: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if (num1%2==0)       // num1이 짝수일 때 -> ***evenSum을 num1만큼 증가*** 
			evenSum += num1; // <-- ★중요★: *누적합 계산을 할 때는 초기값을 0으로 설정*
		else                 // 홀수일 때 -> oddSum을 num1만큼 증가
			oddSum += num1;
		if (num2%2==0)
			evenSum += num2;
		else
			oddSum += num2;
		if (num3%2==0)
			evenSum += num3;
		else
			oddSum += num3;
		if (num4%2==0)
			evenSum += num4;
		else
			oddSum += num4;
		if (num5%2==0)
			evenSum += num5;
		else
			oddSum += num5;
		
		//결과 출력
		System.out.println();
		System.out.printf("짝수의 합은 %d이고, 홀수의 합은 %d입니다.%n", evenSum, oddSum);
	}
}
//실행 결과
/*
임의의 정수 5개 입력: 1 2 3 4 5

짝수의 합은 6이고, 홀수의 합은 9입니다.
계속하려면 아무 키나 누르십시오 . . .
*/