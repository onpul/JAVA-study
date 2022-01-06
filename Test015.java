// 자바 기본 프로그래밍

// 퀴즈
// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
// 이 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예)
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 : 3
// - 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이: XXX
// 계속하려면 아무 키나...

// ※ 문제 인식 및 분석
//    삼각형의 넓이 = 밑변 * 높이 / 2
//    사용자로부터 데이터를 입력받아 처리 → BufferedReader 활용

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// import java.io.*; // 위에 세 개 대신 이렇게 쓸 수 있음 그러나, 위처럼 쓰는 것을 권장한다. 자바에게 비효율적일 수 있다. 

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 주요 변수 선언
		/*
		int base; // 밑변
		int height; // 높이
		double area; // 넓이
		*/

		// 주요 변수 선언 (수업 풀이)
		int underLength, height;
		double area;
		
		// 연산 및 처리
		// 1. 사용자에게 안내 메세지 출력
		//System 클래스 안에서 out을 가져오자?
	
		/*
		System.out.print("- 삼각형의 밑변 입력 : "); // 사용자에게 안내 메세지 출력
		base = Integer.parseInt(br.readLine()); // 사용자가 입력한 값을 문자열 형태로 읽어들임 -> 숫자형(정수형)으로 변환 -> 정수 형태의 변수에 담아내기

		System.out.print("- 삼각형의 높이 입력 : ");
		height = Integer.parseInt(br.readLine());
		
		area = base * height / 2;

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이: %.2f\n", base, height, area);
		*/

		/*
		- 삼각형의 밑변 입력 : 5
		- 삼각형의 높이 입력 : 2
		>> 밑변이 5, 높이가 2인 삼각형의 넓이: 5.00
		계속하려면 아무 키나 누르십시오 . . .
		*/

		// 1. 사용자에게 안내 메세지 출력 (수업 풀이)
		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.print("- 삼각형의 밑변 입력: ");

		// 2. 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//    변수  underLength 에 담아내기
		underLength = Integer.parseInt(br.readLine());

		// 3. 다시 사용자에게 안내 메세지 출력
		System.out.print(" 삼각형의 높이 입력 : ");

		// 4. 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//    변수 height에 담아내기
		height = Integer.parseInt(br.readLine());

		// 5. 삼각형의 넓이 구하는 연산 처리
		// 삼각형의 넓이 = 밑변 * 높이 / 2
		area = underLength * height / 2.0;
		//       정수형      정수형   (2)정수형 → 정수 기반 연산 (즉, 몫을 취하고 나머지 버림)
		//       정수형      정수형   (2.0)실수형 → 실수 기반 연산

		// 실수 기반의 연산 수행
		//area = (double)underLength * height / 2; //--(x)
		//area = (double)underLength * height / 2; 
		//area = underLength * (height) / 2;
		//area = underLength * height / 2.0;
		
		// ※ 실수 자료형이 결과값으로 나오는 과정에서
		//    실수 기반의 연산이 필요한 상황이다.
		//    정수형 『2』가 아닌. 실수형 『2.0』으로 나눗셈 연산을 수행하게 되면
		//    이 연산은 실수 기반으로 처리된다.

		// 결과 출력
		System.out.println(); // 개행

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이: %.2f\n", underLength, height, area);


		
	}
}

// 실행 결과
/*
■ 삼각형의 넓이 구하기 ■
- 삼각형의 밑변 입력: 23
 삼각형의 높이 입력 : 15

>> 밑변이 23, 높이가 15인 삼각형의 넓이: 172.50
계속하려면 아무 키나 누르십시오 . . .
*/