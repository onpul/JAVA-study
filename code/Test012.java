// 자바의 개요 및 특징


// 퀴즈
// 사전에 부여된 반지름 정보를 통해
// 원의 넓이와 둘레를 구하는 프로그램을 구현한다.
// → 반지름 : 10

// ※ 원의 넓이 = 반지름 * 반지름 * 3.141592
//    원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 넓이 : 
// 둘레 :
// 계속하려면 아무 키나 누르세요...

public class Test012
{
	public static void main(String[] args)
	{   
		// 내가 처음에 쓴 것
		/*
		double a = 10 * 10 * 3.141592; // 원의 넓이
		double b = 10 * 2 * 3.141592; // 원의 둘레

		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
		*/
		
		// 은혜 언니 거 참고해서 바꿔 본 것
		/*
		int r = 10; // 반지름
		double pi = 3.141592; // 파이
		double a = r * r * pi; // 원의 넓이
		double b = r * 2 * pi; // 원의 둘레

		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
		*/

		// 수업에서 풀이한 내용
		// 주요 변수 선언
		int r = 10;                    //-- 반지름
 		//double pi = 3.141592;        //-- 원주율
		final double PI = 3.141592;    //-- 원주율

		// ※『final』 키워드 : 변수의 상수화를 발생시키는 키워드
		//   『final』로 상수화된 변수는 대문자로 쓰기 - 개발자들의 암묵적인 규칙
		//                               언더스코어 표기법 사용
		//    final int RAINBOW_COLOR
		double area, length;           //-- 원의 넓이, 원의 둘레
		
		// 코드를 어디부터 써야할지 모르겠을 때 - 담아야 할 것부터 생각해보자 / 담아야 할 변수부터 선언해 보자.


		// 연산 및 처리	
		// ① 넓이 연산
		// 원의 넓이 = 반지름 * 반지름 * 3.141592
		area = r * r * PI;

		// ② 둘레 연산
		// 원의 둘레 = 반지름 * 2 * 3.141592
		length = r * 2 * PI;

		// 결과 출력
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

		//System.out.printf("넓이 : %.2f%n" , area);
		//System.out.printf("둘레 : %.2f%n" , length);
		//--==> 넓이 : 314.16
		//      둘레 : 62.83

	}
}
// 실행 결과
/*
넓이 : 314.1592
둘레 : 62.83184
계속하려면 아무 키나 누르십시오 . . .
*/