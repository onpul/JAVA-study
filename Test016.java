// 자바 기본 프로그래밍

// 변수와 자료형
// 자바의 기본 입출력 : BufferedReader 클래스

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 최문정
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// ====[결과]====
// 이름 : 최문정
// 총점 : 240
// 계속하려면 아무 키나 누르시오 . . .

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test016
{
	public static void main(String[] args)
	{
		// 내가 쓴 풀이(에러남)
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		String name;
		int korean, english, math, total;

		System.out.print("이름을 입력하세요:  ");
		name = Integer.ParseInt(br.readLine());

		System.out.print("국어 점수 입력:  ");
		korean = Integer.ParseInt(br.readLine());

		System.out.print("영어 점수 입력:  ");
		english = Integer.ParseInt(br.readLine());

		System.out.print("수학 점수 입력:  ");
		math = Integer.ParseInt(br.readLine());

		total = korean + english + math;

		System.out.println();
		System.out.println("이름 : " + name);
		System.out.println("총점 : %d", total);
		*/

		// BufferedReader 인스턴스 생성
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		// BufferedReader br = new BufferedReader(new InputStreamReader(system.in));

		// 주요 변수 선언
		String strName; //이름 변수
		int nKor, nEng, nMat; //국어, 영어, 수학 점수 변수
		int nTot; //총점 변수

		// 연산 및 처리
		// 사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print("이름을 입력하세요 : ");

		// 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strName = br.readLine();

		// 사용자에게 안내 메세지 출력(국어 점수 입력 안내)
		System.out.print("국어 점수 입력 : ");

	    // 사용자가 입력한 값(외부 데이터)을 정수 형태로 변환한 후 변수에 담아내기
		nKor = Integer.parseInt(br.readLine());

		// 사용자에게 안내 메세지 출력(영어 점수 입력 안내)
		System.out.print("영어 점수 입력 : ");

		// 사용자가 입력한 값(외부 데이터)을 정수 형태로 변환한 후 변수에 담아내기
		nEng = Integer.parseInt(br.readLine());

		// 사용자에게 안내 메세지 출력(수학 점수 입력 안내)
		System.out.print("수학 점수 입력 : ");

		// 사용자가 입력한 값(외부 데이터)을 정수 형태로 변환한 후 변수에 담아내기
		nMat = Integer.ParseInt(br.readLine());

		// 각 점수 변수에 담겨있는 데이터(사용자가 입력한 데이터)
		// 종합하여 총점을 산출하고 
		// 그 결과를 총점 변수에 담아내기

		nTot = nKor + nEng + nMat;



		// 결과 출력
		System.out.println("\n====[결과]====");
		//System.out.println("이름 : " + strName);
		System.out.printf("이름 : %s\n", strName);
		//System.out.println("총점 : " + nTot);
		System.out.printf("총점 : " + nTot);





		
		
	}
}