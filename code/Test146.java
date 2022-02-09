// 2022-02-03 목

// ▶ Calendar 클래스

// ○ 실습 문제
//    오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
//    확인하여 결과를 출력하는 프로그램을 구현한다.
//    ※ 현재 날짜를 기준으로 날 수 더하는 연산 메소드 활용
//       → 『객체.add(Calendar.DATE, 날 수);』

// 실행 예)
// 오늘 날짜 : 2022-2-3 목요일
// 며칠 후의 날짜를 확인하고자 하십니까? : 200

// ==========[확인 결과]==========
// 200일 후 : xxxx-xx-xx x요일
// ===============================

// 계속하려면 ...
//-------------------------------------------------------------------------------------------------
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test146
{
	public static void main(String[] args)
	{
		// 수업 풀이

		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// Calendar 클래스 기반 인스턴스 생성
		Calendar now = Calendar.getInstance();

		// 주요 변수 선언
		int nalsu;
		int y,m,d,w;
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};

		// 현재의 연, 월, 일, 요일 확인(가져오기 : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH)+1;  // 『+1』 check~!!!
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		// 현재의 연, 월, 일, 요일 확인 결과 출력
		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + " " + week[w-1] + "요일");

		do
		{
			System.out.print("며칠 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);
		
		// check~!!!
		now.add(Calendar.DATE, nalsu);

		// 결과 출력
		System.out.println();
		System.out.println("==========[확인 결과]==========");
		System.out.printf("%d일 후 : %tF %tA\n", nalsu, now, now); // check~!!!
		System.out.println("===============================");

		// 내 풀이
		/*
		Calendar cal = Calendar.getInstance();

		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int w = cal.get(Calendar.DAY_OF_WEEK);

		String week = "";
		switch (w)
		{
			case 1: week = "일요일"; break;
			case 2: week = "월요일"; break;
			case 3: week = "화요일"; break;
			case 4: week = "수요일"; break;
			case 5: week = "목요일"; break;
			case 6: week = "금요일"; break;
			case 7: week = "토요일"; break;
		}

		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + " " + week);

		Scanner sc = new Scanner(System.in);
		System.out.print("며칠 후의 날짜를 확인하고자 하십니까? : ");
		int after = sc.nextInt();
		
		cal.add(Calendar.DATE, after);
		int afterY = cal.get(Calendar.YEAR);
		int afterM = cal.get(Calendar.MONTH)+1;
		int afterD = cal.get(Calendar.DATE);
		int afterW = cal.get(Calendar.DAY_OF_WEEK);
		
		String afterweek = "";
		switch (afterW)
		{
			case 1: afterweek = "일요일"; break;
			case 2: afterweek = "월요일"; break;
			case 3: afterweek = "화요일"; break;
			case 4: afterweek = "수요일"; break;
			case 5: afterweek = "목요일"; break;
			case 6: afterweek = "금요일"; break;
			case 7: afterweek = "토요일"; break;
		}
		
		System.out.println("\n==========[확인 결과]==========");
		System.out.printf("%d일 후 : %d-%d-%d %s%n", after, afterY, afterM, afterD, afterweek);
		System.out.println("===============================");
		*/
	}
}
//-------------------------------------------------------------------------------------------------
// 실행 결과
/*
오늘 날짜 : 2022-2-3 목요일
며칠 후의 날짜를 확인하고자 하십니까? : 200

==========[확인 결과]==========
200일 후 : 2022-08-22 월요일
===============================
계속하려면 아무 키나 누르십시오 . . .
*/