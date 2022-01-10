// 연산자

// 사용자로부터 임의의 문자를 하나 입력받아
// 대문자이면 소문자로, 소문자이면 대문자로
// 알파벳이 아닌 기타 문자이면 그 문자 그대로 출력하는
// 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a
// 계속하려면 아무 키나 누르시오 . . .

// 한 문자 입력 : b
// b → B
// 계속하려면 아무 키나 누르시오 . . .

// 한 문자 입력 : 7
// 7 → 7
// 계속하려면 아무 키나 누르시오 . . .

import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이
		/*
		// 주요 변수 선언
		char temp; // 사용자로부터 입력받은 임의의 문자를 담아둘 변수
		char res;

		// 연산 및 처리
		System.out.print("한 문자 입력 : ");
		temp = (char)System.in.read();

		int i = temp; // 사용자에게 받은 기존 값 따로 저장하기

		// 입력 대기열에 남아있는 『\r』과 『\n』을 스킵(건너뛰기)
		System.in.skip(2);
		// 매개변수(2)에 의해 두 글자를 읽지 않고 건너 뛴다. (버린다.)

        // 1.대문자이면 소문자로
		// 2.소문자이면 대문자로
		// 3.알파벳이 아닌 기타 문자이면 그 문자 그대로 출력
		// 1. (조건식) ? 2. 참 : 3. (조건식) ? 참 : 거짓 
		// 대문자이면 ? 소문자로 변환 : 소문자이면 ? 대문자로 변환 : 문자 그대로 출력
		// c의 아스키 코드가 65~90이면 ? 32를 더함 : 97~122이면 ? 32를 뺌 : 문자 그대로 출력 
		res = (65<=temp)&&(temp<=90) ? temp+=32 : (97<=temp)&&(temp<=122) ? temp-=32 : temp; 
		// temp 값이 바뀌니까... 원래 값 어떻게 보존하지??? --> int i에 temp 값을 저장해 놓자!

		// 최종 결과 출력
		System.out.println();
		System.out.printf("%c → %c\n", i, res);
		*/

		// 수업 풀이

		//int temp;
		//char temp;

		//System.out.print("한 문자 입력 : ");
		//temp = (char)System.in.read(); //int값으로 받아오니까 char로 강제 형변환

		//System.out.println("입력받은 값 확인 : " + temp);
		// 아스키 코드 값 반환

		//*두 개 이상의 조건이 등장하면 무조건 논리 연산자*
		
		
		//String result = temp >= 65 && temp <= 90 ? "대문자" : "대문자아님";
		//System.out.println("결과 : " + result);
		

		//String result = temp >= 'A' && temp <= 'Z' ? "대문자" : "대문자아님";
		//System.out.println("결과 : " + result);

		char ch, result;

		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();

		result = (ch>='A' && ch<='Z') ? (char)(ch+32) : (ch>='a' && ch<='z' ? (char)(ch-32) : ch);

		System.out.println(ch + " → " + result);
	}
}

