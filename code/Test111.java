// 20220124 월

// ▶ 정렬(Sort) 알고리즘

// 향상된 버블 정렬(Bubble Sort)

// ※ 앞에서 본 Selection Sort(Test109)나 Bubble Sort(Test110)의 성능은 같다.
//    (→ 반복의 횟수로 추정)
//    하지만, 향상된 Bubble Sort는 대상 데이터의 구조에 따라서
//    일반 Bubble Sort나 Selection Sort보다 성능이 좋을 수 있다.

// 원본 데이터 : 61 15 20 22 30
//               15 20 22 30 61 - 1회전 (스왑 발생 → true)  → 다음 회전 진행 O
//               15 20 22 30 61 - 2회전 (스왑 발생 → false) → 다음 회전 진행 X

//==> 1회전 수행... 2회전 수행...을 해보았더니...
//    2회전에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
//    불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
//    수행하지 않는다.

// 실행 예)
// Source Data : 10 50 20 30 40
// Sorted Data : 10 20 30 40 50
//-------------------------------------------------------------------------------------------------
public class Test111
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 30, 40};
		/*
		10 50 20 30 40
		== --
		10 20 50 30 40
		   == --
		10 20 30 50 40
		      == --	
	    10 20 30 40 50
	             == --	
        -------------------- 1회전 → 스왑 발생
		10 20 30 40 50
		== --
		10 20 30 40 50
		   == --
		10 20 30 40 50
		      == --
	    -------------------- 2회전 → 스왑 발생하지 않음
			X
			X
		-------------------- 3회전 → X
			X
		-------------------- 4회전 → X
		*/
//-------------------------------------------------------------------------------------------------
		/*
		int i, j;
		boolean swap = true;
		*/

		// Source Data 출력
		System.out.print("Source Data : ");

		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 수업 코드
		// 향상된 Bubble Sort 구현
		int pass=0;
		boolean flag;

		do
		{
			flag = false; // 이번 회전에서는 자리 바꿈이 일어나지 않을 것이다...
			pass++;

			for (int i=0; i<a.length-pass; i++)
			{
				// 테스트
				//System.out.println("쑝");

				if (a[i] > a[i+1])
				{
					// 자리바꿈
					a[i] = a[i]^a[i+1];
					a[i+1] = a[i+1]^a[i];
					a[i] = a[i]^a[i+1];

					flag = true;
					//-- 단 한 번이라도 스왑(자리바꿈)이 발생하게 되면
					//   flag 변수는 true로 변경~!!!
				}
			}
		}
		while (flag);
		//-- flag 변수가 false라는 것은
		//   회전이 부분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
		//   더 이상의 반복문 수행은 무의미한 것으로 판단 가능~!!!
		


		/*
        // 향상된 버블 정렬 구현 (내 코드)
		for (i=1; i<a.length; i++)           // i: 1    2    3  4
		{
			for (j=0; j<a.length-i; j++)     // j: 0123 012  01 0
			{
				if (a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
					swap = true;
					// 테스트
					System.out.print(i); //→ i:1
				}	
			}
			if (swap == false)
			{
				break; // 멈춘다(+그리고 빠져나간다) → break를 끼고 있는 반복문 빠져나감
			}
		}
		// 테스트
		System.out.print("스왑여부: " + swap);
		System.out.println();
		*/

		// Sorted Date 출력
		System.out.print("Sorted Data : ");

		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();		
	}
}
//-------------------------------------------------------------------------------------------------
