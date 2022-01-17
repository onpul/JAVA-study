// 20220117 월
// ▶배열
//-------------------------------------------------------------------------------------------------
// 배열의 선언과 초기화
// 배열의 기본적 활용

// 사용자로부터 인원 수를 입력받고 
// 입력받은 인원 수만큼의 학생 이름과 전화번호를 입력받고
// 이를 이름 배열과 전화번호 배열로 구성하여 
// 결과를 출력할 수 있는 프로그램을 구현한다.

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1~10) : 27
// 입력 처리할 학생 수 입력(명, 1~10) : -5
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백 구분) : 박현수 010-1111-1111
// 이름 전화번호 입력[2](공백 구분) : 신시은 010-2222-2222
// 이름 전화번호 입력[3](공백 구분) : 오이삭 010-3333-3333
//--------------------------
// 전체 학생 수 : 3명
//--------------------------
// 이름      전화번호
// 박현수    010-1111-1111
// 신시은    010-2222-2222
// 오이삭    010-3333-3333
//--------------------------
// 계속하려면 . . .
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.io.IOException;

public class Test084
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이
		/*
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int men; // 입력 처리할 학생 수
		int n=0; // 배열 값(0~length)

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			men = sc.nextInt();
		}
		while (men<1||men>10);

		String[] namearr;
		namearr = new String[men];

		String[] contactarr;
		contactarr = new String[men];

		int m=1; // 반복문 돌아가기 위한 임시 변수
		do
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", m);
			namearr[n] = sc.next();
			contactarr[n] = sc.next();
			n++;
			m++;
		}
		while (m<=men);

		System.out.println("--------------------------");
		System.out.printf("전체 학생 수 : %d명%n", men);
		System.out.println("--------------------------");
		System.out.println("이름      전화번호");
		System.out.println();
		for (int i=0; i<namearr.length&&i<contactarr.length; i++)
		{
			System.out.println(namearr[i]+"    "+contactarr[i]);
		}
		System.out.println("--------------------------");	
		*/
//-------------------------------------------------------------------------------------------------
		// 수업 풀이
		
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 사용자가 입력하는 학생 수를 담아낼 변수
		int memberCount = 0;
		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memberCount = sc.nextInt();
		}
		while (memberCount<1 || memberCount>10);

		// 테스트
		//System.out.println("사용자가 입력한 인원 수 : " + memberCount);
		
		// 인원 수만큼의 이름 저장 배열 구성
		String[] names = new String[memberCount];

		// 인원 수만큼의 전화번호 저장 배열 구성
		// String[] tels = new String[memberCount];
		String[] tels = new String[names.length];

		// 인원 수만큼의 안내 메세지 출력 및 입력값 담아내기
		//for (int i=0; i<tels.length; i++)
		//for (int i=0; i<names.length; i++)
		for (int i=0; i<memberCount; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));
			// 최문정 010-1111-1111
			// ------ -------------
			names[i] = sc.next();
			tels[i] = sc.next();
		}

		// 최종 결과 출력
		System.out.println("--------------------------");
		System.out.printf("전체 학생 수 : %d명%n", memberCount);
		System.out.println("--------------------------");
		System.out.println("이름      전화번호");

		// 학생 리스트 반복 출력
		for (int i=0; i<memberCount; i++)
		{
			System.out.printf("%4s %14s%n", names[i], tels[i]);
		}
		System.out.println("--------------------------");
	}
}
//-------------------------------------------------------------------------------------------------
// 실행 결과
/*
입력 처리할 학생 수 입력(명, 1~10) : -1
입력 처리할 학생 수 입력(명, 1~10) : 100
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) : 최문정 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 홍은혜 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 정은정 010-3333-3333
--------------------------
전체 학생 수 : 3명
--------------------------
이름      전화번호

최문정    010-1111-1111
홍은혜    010-2222-2222
정은정    010-3333-3333
--------------------------
계속하려면 아무 키나 누르십시오 . . .
*/