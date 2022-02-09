// 20220114 금
// ▶클래스와 인스턴스
//-------------------------------------------------------------------------------------------------
// ※ Test073.java 파일과 세트~!!!

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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; //--> 안 쓰면 에러

public class CircleTest 
{
	// 멤버 변수 → 주요 속성
	int r; //반지름
	final double PI = 3.141592; // 원주율 (변수의 상수화)

	// 멤버 메소드 → 주요 기능(동작, 행위)
	// 반지름 입력 기능 → 메소드 정의
	void input() throws IOException //--> 안 쓰면 에러남
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}
	
	// 원 넓이 계산 기능 → 메소드 정의
	double Circlearea()
	{
		double result;
		result = r * r * PI;
		return result;

		//return = r * r * PI; //--> 해도 된다
	}

	// 원 둘레 계산 기능 → 메소드 정의
	double Circlecircum()
	{
		double result;
		result = r * 2 * PI;
		return result;
	}
	
	// 결과 출력 → 메소드 정의
	void print(double a, double l)
	{
		System.out.printf(">> 반지름이 %d인 원의%n", r); // 반지름은 정수 --> %d
		System.out.printf(">> 넓이 : %.2f%n", a);
		System.out.printf(">> 둘레 : %.2f%n", l);
	}
}