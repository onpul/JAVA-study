// 20220128 금

// ▶ 자바의 주요(중요) 클래스

// Wrapper 클래스

//-------------------------------------------------------------------------------------------------

import java.math.BigDecimal; // math 패키지에 있기 때문에 import 구문 작성하기 ~

public class Test135
{
	public static void main(String[] args)
	{
		// 되게 큰 실수 형태일 때 ! BigDecimal
		BigDecimal a = new BigDecimal("123456789.123456789"); // 생성자에게 넘겨주는 게 문자열 형태.

		// movePointLeft : 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println("처리 결과 : " + b);
		//--==>> 처리 결과 : 123456.789123456789

		// 나눗셈 연산 (대체 속성 확인, 반올림 하지 않는다. → 절삭 처리)
		BigDecimal c = a.divide(b, BigDecimal.ROUND_DOWN); // ROUND_DOWN -> static final 
		                                                   // -> 특정한 값이 고정으로 쓰이겠구나
		System.out.println("처리 결과 : " + c);
		//--==>> 처리 결과 : 1000.000000000

		// BigInter 객체로 변환
		System.out.println(a.toBigInteger()); // 실수형 -> 정수형 (정수화)
		//--==>> 123456789
	}
	
}