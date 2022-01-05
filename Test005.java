// 자바 기본 프로그래밍
// 변수와 자료형

public class Test005
{
	public static void main(String[] args)
	{
		// 변수 선언 → 메모리 공간 확보 / 할당
		int a;

        // 연산 및 처리 → 확보한 메모리 공간에 데이터 담아내기
		a = 10;

		// 결과 출력
		System.out.println("a는 " + a + "입니다.");
		//--==> a는 10입니다.

		byte b = 20;
		System.out.println(b);  //-- 변수 b에 담겨있는 값을 출력
		//--==> 20

		System.out.println("b"); //-- 문자열 b 출력

        short c;
	    //c = a;                 //-- 에러 발생(컴파일 에러)
		c = (short)a;            //-- 명시적 형 변환(강제 형 변환)
		System.out.println(c);
        //--==>> 10

	}
}
