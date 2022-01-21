// 20220121 금

// ▶주민등록번호 유효성 검사
//-------------------------------------------------------------------------------------------------
/*
● 주민등록번호 검증 공식

   ① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

   123456-1234567 (주민번호)
   ****** ******  ------------------------ 각 자릿수에 곱하기
   234567 892345  (각 자리에 곱해질 수)

   ② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
       * * * * * *   * * * * * *
	   2 3 4 5 6 7   8 9 2 3 4 5 
	   ---------------------------
	   → 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
	   
	      == 217

   ③ 더해진 결과값을 11로 나누어 『나머지』를 취한다.
    
	217 / 11 = 19(몫) ... 8(나머지)

   ④ 11에서 나머지 8을 뺀 결과값을 구한다.

    11 - 8 → 3

	※ ③의 처리 과정에서 나머지가 0인 경우 → 11 - 0 → 11
	                      나머지가 1인 경우 → 11 - 1 → 10
	   
	   이를 다시 10으로 나누어 나머지를 취한다.  11 → 1
	                                             10 → 0

   ⑤ ④의 연산 결과가 주민번호를 구성하는 마지막 숫자와
      일치하는지의 여부를 비교한다.

	  일치   → 유효한 주민번호
	  불일치 → 잘못된 주민번호
*/
// 실행 예)
// 주민번호입력(XXXXXX-XXXXXXX) : 123456-12345678  → 입력 갯수 초과
// >> 입력 오류
// 계속하려면 . . .

// 주민번호입력(XXXXXX-XXXXXXX) : 123456-123456    → 입력 갯수 미달
// >> 입력 오류
// 계속하려면 . . .

// 주민번호입력(XXXXXX-XXXXXXX) : 750615-1252085   → 유효한 주민번호
// >> 정확한 주민번호
// 계속하려면 . . .

// 주민번호입력(XXXXXX-XXXXXXX) : 750615-1252086   → 유효하지 않은 주민번호
// >> 잘못된 주민번호
// 계속하려면 . . .

// ※ 문제 해결을 위한 추가 팁~!!!

//    배열.length            → 배열의 길이(배열방의 갯수) 반환
//    문자열.length()        → 문자열의 길이 반환
//    문자열.substring()     → 문자열 추출 
//    문자열.substring(m, n) → 문자열의 m번째에서 n-1번째까지 추출(인덱스는 0부터)
//    문자열.substring(m)    → 문자열의 m번째 위치에서 문자열의 끝까지 추출(인덱스는 0부터)
//-------------------------------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test108
{
	public static void main(String[] args) throws IOException
	{

		// 수업 풀이
		// BufferedReader 인스턴스 생성 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받는 주민번호(문자열 형태)
		String str;

		// 주민번호의 각 자릿수에 곱하게 될 수 → 배열 형태로 구성
		//           7  5  0  6  1  5  -  1  8  6  2  1  3  3
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//                            ---
		//                         check~!!!
		
		// 곱셈 연산 후 누적합 (각 곱셈의 결과를 더해 나가라...)
		// ---------    ====== 
		//           0으로 초기화

		int tot = 0;

		System.out.print("주민번호입력(XXXXXX-XXXXXXX) : "); // "750615-1252085"
		//Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> 입력 오류");
			return; //-- 메소드 종료 → main() 메소드 종료 → 프로그램 종료
		}

		// 테스트
		//System.out.println(">> 자릿수 적합");
		
		// ex) "750615-1252085"
		for (int i=0; i<13; i++) // 0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			// 테스트
			//System.out.print(i + " ");

			str.substring(i, (i+1));
		    //----------------------
			// ex) "7"이라는 문자열
			// 문자열에서 추출하면 문자열이 추출되는 것.
			
			if (i==6)
			{
				continue;  //-- 뒷부분 무시하고 계속해라 (얘만 무시)
			}

			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1))); // 뒷부분
		}










//-------------------------------------------------------------------------------------------------
		/*
		//테스트
		String strTemp = "최문정";
		System.out.println(strTemp.length());
		//--==> 3

		String strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		//--==> 9

		String strTemp = "study-hard";
		System.out.println(strTemp.length());
		//--==> 10
        
		//----------------------------------------------------

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		//--==>> NOPQ

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 57));
		//--==> 에러 발생(런타임 에러)
		//      java.lang.StringIndexOutOfBoundsException

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//--==> FGHIJKLMNOPQRSTUVWXYZ
		*/
//-------------------------------------------------------------------------------------------------		
		// 내 풀이
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num;
		int sum;
		String number;
		int jumin;

		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};

		do
		{
			System.out.print("주민번호입력(XXXXXX-XXXXXXX) : ");
			num = br.readLine(); 

			if (num.length()>14 || num.length()<14)
			{
				System.out.println("입력오류");
			}
		}
		while (num.length()>14 || num.length()<14);


		for (int i=0; i<num.length(); i++)
		{
			int n = i;

			if (n != 6)
			{	
				number = num.substring(i, i+1);
				jumin = Integer.parseInt(number);
				System.out.print(jumin);	
			}
		}
		*/
	}
}
//-------------------------------------------------------------------------------------------------
