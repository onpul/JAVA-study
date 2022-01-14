// 20220112 수
// ▶실행 흐름의 컨트롤(제어문)
//-------------------------------------------------------------------------------------------------
// 반복문(for문) 실습
// 다중 for문(반복문의 중첩)을 활용한 별찍기 실습
// 별찍기 실습

// ● 과제
//    다음과 같은 내용이 출력될 수 있도록  
//    반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

// 실행 예)
/*

    *      --> 1줄, 공백4 == 4-0 / 별1 == 2*0+1
   ***     --> 2줄, 공백3 == 4-1 / 별3 == 2*1+1
  *****    --> 3줄, 공백2 == 4-2 / 별5 == 2*2+1
 *******   --> 4줄, 공백1 == 4-3 / 별7 == 2*3+1
*********  --> 5줄, 공백0 == 4-4 / 별9 == 2*4+1

*/

public class Test064
{
	public static void main(String[] args)
	{
		for (int i=0; i<=4; i++) // 총 5줄
		{
			for (int j=0; j<4-i; j++) // 공백은 4부터 -1씩(i++)
			{
				System.out.print(" ");
			}
			for (int j=0; j<2*i+1; j++) 
			{
				System.out.print("*"); // 별을 1, 3, 5, 7, 9 순으로 늘어나게
			}
			System.out.println(); // 한 줄씩 개행
		}	
	}
}
// 실행 결과
/*
    *
   ***
  *****
 *******
*********
계속하려면 아무 키나 누르십시오 . . .
*/