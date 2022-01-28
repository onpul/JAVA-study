// 20220128 금

// ▶ 자바의 주요(중요) 클래스

// Wrapper 클래스

//-------------------------------------------------------------------------------------------------

import java.math.BigInteger; // lang 패키지가 아닌 math 패키지에 있어서 import 구문 작성 해야 해~

public class Test134
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//System.out.println(a1);
		//--==>> 컴파일 에러
		//       integer number too large: 123456789123456789

		//long b1 = 123456789123456789;
		//System.out.println(b1);
		//--==>> 컴파일 에러
		//       integer number too large: 123456789123456789
		// 숫자가 커서가 ㄴㄴ 뒤에 접미사 L을 붙이지 않아서 발생한 에러

		//long b1 = 123456789123456789L;
		//System.out.println(b1);
		//--==>> 123456789123456789

		//long b1 = 123456789123456789123456789L;
		//System.out.println(b1);
		//--==>> 컴파일 에러
		//       integer number too large: 123456789123456789123456789

		BigInteger a = new BigInteger("123456789123456789"); // BigInteger 클래스를 기반으로 생성한 a
		BigInteger b = new BigInteger("123456789123456789"); // 생성자에게 넘겨준 건 '문자열' 타입
		                                                     // 상수를 표현하는 것부터 정수를 표현할 수 없어서.
															 // -> 문자열 넘겨주기

        //BigInteger c = a + b;
		//System.out.println(c);
		//--==>> 에러 발생(컴파일 에러)
		// 클래스로 만들어서 객체화 시켰기 때문에 클래스에 있는 메소드 통해 연산을 처리할 수 있도록 해야함.

		// ↓

		// 더하기
		BigInteger c = a.add(b);
		System.out.println("덧셈 결과 : " + c);
		//--==>> 덧셈 결과 : 246913578246913578

		// 빼기
		BigInteger d = a.subtract(b);
		System.out.println("뺄셈 결과 : " + d);
		//--==>> 뺄셈 결과 : 0

		// 곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱셈 결과 : " + e);
		//--==>> 곱셈 결과 : 15241578780673678515622620750190521
		
		// 나누기
		BigInteger f = a.divide(b);
		System.out.println("나눗셈 결과 : " + f);
		//--==>> 나눗셈 결과 : 1

		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : " + g.pow(3));
		//--==>> 2의 3승 : 8

			
	}
}
//-------------------------------------------------------------------------------------------------