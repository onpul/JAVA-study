// 자바 기본 프로그래밍

// 변수와 자료형

public class Test004
{
	public static void main(String[] args)
	{
		// 변수 선언(선언할 때만 데이터 타입 명시)
		int a;

        // 변수 초기화(변수 a에 10을 대입)
		a = 10;

		// 변수 선언 및 초기화(선언과 대입을 한 번에 처리)
		int b = 20;
		
		// 변수 선언
		int c;

		// 연산 및 처리
		c = a + b;
		// c = 10 + b;
		// c = 10 + 20;
		// c = 30;
         
   		// 테스트
		//System.out.println(a);
		//--==>> 10
		//System.out.println(b);
		//--==>> 20
		//System.out.println(c);
		//--==>> 에러 발생(컴파일 에러) cf.런타임 에러

		//System.out.println(c);
		//--==>> 30

		//System.out.println(a b c);
		//System.out.println(abc);
		//--==>> 에러 발생(컴파일 에러) 

		//System.out.println(문자열);
		System.out.println(a + " " + b + " " + c);
		//--==>> 10 20 30

		// ※ 덧셈 연산자(+)
		//    피 연산자 중 어느 하나라도 문자열 형태의 데이터가 존재한다면 
		//    산술연산자로써의 기능을 수행하는 것이 아니라
		//    문자열 결합 연산자로써의 기능을 수행하게 된다.

		System.out.println("a의 값은 " + a + "입니다.");
		System.out.println("b의 값은 " + b + "입니다.");
		System.out.println("b의 값은 " + c + "입니다.");
		//--==>> a의 값은 10입니다.
		//--==>> b의 값은 20입니다.
		//--==>> c의 값은 30입니다.

		//-- 『+』 연산자를 사용하는 과정에서
		//    피연산자 중 문자열이 포함되어 있을 경우
		//    문자열 결합 연산자로 활용되며
		//    처리 결과는 문자열의 형태로 반환된다.
		
		// 추가 확인 및 관찰
		System.out.println(1 + 2);     // 산술연산자 +
		System.out.println("1" + 2);   // 문자열결합연산자 +
		System.out.println(1 + "2");   // 문자열결합연산자 +
		System.out.println("1" + "2"); // 문자열결합연산자 +
		System.out.println("1 + 2" );  // 문자열 +
		//--==>> 3
		//       12
        //       12
		//       12
		//       1 + 2 
	}
}