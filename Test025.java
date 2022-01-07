// 연산자

// 비트 단위 연산자

public class Test025
{
	public static void main(String[] args)
	{
		int a = 13, b = 7;
		int c, d, e;

		c = a & b;
		d = a | b;
		e = a ^ b;

		System.out.printf("a & b : %d%n", c);
		System.out.printf("a | b : %d%n", d);
		System.out.printf("a ^ b : %d%n", e);

	}
}

// 실행결과 
/*
a & b : 5
a | b : 15
a ^ b : 10
계속하려면 아무 키나 누르십시오 . . .
*/

/*
	13 → 00001101
   & 7 → 00000111
   ---------------
          00000101 → 5 
		  
	13 → 00001101
   | 7 → 00000111
   ---------------
          00001111 → 8 + 4 + 2 + 1 = 15

	13 → 00001101
   ^ 7 → 00000111
   ---------------
          00001010 → 8 + 2 = 10
*/