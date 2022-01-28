// 20220128 금

// ▶ 자바의 주요(중요) 클래스

// StringBuffer 클래스

/*
● StringBuffer 클래스는
   문자열을 처리하는 클래스로 String 클래스와의 차이점은
   String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
   StringBuffer 클래스는 문자열을 사용할 때
   내부 문자열을 실행 단계에서 변경할 수 있다.

   즉, StringBuffer 객체는 가변적인 길이를 가지므로
   객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
   실행 시점에 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.

   또한, JDK 1.5 이후부터는
   문자열을 처리하는 StringBuilder 라는 클래스도 제공한다. 
   StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
   가장 큰 차이점은 multi-thread unsafe 라는 점이다. 
   즉, Syncronization 이 없기 때문에
   StringBuffer 보다 빠르며 동시성(동기화) 문제가 없다면
   StringBuilder를 사용하는 것이 성능을 향상시킬 수 있다.
*/

// StringBuilder-> multi-thread unsafe
// StringBuffer -> multi-thread safe
// 성능 : StringBuilder > StringBuffer
//        -> 단순한 게 성능이 더 좋음
//-------------------------------------------------------------------------------------------------

public class Test140
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");
		

		System.out.println(sb1 == sb2); // 비교 대상이 객체 -> 주소값 비교 
		System.out.println(sb1.equals(sb2)); // 문자열임에도 f => 오버라이딩 안 했다
		//--==>> false                       // Object의 이퀄스 메소드 그대로 
	    //       false                       // check~!!!

		// ↑ 추가 설명
		// StringBuffer -> Object의 equals()를 그대로 썼다 
		//                 『==』와 동일한 개념으로 객체의 주소 비교! (Test130 참고)
        // String -> Object의 equals() 오버라이딩 한 거다
		// -> 문자열 자체를 비교 (주소 ㄴㄴ, 참조하는 문자열 값 비교)
		
		//--------------------------------------------------------------------------

		System.out.println(sb1);
		//--==>> korea

		System.out.println(sb1.toString());
		//--==>> korea

		// 해시코드 값이 나오지 않았다 -> toString을 오버라이딩 한 거다.
		// 둘 다 문자열 반환 -> 항상 문자열 반환한다.

		System.out.println(sb1.toString().equals(sb2.toString()));
		//--==>> true 


		System.out.println(); // 개행
		
		StringBuffer sb3 = new StringBuffer();
		
	}
}

//-------------------------------------------------------------------------------------------------