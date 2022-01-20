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
	int rps;
	
	String userhand;
	String comhand;
	String result;

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

	void print(int nan)
	{
		System.out.printf("%n- 유저   : %s%n", userhand);
		System.out.printf("- 컴퓨터 : %s%n", comhand);
		System.out.println();
		System.out.printf(">> 승부 최종 결과 : %s%n", result);// >> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
	}

}

public class Test104
{
	public static void main(String[] args)
	{
		RpsGame rg = new RpsGame();
		int nan = rg.nansu();
		rg.input();
		rg.print(nan);
	}
}