// 20221011

// ������ �帧�� ��Ʈ��(���)

//----------------------------------------------------------------------
// switch �� �ǽ�

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 3
// �� ��° ���� �Է�    : 17
// ������ �Է�[+ - * /] : -

// >> 3 - 17 = - 14
// ����Ϸ��� . . .
//----------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test045
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//int a, b, op; // �Է¹��� ����, ������
		//int result;
		/*
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = System.in.read();
		*/
//----------------------------------------------------------------------
		// �� Ǯ��
		/*
		switch (op)
		{
		case 43:
			System.out.printf("%n>> %d + %d = %d%n", a, b, (a+b)); break;
		case 45:
			System.out.printf("%n>> %d - %d = %d%n", a, b, (a-b)); break;
		case 42:
			System.out.printf("%n>> %d * %d = %d%n", a, b, (a*b)); break;
		case 47:
			System.out.printf("%n>> %d / %d = %d%n", a, b, (a/b)); break;
		default :
			System.out.println(">> �Է� ������ ������ �����մϴ�.");
		}
		*/
//----------------------------------------------------------------------
		// ���� Ǯ�� 1
		/*
		switch (op)
		{
		case 43: result = a + b; break;
		case 45: result = a - b; break;
		case 42: result = a * b; break;
		case 47: result = a / b; break;
		default: return; // 1. ���� ��ȯ
		                 // 2. �޼ҵ� ���� (������ ǰ�� �ִ� �޼ҵ尡 ���� --> ���⼭�� main()�޼ҵ� ����--> ���α׷� ����)
						 // �ܵ����� �������� ����
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d%n", a, op, b, result);
		*/
		//----------------------------------------------------------------------
		// ���� Ǯ�� 2
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		switch(op)
		{
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; break;
			default : return;
		}
		
		System.out.println();
		System.out.printf(">> %d %c %d = %d%n", a, op, b, result);
	}
}
//----------------------------------------------------------------------
// ���� ���
/*
ù ��° ���� �Է� : 3
�� ��° ���� �Է� : 4
������ �Է�[+ - * /] : -

>> 3 - 4 = -1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/