// 20220125 화

// ▶ 클래스 고급

// 상속(Inheritance)

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5.00
// 계속하려면 아무 키나 누르세요...
//-------------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.io.IOException;

class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
}

// Aclass를 상속받는 클래스로 설계
class Bclass extends Aclass 
{
	Bclass()
	{		
	}

	boolean input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		
		// 정수가 두 개가 아니면 boolean값 false로
		/*
		int z = sc.nextInt(); 

		if(z!=0) 
		{
			return false;
		}
		else 
			return true;
		*/

		// 연산자가 +, -, *, /가 아니면 boolean값 false로
		while (true)
		{
			if (op=='+'||op=='-'||op=='*'||op=='/')
			{
				return true;
			}
			else 
				return false;
		}
	}

	double calc()
	{
		int res = 0;

		switch (op)
		{
		case '+': res = x + y; break;
		case '-': res = x - y; break;
		case '*': res = x * y; break;
		case '/': res = x / y; break;
		}
		return res;
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test115_1
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);
	}
}