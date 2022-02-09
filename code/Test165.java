// 2022-02-07 월

// ▶ 컬렉션 프레임워크(Collection Framework)

// Test165 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.
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

public class Test165
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

	// 메뉴 출력 메소드 // 완 
	public static void menuDisp()
	{
		System.out.println("\n\t[메뉴 선택]"); // 『\t는 탭』
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종     료");
		System.out.println();
	}

	// 메뉴 선택 메소드 // 완
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print("\t>> 메뉴 선택(1~6) : ");  
			sel = Integer.parseInt(br.readLine());	
		}
		while (sel<1 || sel>6);
	}
		
	// 선택된 메뉴 실행에 따른 기능 호출 메소드 // 완
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case Menus.E_ADD  : addElement(); break;   // 요소 추가 / 1
			case Menus.E_DISP : dispElement(); break;  // 요소 출력 / 2
			case Menus.E_FIND : findElement(); break;  // 요소 검색 / 3
			case Menus.E_DEL  : delElement(); break;   // 요소 삭제 / 4
			case Menus.E_CHA  : chaElement(); break;   // 요소 변경 / 5
			case Menus.E_EXIT : exit(); break;         // 종료      / 6
		}
	}

	// 자료구조에 요소 추가(입력) 메소드 // 완
	public static void addElement() throws IOException
	{		
		do
		{
			System.out.printf("\n\t%d번째 요소 입력 : ", vt.size()+1); // 맨 처음엔 요소가 없음 -> 0 이니까 +1  
			String temp = br.readLine();

			vt.add(temp); // 요소 추가 
			System.out.printf("\n\t%d번째 요소 입력 성공~!!!", vt.size()); // 요소가 추가된 후  

			System.out.println();
			System.out.print("\t요소 입력 계속(Y/N)? : ");
			con = br.readLine(); // con 위에 있음 계속 여부
		}
		while(con.equals("Y") || con.equals("y"));

		System.out.println();
	}

	// 자료구조 전체 요소 출력 메소드 // 완
	public static void dispElement()
	{
		System.out.println("\n\t[백터 전체 출력]");
		
		// 전체 요소 출력
		for (int i=0; i<vt.size(); i++)
		{
			System.out.printf("\t%s\n", vt.elementAt(i)); // E elementAt(int index)	
		}                                                 // 또는 E get(int index)
		System.out.println("\t벡터 전체 출력 완료~!!!");

		System.out.println();
	}

	// 자료구조 내 요소 검색 메소드 // 완
	public static void findElement() throws IOException
	{
		System.out.print("\n\t검색할 요소 입력 : ");
		String temp = br.readLine();

		int i = vt.indexOf(temp);

		System.out.println("\n\t[검색 결과 출력]");

		if (i<0)
		{
			System.out.println("\t항목이 존재하지 않습니다.");		
		}
		else
			System.out.println("\t항목이 존재합니다.");	

		System.out.println();
	}

	// 자료구조 내 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		System.out.print("\n\t삭제할 요소 입력 : ");
		String temp = br.readLine();
		System.out.println();

		System.out.println("\t[검색 결과 출력]");

		if (vt.contains(temp)) // boolean    
		{
			int a = vt.indexOf(temp);
			vt.remove(a);          
			System.out.printf("\t%s 항목이 삭제되었습니다.\n", temp);
		}
		else
			System.out.println("\t항목이 존재하지 않아 삭제할 수 없습니다.");

		System.out.println();
	}

	// 자료구조 내 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		System.out.print("\n\t변경할 요소 입력 : ");
		String temp = br.readLine();

		if (vt.contains(temp)) // boolean    
		{
			System.out.print("\t수정할 내용 입력 : ");
			String change = br.readLine();	

			int i = vt.indexOf(temp);
			vt.setElementAt(change, i); // 또는 vt.set(i, change);

			System.out.println("\n\t[변경 결과 출력]");
			System.out.println("\t변경이 완료되었습니다.");
		}
		else
		{
			System.out.println("\n\t[변경 결과 출력]");
			System.out.println("\t변경할 대상이 존재하지 않습니다.");
		}

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
// 실행 결과
/*
        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종     료

        >> 메뉴 선택(1~6) : 1

        1번째 요소 입력 : 최문정

        1번째 요소 입력 성공~!!!
        요소 입력 계속(Y/N)? : Y

        2번째 요소 입력 : 홍은혜

        2번째 요소 입력 성공~!!!
        요소 입력 계속(Y/N)? : Y

        3번째 요소 입력 : 한충희

        3번째 요소 입력 성공~!!!
        요소 입력 계속(Y/N)? : N


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종     료

        >> 메뉴 선택(1~6) : 2

        [백터 전체 출력]
        최문정
        홍은혜
        한충희
        벡터 전체 출력 완료~!!!


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종     료

        >> 메뉴 선택(1~6) : 3

        검색할 요소 입력 : 최문정

        [검색 결과 출력]
        항목이 존재합니다.


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종     료

        >> 메뉴 선택(1~6) : 3

        검색할 요소 입력 : 짱구

        [검색 결과 출력]
        항목이 존재하지 않습니다.


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종     료

        >> 메뉴 선택(1~6) : 4

        삭제할 요소 입력 : 한충희

        [검색 결과 출력]
        한충희 항목이 삭제되었습니다.


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종     료

        >> 메뉴 선택(1~6) : 2

        [백터 전체 출력]
        최문정
        홍은혜
        벡터 전체 출력 완료~!!!


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종     료

        >> 메뉴 선택(1~6) : 5

        변경할 요소 입력 : 최문정
        수정할 내용 입력 : 짱구

        [변경 결과 출력]
        변경이 완료되었습니다.


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종     료

        >> 메뉴 선택(1~6) : 2

        [백터 전체 출력]
        짱구
        홍은혜
        벡터 전체 출력 완료~!!!


        [메뉴 선택]
        1. 요소 추가
        2. 요소 출력
        3. 요소 검색
        4. 요소 삭제
        5. 요소 변경
        6. 종     료

        >> 메뉴 선택(1~6) :
*/