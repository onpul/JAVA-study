// 20220110 월
// 홀수, 짝수, 영

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		// 틀린 코드 -> 짝수보다 0을 먼저 판별해야 함. 이 코드는 0을 짝수로 출력.
		/*
		if(n%2==0)
		{
			System.out.print(n + " → 짝수");
		}
		else if(n%2!=0)
		{
			System.out.println(n + " → 홀수");
		}
		else
		{
			System.out.println(n + " → 영");
		}
		*/

		/*
		if(n%2!=0)
		{
			System.out.println(n + " → 홀수");
		}
		else if(n==0)
		{
			System.out.println(n + " → 영");
		}
		else
		{
			System.out.println(n + " → 짝수");
		}
		*/

		String result = "판정 불가"; // 먼저 값을 대입해 두면 else 없어도 에러가 나지 않는다.

		if(n==0)
		{
			result = "영";
		}
		else if(n%2==0)
		{
			result = "짝수";
		}
		else if (n%2!=0)
		{
			result = "홀수";
		}
		// 꼭 else로 끝나야 하는 게 아님
		/*
		else
		{
			result = "판정 불가";
		}
		*/

		System.out.println(n + " →" + result);
	}
}

// ※ 조건문을 구성할 때에는 항상 조건의 구성 순서에 유의해야 한다.

// ※ if~else 구문의 중첩 구문은
//    반드시 else로 끝나야 하는 것이 아니다.
//    다만, 출력해야 할 구문을 처리하는 과정에서
//    문제가 발생하지 않는 구문으로 작성해야 한다.

// ※ 조건문 구성 과정에서 이외의 영역(else)을
//    업무에 포함된 내용으로 처리하는 것은 바람직하지 않을 경우가 있다.
//    불가능한 경우는 어쩔 수 없더라도
//    가급적이면 업무에 포함되지 않는 내용을
//    이외의 영역(else)에서 처리할 수 있도록 하자.



