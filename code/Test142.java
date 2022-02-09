// 20220203 목

// ▶ 자바의 주요(중요) 클래스

// StringTokenizer 클래스

/*
● StringTokenizer 클래스는
   문자열 파싱(parsing)을 위한 정보를 제공하는 클래스로
   파싱(parsing)하고자 하는 문자열을 인자로 받아 생성하는데,
   여기에서 파싱(parsing)이란 하나의 문자열을 여러 문자열로
   나누는 작업을 의미하게 되며, 이 때 나누는 단위가 되는 문자열을
   토큰(token)이라고 한다.

   StringTokenizer 클래스를 사용하기 위해서는
   java.util 패키지의 StringTokenizer를 import 해야 한다.

   StringTokenizer 클래스는 호환성을 유지하는 목적으로 // 이런 말 있으면 안 쓰는 거... 단순 호환용
   보관 유지되고 있으며 문자열을 파싱(parsing)하기 위해서는
   String 클래스의 split() 메소드나 java.util.regex 패키지를
   사용할 것을 권장하고 있다.

● 생성자
   - 원형
     StringTokenizer(String str)
	 StringTokenizer(String str, String delim)
	 StringTokenizer(String str, String delim, boolean returnDelims)
	 → 주어진 문자열 str을 단어로 분리하는 객체를 생성하며 
	    공백(구분)문자는 delim에 포함된 문자로 처리하게 된다.
		만약 returnDelimes가 true이면
		구분 문자도 분리된 데이터로 처리하게 된다.
*/

// 꼼꼼히 읽어볼 필요가 없다... 자바가 없애고 싶은데 없애지 않은 클래스
// 고어 같은... 
//-------------------------------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test142
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("파싱할 문자열 입력(컴마 구분 : )");
		strTemp = br.readLine();
		//-- "사과,딸기,바나나,토마토"

		// StringTokenizer 클래스 인스턴스 생성
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//-- strTemp를 대상 문자열로... ("사과,딸기,바나나,토마토")
		//   『,』를 구분자로...
		// 객체가 생성된 거지, 배열을 만든 건 아님

		// st의 『countTokens()』 메소드 호출
		// 『int countTokens()』
		//  : 파싱된 문자열의 갯수를 리턴(반환)한다.
		strArr = new String[st.countTokens()];
		//                  ----------------
		//                          4

		// → strArr = new String[4]; 
		//    4개 배열방 배열 만든다

        // **구조 중요
		n=0;
		while (st.hasMoreTokens())            // nextToken이랑 둘이 협업, 다음값 확인 망 보기
		{   // true true true ture false      // 다음 값 보여서 true 값 반환하면
			strArr[n++] = st.nextToken();     // 얘는 화살표 움직여서 값 가져오기
			// strArr[0] = "사과";
			// strArr[1] = "딸기";
			// strArr[2] = "바나나";
			// strArr[2] = "토마토";
		}
		//-- 『hasMoreTokens()』
		//    : 사용할 수 있는 토큰이 남아있는 경우 true를 반환.
		//      더 이상 사용할 토큰이 없는 경우 false를 반환.
		//      확인 결과만 반환할 뿐...
		//      실제 내용을 읽어들이지도 않고,
		//      실제 내용을 읽어들이는 헤드를 이동시키지도 않는다.
		//-- 『nextToken()』
		//    : 다음 토큰을 얻어온다.
		//      다음 토큰을 얻어오며 헤드를 이동시키게 된다.
		//      구분자를 바꾸었을 경우 다음 호출에도
		//      바뀐 구분자를 이용하여 토큰을 분리한다.

		System.out.print("파싱된 토큰(문자열) : ");
		for (String str : strArr)
		{
			System.out.print(str + " ");
		}
		System.out.println();
	}
}