// 20220114 ��
// ��Ŭ������ �ν��Ͻ�

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������ �Է�(+ - * /)    : +
// >> 10 + 5 = 15
// ����Ϸ��� . . .

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// ��� ���� ����
	int a, b;
	char op;

	// �Է� �޼ҵ� ����(��� : �Է�)
	void input() throws IOException // System.in.read ������!
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /)    : ");
		op = (char)System.in.read();
	}

	// ���� ó�� �޼ҵ� ����
	int result()
	{
		int res = 0;

		switch(op)
		{
			case '+': res = a + b; break;
			case '-': res = a - b; break;
			case '*': res = a * b; break;
			case '/': res = a / b; break;
		}
		return res;
	}
	
	// ��� �޼ҵ� ����
	void print(int res)
	{
		System.out.printf(">> %d %c %d = %d%n", a, op, b, res);
	}
}

public class Test075
{
	public static void main(String[] args) throws IOException //input���� ���� ���� ������~
	{
		Calculate ob = new Calculate();

		ob.input();

		int res = ob.result();
		
		ob.print(res);
	}
}
// ���� ���
/*
������ �� ���� �Է�(���� ����) : 10 20
������ ������ �Է�(+ - * /)    : +
>> 10 + 20 = 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/