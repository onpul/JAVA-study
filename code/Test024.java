// 연산자
// 비트 단위 연산자

public class Test024
{
	public static void main(String[] args)
	{
		int a = 10, b = -10;
		
		System.out.printf("~a : %d%n", ~a);
		System.out.printf("~b : %d%n", ~b);
	}
}

// 실행 결과
/*
~a : -11
~b : 9
계속하려면 아무 키나 누르십시오 . . .
*/

/*
a = 10 → 00001010
             ↓ ~a
		  11110101 → -11 → check? → ok
		 +00001010 →  11
		 ---------
		  00000000 →  0 


b = -10   00001010 → 10
          11110101
		 +       1
		 ---------
      →  11110110

             ↓~b

		  00001001 → 9 → check? → ok
		      8  1
*/