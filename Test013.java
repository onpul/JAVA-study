// 자바의 개요 및 특징


// 퀴즈
// 사전에 부여된 반지름 정보를 통해
// 직사각형의 넓이와 둘레를 구하는 프로그램을 작성한다.
// → 가로 : 10. 세로 : 20

// 실행 예)
// 넓이 : 
// 둘레 :
// 계속하려면 아무 키나 누르세요...

public class Test013
{
	public static void main(String[] args)
	{
		// 내가 쓴 풀이
		/*
		int width = 10;
		int height = 20;
		int area = width * height;
		int length = (width + height) *2;

		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

		//--==> 넓이 : 200
        //      둘레 : 60
        //      계속하려면 아무 키나 누르십시오 . . .
		*/

		// 수업 풀이
		/*
		// 변수 선언 및 초기화
		int a = 10, b= 20;    //-- 가로, 세로
		int x, y;             //-- 넓이, 둘레

		// 연산 및 처리
		x = a * b;
		y = (a + b) * 2;
			
		// 결과 출력
		System.out.println("넓이 : " + x);
		System.out.println("둘레 : " + y);
		*/

		int a=10, b=20;

		System.out.println("넓이 : " + (a*b));
		System.out.println("둘레 : " + (a+b)*2);
	}
}