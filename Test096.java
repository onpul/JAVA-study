// 20220118 화
// ▶배열
// 배열의 배열(2차원 배열)
//-------------------------------------------------------------------------------------------------

// ● 과제
//    배열의 배열(다차원 배열)을 활용하여
//    다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//    그 결과를 출력하는 프로그램을 구현한다.

// 실행 예시 및 분석
/*
   A               00                 00
   C  B            10 11          →  11 10
   D  E  F         20 21 22           20 21 22 
   J  I  H  G      30 31 32 33    →  33 32 31 30
   K  L  M  N  O   40 41 42 43 44     40 41 42 43 44  

계속하려면 . . .
*/
//-------------------------------------------------------------------------------------------------
public class Test096
{
	public static void main(String[] args)
	{
		// 배열 및 변수 선언
		char[][] arr = new char[5][5];
		char ch = 'A';
			
		// 배열 채우기 
		for (int i=0; i<arr.length; i++) // i : 0    1    2    3    4
		{
			for (int j=0; j<=i; j++)     
			{
				if (i%2!=0)
				{
					arr[i][i-j] = ch;    // j : 0    10   012  3210 01234   
				}                        //          --        ---- 
				else                     //          1-0, 1-1  3-0, 3-1, 3-2, 3-3 
					arr[i][j] = ch;
				ch++;
			}
		}

		// 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
//-------------------------------------------------------------------------------------------------
// 실행 결과
/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O

계속하려면 아무 키나 누르십시오 . . .
*/