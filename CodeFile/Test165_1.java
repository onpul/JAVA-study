/*
실행 예)

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 1

	1번째 요소 입력 : 박현수
	1번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? : y

	2번째 요소 입력 : 오이삭
	2번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? : N

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		박현수
		오이삭
	벡터 전체 출력 완료~!!!
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 오이삭

	[검색 결과 출력]
	항목이 존재합니다.
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 임소민

	[검색 결과 출력]
	항목이 존재하지 않습니다.
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 홍은혜

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 박현수

	[삭제 결과 출력]
	박현수 항목이 삭제되었습니다.
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5 

	변경할 요소 입력 : 김민성

	[변경 결과 출력]
	변경할 대상이 존재하지 않습니다.
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 오이삭
	수정할 내용 입력 : 정은정

	[변경 결과 출력]
	변경이 완료되었습니다.
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2	
	                  			 
	[벡터 전체 출력]
		정은정
	벡터 전체 출력 완료~!!!
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 6

	프로그램 종료
	계속하려면 아무 키나 . . .
*/
//-------------------------------------------------------------------------------------------------
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus // → 완성
{
	public static final int E_ADD = 1;      //-- 요소 추가
	public static final int E_DISP = 2;     //-- 요소 출력
	public static final int E_FIND = 3;     //-- 요소 검색
	public static final int E_DEL = 4;      //-- 요소 삭제
	public static final int E_CHA = 5;      //-- 요소 변경
	public static final int E_EXIT = 6;     //-- 종료
}

public class Test165_1
{
	// 주요 속성 구성 → 완성
	private static final Vector<Object> vt; //-- 자료 구조
	private static BufferedReader br;       //-- 입력 시 활용
	private static Integer sel;             //-- 선택 값
	private static String con;              //-- 계속 여부
	 
	// static 초기화 블럭 → 완성
	static
	{
		// Vector 자료구조 생성
		vt = new Vector<Object>();
		
		// BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}

	// 메뉴 출력 메소드 
	public static void menuDisp()
	{
		System.out.print("\n\t1. 요소 추가");
		System.out.print("\n\t2. 요소 출력");
		System.out.print("\n\t3. 요소 검색");
		System.out.print("\n\t4. 요소 삭제");
		System.out.print("\n\t5. 요소 변경");
		System.out.print("\n\t6. 종료");
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print("\n\t>> 메뉴 선택(1~6) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>6);
	}
		
	// 선택된 메뉴 실행에 따른 기능 호출 메소드 
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case Menus.E_ADD : addElement(); break;
			case Menus.E_DISP : dispElement(); break;
		    case Menus.E_FIND : findElement(); break;
			case Menus.E_DEL : delElement(); break;
			case Menus.E_CHA : chaElement(); break;
			default : exit(); break;
		}
	}

	// 자료구조에 요소 추가(입력) 메소드 
	public static void addElement() throws IOException
	{
		do
		{
			System.out.printf("\n\t%d번째 요소 입력 : ", vt.size()+1);
			String temp = br.readLine();
			vt.add(temp);

			System.out.printf("\t%d번째 요소 입력 성공~!!!", vt.size());
			System.out.print("\n\t요소 입력 계속(Y/N)? : ");
			con = br.readLine();
		}
		while (con.equals("Y") || con.equals("y"));
	}

	// 자료구조 전체 요소 출력 메소드
	public static void dispElement()
	{
		System.out.println("\n\t[벡터 전체 출력]");

		for (int i=0; i<vt.size(); i++)
		{
			System.out.printf("\t%s",vt.get(i));
			System.out.println();
		}
		System.out.println("\t벡터 전체 출력 완료~!!!");
	}

	// 자료구조 내 요소 검색 메소드 
	public static void findElement() throws IOException
	{
		System.out.print("\n\t검색할 요소 입력 : ");
		String temp = br.readLine();
		
		System.out.print("\n\t[검색 결과 출력]");
		if (vt.indexOf(temp)<0)
		{
			System.out.print("\n\t항목이 존재하지 않습니다.");
		}
		else
			System.out.print("\n\t항목이 존재합니다.");
		System.out.println();
	}

	// 자료구조 내 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		System.out.print("\n\t삭제할 요소 입력 : ");
		String temp = br.readLine();

		System.out.print("\n\t[삭제 결과 출력]");
		if (vt.contains(temp))
		{
			vt.remove(temp);
			System.out.printf("\n\t%s 항목이 삭제되었습니다.", temp);
		}
		else
			System.out.print("\n\t항목이 존재하지 않아 삭제할 수 없습니다.");
		System.out.println();
	}

	// 자료구조 내 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		System.out.print("\n\t변경할 요소 입력 : ");
		String temp = br.readLine();

		System.out.print("\n\t수정할 내용 입력 : ");
		String change = br.readLine();
		
		System.out.print("\n\t[변경 결과 출력]");
		if (vt.contains(temp))
		{
			int i = vt.indexOf(temp);
			vt.set(i, change);
			System.out.print("\n\t변경이 완료되었습니다.");
		}
		else
			System.out.print("\n\t변경할 대상이 존재하지 않습니다.");
		System.out.println();
	}

	// 프로그램 종료 메소드 → 완성
	public static void exit()
	{
		System.out.println("\n\t프로그램 종료~!!!");
		System.exit(-1);
	}
	
	// main() 메소드 → 완성
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}