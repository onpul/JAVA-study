// 자바의 개요 및 특징

// 관찰

public class Test003
{
	public static void main(String[] args)
	{
		// ①
		/*
		System.out.print("첫 번째 출력구문");
		System.out.print("두 번째 출력구문");
		*/

		// ②
		System.out.print("첫 번째 출력구문\n"); //"큰 따옴표 사이에 있는 것들" 문자열 영역
		System.out.print("두 번째 출력구문");
		// ※ println()과 print() 메소드의 차이는 라인 스킵(줄바꿈, 개행) 유무
		// ※ \n 을 문자열에 포함하면 라인 스킵 가능
	}
}

// 실행 결과
// ①
/*
첫 번째 출력구문두 번째 출력구문계속하려면 아무 키나 누르십시오 . . .
*/

// ②
/*
첫 번째 출력구문
두 번째 출력구문계속하려면 아무 키나 누르십시오 . . .
*/