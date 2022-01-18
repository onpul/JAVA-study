// 20220118 화
// ▶배열
// 배열의 배열(2차원 배열)
//-------------------------------------------------------------------------------------------------
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
E J O T Y 
D I N S X
C H M R W
B G L Q V
A F K P U
계속하려면 . . .
*/
//-------------------------------------------------------------------------------------------------
public class Test092
{
	public static void main(String[] args)
	{
		//int[][] arr = new int[5][5];

		// 순차 출력
		/*
		for (int i=0, ch=65; i<arr.length; i++, ch++) 
		{
			arr[i] = (char)ch;
		}
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		*/
		
		/*
		for (int i=0; i<arr.length; i++) // 웅 ~
		{
			for (int j=0; j<arr[i].length; j++) // 쑝!
			{
				arr[i][j] = n;
				n++;
			}
		}
		*/
		
		/*
		for (int i=0, ch=65; i<arr.length; i++, ch++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = (char)ch;
				ch++;
			}
			System.out.print
		}
		*/
//-------------------------------------------------------------------------------------------------	
		// 수업 풀이
		// 배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		char start='A';

		for (int i=0; i<5; i++) // i → 0 1 2 3 4
		{
			for (int j=4; j>=0; j--)
			{
				arr[j][i] = start++;
			}
		}
		
		// 전체 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);
			}
			System.out.println();
		}
	}
}
// 실행 결과
/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
계속하려면 아무 키나 누르십시오 . . .
*/