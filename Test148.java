// 2022-02-03 목

// ▶ Random 클래스

/*
○ java.util.Random 클래스는 
   
   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도
   난수를 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는
   추가적인 연산을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성기(난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를 
// 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 3 5 12 24 31 41
// 1 2 8 36 41 42
// 4 9 11 13 22 30
// 5 10 13 15 27 6
// 22 31 32 33 40 41
// 계속하려면... 
//-------------------------------------------------------------------------------------------------
class Lotto
{	
	int[] lt;

	public int pickNum() // 난수 발생할 메소드
	{
		return (int)(Math.random() * 6) + 1; // 1~45 사이 임의의 숫자 생성
	}

	public void setting() // 로또 번호 세팅할 메소드
	{
		lt = new int[6]; // 6개 로또 번호 들어갈 배열방 생성
		boolean[] picked = new boolean[45];

		for (int i=0; i<lt.length; i++) // 0  1  2  3  4  5
		{
			lt[i] = pickNum();
		}
		
		// 오름차순 정렬 (선택 정렬)
		for (int i=0; i<lt.length-1; i++)           // 비교 기준 데이터     (0     1     2     3    4)
		{                                           //                       |     |     |     |    |
			for (int j=i+1; j<lt.length; j++)       // 비교 대상 데이터      12345 2345  345   45   5
			{
				if (lt[i] > lt[j])    
				{
					// 자리 바꾸기
					lt[i] = lt[i]^lt[j];
					lt[j] = lt[j]^lt[i];
					lt[i] = lt[i]^lt[j];
				}
			}
		}
		
	} // setting() end
	public void print()
	{
		for (int i=0; i<lt.length; i++)
		{
			System.out.print(lt[i] + " ");
		}
		System.out.println();
	}
} // Lotto end

public class Test148
{
	public static void main(String[] args)
	{
		// Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5 게임
		for (int i=1; i<=5; i++)
		{
			// 로또 게임 수행
			lotto.pickNum();
			lotto.setting();

			// 결과 출력
			lotto.print();
		}
	}
}