// 20220128 금

// ▶ 자바의 주요(중요) 클래스

// String 클래스

//-------------------------------------------------------------------------------------------------

public class Test139
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>> seoul korea

		// ● 문자열 추출
		System.out.println(s.substring(6, 9));
		//--==>> kor

		// ※ 『String.substring(s, e)』
		//    String 문자열을 대상으로
		//    s 번째에서 ... e-1 번째까지 추출
		//    (단, 인덱스는 0부터 시작)

		System.out.println(s.substring(7));
		//--==>> orea

		// ※ 『String.substring(s)』
		//    String 문자열을 대상으로
		//    s 번째에서 ... 끝까지 추출
		//    (즉, 문자열이 가진 길이만큼...)

		// ● 문자열의 데이터(값) 비교
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		//--==>> true
        //       false
		//-- 대소문자 구분

		System.out.println(s.equalsIgnoreCase("Seoul korea"));
		//--==>> true
		//-- 대소문자 구분 안하고 내용이 같은지 다른지만 비교

		// ● 찾고자 하는 대상 문자열(s)에
		//    『kor』 문자열이 존재할까?
		//    존재한다면... 그 위치는 어떻게 될까?

		// "seoul korea"
		//        ---
		//  0123456
		System.out.println(s.indexOf("kor"));
		//--==>> 6
		// 어 존재해, 그 문자는 6번째에 위치하고 있어~

		System.out.println(s.indexOf("ea"));
		//--==>> 9
		
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("tt"));
		//--==>> -1
		// 음수값 반환 -> 너가 찾고자 하는 게 여기 존재하지 않아
		//             -> 찾고자 하는 문자열이 대상 문자열에 존재할 경우
		//                그 문자열의 인덱스를 반환하지만
		//                존재하지 않을 경우 음수를 반환하게 된다. (-1)
		//                                   ----> 반드시 -1은 아님

		// ● 대상 문자열(s)이 『rea』로 끝나는지의 여부 확인
		//    (true / false)
		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
		//--==>> true
		//       false

		// ● 찾고자 하는 대상 문자열(s)에
		//    『e』 문자열이 존재할까?
		//    존재한다면 그 위치는 어떻게 될까?
		//    (단, 뒤에서부터 검사)

		// seoul korea
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("o"));
		//--==>> 2

		System.out.println(s.lastIndexOf("e"));
		//--==>> 9
		// 찾는 건 뒤에서부터지만 인덱스는 앞에서부터 0 그대로

		System.out.println(s.lastIndexOf("o"));
		//--==>> 7


		// ● 대상 문자열(s) 중
		//    『6』번째 인덱스 위치의 문자는?

		// seoul korea

		System.out.println(s.charAt(6));
		//--==>> k

		//System.out.println(s.charAt(22));
		//--==>> 에러 발생(런타임 에러)
		//--     StringIndexOutOfBoundsException
		// subString에서도 본 에러

		
		// ● 대상 문자열(s) 과 비교 문자열 『seoul corea』 중
		//    어떤 문자열이 더 큰가? → 문자열에 대한 크기 비교
		//    ==> 두 문자열이 같다면 → 0
		//    ==> 두 문자열이 다르다면 → 차이를 확인(사전식 배열)

		System.out.println(s.compareTo("seoul korea"));
		//--==>> 0

		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8
		//-- c ~ k → defghijk → 8

		
		// ● 대상 문자열(s) 중
		//    해당 문자열을 찾아서 원하는 형태로 수정
		
		s = "우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한", "자주");
		System.out.println("처리 결과: " + s);
		//--==>> 처리 결과: 우리나라 자주민국 자주독립 만세


		// ● 공백 제거
		s = "           사          랑               ";
		System.out.println("|||" + s + "|||");
		//--==>> |||           사          랑               |||

		System.out.println("|||" + s.trim() + "|||");
		//--==>> |||사          랑|||
		//--> 양쪽 가장자리 공백 제거

		// 트림 -> 손톱깎이 생각 
		//      -> 가장자리부터 깎아나간다 -> 중간부터 깎을 수 없다 -> 깎아낸 건 버린다!
		//      -> 남아있는 걸 취한다!
		// 한 번에 자르지 않고 또깍..또깍....하나씩 자름 ! 손톱깎이와 싱크로율 1000%

		// 양쪽 공백을 다 제거하는 함수! (사이 공백은 지울 수 없음)
		// 오라클에는 l트림, r트림 따로 있음

		System.out.println("|||" + s.replaceAll(" ", "") + "|||");
		//--==>> |||사랑|||



		// "30"
		int temp = Integer.parseInt("30"); // 문자열을 정수로
		//System.out.println(temp);
		System.out.printf("%d\n", temp);
		//--==>> 30
		Integer.toString(30); // toString()을 인티져가 오버라이딩해서 쓰는 것
		//System.out.println(s);
		System.out.printf("%s\n", temp);
		//--==>> 30
		

		int n = 2345678;
		System.out.printf("%d", n);
		System.out.format("%d", n);
		//--==>> 23456782345678

		s = String.format("%d", n); // static 메소드! 
								    // printf, format과 사용법은 같음!
		                            // printf, format -> 이런 형태의 모양새로 출력해라~
		                            // String.format -> 이런 모양새로 문자열로 반환해라~
		System.out.println(s);
		//--==>> 2345678

		s = String.format("%,d", n); // % 뒤에 『,』는 돈 단위 처럼 세 개씩 찍음
		                             // 출력해라 ㄴㄴ 문자열로 반환해라 ㅇㅇ
		System.out.println(s); // 
		//--==>> 2,345,678
		
		System.out.printf("%,d\n", n);
		//--==>> 2,345,678
		

		//String str = "기본,열정,배려";
		//String[] strArr = str.split(",");
		// ↑
		// 위 두 줄과 동일한 구문
		String[] strArr = "기본,열정,배려".split(",");

		/*
		for (String str : strArr)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		*/

		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		//--==>> 기본 열정 배려
	}
}
//-------------------------------------------------------------------------------------------------