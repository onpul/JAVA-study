// 20220114 금
// ▶클래스와 인스턴스
//-------------------------------------------------------------------------------------------------
// ※ CircleTest.java 파일과 세트~!!!

// 원의 넓이와 둘레 구하기
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
// (클래스명 : CircleTest) → CircleTest.java
// BufferedReader의 readLine() 사용

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 *2 * 3.141592

// 실행 예)
// 반지름 입력 : xxx

// >> 반지름이 xx인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나 누르십시오 . . .
//-------------------------------------------------------------------------------------------------
import java.io.IOException; //--> 안 쓰면 에러

public class Test073
{
	public static void main(String[] args) throws IOException //--> 안 쓰면 에러남
	{
		// CircleTest 클래스 기반 인스턴스 생성
		// CircleTest 인스턴스 생성
		// CircleTest 객체 생성
		CircleTest ob = new CircleTest(); //import 구문 없이 쓸 수 없는 이유
		                                  // 1. 물리적으로 같은 디렉토리 안에 있어서
										  // 2. 논리적으로 같은 패키지에 있어서
		ob.input();

		double area = ob.Circlearea();

		double length = ob.Circlecircum();

		ob.print(area,length);
	}
}
// 실행결과
/*
반지름 입력 : 5
>> 반지름이 5인 원의
>> 넓이 : 78.54
>> 둘레 : 31.42
계속하려면 아무 키나 누르십시오 . . .
*/
