// 20220114 금
// ▶클래스와 인스턴스

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자 입력(+ - * /)    : +
// >> 10 + 5 = 15
// 계속하려면 . . .

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// 멤버 변수 선언
	int a, b;
	char op;

	// 입력 메소드 정의(기능 : 입력)
	void input() throws IOException // System.in.read 때문에!
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /)    : ");
		op = (char)System.in.read();
	}

	// 연산 처리 메소드 정의
	int result()
	{
		int res = 0;

		switch(op)
		{
			case '+': res = a + b; break;
			case '-': res = a - b; break;
			case '*': res = a * b; break;
			case '/': res = a / b; break;
		}
		return res;
	}
	
	// 출력 메소드 정의
	void print(int res)
	{
		System.out.printf(">> %d %c %d = %d%n", a, op, b, res);
	}
}

public class Test075
{
	public static void main(String[] args) throws IOException //input에서 던진 오류 때문에~
	{
		Calculate ob = new Calculate();

		ob.input();

		int res = ob.result();
		
		ob.print(res);
	}
}
// 실행 결과
/*
임의의 두 정수 입력(공백 구분) : 10 20
임의의 연산자 입력(+ - * /)    : +
>> 10 + 20 = 30
계속하려면 아무 키나 누르십시오 . . .
*/