// 20220114 금
// ▶클래스와 인스턴스
//-------------------------------------------------------------------------------------------------

// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수까지의 합을 연산하여
// 결과값을 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하려 처리할 수 있도록 한다.
// 또한 입력 처리 과정에서 BufferedReader의 readLine()을 사용하며,
// 입력 데이터가 1보다 작거나 1000보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : 1050
// 임의의 정수 입력(1~1000) : -45
// 임의의 정수 입력(1~1000) : 100
// >> 1~100까지의 합 : 5050
// 계속하려면 . . .
//-------------------------------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// 멤버 변수
	int n; // 사용자에게 입력받은 정수

	// 입력 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);	
	}

	// 연산 처리 메소드 정의
	int sum()
	{	
		int s = 0; // 누적합 담을 변수

		for (int i=1; i<=n; i++)
		{
			s+=i;
		}
		return s;
	}

	void print(int s)
	{
		System.out.printf(" >> 1~%d까지의 합 : %d%n",n ,s);
	}

}

public class Test074
{
	public static void main(String[] args) throws IOException
	{
		// Hap 인스턴스 생성
		Hap ob = new Hap();
		
		// 생성한 인스턴스를 통해 입력 메소드 호출
		// ----------------------
		//    참조변수(ob)활용~
		ob.input();

		int s = ob.sum();

		ob.print(s);
	}
}

// 실행 결과
/*
임의의 정수 입력(1~1000) : -1
임의의 정수 입력(1~1000) : 10000
임의의 정수 입력(1~1000) : 100
 >> 1~100까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/