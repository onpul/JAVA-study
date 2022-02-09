// 20220113 목
// ▶메소드의 재귀 호출
//-------------------------------------------------------------------------------------------------

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(10);
	}
	
	// 코드 내에서 2군데 위치 바꾸기 

	public static void showHi(int cnt)
	{
		// 원래 코드
		/*
		System.out.println("Hi~ ");
		showHi(cnt--);
		if(cnt==1)
			return;
		*/

		// 바꾼 코드
		System.out.println("Hi~ ");
		if(cnt==1) // 2. 함수 재귀 호출보다 먼저 조건문이 등장!
			return; 
		showHi(--cnt); // 1. 전위 연산으로 바꿈!
	}
}