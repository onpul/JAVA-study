// 20220126 수

// ▶ 클래스 고급

// 인터페이스(Interface)

// ● 실습 문제
// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2280946 홍은혜
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2290847 최문정
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

// 2280946 홍은혜   90 100  85   xxx   xx
//                  수  수  우
// 2290847 최문정   85  70  65   xxx   xx
//                  우  미  양

// 계속하려면 . . .
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;

// 속성만 존재하는 클래스 → 자료형 활용
class Record
{
	String hak, name;   //-- 학번, 이름
	int kor, eng, mat;  //-- 국어, 영어, 수학 점수
	int tot, avg;       //-- 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk
{
	public void set();     //-- 인원 세팅
	public void input();   //-- 데이터 입력
	public void print();   //-- 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec; // Record를 기반으로 생성된 객체만 담아낼 수 있는 배열 선언

	@Override
	public void set() //-- 인원 세팅
	{
		// 스캐너 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);

		// Record 클래스를 기반으로 생성된 인스턴스를 담을 수 있는 배열방을 
		// 입력받은 inwon만큼 생성
		rec = new Record[inwon];
		// Record 클래스의 인스턴스를 생성한 거 아님!
	}

	@Override
	public void input() //-- 데이터 입력
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<inwon; i++)
		{
			// Record 클래스 기반의 인스턴스 생성
			rec[i] = new Record();

			// 학번 이름 입력받기
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", (i+1));
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			// 국어, 영어, 수학 점수 입력받기
			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			// 총점 누적합 구하기
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			
			// 평균 구하기
			rec[i].avg = rec[i].tot / 3;
		}
	}

	@Override
	public void print() //-- 결과 출력
	{
		for (int i=0; i<inwon; i++)
		{
			System.out.printf(" %-8s %-3s %3d %3d %3d %3d %3d%n"
			, rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%19s %2s %2s%n", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));
		}
	}

    // 내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int score)
	{
		int s = score;
		String grade;

		switch (s/10)
		{
			case 10 : case 9 : grade = "수"; break;
			case 8 : grade = "우"; break;
			case 7 : grade = "미"; break;
			case 6 : grade = "양"; break;
			default : grade = "가"; 
		}
		return grade;
	}
}

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test123_1
{
	public static void main(String[] args)
	{
		Sungjuk ob = new SungjukImpl();
		
		// 문제 해결 과정에서 작성해야 할 ob 구성
		ob.set();
		ob.input();
		ob.print();
	}
}
//-------------------------------------------------------------------------------------------------