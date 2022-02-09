// 20220128 금

// ▶ 자바의 주요(중요) 클래스

// Wrapper 클래스

//-------------------------------------------------------------------------------------------------

public class Test136
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2); 

		print(b2); // Byte 타입
		print(i2); // Integer 타입

		// Byte 클래스의 byteValue() 메소드 호출
		byte b3 = b2.byteValue(); // 언박싱

		// Integer 클래스의 intValue() 메소드 호출
		int i3 = i2.intValue(); // 언박싱

		// check~!!!
		int i4 = b2.byteValue(); // 가능
		//       ---------------
		//         바이트 값

		//byte b4 = i2.intValue(); // 자동 형변환 규칙 위배 -> 에러 발생(컴파일 에러)
		byte b4 = i2.byteValue();
		
		System.out.println(b3);
		System.out.println(i3);

		// check~!!!
		System.out.println(b4); //--==>> 256 담겼는데 0 출력 
		                        //      (byte에서 수용할 수 없는 값이기 때문에)
		System.out.println(i4);
	}
	
	/*
	static void print(Byte b)
	{
	}

	static void print(Integer i)
	{
	}
	*/
	
	// Byte 타입을 byte로? -> 언박싱
	// Integer 타입을 int로? -> 언박싱
	
	// 넘겨주는 값은? -> Byte b, Integer i
	// 한 번에 매개변수 두 개를 받아서 처리
	// 그러려면 매개변수의 타입은...?
	
	// toString 사용?
	/*
	@Override
	public String toString()
	{
	    return " ? ";
	}
	*/
	/*
	static void print(?) // 넘겨줘야 하는 매개변수의 타입은?
	{
		// 안에서 수행되어야 할 것은?
		System.out.println(?);
	}
	*/
    // static void print(Object obj) -> 여기부터 생각흐름 ~
	// Object로 다 받았을 때 -> 안정성 문제

	// java.lang.Number 클래스(추상 클래스)는
	// 모든 숫자형 Wrapper 클래스들의 부모 클래스
	// (슈퍼 클래스, 상위 클래서)이다.
	// b2, i2 자료형이 Number에 넘어오면서 
	// 업 캐스팅이 일어나게 된다.
	// Auto-Boxing이 일어나게 된다.
	static void print(Number n) // ← 3
	{
		System.out.println(n);
		System.out.println(n.intValue());
	}
}
// 문제 의도
// 1. API 도큐먼트 좀 봐라~
// 2. Object 떠올리기