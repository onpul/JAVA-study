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
	}
}
//-------------------------------------------------------------------------------------------------