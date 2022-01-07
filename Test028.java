// 연산자

// 논리 연산자

public class Test028
{
	public static void main(String[] args)
	{
		boolean a = true, b = false;

		System.out.printf("a && b : %b%n", (a&&b));
		System.out.printf("a || b : %b%n", (a||b));
		System.out.printf("!a     : %b%n", !a);
		System.out.printf("!b     : %b%n", !b);
	}
}

// 실행 결과
/*
a && b : false
a || b : true
!a     : false
!b     : true
계속하려면 아무 키나 누르십시오 . . .
*/