// 20220124 월

// ▶ 정렬(Sort) 알고리즘
//-------------------------------------------------------------------------------------------------
// ● 과제
//    사용자로부터 여러 학생의 성적 데이터를 입력받아
//    점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//    결과를 출력하는 프로그램을 구현한다.
//    단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 이아린 90
// 이름 점수 입력(2, 공백 구분) : 박현수 80
// 이름 점수 입력(3, 공백 구분) : 이지연 85
// 이름 점수 입력(4, 공백 구분) : 서민지 75
// 이름 점수 입력(5, 공백 구분) : 김민성 95

/*
------------------
1등 김민성 95
2등 이아린 90
3등 이지연 85
4등 박현수 80
5등 서민지 75
------------------
계속하려면 . . .
*/
//-------------------------------------------------------------------------------------------------

import java.util.Scanner;

class Data // 데이터만 담을 클래스
{
	// 변수 선언
	String name; // 이름
	int score; // 점수
}

class Setting // 출력 제외한 처리가 이루어질 클래스
{
	// 주요 변수
	int inwon;
	Data[] arr; // 데이터 타입의 배열 arr 선언

	public void input() 
	{
		// 인원 수 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 입력 : ");
		inwon = sc.nextInt();

		arr = new Data[inwon]; // 데이터 타입의 배열 arr에 inwon만큼 배열방 생성
	}

	public void info()
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<inwon; i++)
		{
			arr[i] = new Data();

			System.out.printf("이름 점수 입력(%d, 공백 구분) : ", (i+1));
			arr[i].name = sc.next();
			arr[i].score = sc.nextInt();
		}
	}

	public void print()
	{
		System.out.println("------------------");
		
		boolean swap = false; // 스왑 여부
		String temp;
		
		// 향상된 버블 정렬 
		for (int i=1; i<arr.length; i++)           
		{
			for (int j=0; j<arr.length-i; j++)    
			{
				if (arr[j].score < arr[j+1].score) // Q. 같은 배열 방에 구성했는데 요소를 일일이 바꾸는 거 넘 비효율적임
				{                                  //    --> 입력받는 자료가 많아지면 자료를 모두 하나씩 바꿔줘야 하잖어?
					                               //    --> 2차원 배열 활용해서 한 줄에 담고 줄 자체를 정렬할 수 없나                               
					// 점수 자리 바꾸기
					arr[j].score = arr[j].score ^ arr[j+1].score;
					arr[j+1].score = arr[j+1].score ^ arr[j].score;
					arr[j].score = arr[j].score ^ arr[j+1].score;     
					
					// 이름 자리 바꾸기
					temp = arr[j].name;
					arr[j].name = arr[j+1].name;
					arr[j+1].name = temp;

					swap = true;
				}	
			}
			if (swap == false)
			{
				break; // 멈춘다(+그리고 빠져나간다) → break를 끼고 있는 반복문 빠져나감
			}
		}
		
		// 출력
		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%d등 %s %d%n", (i+1), arr[i].name, arr[i].score);
		}

		System.out.println("------------------");
	}
}

public class Test112
{
	public static void main(String[] args) 
	{
		// Setting 클래스 인스턴스 생성
		Setting set = new Setting();

		set.input();
		set.info();
		set.print();
	}
}
//-------------------------------------------------------------------------------------------------
// 실행 결과
/*
인원 수 입력 : 5
이름 점수 입력(1, 공백 구분) : 짱구 10
이름 점수 입력(2, 공백 구분) : 짱아 30
이름 점수 입력(3, 공백 구분) : 훈이 50
이름 점수 입력(4, 공백 구분) : 유리 70
이름 점수 입력(5, 공백 구분) : 철수 90
------------------
1등 철수 90
2등 유리 70
3등 훈이 50
4등 짱아 30
5등 짱구 10
------------------
계속하려면 아무 키나 누르십시오 . . .
*/