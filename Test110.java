// 20220124 월

// ▶ 정렬(Sort) 알고리즘

/*
● 정렬
   : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

● 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
     → 보기 좋게 검색하기 위함

● 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬, ....
   
- 정렬은 리소스 소모가 심한 작업이다
- 대상이 많을수록!
- ex) 키 비교
*/

// 버블 정렬(거품 정렬, Bubble Sort)

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 . . .
//-------------------------------------------------------------------------------------------------
public class Test110
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
	    
		int i, j;

		System.out.print("Source Data : ");

		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 수업 코드
		// Bubble Sort

		for (i=1; i<a.length; i++)       // 뒤에서 비교 대상을 하나씩 줄여주는 역할
		{                                // 1    2   3  4
			for (j=0; j<a.length-i; j++) // 0123 012 01 0 (비교 기준 자리) vs 1234 123 12 1 (비교 대상 자리)
			{
				if (a[j] > a[j+1])
				{
					// 자리 바꿈
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
				}
			}
		}

		
		// 내 코드
		/*
		for (i=1; i<a.length; i++)
		{
			for (j=0; j<a.length-1; j++)    // 01 12 23 34 / 01 12 23 / 01 12 / 01
			{
				if (a[i] < a[j]) 
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}
		*/
		/*
		for (i=a.length-1; i>0; i--)
		{
			for (j=1; j<i; j++)
			{
				System.out.printf("i: %d, j: %d", i, j);
				System.out.println();
			}
		}
		*/

		System.out.print("Sorted Data : ");

		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();		
	}
}
//-------------------------------------------------------------------------------------------------
// 실행 결과
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/