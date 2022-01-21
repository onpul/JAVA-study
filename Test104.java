// 20220120 목
// ▶클래스와 인스턴스
//-------------------------------------------------------------------------------------------------
// 클래스와 인스턴스 활용

// 1 ~ 3 사이의 난수를 발생시켜서
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

// ※ 기준 데이터 → 1:가위, 2:바위, 3:보

// 실행 예)
// 1:가위  2:바위  3:보  중 입력(1~3) : 4
// 1:가위  2:바위  3:보  중 입력(1~3) : -1
// 1:가위  2:바위  3:보  중 입력(1~3) : 2

// - 유저   : 바위
// - 컴퓨터 : 보

// >> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
// 계속하려면 . . .
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	// 수업 풀이
	private int user;
	private int com;

	// 컴퓨터의 가위바위보
	private void runcom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1; // 0 1 2  (+1) → 1 2 3
	}

	// 유저의 가위바위보
	public void input()
	{
		// 유저가 가위바위보 하기 전에... 컴퓨터(주최측) 먼저 가위바위보
		runcom();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위  2:바위  3:보  중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}

	// 중간 결과 출력
	public void middleCalc()
	{
		String[] str = {"가위", "바위", "보"};

		System.out.println();
		System.out.println(" - 유저   :" + str[user-1]); // str[1] str[2] str[]3 → str[0] str[1] str[2]
		System.out.println(" - 컴퓨터 :" + str[com-1]);  // str[1] str[2] str[]3 → str[0] str[1] str[2]
	}

	// 승부에 대한 최종 결과 연산
	public String resultCalc()
	{
		String result = "무승부";
 
		// (유저=="가위" && 컴 =="보") || (유저=="바위" && 컴 =="가위") || (유저=="보" && 컴 =="바위")
		if ((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2))
		{
			result = "당신 승리";
		}
		// (유저=="가위" && 컴 =="바위") || (유저=="바위" && 컴 =="보") || (유저=="보" && 컴 =="가위")
		else if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
		{
			result = "컴퓨터 승리";
		}
		return result;
	}

	// 결과 출력
	public void print(String str)
	{
		System.out.printf("\n>> 승부 최종 결과 : %s%n", str);
	}

	// 내 풀이
	/*
	int rps;
	
	String userhand;
	String comhand;

	// 사용자가 1~3 중 입력 메소드
	void input() 
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:가위  2:바위  3:보  중 입력(1~3) : ");
			rps = sc.nextInt();
		}
		while (rps<1 || rps>3);

		if (rps==1)
		{
			userhand="가위";
		}
		else if (rps==2)
		{
			userhand="바위";
		}
		else
			userhand="보";
	}

	// 난수 발생 메소드
	int nansu() // 1:가위, 2:바위, 3:보
	{
		Random rd = new Random();
	    int nan = rd.nextInt(3)+1; // 1 ~ 3 

		if (nan==1)
		{
			comhand="가위";
		}
		else if (nan==2)
		{
			comhand="바위";
		}
		else
			comhand="보";

		return nan;
	}

	// 연산 메소드
	String exec(int nan)
	{
		String result="얍";

		// 가위바위보 승부
		if (rps==nan)
		{
			result="무승부입니다~!!!";
		}
		else if (rps==1)
		{
			if (nan==2)
			{
				result="컴퓨터가 이겼습니다~!!!";
			}
			else
				result="사용자가 이겼습니다~!!!";
		}
		else if (rps==2)
		{
			if (nan==1)
			{
				result="사용자가 이겼습니다~!!!";
			}
			else
				result="컴퓨터가 이겼습니다~!!!";
		}
		else if (rps==3)
		{
			if (nan==1)
			{
				result="컴퓨터가 이겼습니다~!!!";
			}
			else
				result="사용자가 이겼습니다~!!!";
		}
		return result;
	}

	void print(int nan, String result)
	{
		System.out.printf("%n- 유저   : %s%n", userhand);
		System.out.printf("- 컴퓨터 : %s%n", comhand);
		System.out.println();
		System.out.printf(">> 승부 최종 결과 : %s%n", result);// >> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
	}
	*/
	
}//end class RpsGame


// 메인 메소드를 포함하고 있는 외부의 다른 클래스
public class Test104
{
	public static void main(String[] args)
	{
		// 수업 풀이
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);

		// 내 풀이
		/*
		RpsGame rg = new RpsGame();
		int nan = rg.nansu();
		rg.input();
		String result = rg.exec(nan);
		rg.print(nan, result);
		*/
	}
}
//-------------------------------------------------------------------------------------------------
// 실행 결과
/*
1:가위  2:바위  3:보  중 입력(1~3) : 3

 - 유저   :보
 - 컴퓨터 :바위

>> 승부 최종 결과 : 당신 승리
계속하려면 아무 키나 누르십시오 . . .
*/