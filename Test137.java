// 20220128 금

// ▶ 자바의 주요(중요) 클래스

// Wrapper 클래스

//-------------------------------------------------------------------------------------------------

public class Test137
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE); // static final -> 인스턴스 생성 없이 바로 접근 가능
		System.out.println(Integer.MIN_VALUE);
		//--==>> 2147483647
        //       -2147483648

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		//--==>> 9223372036854775807
        //       -9223372036854775808

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		//--==>> 1.7976931348623157E308
        //       4.9E-324
		// ※ e 표기법

		System.out.println(); // 개행

		// 실수 기반의 나눗셈 연산
		System.out.println("1 : " + 3.0/0); // 연산의 끝이 없음 -> 에러 ㄴㄴ Infinity
		//--==> 1 : Infinity

		System.out.println("2 : " + -3.0/0); // 음의 Infinity
		//--==> 2 : -Infinity

		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("4 : " + (3.0/0 == -3.0/0));
		//--==>> 3 : true
		//       4 : false

		// 『Double.isInfinite()』 // 인피니트인지 확인해 주는 메소드
		                           // 인피니티 아니고 인피니트
								   // 스태틱 메소드
								   // is~~~로 구성된 것은 뭐뭐 인지 아닌지 확인해서 t or f 반환
		
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		//--==>> 5 : true
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		//--==>> 6 : true
		// 부호를 가리지 않고 무한인지 아닌지 판별
		
		//------------------------------------------------------

		// 주의~!!! check~!!!
		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + (0.0/0));
		//--==>> 7 : NaN (→ Not a Number) // 숫자가 아닙니다요~
		//--==>> 8 : NaN
		
		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10 : " + (0.0/0 != 0.0/0));
		//--==>> 9 : false
		//       10 : true

		// ※ NaN(Not a Number) 값과 임의의 수를
		//    『==』 연산자를 통해 비교 연산을 수행하게 되면
		//    결과는 언제나 『false』를 반환한다.

		// 무한대 -> 자바는 하나의 숫자로 본다.
		// but, NaN은 이름과 같이 숫자로 간주하지 않음 -> 비교 불가능으로 처리
		
		// 『Double.isNaN()』 NaN인지 아닌지 확인해 주는 메소드
		System.out.println("11 : " + Double.isNaN(0.0/0));
		System.out.println("12 : " + Double.isNaN(1.1+2.2));
		//--==>> 11 : true
        //       12 : false
	
	}
}
//-------------------------------------------------------------------------------------------------