// 20220110 ��

//// ���� �帧�� ��Ʈ��(���)
// if ��
// if ~ else�� �ǽ�

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//    �б� ������ ���ϱ� ���� ����ϴ� �������
//    if��, if~else��, ���� ������, ����if��(if�� ��ø),
//    switch ���� �ִ�.

// 2. if���� if ������ ������ ���� ���,
//    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 10
// �� ��° ���� �Է�    : 3
// ������ �Է�[+ - * /] : +

// >> 10 + 3 = 13
// ����Ϸ��� �ƹ� Ű�� �����ÿ� . . .

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		// ���1
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b; // ù ��°, �� ��° ����
		char op; // ������

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		// Integer.parseInt()
		// "1234" -> Integer.parseInt() -> 1234
		// "abcd" -> Integer.parseInt() -> (X)
		
		System.out.print("������ �Է�[+ - * /] : "); // + - * /
		//op = Integer.parseInt(br.readLine()); // �Ұ���
		//op = br.readLine(); // �Ұ���, ���ڰ� �ƴ϶� ���ڿ�
		op = (char)System.in.read(); // �ڵ� ����ȯ ��Ģ�� ���ݵż� char�� ���� ����ȯ, throws IOException �ʿ�

		// Ȯ��(�׽�Ʈ)
		//System.out.println("�Է��� ������ : " + op);

		if (op=='+') // �ܹ����� ��� ũ�� �� ����
		{
			System.out.printf("%n>> %d + %d = %d%n", a, b, (a+b));
		}
		else if (op=='-')
		{
			System.out.printf("%n>> %d - %d = %d%n", a, b, (a-b));
		}
		else if (op=='*')
		{
			System.out.printf("%n>> %d * %d = %d%n", a, b, (a*b));
		}
		else if (op=='/')
		{
			System.out.printf("%n>> %d / %d = %d%n", a, b, (a/b));
		}
		else
		{
			System.out.println(">> �Է� ������ ������ �����մϴ�.");
		}
		*/

		// ���2
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, op; // ù ��°, �� ��° ����, ������ ��� ������ ����

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine()); //���ڿ� ����� ������ ���ϰ� �Ϸ���

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read(); //� ���ڸ� �Է��߳Ŀ� ���� �ƽ�Ű �ڵ� ���� ���ϰ� ����

		if (op==43) // �ܹ����� ��� ũ�� �� ����
		{
			System.out.printf("%n>> %d + %d = %d%n", a, b, (a+b));
		}
		else if (op==45)
		{
			System.out.printf("%n>> %d - %d = %d%n", a, b, (a-b));
		}
		else if (op==42)
		{
			System.out.printf("%n>> %d * %d = %d%n", a, b, (a*b));
		}
		else if (op==47)
		{
			System.out.printf("%n>> %d / %d = %d%n", a, b, (a/b));
		}
		else
		{
			System.out.println(">> �Է� ������ ������ �����մϴ�.");
		}
		*/

		// ���3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result=0;
		char op; 

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine()); //���ڿ� ����� ������ ���ϰ� �Ϸ���

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		if(op=='+')
			result = a + b;
		else if(op=='-')
			result = a - b;
		else if(op=='*')
			result = a * b;
		else if(op=='/')
			result = a / b;

		System.out.printf("\n>> %d %c %d = %d%n", a, op, b, result);
		
	}
}
/*
ù ��° ���� �Է� : 3
�� ��° ���� �Է� : 4
������ �Է�[+ - * /] : -

>> 3 - 4 = -1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/