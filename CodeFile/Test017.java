// �ڹ� �⺻ ���α׷���

//�ڹ��� �⺻ ����� : System.in.read()

/*
��System.in.read()���޼ҵ�� �� ���ڸ� �����´�.
��, �Է¹��� �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶�
ASCII Code ������ ��ȯ�Ѵ�.
*/

// ���� ��)
// �� ���� �Է� : A
// �� �ڸ� ���� �Է� : 8

// �Է��� ���� : A
// �Է��� ���� : 8
// ����Ϸ��� �ƹ� Ű��....

import java.io.IOException;

public class Test017
{
	public static void main(String[] args) throws IOException
	{
		/*
		// �ֿ� ���� ����
		char ch;

		// ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� �ϳ� �Է��ϼ��� : "); // A
		ch = (char)System.in.read();                 // 65

		// ��� ���
		System.out.println(ch);
		//--==> A
		*/

		// ���� �ذ� - �� Ǯ��
		/*
		char ch;
		int d;

		System.out.print("�� ���� �Է�: ");
		ch = (char)System.in.read();

		System.out.print("�� �ڸ� ���� �Է�: ");
		d = (char)System.in.read();

		System.out.println("�Է��� ����: " + ch);
		System.out.println("�Է��� ����: " + d);
		*/

		// �ֿ� ���� ����
		char ch; // �Է¹��� ���ڸ� ���� ����
		//int n; // �Է¹��� ������ ���� ����

		// �߰� ���� ����
		char temp;
		
		// ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�� ���� �Է�: ");
		ch = (char)System.in.read();

		// �Է� ��⿭�� �����ִ� ��\r���� ��\n���� ��ŵ(�ǳʶٱ�)
		System.in.skip(2);
		// �Ű�����(2)�� ���� �� ���ڸ� ���� �ʰ� �ǳ� �ڴ�. (������.)

		System.out.print("�� �ڸ� ���� �Է�: ");
		//n = System.in.read();
		temp = (char)System.in.read();

		// 1 �� 49
		// 2 �� 50
		// :
		// 9 �� 57

		// �Է¹��� n�� 48��ŭ ���ҽ��Ѷ�
	    //n -= 48;

		// ��� ���
		System.out.println();
		System.out.println("�Է��� ����: " + ch);
		//System.out.println("�Է��� ����: " + n);
		System.out.println("�Է��� ���� : " + temp);
		
	}
}

// ���� ���
/*
�� ���� �Է�: a
�� �ڸ� ���� �Է�: 10

�Է��� ����: a
�Է��� ����: 1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/