// 20220120 목
// ▶클래스와 인스턴스
//-------------------------------------------------------------------------------------------------
// 클래스와 인스턴스 활용

// 학생별로 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
// 클래스 설계는 다음의 가이드라인에 따라 진행할 수 있도록 한다.

// 프로그램을 구성하는 클래스 
// 1. Record 클래스
//    - 속성만 존재하는 클래스로 설계할 것
// == 1명의 학생으로 다뤄라
// 2. Sungjuk 클래스
//    - 인원 수를 입력받아, 입력받은 인원 수만큼
//      이름, 국어점수, 영어점수, 수학점수를 입력받고
//      총점과 평균(+석차)을 산출하는 클래스로 설계할 것
//      - 속성 : 인원수, Record 형태의 배열
//      - 기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력
// 3. Test103 클래스
//    - main() 메소드가 존재하는 외부 클래스로 설계할 것

// 실행 예)
// 인원 수 입력(1~100) : 102
// 인원 수 입력(1~100) : -10
// 인원 수 입력(1~100) : 3

// 1번째 학생의 이름 입력 : 김상기
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// 2번째 학생의 이름 입력 : 임소민
// 국어 점수 : 92
// 영어 점수 : 82
// 수학 점수 : 72

// 3번째 학생의 이름 입력 : 이연주
// 국어 점수 : 82
// 영어 점수 : 72
// 수학 점수 : 62

// 김상기 90 80 70 240 xx.xx 2
// 임소민 92 82 72 xxx xx.xx 1
// 이연주 82 72 62 xxx xx.xx 3

// 계속하려면 아무 키나 . . .
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;

class Record
{
	// 수업 풀이

	// 학생 1명을 표현할 수 있는 속성들로 구성해라~~~~! check~!
	String name;              //-- 이름
	int[] score = new int[3]; //int kor, eng, mat; //-- 각 과목의 점수
	int tot;                  //-- 총점
	double avg;               //-- 평균
	int rank;                 //-- 석차(등수)
}

class Sungjuk
{
	// 수업 풀이

	// 주요 속성 구성
	int inwon;    //-- 인원 수
	Record[] rec; //-- Record 배열(학생 한 명 당 Record 배열 방 한 개 활용)
	              //   Record 를 기반으로 생성된 객체만 담아낼 수 있는 배열
	
	// 주요 메소드 정의(기능 구성)
	// ① 인원 수 입력
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);
		
		// check~!!!
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		// 배열방을 inwon만큼 생성한 것이지
		// Record 클래스의 인스턴스를 생성한 것은 아니다.
		rec = new Record[inwon];
	}
	
	// ② 상세 데이터 입력(총점 및 평균 산출 기능 포함)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};

		// 인원 수 만큼 반복 → 인원 수에 기반하여 만들어진 배열의 길이만큼 반복
		for (int i=0; i<inwon; i++) // for (int=0; i<rec.length; i++)
		{
			// check~!!!
			// Record 클래스 기반의 인스턴스 생성!!
			rec[i] = new Record();

			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			rec[i].name = sc.next();

			for (int j=0; j<title.length; j++) // 0 1 2
			{
			//안내 메세지 출력
			System.out.print(title[j]);
			
			// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
			rec[i].score[j] = sc.nextInt(); // score[0] → 국어점수
											// score[1] → 영어점수
											// score[2] → 수학점수
			
			// 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
			// 총점에 대한 누적 산출
			rec[i].tot += rec[i].score[j];
			}
		
		// 평균 산출하기
		rec[i].avg = rec[i].tot / 3.0;

		}//end outer for
	}
	
	// ③ 결과 출력
	public void print()
	{
		// 석차 산출 메소드 호출
		//ranking();

		// 개행
		System.out.println();

		// 학생 한 명 당 반복 출력 구문 구성
		for (int i=0; i<inwon; i++) // for (int i=0; i<rec.length; i++)
		{
			// 이름 출력
			System.out.printf("%5s", rec[i].name);

			// 성적(국어, 영어, 수학) 반복 출력
			for (int j=0; j<3; j++)
				System.out.printf("%4d", rec[i].score[j]);

			// 총점, 평균 출력
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			// 개행
			System.out.println();
		}
	}

	// + ④ 석차 산출 메소드 추가
	private ranking()
	{
	}
}

public class Test103
{
	public static void main(String[] args)
	{
		Sungjuk sj = new Sungjuk();
		sj.set();
		sj.input();
		sj.print();
	}
}