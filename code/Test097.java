// 20220118 화
// ▶배열

// 배열과 난수 처리(※ Random 클래스 활용)

// 사용자로부터 임의의 정수를 입력받아 
// 그 정수의 갯수만큼 난수(1~100)를 발생시켜 배열에 담고
// 배열에 담겨있는 데이터들 중
// 가장 큰 값과 가장 작은 값을 선택하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 발생시킬 난수의 갯수 입력 : 10
// (50 7 24 81 72 45 61 38 1 99 → 무작위로 발생한 정수들...)
// (int[] arr = {50, 7, 24, 81, 72, 45, 61, 38, 1, 99} → 배열에 담아내기(배열 구성))
// 가장 큰 값 : 99, 가장 작은 값 : 1
// 계속하려면 아무 키나. . . 
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.util.Random;

public class Test097
{
	public static void main(String[] args)
	{ 
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 안내 메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();

		// size 변수에 담아낸 수 만큼의 배열방 만들기
		// (배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		// 무작위 정수(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();

		// java.lang.Object       
        //      java.util.Random
		// 랜덤 클래스는 오브젝트의 자식이군...
		
		// ※ Random 클래스의 『nextInt()』 메소드
		//    0 ~ 매개변수로 넘겨받은 정수 n-1 까지의 수 중
		//    무작위 정수(난수) 1개를 발생시킨다.

		//rd.nextInt(10)    // 0 ~ 9
		
		// 테스트
		//System.out.println("발생한 난수 : " + rd.nextInt(10));
		// 0 ~ 9 까지의 범위 내에서 무작위 정수 한 개 발생~!!!

		// 배열 구성
		//for (int i=0; i<arr.length; i++)
		for (int i=0; i<size; i++)
		{
			//rd.nextInt(101);
			//→ 0 ~ 100
			//rd.nextInt(100);
			//→ 0 ~ 99
			arr[i] = rd.nextInt(100) + 1;
			//→ 0 ~ 99 → 1 ~ 100
		}
		//-- rd.nextInt(100)    → 0 ~ 99  까지의 무작위 정수 한 개 발생
		//   rd.nextInt(100)+1  → 1 ~ 100 까지의 무작위 정수 한 개 발생

		// 테스트 → 구성된 배열의 전체 요소 출력
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();
		

		//--==>
		/*
		발생시킬 난수의 갯수 입력 : 10
		   2  87  68  95  90  38  42  56  54  23
		계속하려면 아무 키나 누르십시오 . . .

		발생시킬 난수의 갯수 입력 : 10
		  14  12  92  76  52  81   9  60  10  20
		계속하려면 아무 키나 누르십시오 . . .

		발생시킬 난수의 갯수 입력 : 10
		  49  25  87  58  28  76  14  91  20  24
		계속하려면 아무 키나 누르십시오 . . .
		*/
		
		// 가장 작은 값, 가장 큰 값 출력~!!!
		
		/*
		int min, max;   // 최대값, 최소값

		max=0;
		min=100;

		for (int i=0; i<arr.length; i++) // 배열 길이만큼 반복
		{
			if (arr[i] > max) // 배열 순서대로 max값에 들어가며 비교
			{
				max = arr[i];
			}
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d%n", max, min);
		*/

		int max, min; // 최대값, 최소값
		max=min=arr[0]; // max = min = 69

		for (int i=1; i<arr.length; i++) // 1 2 3 4 5 6 7 8 9
		{
			if (max<arr[i])
			{
				max = arr[i];
			}
			if (min>arr[i])
			{
				min = arr[i];
			}
		}

		// 결과 출력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d%n", max, min);
	}
}
// 실행 결과
/*
발생시킬 난수의 갯수 입력 : 10
  26  70   1  60   1  36  57  32  82  76
가장 큰 값 : 82, 가장 작은 값 : 1
계속하려면 아무 키나 누르십시오 . . .
*/