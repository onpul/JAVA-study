// 자바의 개요 및 특징



// 변수와 자료형
// 변수와 자료형 실습 및 테스트 : char

public class Test010
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		char ch1, ch2, ch3;
		int a;                              // -- check~!!!

		// 연산 및 처리(대입 연산)
        ch1 = 'A'; // 문자 형식으로 문자열을 표시해서 틀림 → "A" / char는 단일 문자만 담을 수 있음
		ch2 = '\n'; // 개행 문자
		ch3 = '대';
		//a = ch1;                            // -- check~!!!
		a = (int)ch1;

		// 결과 출력
		System.out.println("ch1 : " + ch1);
		//--==> ch1 : A
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		//--==> ch3 : 대

		System.out.println("a :" + a);
		//--==> a : 65
			
	}
}
// 실행 결과
/*

ch1 : A
ch2 :

ch3 : 대
a :65
계속하려면 아무 키나 누르십시오 . . .

*/