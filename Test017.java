// 자바 기본 프로그래밍

//자바의 기본 입출력 : System.in.read()

/*
『System.in.read()』메소드는 한 문자만 가져온다.
단, 입력받은 하나의 문자를 문자 그대로 가져오는 것이 아니라
ASCII Code 값으로 반환한다.
*/

import java.io.IOException;

public class Test017
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		char ch;

		// 사용자에게 안내 메세지 출력
		System.out.print("문자 하나 입력하세요 : "); // A
		ch = (char)System.in.read();                 // 65

		// 결과 출력
		System.out.println(ch);
		//--==> A

	}
}