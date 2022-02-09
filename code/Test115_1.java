// 20220125 ȭ

// �� Ŭ���� ���

// ���(Inheritance)

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5.00
// ����Ϸ��� �ƹ� Ű�� ��������...
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

// Aclass�� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass 
{
	Bclass()
	{		
	}

	boolean input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		
		// ������ �� ���� �ƴϸ� boolean�� false��
		/*
		int z = sc.nextInt(); 

		if(z!=0) 
		{
			return false;
		}
		else 
			return true;
		*/

		// �����ڰ� +, -, *, /�� �ƴϸ� boolean�� false��
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

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
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